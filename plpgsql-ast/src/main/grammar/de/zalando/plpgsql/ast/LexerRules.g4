lexer grammar LexerRules;

// NOTE: 0 is default channel that's why we should start with a channel id > 0
@lexer::members {
	public static final int COMMENTS_CHANNEL = 1;
}

// ---------
// -- lexer rules
// ---------

// -- operators

LIKE 	    : ([Ii])? [Ll][iI][Kk][eE];
SIMILAR_OP  : SIMILAR TO;
SIMILAR     : [Ss][iI][mM][[iI][Ll][Aa][Rr];
TO          : [Tt][Oo];
AND         : [Aa][Nn][Dd];
OR          : [Oo][Rr];
ASSIGN_OP   :  ':=' ;
BETWEEN     : [Bb][eE][Tt][wW][eE][eE][nN];
IS      : [Ii][Ss];
NOT     : [Nn][Oo][Tt];
ISNULL  : [Ii][Ss][Nn][uU][Ll][Ll];
NOTNULL : [Nn][Oo][Tt][Nn][uU][Ll][Ll];


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




SELECT    : [Ss][eE][Ll][Ee][cC][Tt];
ALL       : [Aa][lL][lL];
DISTINCT  : [Dd][iI][Ss][tT][iI][nN][Cc][tT]; 
FROM      : [Ff][rR][Oo][Mm];
WHERE     : [Ww][Hh][Ee][Rr][Ee];
GROUP_BY  : GROUP BY;
GROUP     : [Gg][rR][Oo][Uu][Pp];
BY        : [Bb][yY];
ORDER_BY  : ORDER BY;
ORDER     : [Oo][Rr][Dd][Ee][Rr];
LIMIT     : [Ll][Ii][mM][Ii][Tt];
OFFSET    : [Oo][Ff][Ff][Ss][eE][Tt];
ROW       : [Rr][Oo][wW];
ROWS      : ROW [Ss];
FETCH     : [Ff][eE][Tt][cC][Hh];
ONLY      : [Oo][nN][Ll][Yy];
UPDATE    : [Uu][pP][Dd][Aa][Tt][Ee];
SHARE     : [Ss][hH][aA][Rr][Ee];
OF        : [Oo][Ff];
NOWAIT    : [Nn][Oo][Ww][aA][iI][Tt];
INTO      : [Ii][Nn][Tt][oO];
STRICT    : [Ss][Rr][Ii][Cc][Tt];
UNION     : [Uu][Nn][Ii][Oo][Nn];
INTERSECT : [Ii][Nn][Tt][Ee][Rr][Ss][eE][Cc][Tt];
EXCEPT    : [Ee][Xx][Cc][eE][pP][Tt];
ASC       : [Aa][Ss][Cc];
DESC	  : [Dd][Ee][Ss][Cc];
USING     : [Uu][sS][Ss][iI][nN][Gg];
NULLS     : [Nn][Uu][Ll][Ll][sS];
FIRST     : [Ff][iI][rR][sS][Tt];
NEXT      : [Nn][eE][xX][tT];
LAST      : [Ll][Aa][sS][tT];
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
ON          : [Oo][Nn];
HAVING      : [Hh][Aa][vV][Ii][Nn][Gg];

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



EXTERNAL         : [Ee][xX][Tt][Ee][Rr][Nn][Aa][Ll];
SECURITY         : [Ss][Ee][Cc][Uu][Rr][iI][Tt][Yy];
SECURITY_INVOKER : EXTERNAL? SECURITY [Ii][nN][Vv][Oo][Kk][Ee][Rr];
SECURITY_DEFINER : EXTERNAL? SECURITY [Dd][Ee][Ff][iI][nN][eE][Rr];

COST       : [Cc][oO][sS][Tt];


CONSTANT : [Cc][Oo][Nn][sS][tT][aA][Nn][tT]; 
COLLATE  : [Cc][Oo][Ll][Ll][Aa][Tt][eE];


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

ID         : [a-zA-Z_] ([a-zA-Z_] | DIGIT)*;
QNAME      : ID ('.' ID)?;

SL_COMMENT : '--' .*? ('\r')? '\n'   -> channel(COMMENTS_CHANNEL); // we might need comments later on e.g. for code formatting
ML_COMMENT : '/*' .*? '*/'           -> channel(COMMENTS_CHANNEL); // we might need comments later on e.g. for code formatting
WS         : [ \t\r\n]+              -> skip ; // skip spaces, tabs, newlines



fragment EXPONENT
    : 'E' ('+' | '-')? DIGIT+
    ;

fragment DIGIT
    : [0-9]
    ;

