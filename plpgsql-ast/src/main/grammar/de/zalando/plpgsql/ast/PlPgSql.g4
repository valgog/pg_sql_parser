//
// Grammar for plpgsql Postgres 9.1
//
grammar PlPgSql;

import LexerRules;

varExpr          : QNAME | ID;

functionCallExpr : functionCallName=ID '(' (expression  (',' expression)* )?  ')'
				 ;


// -- definition of numeric constants
// -- see http://www.postgresql.org/docs/9.1/static/sql-syntax-lexical.html#SQL-SYNTAX-IDENTIFIERS
// -- Examples:
// REAL '1.23'  -- string style
// 1.23::REAL   -- PostgreSQL (historical) style
numericConstant : value=( INTEGER_VALUE | DECIMAL_VALUE ) '::' type=(ID | QNAME | ARRAY_TYPE | COPY_TYPE | ROW_TYPE)
				| typeName=(ID | QNAME | ARRAY_TYPE | COPY_TYPE | ROW_TYPE) QUOTE value=( INTEGER_VALUE | DECIMAL_VALUE ) QUOTE
				;




// -- definition of constantsvof other types
// -- see http://www.postgresql.org/docs/9.1/static/sql-syntax-lexical.html#SQL-SYNTAX-IDENTIFIERS
// -- Examples:
// type 'string'
// 'string'::type
// CAST ( 'string' AS type )
constantOfOtherTypes : type=(ID | QNAME | ARRAY_TYPE | COPY_TYPE | ROW_TYPE) value=stringLiteralExpr
				     | value=stringLiteralExpr '::' type=(ID | QNAME | ARRAY_TYPE | COPY_TYPE | ROW_TYPE)
				     | CAST '(' value=stringLiteralExpr AS type=(ID | QNAME | ARRAY_TYPE | COPY_TYPE | ROW_TYPE) ')'
				     ;



numericalLiteralExpr : numericConstant       			  			 # numericalConstantExpression
			  		 | INTEGER_VALUE  					   			 # integerLiteral
	  		  		 | DECIMAL_VALUE						   		 # decimalLiteral
   	 		  		 ;


booleanLiteralExpr  :  NOT expression		# negateExpression
					| value=(TRUE | FALSE)  # booleanLiteral
					;


// stringLiteralExpr  : STRING # stringLiteral
// 				   ;


stringLiteralExpr : QUOTE 		  ( ESC | .)*?  QUOTE
 		   		  | DOLLAR_QUOTE  ( ESC | .)*?  DOLLAR_QUOTE
 				  ;

// TODO Not finished yet
// OVERLAPS expression: http://www.postgresql.org/docs/9.1/static/functions-datetime.html
// -- expression definitions
// http://www.postgresql.org/docs/8.2/static/functions-comparison.html
// http://www.postgresql.org/docs/9.1/interactive/sql-syntax-lexical.html#SQL-SYNTAX-OPERATORS
expression  : functionCallExpr                     					# functionCallExpression
			| '(' expression ')'                   					# expressionGroup
			| expression  ('[' arrayIndexExpr=expression ']')+  	# arrayAccessExpression
    		| varExpr                             					# variableExpression
		    | booleanLiteralExpr                          			# booleanLiteralExpression
	        | numericalLiteralExpr						   		    # numericalLiteralExpression
	        | stringLiteralExpr          			     			# stringLiteralExpression
			| expression  operator=EQ  					 expression   # comparisonExpression
			| expression  operator=NEQ 					 expression   # comparisonExpression
			| expression  operator=LT  					 expression   # comparisonExpression
			| expression  operator=LTE 					 expression   # comparisonExpression
			| expression  operator=GT  					 expression   # comparisonExpression
			| expression  operator=GTE 					 expression   # comparisonExpression

			// TODO these definitions are NOT COMPLETE yet
			| expression  (not=NOT)? operator=LIKE           stringLiteralExpr   # comparisonExpression
			| expression  (not=NOT)? operator=SIMILAR TO     stringLiteralExpr   # comparisonExpression

		    | unaryOperator=ADD<assoc=right> 			 expression   # unaryExpression
			| unaryOperator=SUB<assoc=right> 			 expression   # unaryExpression
			| expression operator=MUL      				 expression   # mulExpression
			| expression operator=DIV      				 expression   # divExpression
		 	| expression operator=MOD      				 expression   # modExpression
			| expression operator=ADD      				 expression   # addExpression
		 	| expression operator=SUB      				 expression   # subExpression
		 	| expression  '^'<assoc=right> expression   			  # exponentiationExpression
	        | constantOfOtherTypes  			  					# arbitraryConstantExpression
	        | expression AS label=ID   							    # labelExpression
			| expression  operator=IN   expression # inExpression
			| expression  operator=AND  expression # logicalConjunctionExpression
			| expression  operator=OR   expression # logicalConjunctionExpression
	  		| select                               # subQueryExpression
	  		;


