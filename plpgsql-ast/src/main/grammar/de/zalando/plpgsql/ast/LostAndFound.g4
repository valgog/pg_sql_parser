lexer grammar LostAndFound;


SPACE : [ \t\n\r\f];
HORIZ_SPACE : [ \t\f];
NEWLINE : [\n\r];
NON_NEWLINE : [^\n\r];
COMMENT : ('--' NON_NEWLINE );
WHITESPACE : ( SPACE | COMMENT );
SPECIAL_WHITESPACE : ( SPACE | COMMENT  NEWLINE );
HORIZ_WHITESPACE : ( HORIZ_SPACE | COMMENT );
WHITESPACE_WITH_NEWLINE : ( HORIZ_WHITESPACE  NEWLINE  SPECIAL_WHITESPACE );
QUOTE : '\'';
QUOTESTOP :  QUOTE  WHITESPACE ;
QUOTECONTINUE :  QUOTE  WHITESPACE_WITH_NEWLINE  QUOTE ;
QUOTEFAIL :  QUOTE  WHITESPACE '-';
XBSTART : [bB] QUOTE ;
//XBINSIDE : [^']*; // BUG
XHSTART : [xX] QUOTE ;
//XHINSIDE : [^']*; // BUG
XNSTART : [nN] QUOTE ;
XESTART : [eE] QUOTE ;
XEINSIDE : [^\\']+;
XEESCAPE : [\\][^0-7];
// XEOCTESC : [\\][0-7] 1,3 ;  // BUG
// XEHEXESC : [\\]x[0-9A-Fa-f] 1,2 ; // BUG
// XEUNICODE : [\\](u[0-9A-Fa-f] 4 |U[0-9A-Fa-f] 8 ); // BUG
// XEUNICODEFAIL : [\\](u[0-9A-Fa-f] 0,3 |U[0-9A-Fa-f] 0,7 ); // BUG
XQSTART :  QUOTE ;
XQDOUBLE :  QUOTE  QUOTE ;
XQINSIDE : [^']+;
DOLQ_START : [A-Za-z\200-\377_];
DOLQ_CONT : [A-Za-z\200-\377_0-9];
DOLQDELIM : '$' ( DOLQ_START  DOLQ_CONT )?'$' ;
DOLQFAILED : '$'  DOLQ_START  DOLQ_CONT ;
DOLQINSIDE : [^$]+;
DQUOTE : '"' ;
XDSTART :  DQUOTE ;
XDSTOP :  DQUOTE ;
XDDOUBLE :  DQUOTE  DQUOTE ;
XDINSIDE : [^"]+;
UESCAPE : [uU][eE][sS][cC][aA][pP][eE] WHITESPACE  QUOTE [^'] QUOTE ;
UESCAPEFAIL : ('-'|[uU][eE][sS][cC][aA][pP][eE] WHITESPACE '-'|[uU][eE][sS][cC][aA][pP][eE] WHITESPACE  QUOTE [^']|[uU][eE][sS][cC][aA][pP][eE] WHITESPACE  QUOTE |[uU][eE][sS][cC][aA][pP][eE] WHITESPACE |[uU][eE][sS][cC][aA][pP]|[uU][eE][sS][cC][aA]|[uU][eE][sS][cC]|[uU][eE][sS]|[uU][eE]|[uU]);
// XUISTART : [uU]& DQUOTE ;  // BUG
// XUSSTART : [uU]& QUOTE ;   // BUG
// XUFAILED : [uU]&; // BUG
XCSTART : '/' '*'  OP_CHARS ;
XCSTOP : '*' +'/' ;
XCINSIDE : [^*/]+;
DIGIT : [0-9];
IDENT_START : [A-Za-z\200-\377_];
IDENT_CONT : [A-Za-z\200-\377_0-9\$];
IDENTIFIER :  IDENT_START  IDENT_CONT ;
TYPECAST : '::';
DOT_DOT : '.' '.' ;
COLON_EQUALS : ':=';
SELF : [,()\[\].;\:\+\-\*\/\%\^\<\>\=];
OP_CHARS : [\~\!\@\#\^\&\|\`\?\+\-\*\/\%\<\>\=];
OPERATOR :  OP_CHARS ;
INTEGER :  DIGIT ;
DECIMAL : (( DIGIT '.'  DIGIT )|( DIGIT '.'  DIGIT ));
DECIMALFAIL :  DIGIT '.' '.' ;
REAL : ( INTEGER | DECIMAL )[Ee][-+]? DIGIT ;
PARAM : '$'  INTEGER ;
OTHER : .;







//-- src/interfaces/ecpg/preproc/parse.pl

fragment TIME : [Tt][iI][Mm][Ee] ;
fragment WITH : [Ww][iI][Tt][Hh] ;
WITH_TIME : WITH TIME;


fragment NULLS : [Nn][Uu][Ll][Ll][Ss]   ;
fragment FIRST : [Ff] [Ii] [Rr] [Ss] [Tt] ;
fragment LAST  : [Ll] [Aa] [Ss] [Tt];

NULLS_FIRST : NULLS FIRST ;
NULLS_LAST  : NULLS LAST ;

//-- src/pl/plpgsql/src/pl_scanner.c:
LESS_LESS       : '<<' ;
GREATER_GREATER : '>>' ;


//
// Other tokens recognized by plpgsql's lexer interface layer (pl_scanner.c).
//
// token <word>           T_WORD          /* unrecognized simple identifier */
//token <cword>          T_CWORD         /* unrecognized composite identifier */
//token <wdatum>         T_DATUM         /* a VAR, ROW, REC, or RECFIELD variable */
//token                          LESS_LESS
//token                          GREATER_GREATER
//

// TODO don't know if this is correct. couldn't find definition anywhere...
// see https://github.com/antlr/grammars-v4/blob/master/sqlite/SQLite.g4

// T_WORD  : [0-9]* [A-Za-z\\_]+ [0-9]* ;
// T_CWORD : T_WORD '.' T_WORD       ;

ICONST  :   DIGIT+ ( '.' DIGIT* )? ( [Ee] [-+]? DIGIT+ )?
        | '.' DIGIT+ ( [Ee] [-+]? DIGIT+ )?
        ;

IDENT : '"' (~'"' | '""')* '"'
      | '`' (~'`' | '``')* '`'
      | '[' ~']'* ']'
      | [a-zA-Z_] [a-zA-Z_0-9]* // TODO check: needs more chars in set
      ;



fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;


//FIXME most likely, this is not correct...
// T_DATUM : T_WORD | T_CWORD;



FCONST : [0-9] '.' [0-9]*;
BCONST : [Xx] SCONST ;


XCONST : HEX_DIGIT+;



SCONST : QUOTE 	    (ESC|.)*?  QUOTE
       | DQUOTE     (ESC|.)*?  DQUOTE
       | DOLQDELIM  (ESC|.)*?  DOLQDELIM
       ;

ESC : '\\' QUOTE
    | '\\\\'
    | '\\$'
    ;


T_WORD  : [A-Za-z0-9]+;
T_CWORD : [A-Za-z0-9];
