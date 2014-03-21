//
// Grammar for plpgsql Postgres 9.1
//
grammar PlPgSql;

import  SelectStmtGrammar;

// ---------
// -- parser rules
// ---------

// -- the entry point
unit        : plFunction+; // each file has at least one function definition


// ---------
// -- http://www.postgresql.org/docs/9.1/static/sql-createfunction.html
// -- NOTE: for now, the specification is not fully matched (the parts following after ROWS definition are omitted)
// ---------


plFunction         : CREATE (OR REPLACE)? FUNCTION functionName=ID '(' functionArgsList ')' functionReturns functionBody LANGUAGE LANGUAGE_NAME functionSettings? ';';
functionArgsList   : ( functionArg (',' functionArg)* )? ;

functionArg        : (argMode=(IN | OUT | INOUT | VARIADIC))? argName=ID type=(ID | QNAME | ARRAY_TYPE)   ( initOperator=( DEFAULT | ASSIGN_OP | EQ ) expression )?;


functionReturns    : RETURNS type=(ID | QNAME | ARRAY_TYPE | COPY_TYPE | ROW_TYPE)
				   | RETURNS (type=(ID | QNAME | ARRAY_TYPE | COPY_TYPE | ROW_TYPE) outName=ID)+
				   ;


functionBody       : F_DOLLAR_QUOTE blockStmt DOLLAR_QUOTE
				   | F_QUOTE        blockStmt QUOTE
				   ;




blockStmt          : (DECLARE varDeclarationList)* BEGIN  stmts (EXCEPTION exceptionHandlingBlock)?  END ';';

exceptionHandlingBlock  : (WHEN  exceptionWhenConditions THEN stmts)* stmts;
exceptionWhenConditions : exceptionWhenCondition (OR exceptionWhenCondition)* ;
exceptionWhenCondition  : expression;

functionSettings   : window functionBehavior functionInputHandling functionSecurity functionCosts functionRows; // TODO not sure if there is a fixed order

functionBehavior   : IMMUTABLE
 				   | STABLE
 				   | VOLATILE
 				   ;

window             : WINDOW;

functionInputHandling   : CALLED_ON_NULL_INPUT
					    | RETURNS_NULL_ON_NULL_INPUT
					    | STRICT
					    ;

functionSecurity        : SECURITY_INVOKER
						| SECURITY_DEFINER
						;

functionCosts           : COST value=INTEGER_VALUE;

functionRows            : ROWS value=INTEGER_VALUE;


// ---------
// -- Declarations
// -- see http://www.postgresql.org/docs/9.1/static/plpgsql-declarations.html
// ---------

varDeclarationList : (varDeclaration | aliasDeclaration)*;

// -- name [ CONSTANT ] type [ COLLATE collation_name ] [ NOT NULL ] [ { DEFAULT | := } expression ];
varDeclaration     : varName=ID CONSTANT? type=(ID | QNAME | ARRAY_TYPE | COPY_TYPE | ROW_TYPE) (COLLATE collationName=ID)? (NOT NULL)?  ( initOperator=( DEFAULT | ASSIGN_OP | EQ ) expression )? ';' ;

// -- newname ALIAS FOR oldname;
aliasDeclaration   : newVarName=ID ALIAS FOR oldVarName=ID ';' ;



stmts 	: stmt*; // we allow empty functions

stmt  	: selectStmt
		| insertStmt
		| blockStmt
		| assignStmt
		;

assignStmt : receiver=expression assignOperator value=expression ';'
		   ;

//------
//-- INSERT STATEMENT GRAMMAR
//-- http://www.postgresql.org/docs/9.1/static/sql-insert.html
//-- http://www.postgresql.org/docs/9.1/static/plpgsql-statements.html  "9.5.3. Executing a Query with a Single-row Result"
//------

insertStmt : insert ';' ;

insert : INSERT INTO (schema=ID '.')? table=ID insertColumnList? (valuesClause | select)
	   ;

insertColumnList : '(' insertColumn (',' insertColumn)* ')' ;
insertColumn     : column=ID;
valuesClause     : DEFAULT? VALUES valueTuple (',' valueTuple)*;
valueTuple       : '(' expression (',' expression)*  ')';


// intoClause     : INTO   strict=STRICT? target=ID (',' target=ID)* ;


