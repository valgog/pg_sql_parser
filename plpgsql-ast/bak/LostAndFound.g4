lexer grammar LostAndFound;

//-- src/interfaces/ecpg/preproc/parse.pl

fragment TIME : [Tt][iI][Mm][Ee] ;
fragment WITH : [Ww][iI][Tt][Hh] ;
WITH_TIME : WITH TIME;

TYPECAST     : '::' ;
DOT_DOT      : '..' ;

fragment NULLS : [Nn][Uu][Ll][Ll][Ss]   ;
fragment FIRST : [Ff] [Ii] [Rr] [Ss] [Tt] ;
fragment LAST  : [Ll] [Aa] [Ss] [Tt];

NULLS_FIRST : NULLS FIRST ;
NULLS_LAST  : NULLS LAST ;

//-- src/pl/plpgsql/src/pl_scanner.c:
LESS_LESS       : '<<' ;
GREATER_GREATER : '>>' ;
COLON_EQUALS    : ':=' ;


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





// see http://stackoverflow.com/questions/11898127/antlr-string-can-not-match
SCONST : '\'' ( ~'\'' | '\'\'' )* '\''
       ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;


//FIXME most likely, this is not correct...
// T_DATUM : T_WORD | T_CWORD;



FCONST : [0-9] '.' [0-9]*;
BCONST : [Xx] SCONST ;


XCONST : HEX_DIGIT+;



PARAM :  '?' DIGIT*
      | [:@$] IDENT
      ;

fragment DIGIT : [0-9];


WS         : [ \t\r\n]+              -> skip ; // skip spaces, tabs, newlines
SL_COMMENT : '--' .*? ('\r')? '\n'   -> channel(COMMENTS_CHANNEL); // we might need comments later on e.g. for code formatting
ML_COMMENT : '/*' .*? '*/'           -> channel(COMMENTS_CHANNEL); // we might need comments later on e.g. for code formatting


