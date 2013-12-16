lexer grammar LexerRules;

// NOTE: 0 is default channel that's why we should start with a channel id > 0
@lexer::members {
	public static final int COMMENTS_CHANNEL = 1;
}

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

