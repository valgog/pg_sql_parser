lexer grammar LostAndFound;

// NOTE: 0 is default channel that's why we should start with a channel id > 0
// ignore lexer warnings like '...contains a lexer command with an unrecognized constant value..' see http://stackoverflow.com/questions/22027175/why-am-i-getting-an-error-when-assigning-tokens-to-a-channel
@lexer::members {
  public static final int COMMENTS_CHANNEL = 1;
}


ICONST  :   DIGIT+ ( '.' DIGIT* )? ( [Ee] [-+]? DIGIT+ )?
        | '.' DIGIT+ ( [Ee] [-+]? DIGIT+ )?
        ;

FCONST : [0-9] '.' [0-9]*;
BCONST : [Xx] SCONST ;

XCONST : HEX_DIGIT+;

SCONST : QUOTE 	    (ESC|.)*?  QUOTE
       | DQUOTE     (ESC|.)*?  DQUOTE
       | DOLQDELIM  (ESC|.)*?  DOLQDELIM
       ;


INTEGER :  DIGIT ;
DECIMAL : (( DIGIT '.'  DIGIT )|( DIGIT '.'  DIGIT ));
DECIMALFAIL :  DIGIT '.' '.' ;
REAL : ( INTEGER | DECIMAL )[Ee][-+]? DIGIT ;
PARAM : '$'  INTEGER ;

WITH_TIME : WITH TIME;

//-- src/pl/plpgsql/src/pl_scanner.c:
LESS_LESS       : '<<' ;
GREATER_GREATER : '>>' ;

//-- src/interfaces/ecpg/preproc/parse.pl

NULLS_FIRST : NULLS FIRST ;
NULLS_LAST  : NULLS LAST ;


fragment ESC : '\\' QUOTE
             | '\\\\'
             | '\\$'
             ;
fragment TIME      : [Tt][iI][Mm][Ee] ;
fragment WITH      : [Ww][iI][Tt][Hh] ;
fragment NULLS     : [Nn][Uu][Ll][Ll][Ss]   ;
fragment FIRST     : [Ff] [Ii] [Rr] [Ss] [Tt] ;
fragment LAST      : [Ll] [Aa] [Ss] [Tt];
fragment HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;


//-------others

// SPACE : [ \t\n\r\f];
// HORIZ_SPACE : [ \t\f];
// NEWLINE : [\n\r];
// NON_NEWLINE : [^\n\r];
// COMMENT : ('--' NON_NEWLINE );
// WHITESPACE : ( SPACE | COMMENT );
// SPECIAL_WHITESPACE : ( SPACE | COMMENT  NEWLINE );
// HORIZ_WHITESPACE : ( HORIZ_SPACE | COMMENT );
// WHITESPACE_WITH_NEWLINE : ( HORIZ_WHITESPACE  NEWLINE  SPECIAL_WHITESPACE );
// QUOTESTOP :  QUOTE  WHITESPACE ;
// QUOTECONTINUE :  QUOTE  WHITESPACE_WITH_NEWLINE  QUOTE ;
// QUOTEFAIL :  QUOTE  WHITESPACE '-';
// XBSTART : [bB] QUOTE ;
// XBINSIDE : [^']*; // BUG
// XHSTART : [xX] QUOTE ;
// XHINSIDE : [^']*; // BUG
// XNSTART : [nN] QUOTE ;
// XESTART : [eE] QUOTE ;
// XEINSIDE : [^\\']+;
// XEESCAPE : [\\][^0-7];
// XEOCTESC : [\\][0-7] 1,3 ;  // BUG
// XEHEXESC : [\\]x[0-9A-Fa-f] 1,2 ; // BUG
// XEUNICODE : [\\](u[0-9A-Fa-f] 4 |U[0-9A-Fa-f] 8 ); // BUG
// XEUNICODEFAIL : [\\](u[0-9A-Fa-f] 0,3 |U[0-9A-Fa-f] 0,7 ); // BUG
// XQSTART :  QUOTE ;
// XQDOUBLE :  QUOTE  QUOTE ;
// XQINSIDE : [^']+;
// UESCAPE : [uU][eE][sS][cC][aA][pP][eE] WHITESPACE  QUOTE [^'] QUOTE ;
// UESCAPEFAIL : ('-'|[uU][eE][sS][cC][aA][pP][eE] WHITESPACE '-'|[uU][eE][sS][cC][aA][pP][eE] WHITESPACE  QUOTE [^']|[uU][eE][sS][cC][aA][pP][eE] WHITESPACE  QUOTE |[uU][eE][sS][cC][aA][pP][eE] WHITESPACE |[uU][eE][sS][cC][aA][pP]|[uU][eE][sS][cC][aA]|[uU][eE][sS][cC]|[uU][eE][sS]|[uU][eE]|[uU]);
// XUISTART : [uU]& DQUOTE ;  // BUG
// XUSSTART : [uU]& QUOTE ;   // BUG
// XUFAILED : [uU]&; // BUG
// XCSTART : '/' '*'  OP_CHARS ;
// XCSTOP : '*' +'/' ;
// XCINSIDE : [^*/]+;
// SELF : [,()\[\].;\:\+\-\*\/\%\^\<\>\=];
// OP_CHARS : [\~\!\@\#\^\&\|\`\?\+\-\*\/\%\<\>\=];
// OPERATOR :  OP_CHARS ;
// IDENT_START : [A-Za-z\200-\377_];
// IDENT_CONT : [A-Za-z\200-\377_0-9\$];
// IDENTIFIER :  IDENT_START  IDENT_CONT ;
// OTHER : .;




QUOTE : '\'';
DOLQ_START : [A-Za-z\200-\377_];
DOLQ_CONT : [A-Za-z\200-\377_0-9];
DOLQDELIM : '$' ( DOLQ_START  DOLQ_CONT )?'$' ;
DOLQFAILED : '$'  DOLQ_START  DOLQ_CONT ;
DOLQINSIDE : [^$]+;
DQUOTE : '\"' ;
XDSTART :  DQUOTE ;
XDSTOP :  DQUOTE ;
XDDOUBLE :  DQUOTE  DQUOTE ;
XDINSIDE : [^\"]+;
fragment DIGIT : [0-9];

TYPECAST : '::';
DOT_DOT : '.' '.' ;
COLON_EQUALS : ':=';


WS         : [ \t\r\n]+              -> skip ; // skip spaces, tabs, newlines
SL_COMMENT : '--' .*? ('\r')? '\n'   -> channel(COMMENTS_CHANNEL); // we might need comments later on e.g. for code formatting
ML_COMMENT : '/*' .*? '*/'           -> channel(COMMENTS_CHANNEL); // we might need comments later on e.g. for code formatting