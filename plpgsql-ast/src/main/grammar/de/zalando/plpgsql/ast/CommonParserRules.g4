grammar CommonParserRules;

import LexerRules;

varExpr          : ID;

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
constantOfOtherTypes : type=(ID | QNAME | ARRAY_TYPE | COPY_TYPE | ROW_TYPE) value=STRING
				     | value=STRING '::' type=(ID | QNAME | ARRAY_TYPE | COPY_TYPE | ROW_TYPE)
				     | CAST '(' value=STRING AS type=(ID | QNAME | ARRAY_TYPE | COPY_TYPE | ROW_TYPE) ')'
				     ;



numericalLiteralExpr : numericConstant       			  			 # numericalConstantExpression
			  		 | INTEGER_VALUE  					   			 # integerLiteral
	  		  		 | DECIMAL_VALUE						   		 # decimalLiteral
   	 		  		 ;
										

booleanLiteralExpr  :  NOT expression		# negateExpression
					| value=(TRUE | FALSE)  # booleanLiteral
					;


 stringLiteralExpr  : STRING # stringLiteral
					;



// TODO Not finished yet
// OVERLAPS expression: http://www.postgresql.org/docs/9.1/static/functions-datetime.html
// -- expression definitions
// http://www.postgresql.org/docs/8.2/static/functions-comparison.html
// http://www.postgresql.org/docs/9.1/interactive/sql-syntax-lexical.html#SQL-SYNTAX-OPERATORS
expression  : functionCallExpr                     					# functionCallExpression
			| '(' expression ')'                   					# expressionGroup
			| expression  ('[' arrayIndexExpr=expression ']')+  	# arrayAccessExpression
			
			| expression  operator=EQ  					 expression   # comparisonExpression
			| expression  operator=NEQ 					 expression   # comparisonExpression
			| expression  operator=LT  					 expression   # comparisonExpression
			| expression  operator=LTE 					 expression   # comparisonExpression
			| expression  operator=GT  					 expression   # comparisonExpression
			| expression  operator=GTE 					 expression   # comparisonExpression
			| expression  (not=NOT)? operator=LIKE       expression   # likeExpression
			| expression  (not=NOT)? SIMILAR TO          expression   # similarToExpression
		    | unaryOperator=ADD<assoc=right> 			 expression   # unaryExpression
			| unaryOperator=SUB<assoc=right> 			 expression   # unaryExpression
			| expression operator=MUL      				 expression   # mulExpression
			| expression operator=DIV      				 expression   # divExpression
		 	| expression operator=MOD      				 expression   # modExpression 
			| expression operator=ADD      				 expression   # addExpression
		 	| expression operator=SUB      				expression    # subExpression 
		 	| expression  '^'<assoc=right> expression   			  # exponentiationExpression
			| expression  operator=AND  expression # logicalConjunctionExpression
			| expression  operator=OR   expression # logicalConjunctionExpression			
	        | constantOfOtherTypes  			  					# arbitraryConstantExpression
	        | expression AS label=ID   							    # labelExpression
			| varExpr                             					# variableExpression
		    | booleanLiteralExpr                          			# booleanLiteralExpression
	        | numericalLiteralExpr						   		    # numericalLiteralExpression	
	        | stringLiteralExpr          			     			# stringLiteralExpression   
	  		;


assignOperator  : ASSIGN_OP 
			    | EQ
			    ;			
