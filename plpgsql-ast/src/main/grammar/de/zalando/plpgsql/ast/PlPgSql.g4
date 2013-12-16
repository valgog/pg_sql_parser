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
// -- NOTE: for now, the specification is not fully matched (the parts following after ROWS definition are ommitted) 
// ---------

functionName       : ID;

plFunction         : CREATE (OR REPLACE)? FUNCTION functionName '(' functionArgsList ')' functionReturns AS functionBody LANGUAGE LANGUAGE_NAME functionSettings? ';';
functionArgsList   : functionArg?
				   | functionArg (',' functionArg)*
				   ;
				   
functionArg        : (argMode=(IN | OUT | INOUT | VARIADIC) )? argName=ID type ( ( DEFAULT | assignOperator ) expression )?;


functionReturns    : RETURNS type
				   | RETURNS (type ID)+
				   ;
				   
functionBody       : DOLLAR_QUOTE blockStmt DOLLAR_QUOTE
				   | QUOTE        blockStmt QUOTE
				   ;
				   
blockStmt          : (DECLARE varDeclarationList)* BEGIN stmts END ';'; // TODO EXCEPT Block


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
varDeclaration     : varName=ID CONSTANT? (type | copyType | rowType) (COLLATE collationName=ID)? (NOT NULL)?  ( ( DEFAULT | assignOperator ) expression )? ';' ;

// -- newname ALIAS FOR oldname;
aliasDeclaration   : newVarName=ID ALIAS FOR oldVarName=ID ';' ;



stmts 	: stmt*; // we allow empty functions

stmt  	: 
		//	selectStmt| 
        blockStmt
		| assignStmt
		;

assignStmt : receiver=expression assignOperator value=expression ';'
		   ;
		   