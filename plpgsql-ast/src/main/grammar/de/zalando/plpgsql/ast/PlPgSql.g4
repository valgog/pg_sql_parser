//
// Grammar for plpgsql Postgres 9.1
// 
grammar PlPgSql;

@lexer::members {
	public static final int COMMENTS_CHANNEL = 0;
}

// ---------
// -- parser rules
// ---------

unit        : plFunction+; // each file has at least one function definition

// ---------
// -- http://www.postgresql.org/docs/9.1/static/sql-createfunction.html
// -- NOTE: for now, the specification is not fully matched (the parts following after ROWS definition are ommitted) 
// ---------

type 			   : ID;
functionName       : ID;

plFunction         : CREATE (OR REPLACE)? FUNCTION functionName '(' functionArgsList ')' functionReturns AS functionBody LANGUAGE LANGUAGE_NAME functionSettings? ';';
functionArgsList   : functionArg*;
functionArg        : argMode? varDecl ','?;

argMode	           : IN 
	               | OUT
	               | INOUT 
	               | VARIADIC 
	               ;

varDecl            : ID type ( ( DEFAULT | ASSIGN_OP ) expr )? ;
functionReturns    : RETURNS type
				   | RETURNS (type ID)+
				   ;
				   
functionBody       : DOLLAR_QUOTE (DECLARE varDecl)? block DOLLAR_QUOTE;
block              : BEGIN stmts END ';';


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
						
functionCosts           : COST COST_VALUE;

functionRows            : ROWS ROWS_VALUE;

expr  : ID;
stmts : stmt*; // we allow empty functions
stmt  : ID;


// ---------
// -- lexer rules
// ---------


CREATE      : [Cc][Rr][Ee][Aa][Tt][eE];
REPLACE     : [Rr][Ee][pP][Ll][Aa][cC][Ee];
FUNCTION    : [Ff][uU][nN][cC][Tt][iI][Oo][Nn];
OR          : [Oo][Rr];
IN    		: [Ii][Nn];
OUT   		: [Oo][Uu][Tt];
INOUT 		: [Ii][Nn][Oo][Uu][Tt];
VARIADIC 	: [Vv][Aa][rR][Ii][aA][Dd][iI][cC];

LANGUAGE      : [Ll][Aa][Nn][Gg][Uu][Aa][Gg][Ee];
LANGUAGE_NAME : [Pp][lL][Pp][Gg][Ss][qQ][Ll]; // we allow PLPGSQL only


ASSIGN_OP   : '='  | ':=';
DEFAULT     : [Dd][eE][Ff][Aa][Uu][lL][Tt];
RETURNS     : [Rr][eE][tT][uU][rR][nN][sS];
TABLE       : [Tt][Aa][Bb][lL][eE];

AS : [Aa][sS];

DECLARE : [Dd][eE][cC][Ll][aA][rR][Ee];
BEGIN   : [Bb][eE][Gg][Ii][nN];
END     : [Ee][nN][Dd];

DOLLAR_QUOTE : '$' ID? '$';
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
COST_VALUE : [0-9]+;

ROWS       : [Rr][Oo][wW][Ss];
ROWS_VALUE : [0-9]+;



NULL : [Nn][uU][Ll][Ll];


ID         : [a-zA-Z_] [a-zA-Z0-9_]*;
SL_COMMENT : '--' .*? NL   -> channel(COMMENTS_CHANNEL); // we might need comments later on e.g. for code formatting
ML_COMMENT : '/*' .*? '*/' -> channel(COMMENTS_CHANNEL); // we might need comments later on e.g. for code formatting
NL         : ('\r')? '\n';
WS         : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