assignOperator  : ASSIGN_OP
			    | EQ
			    ;

condition : expression ;



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


//------------

assignStmt : receiver=expression assignOperator value=expression ';'
		   ;


//-------------
// -- RETURNING clause
//    RETURNING expressions INTO [STRICT] target
// -- http://www.postgresql.org/docs/9.1/static/plpgsql-statements.html  "9.5.3. Executing a Query with a Single-row Result"
//-------------
// TODO might generate uncomfy api
returningClause      : RETURNING (returningExpressions | returningAll)
					 ;

returningExpressions : returningOutputExpression (',' returningOutputExpression)* returningIntoClause?
                     ;

returningOutputExpression : expression (AS aliasName=ID)?
                          ;

returningAll         : '*'
                     ;

returningIntoClause  : INTO hasStrict=STRICT? returningIntoTargets
                     ;

returningIntoTargets : returningIntoTarget (',' returningIntoTarget)*
                     ;

returningIntoTarget  : target=(ID | QNAME)
                     ;

//------
//-- SELECT STATEMENT GRAMMAR
//-- http://www.postgresql.org/docs/9.1/static/queries-overview.html
//-- http://www.postgresql.org/docs/9.1/static/sql-select.html
//-- http://www.postgresql.org/docs/9.1/static/plpgsql-statements.html
//------

// see http://www.postgresql.org/docs/9.1/static/queries-overview.html
selectStmt : select ';' ;

// TODO we leave WINDOW out for now
// (WITH withQueries)?
select :  SELECT  selectList
			(
			   intoClause?     // necessary for selectStmt
			   fromClause
			   joinClause*
			   whereClause?
		       groupByClause?
			   havingClause?
			   bulkOperationClause?
			   orderByClause?
			   limitClause?
			   offsetClause?
			   fetchClause?
			   forClause?
			)?
			;

selectList          : (ALL | distinctClause )?  ( selectAll | selectSpecific );
distinctClause      : DISTINCT ON expression (',' expression)* ;
selectSpecific      : expression (',' expression)* ;

selectAll           : '*';



intoClause     : INTO   strict=STRICT? target=ID (',' target=ID)* ;

limitClause    : LIMIT  limit=( INTEGER_VALUE | ALL ) ;
offsetClause   : OFFSET offset=INTEGER_VALUE (ROW | ROWS)? ;

orderByClause  : ORDER_BY orderByItem (',' orderByItem)*;
orderByItem    : expression  ordering=( ASC | DESC )?  nullsOrdering ? # standardOrdering
			   | expression orderByUsing nullsOrdering ?               # usingOrdering
			   ;

orderByUsing   :  USING operator=(LT | LTE | GT | GTE);

nullsOrdering  : NULLS  ordering=( FIRST | LAST  );

//withQueries    : ;

// http://www.postgresql.org/docs/9.1/static/sql-select.html#SQL-FROM
// didn't really get this part: "from_item [ NATURAL ] join_type from_item [ ON join_condition | USING ( join_column [, ...] ) ]"


fromClause        : FROM  tableExpression (',' tableExpression)* ;

joinClause : NATURAL? join;

// TODO not finished yet
tableExpression   : (only=ONLY)? tableName=( QNAME | ID) ('*')? (AS?  alias=ID columnAlias)?  # fromTable
				  | '(' select ')' AS? alias=ID  columnAlias?                         # fromSelect
			      ;

join            : INNER?      JOIN  table=( QNAME | ID)  ON condition # innerJoin
				| LEFT  OUTER JOIN  table=( QNAME | ID)  ON condition # leftOuterJoin
				| LEFT        JOIN  table=( QNAME | ID)  ON condition # leftJoin
				| RIGHT OUTER JOIN  table=( QNAME | ID)  ON condition # rightOuterJoin
				| RIGHT       JOIN  table=( QNAME | ID)  ON condition # rightJoin
				| FULL  OUTER JOIN  table=( QNAME | ID)  ON condition # fullJoin
				| FULL        JOIN  table=( QNAME | ID)  ON condition # fullOuterJoin
				| CROSS       JOIN  table=( QNAME | ID)  ON condition # crossJoin
				;

columnAlias     : '(' columnAliasItem (',' columnAliasItem)* ')' ;
columnAliasItem : ID;


whereClause         : WHERE    condition;
groupByClause       : GROUP_BY expression ;
havingClause        : HAVING   condition;
bulkOperationClause : operator=( UNION | INTERSECT | EXCEPT )   selectMode=(ALL | DISTINCT) select ;

