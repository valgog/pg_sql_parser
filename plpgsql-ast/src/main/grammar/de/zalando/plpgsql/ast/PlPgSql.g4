//
// Grammar for plpgsql Postgres 9.1
// 
grammar PlPgSql;

// NOTE: 0 is default channel that's why we should start with a channel id > 0
@lexer::members {
	public static final int COMMENTS_CHANNEL = 1;
}

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
				   
functionBody       : DOLLAR_QUOTE block DOLLAR_QUOTE
				   | QUOTE block QUOTE
				   ;
				   
block              : (DECLARE varDeclarationList)* BEGIN stmts END ';'; // TODO EXCEPT Block


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


// TODO Not finished yet
// arrays!!!
// OVERLAPS expression: http://www.postgresql.org/docs/9.1/static/functions-datetime.html
// -- expression definitions
// http://www.postgresql.org/docs/8.2/static/functions-comparison.html
// http://www.postgresql.org/docs/9.1/interactive/sql-syntax-lexical.html#SQL-SYNTAX-OPERATORS
expression  : '(' expression ')'                   # expressionGroup
			| NOT expression					   # negateExpression
			| expression operator=AND  expression  # logicalConjunctionExpression
			| expression operator=OR   expression  # logicalConjunctionExpression
			| unaryOperator=ADD<assoc=right> expression # unaryExpression
			| unaryOperator=SUB<assoc=right> expression # unaryExpression
		    | expression operator=MUL  expression  # mulExpression
			| expression operator=DIV  expression  # divExpression
			| expression operator=MOD  expression  # modExpression 
			| expression operator=ADD  expression  # addExpression
			| expression operator=SUB  expression  # subExpression 
			| expression operator=ISNULL           # isNullExpression
			| expression operator=NOTNULL          # notNullExpression
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
			| expression  (not=NOT)? operator=LIKE       expression # comparisonExpression
			| expression  (not=NOT)? operator=SIMILAR_OP expression # comparisonExpression
			| ID                                  # variableExpression
			| numericConstant       			  # constantExpression
	        | constantOfOtherTypes  			  # constantExpression
	        | STRING         					  # literalExpression        
	  		| INTEGER_VALUE  					  # literalExpression
	  		| DECIMAL_VALUE						  # literalExpression
	  		;

	  
	  
stmts : stmt*; // we allow empty functions
stmt  : assignStmt;

assignStmt : ID assignOperator expression ';';


// ---------
// -- lexer rules
// ---------

// -- operators

MUL : '*';
DIV : '/';
MOD : '%';
ADD : '+';
SUB : '-';

EQ  : '=';
NEQ : '<>' | '!=';
LT  : '<';
LTE : '<=';
GT  : '>';
GTE : '>=';

LIKE : ([Ii])? [Ll][iI][Kk][eE];

