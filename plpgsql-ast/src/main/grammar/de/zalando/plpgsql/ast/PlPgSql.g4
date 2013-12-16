//
// Grammar for plpgsql Postgres 9.1
// 
grammar PlPgSql;
import  LexerRules, SelectStmtGrammar;



// ---------
// -- parser rules
// ---------



type 	 : ID ('.' ID)? ('[' ']')*;  // ordinary type e.g. INTEGER or z.custom_type
	
copyType : ID ('.' ID)? ('.' ID)? '%' 'TYPE';  // variable%TYPE  e.g. user_id z.my_table.user_id%TYPE
rowType  : ID ('.' ID)? '%' 'ROWTYPE';         // e.g. t2_row z.my_table%ROWTYPE;


// -- definition of numeric constants
// -- see http://www.postgresql.org/docs/9.1/static/sql-syntax-lexical.html#SQL-SYNTAX-IDENTIFIERS
// -- Examples:
// REAL '1.23'  -- string style
// 1.23::REAL   -- PostgreSQL (historical) style
numericConstant : value=( INTEGER_VALUE | DECIMAL_VALUE ) '::' type
				| type QUOTE value=( INTEGER_VALUE | DECIMAL_VALUE ) QUOTE
				;
			
assignOperator  : OLD_ASSIGN_OP 
			    | EQ
			    ;			
			

// -- definition of constantsvof other types
// -- see http://www.postgresql.org/docs/9.1/static/sql-syntax-lexical.html#SQL-SYNTAX-IDENTIFIERS
// -- Examples:			
// type 'string'
// 'string'::type
// CAST ( 'string' AS type )
constantOfOtherTypes : type value=STRING
				     | value=STRING '::' type
				     | CAST '(' value=STRING AS type ')'
				     ;


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


functionCallExpr : functionCallName=ID '(' (expression  (',' expression)* )?  ')'
				 ;

numericalExpr :    functionCallExpr							     # numericalFunctionExpression
                    |   '(' numericalExpr ')'						     # numericalExpressionGroup
				 	| unaryOperator=ADD<assoc=right> numericalExpr   # unaryExpression
				 	| unaryOperator=SUB<assoc=right> numericalExpr   # unaryExpression
				     | numericalExpr operator=MUL  numericalExpr      # mulExpression
				 	| numericalExpr operator=DIV  numericalExpr      # divExpression
				 	| numericalExpr operator=MOD  numericalExpr      # modExpression 
				 	| numericalExpr operator=ADD  numericalExpr      # addExpression
				 	| numericalExpr operator=SUB  numericalExpr      # subExpression 
				 	| numericalExpr  '^'<assoc=right> numericalExpr  # exponentiationExpression
				 	| numericConstant       			  			 # constantExpression
				 	| INTEGER_VALUE  					   			 # numericalLiteralExpression
	  			 	| DECIMAL_VALUE						   			 # numericalLiteralExpression
	  			 	| ID											 # numericVariableExpression
					;
										

booleanExpr   : '(' booleanExpr ')'                     # booeleanExpressionGroup
				| NOT booleanExpr					    # negateExpression
				| booleanExpr operator=AND  booleanExpr # logicalConjunctionExpression
				| booleanExpr operator=OR   booleanExpr # logicalConjunctionExpression			
				| expression operator=ISNULL            # isNullExpression
				| expression operator=NOTNULL           # notNullExpression
				| expression operator=IS 
							 (not=NOT)? 
							 rightOperand=(NULL | TRUE | FALSE | UNKNOWN) # isExpression
				| expression IS (not=NOT)? DISTINCT FROM expression       # isDistinctFromExpression
				| expression (not=NOT)? operator=BETWEEN leftBorder=expression AND rightBorder=expression     # betweenExpression
				| expression  operator=EQ  expression        # comparisonExpression
				| expression  operator=NEQ expression        # comparisonExpression
				| expression  operator=LT  expression        # comparisonExpression
				| expression  operator=LTE expression        # comparisonExpression
				| expression  operator=GT  expression        # comparisonExpression
				| expression  operator=GTE expression        # comparisonExpression
				| expression  (not=NOT)? operator=LIKE       expression   # comparisonExpression
				| expression  (not=NOT)? operator=SIMILAR_OP expression   # comparisonExpression
				| value=(TRUE | FALSE)  			      # booleanConstant
				| ID                                  # booleanVariableExpression
	            | constantOfOtherTypes  			  # booleanArbitraryConstantExpression
			;


// TODO Not finished yet
// OVERLAPS expression: http://www.postgresql.org/docs/9.1/static/functions-datetime.html
// -- expression definitions
// http://www.postgresql.org/docs/8.2/static/functions-comparison.html
// http://www.postgresql.org/docs/9.1/interactive/sql-syntax-lexical.html#SQL-SYNTAX-OPERATORS
expression  : functionCallExpr                     # functionCallExpression
			| '(' expression ')'                   # expressionGroup
	        | booleanExpr                          # booleanExpression
	        | numericalExpr						   # numericalExpression		
			| expression  ('[' arrayIndexExpr=numericalExpr ']')+  	  # arrayAccessExpression
			| ID                                  # variableExpression
	        | constantOfOtherTypes  			  # arbitraryConstantExpression
	        | STRING         					  # stringLiteralExpression        
	  		;






					
	  
stmts 	: stmt*; // we allow empty functions

stmt  	: selectStmt
        | blockStmt
		| assignStmt
		;

assignStmt : receiver=expression assignOperator value=expression ';'
		   ;
		   