// In this syntax, to write anything except a simple integer constant for start or count,
// you must write parentheses around it. If count is omitted in a FETCH clause, it defaults to 1.
// ROW and ROWS as well as FIRST and NEXT are noise words that don't influence the effects of these clauses
fetchClause  : FETCH  (FIRST | NEXT )? (count=INTEGER_VALUE)?  (ROW | ROWS)? ONLY;

forClause    :  FOR lockMode=(UPDATE | SHARE)  (lockedTables)?  nowait=NOWAIT?;
lockedTables : OF lockedTable (',' lockedTable)*;
lockedTable  : ID;

//------
//-- INSERT STATEMENT GRAMMAR
//-- http://www.postgresql.org/docs/9.1/static/sql-insert.html
//-- http://www.postgresql.org/docs/9.1/static/plpgsql-statements.html  "9.5.3. Executing a Query with a Single-row Result"
// TODO: WITH clause is missing
//------

insertStmt : insert ';' ;

insert : INSERT INTO table=(ID | QNAME) insertColumnList? (insertValuesClause | select) returningClause?
	   ;

insertColumnList : '(' insertColumn (',' insertColumn)* ')'
                 ;

insertColumn     : column=ID
				 ;

insertValuesClause     : insertDefaultValues
                       | insertValues
                       ;

insertDefaultValues    : DEFAULT VALUES
                 ;

insertValues           : VALUES insertValueTuple (',' insertValueTuple)*
                 ;

insertValueTuple       : '(' expression (',' expression)*  ')'
                 ;


//------
//-- UPDATE STATEMENT GRAMMAR
//-- http://www.postgresql.org/docs/9.1/static/sql-update.html
//-- http://www.postgresql.org/docs/9.1/static/plpgsql-statements.html  "9.5.3. Executing a Query with a Single-row Result"
// TODO: WITH clause is missing
// TODO: cursors ignored for now
//------

updateStmt : update ';'
           ;

// UPDATE [ ONLY ] table [ * ] [ [ AS ] alias ]
//     SET { column = { expression | DEFAULT } |
//           ( column [, ...] ) = ( { expression | DEFAULT } [, ...] ) } [, ...]
//     [ FROM from_list ]
//     [ WHERE condition | WHERE CURRENT OF cursor_name ]
//     [ RETURNING * | output_expression [ [ AS ] output_name ] [, ...] ]

update : UPDATE hasOnly=ONLY? table=(ID | QNAME) (areDescendantTablesIncluded='*')? (AS tableAliasName=ID)?
            SET (updateSingleSetClause | updateMultiSetClause)
          fromClause?
          whereClause?
          returningClause?
       ;


updateSingleSetClause : updateSingleSetAssignment (',' updateSingleSetAssignment)*
                      ;

updateSingleSetAssignment : column=(ID | QNAME) '=' updateSetValue
                          ;


updateMultiSetClause   : updateMultiSetAssignment (',' updateMultiSetAssignment)*
                       ;

updateMultiSetAssignment : '(' updateMultiSetColumns ')' '=' '('  updateMultiSetValues ')'
                         ;


updateMultiSetColumns  : updateMultiSetColumn (',' updateMultiSetColumn)*
                       ;

updateMultiSetColumn   : column=(ID | QNAME)
                       ;

updateMultiSetValues   : updateSetValue (',' updateSetValue)*
                       ;

updateSetValue         : expression
                       | column=(ID | QNAME)
                       | hasDefault=DEFAULT
                       ;

//------
//-- DELETE STATEMENT GRAMMAR
//-- http://www.postgresql.org/docs/9.1/static/sql-delete.html
//-- http://www.postgresql.org/docs/9.1/static/plpgsql-statements.html  "9.5.3. Executing a Query with a Single-row Result"
// TODO: WITH clause is missing
// TODO: cursors ignored for now
//------

deleteStmt : delete ';'
           ;

// [ WITH [ RECURSIVE ] with_query [, ...] ]
// DELETE FROM [ ONLY ] table [ * ] [ [ AS ] alias ]
//     [ USING using_list ]
//     [ WHERE condition | WHERE CURRENT OF cursor_name ]
//     [ RETURNING * | output_expression [ [ AS ] output_name ] [, ...] ]

delete : DELETE FROM hasOnly=ONLY? table=(ID | QNAME) (areDescendantTablesIncluded='*')? (AS tableAliasName=ID)?
         usingClause?
         whereClause?
         returningClause?
       ;

usingClause : USING usingTable (',' usingTable)*
            ;

usingTable  : tableName=( QNAME | ID)
            ;


//------------

stmts 	: stmt*; // we allow empty functions

stmt  	: selectStmt
		| insertStmt
		| updateStmt
		| deleteStmt
		| blockStmt
		| assignStmt
		;




