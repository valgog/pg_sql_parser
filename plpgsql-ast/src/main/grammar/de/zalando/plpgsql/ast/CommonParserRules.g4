grammar CommonParserRules;

import LexerRules;

type 	 : ID ('.' ID)? ('[' ']')*;  // ordinary type e.g. INTEGER or z.custom_type
	
copyType : ID ('.' ID)? ('.' ID)? '%' 'TYPE';  // variable%TYPE  e.g. user_id z.my_table.user_id%TYPE
rowType  : ID ('.' ID)? '%' 'ROWTYPE';         // e.g. t2_row z.my_table%ROWTYPE;

functionCallExpr : functionCallName=ID '(' (expression  (',' expression)* )?  ')'
				 ;


// -- definition of numeric constants
// -- see http://www.postgresql.org/docs/9.1/static/sql-syntax-lexical.html#SQL-SYNTAX-IDENTIFIERS
// -- Examples:
// REAL '1.23'  -- string style
// 1.23::REAL   -- PostgreSQL (historical) style
numericConstant : value=( INTEGER_VALUE | DECIMAL_VALUE ) '::' type
				| type QUOTE value=( INTEGER_VALUE | DECIMAL_VALUE ) QUOTE
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
										

booleanExpr   : '(' booleanExpr ')'     # booeleanExpressionGroup
				| NOT booleanExpr		# negateExpression
				| value=(TRUE | FALSE)  # booleanConstant
	            | constantOfOtherTypes  # booleanArbitraryConstantExpression
				| ID                    # booleanVariableExpression
				;



// TODO Not finished yet
// OVERLAPS expression: http://www.postgresql.org/docs/9.1/static/functions-datetime.html
// -- expression definitions
// http://www.postgresql.org/docs/8.2/static/functions-comparison.html
// http://www.postgresql.org/docs/9.1/interactive/sql-syntax-lexical.html#SQL-SYNTAX-OPERATORS
expression  : functionCallExpr                     					# functionCallExpression
			| '(' expression ')'                   					# expressionGroup
	        | booleanExpr                          					# booleanExpression
	        | numericalExpr						   					# numericalExpression		
			| expression  ('[' arrayIndexExpr=numericalExpr ']')+  	# arrayAccessExpression
			
			| expression  operator=EQ  expression        # comparisonExpression
				| expression  operator=NEQ expression        # comparisonExpression
				| expression  operator=LT  expression        # comparisonExpression
				| expression  operator=LTE expression        # comparisonExpression
				| expression  operator=GT  expression        # comparisonExpression
				| expression  operator=GTE expression        # comparisonExpression
				| expression  (not=NOT)? operator=LIKE       expression   # comparisonExpression
				| expression  (not=NOT)? operator=SIMILAR_OP expression   # comparisonExpression
				| expression  operator=AND  expression # logicalConjunctionExpression
				| expression  operator=OR   expression # logicalConjunctionExpression			
	        | constantOfOtherTypes  			  					# arbitraryConstantExpression
			| ID                                  					# variableExpression
	        | STRING         					  					# stringLiteralExpression        
	  		;


assignOperator  : ASSIGN_OP 
			    | EQ
			    ;			