SIMILAR_OP : SIMILAR TO;
SIMILAR    : [Ss][iI][mM][[iI][Ll][Aa][Rr];
TO         : [Tt][Oo];


AND         : [Aa][Nn][Dd];
OR          : [Oo][Rr];
OLD_ASSIGN_OP   :  ':=';
BETWEEN     : [Bb][eE][Tt][wW][eE][eE][nN];
DISTINCT    : [Dd][iI][sS][Tt][iI][nN][Cc][Tt];
FROM        : [Ff][Rr][Oo][Mm];

IS      : [Ii][Ss];
NOT     : [Nn][Oo][Tt];
ISNULL  : [Ii][Ss][Nn][uU][Ll][Ll];
NOTNULL : [Nn][Oo][Tt][Nn][uU][Ll][Ll];

// --

NULL    : [Nn][uU][Ll][Ll];
TRUE    : [Tt][Rr][Uu][eE];
FALSE   : [Ff][Aa][lL][sS][Ee];
UNKNOWN : [Uu][nN][Kk][nN][Oo][wW][nN];


DOLLAR_QUOTE : '$' ID? '$';
QUOTE        : '\'';


STRING          : QUOTE ( ~[QUOTE] | '\'\'' )* QUOTE ;

INTEGER_VALUE   : DIGIT+ ;

DECIMAL_VALUE   : DIGIT+ '.' DIGIT*
			    | '.' DIGIT+
			    | DIGIT+ ('.' DIGIT*)? EXPONENT
			    | '.' DIGIT+ EXPONENT
			    ;


CAST        : [Cc][Aa][sS][Tt];
ALIAS       : [Aa][Ll][iI][aA][Ss];
FOR         : [Ff][Oo][Rr];
CREATE      : [Cc][Rr][Ee][Aa][Tt][eE];
REPLACE     : [Rr][Ee][pP][Ll][Aa][cC][Ee];
FUNCTION    : [Ff][uU][nN][cC][Tt][iI][Oo][Nn];
IN    		: [Ii][Nn];
OUT   		: [Oo][Uu][Tt];
INOUT 		: [Ii][Nn][Oo][Uu][Tt];
VARIADIC 	: [Vv][Aa][rR][Ii][aA][Dd][iI][cC];

LANGUAGE      : [Ll][Aa][Nn][Gg][Uu][Aa][Gg][Ee];
LANGUAGE_NAME : [Pp][lL][Pp][Gg][Ss][qQ][Ll]; // we allow PLPGSQL only



DEFAULT     : [Dd][eE][Ff][Aa][Uu][lL][Tt];
RETURNS     : [Rr][eE][tT][uU][rR][nN][sS];
TABLE       : [Tt][Aa][Bb][lL][eE];

AS : [Aa][sS];

DECLARE : [Dd][eE][cC][Ll][aA][rR][Ee];
BEGIN   : [Bb][eE][Gg][Ii][nN];
END     : [Ee][nN][Dd];



WINDOW       : [Ww][Ii][nN][dD][oO][Ww];
IMMUTABLE    : [Ii][Mm][Mm][Uu][Tt][aA][Bb][Ll][eE];
STABLE       : [Ss][tT][aA][Bb][Ll][eE];
VOLATILE     : [Vv][oO][Ll][aA][tT][iI][Ll][eE];


CALLED_ON_NULL_INPUT       : [Cc][aA][Ll][lL][eE][Dd] [Oo][Nn] NULL [Ii][nN][Pp][Uu][Tt];
RETURNS_NULL_ON_NULL_INPUT : RETURNS NULL  [Oo][Nn] NULL [Ii][nN][Pp][Uu][Tt];
STRICT                     : [Ss][Tt][Rr][iI][Cc][Tt];


EXTERNAL         : [Ee][xX][Tt][Ee][Rr][Nn][Aa][Ll];
SECURITY         : [Ss][Ee][Cc][Uu][Rr][iI][Tt][Yy];
SECURITY_INVOKER : EXTERNAL? SECURITY [Ii][nN][Vv][Oo][Kk][Ee][Rr];
SECURITY_DEFINER : EXTERNAL? SECURITY [Dd][Ee][Ff][iI][nN][eE][Rr];

COST       : [Cc][oO][sS][Tt];
ROWS       : [Rr][Oo][wW][Ss];


CONSTANT : [Cc][Oo][Nn][sS][tT][aA][Nn][tT]; 
COLLATE  : [Cc][Oo][Ll][Ll][Aa][Tt][eE];



ID         : [a-zA-Z_] ([a-zA-Z_] | DIGIT)*;

SL_COMMENT : '--' .*? ('\r')? '\n'   -> channel(COMMENTS_CHANNEL); // we might need comments later on e.g. for code formatting
ML_COMMENT : '/*' .*? '*/'           -> channel(COMMENTS_CHANNEL); // we might need comments later on e.g. for code formatting
WS         : [ \t\r\n]+              -> skip ; // skip spaces, tabs, newlines



fragment EXPONENT
    : 'E' ('+' | '-')? DIGIT+
    ;

fragment DIGIT
    : [0-9]
    ;