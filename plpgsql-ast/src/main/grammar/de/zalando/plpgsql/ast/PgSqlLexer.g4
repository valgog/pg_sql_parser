lexer grammar PgSqlLexer;

TYPECAST        : '::' ;
DOT_DOT         : '..' ;
COLON_EQUALS    : ':=' ;
SCONST          : XQString
                | XNString
                | XDOLQString
                ;
BCONST          : XBString;
XCONST          : XHString;
IDENT           : XDQString
                | XUIString
                | IDENT_START IDENT_CONT*
                ;
PARAM           : '$' T_integer ;
FCONST          : T_real | T_decimal;
ICONST          : T_integer;

/** Operator */

Op              : OP_CHAR_SAFE+ | '-' | '+'+ | '/'+ ;

//OP_CHAR         : [~!@#^&|`?+*/%<>=-] ;
fragment OP_CHAR_SAFE  : [~!@#^&|`?*%<>=] ;
//OP_CHAR_MILTI : [~!@#%^&|`] ;

/** Line comment */
T_comment       : '--' ( ~[\n\r] )* -> channel(COMMENT);
/** C-style comments */

T_ccomment      : '/*' ( T_ccomment | T_xcinside )*? '*/' -> channel(COMMENT) ;
fragment
T_xcinside      : ~[*/]+ ;

T_whitespace    : ( T_space+ | T_comment ) ;

T_space         : [ \t\n\r\f] -> skip;
T_newline       : [\n\r] -> skip;

/** Numbers */
fragment T_real          : ( T_integer | T_decimal ) [Ee] [-+]? DIGIT+ ;
fragment T_decimal       : ( ( DIGIT* '.' DIGIT+ ) | ( DIGIT+ '.' DIGIT* ) ) ;
fragment T_integer       : DIGIT+ ;

/*
 * SQL requires at least one newline in the whitespace separating
 * string literals that are to be concatenated.  Silly, but who are we
 * to argue?  Note that {whitespace_with_newline} should not have * after
 * it, whereas {whitespace} should generally have a * after it...
 */

T_special_whitespace      : T_space+ | T_comment T_newline ;
T_horiz_whitespace        : T_horiz_space | T_comment ;
T_whitespace_with_newline : T_horiz_whitespace* T_newline T_special_whitespace* ;

T_horiz_space : [ \t\f] -> skip;

/*
 * To ensure that {quotecontinue} can be scanned without having to back up
 * if the full pattern isn't matched, we include trailing whitespace in
 * {quotestop}.  This matches all cases where {quotecontinue} fails to match,
 * except for {quote} followed by whitespace and just one "-" (not two,
 * which would start a {comment}).  To cover that we have {quotefail}.
 * The actions for {quotestop} and {quotefail} must throw back characters
 * beyond the quote proper.
 */
fragment T_quote         : '\'' ;
fragment T_nonquote      : ~'\''+ ;
fragment T_quotestop     : T_quote T_whitespace* ;
fragment T_quotecontinue : T_quote T_whitespace_with_newline T_quote ;
fragment T_xqdouble      : T_quote T_quote ;

/** Quoted string */
fragment XQString : T_quote ( T_xqdouble | T_quotecontinue | T_nonquote )*? T_quote ;
/** Binary string number */
fragment XBString : [bB] T_quote ( T_quotecontinue | [01]+ )*? T_quote ;
/** Hexadecimal number */
fragment XHString : [xX] T_quote ( T_quotecontinue | HDIGIT+ )*? T_quote ;
/** National character (TODO: check if we need a version check here) */
fragment XNString : [nN] XQString ;
/* Quoted string that allows backslash escapes */
fragment XEString : [eE] T_quote ( T_xqdouble
                                 | T_quotecontinue
                                 | '\\' ( 'x' ( HDIGIT HDIGIT? ) // hex
                                        | ( 'u' HDIGIT HDIGIT HDIGIT HDIGIT
                                          | 'U' HDIGIT HDIGIT HDIGIT HDIGIT HDIGIT HDIGIT HDIGIT HDIGIT
                                          ) // unicode
                                        | NOT_ODIGIT // escape
                                        | ( ODIGIT ODIGIT ODIGIT | ODIGIT ODIGIT | ODIGIT ) // octets
                                        ) // escapes
                                 | T_nonquote )*? T_quote ;

fragment DIGIT         : [0-9] ;
fragment ODIGIT        : [0-7] ;
fragment NOT_ODIGIT    : ~[0-7] ;
fragment HDIGIT        : [0-9A-Fa-f] ;

/* $foo$ style quotes ("dollar quoting")
 * The quoted string starts with $foo$ where "foo" is an optional string
 * in the form of an identifier, except that it may not contain "$",
 * and extends to the first occurrence of an identical string.
 * There is *no* processing of the quoted text.
 *
 * {dolqfailed} is an error rule to avoid scanner backup when {dolqdelim}
 * fails to match its trailing "$".
 */

fragment XDOLQString : '$$' .*? '$$'
                     | '$BODY$' .*? '$BODY$' // this is a hack until the $$ string is implemented
                     | '$function$' .*? '$function$'
                     ;
/*
TODO: do something about the comlex dollar delimited strings
fragment XDOLDelim   : '$' [A-Za-z\200-\377_] [A-Za-z\200-\377_0-9]* '$' ;
*/

fragment IDENT_START   : [A-Za-z\u00C7-\u00A0_] ;
fragment IDENT_CONT    : [A-Za-z\u00C7-\u00A0_0-9\$] ;

/* Double quote
 * Allows embedded spaces and other special characters into identifiers.
 */
fragment XDQString    : T_dquote ( T_xddouble | T_nondquote )*? T_dquote ;

fragment T_dquote     : '"' ;
fragment T_nondquote  : ~'"'+ ;
fragment T_xddouble   : T_dquote T_dquote ;

/* Unicode escapes */
fragment T_uescape    : [uU][eE][sS][cC][aA][pP][eE] T_whitespace* T_quote T_nondquote*? T_quote ;

fragment XUIString    : [uU] '&' XDQString ( T_whitespace* T_uescape )? ;

/*
 * "self" is the set of chars that should be returned as single-character
 * tokens.  "op_chars" is the set of chars that can make up "Op" tokens,
 * which can be one or more characters long (but if a single-char token
 * appears in the "self" set, it is not to be returned as an Op).  Note
 * that the sets overlap, but each has some chars that are not in the other.
 *
 * If you change either set, adjust the character lists appearing in the
 * rule for "operator"!
 */