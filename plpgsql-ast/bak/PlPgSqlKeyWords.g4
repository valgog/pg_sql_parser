lexer grammar PlPgSqlKeyWords;

// NOTE: 0 is default channel that's why we should start with a channel id > 0
@lexer::members {
  public static final int COMMENTS_CHANNEL = 1;
}
/*-------------------------------------------------------------------------
 *
 * pl_scanner.c
 *	  lexical scanning for PL/pgSQL
 *
 *
 * Portions Copyright (c) 1996-2012, PostgreSQL Global Development Group
 * Portions Copyright (c) 1994, Regents of the University of California
 *
 *
 * IDENTIFICATION
 *	  src/pl/plpgsql/src/pl_scanner.c
 *
 *-------------------------------------------------------------------------
 */

/*
 * A word about keywords:
 *
 * We keep reserved and unreserved keywords in separate arrays.  The
 * reserved keywords are passed to the core scanner, so they will be
 * recognized before (and instead of) any variable name.  Unreserved
 * words are checked for separately, after determining that the identifier
 * isn't a known variable name.  If plpgsql_IdentifierLookup is DECLARE then
 * no variable names will be recognized, so the unreserved words always work.
 * (Note in particular that this helps us avoid reserving keywords that are
 * only needed in DECLARE sections.)
 *
 * In certain contexts it is desirable to prefer recognizing an unreserved
 * keyword over recognizing a variable name.  Those cases are handled in
 * gram.y using tok_is_keyword().
 *
 * For the most part, the reserved keywords are those that start a PL/pgSQL
 * statement (and so would conflict with an assignment to a variable of the
 * same name).	We also don't sweat it much about reserving keywords that
 * are reserved in the core grammar.  Try to avoid reserving other words.
 */

  // PG_KEYWORD("all", K_ALL, RESERVED_KEYWORD)
K_ALL : [aA][lL][lL];

  // PG_KEYWORD("begin", K_BEGIN, RESERVED_KEYWORD)
K_BEGIN : [bB][eE][gG][iI][nN];

  // PG_KEYWORD("by", K_BY, RESERVED_KEYWORD)
K_BY : [bB][yY];

  // PG_KEYWORD("case", K_CASE, RESERVED_KEYWORD)
K_CASE : [cC][aA][sS][eE];

  // PG_KEYWORD("close", K_CLOSE, RESERVED_KEYWORD)
K_CLOSE : [cC][lL][oO][sS][eE];

  // PG_KEYWORD("collate", K_COLLATE, RESERVED_KEYWORD)
K_COLLATE : [cC][oO][lL][lL][aA][tT][eE];

  // PG_KEYWORD("continue", K_CONTINUE, RESERVED_KEYWORD)
K_CONTINUE : [cC][oO][nN][tT][iI][nN][uU][eE];

  // PG_KEYWORD("declare", K_DECLARE, RESERVED_KEYWORD)
K_DECLARE : [dD] [eE] [cC] [lL] [aA] [rR] [eE];

  // PG_KEYWORD("default", K_DEFAULT, RESERVED_KEYWORD)
K_DEFAULT : [dD][eE][fF][aA][uU][lL][tT];

  // PG_KEYWORD("diagnostics", K_DIAGNOSTICS, RESERVED_KEYWORD)
K_DIAGNOSTICS : [dD][iI][aA][gG][nN][oO][sS][tT][iI][cC][sS];

  // PG_KEYWORD("else", K_ELSE, RESERVED_KEYWORD)
K_ELSE : [eE][lL][sS][eE];

  // PG_KEYWORD("elsif", K_ELSIF, RESERVED_KEYWORD)
K_ELSIF : [eE][lL][sS][iI][fF];

  // PG_KEYWORD("end", K_END, RESERVED_KEYWORD)
K_END : [eE][nN][dD];

  // PG_KEYWORD("exception", K_EXCEPTION, RESERVED_KEYWORD)
K_EXCEPTION : [eE][xX][cC][eE][pP][tT][iI][oO][nN];

  // PG_KEYWORD("execute", K_EXECUTE, RESERVED_KEYWORD)
K_EXECUTE : [eE][xX][eE][cC][uU][tT][eE];

  // PG_KEYWORD("exit", K_EXIT, RESERVED_KEYWORD)
K_EXIT : [eE][xX][iI][tT];

  // PG_KEYWORD("fetch", K_FETCH, RESERVED_KEYWORD)
K_FETCH : [fF][eE][tT][cC][hH];

  // PG_KEYWORD("for", K_FOR, RESERVED_KEYWORD)
K_FOR : [fF][oO][rR];

  // PG_KEYWORD("foreach", K_FOREACH, RESERVED_KEYWORD)
K_FOREACH : [fF][oO][rR][eE][aA][cC][hH];

  // PG_KEYWORD("from", K_FROM, RESERVED_KEYWORD)
K_FROM : [fF][rR][oO][mM];

  // PG_KEYWORD("get", K_GET, RESERVED_KEYWORD)
K_GET : [gG][eE][tT];

  // PG_KEYWORD("if", K_IF, RESERVED_KEYWORD)
K_IF : [iI][fF];

  // PG_KEYWORD("in", K_IN, RESERVED_KEYWORD)
K_IN : [iI][nN];

  // PG_KEYWORD("insert", K_INSERT, RESERVED_KEYWORD)
K_INSERT : [iI][nN][sS][eE][rR][tT];

  // PG_KEYWORD("into", K_INTO, RESERVED_KEYWORD)
K_INTO : [iI][nN][tT][oO];

  // PG_KEYWORD("loop", K_LOOP, RESERVED_KEYWORD)
K_LOOP : [lL][oO][oO][pP];

  // PG_KEYWORD("move", K_MOVE, RESERVED_KEYWORD)
K_MOVE : [mM][oO][vV][eE];

  // PG_KEYWORD("not", K_NOT, RESERVED_KEYWORD)
K_NOT : [nN][oO][tT];

  // PG_KEYWORD("null", K_NULL, RESERVED_KEYWORD)
K_NULL : [nN][uU][lL][lL];

  // PG_KEYWORD("open", K_OPEN, RESERVED_KEYWORD)
K_OPEN : [oO][pP][eE][nN];

  // PG_KEYWORD("or", K_OR, RESERVED_KEYWORD)
K_OR : [oO][rR];

  // PG_KEYWORD("perform", K_PERFORM, RESERVED_KEYWORD)
K_PERFORM : [pP][eE][rR][fF][oO][rR][mM];

  // PG_KEYWORD("raise", K_RAISE, RESERVED_KEYWORD)
K_RAISE : [rR][aA][iI][sS][eE];

  // PG_KEYWORD("return", K_RETURN, RESERVED_KEYWORD)
K_RETURN : [rR][eE][tT][uU][rR][nN];

  // PG_KEYWORD("strict", K_STRICT, RESERVED_KEYWORD)
K_STRICT : [sS][tT][rR][iI][cC][tT];

  // PG_KEYWORD("then", K_THEN, RESERVED_KEYWORD)
K_THEN : [tT][hH][eE][nN];

  // PG_KEYWORD("to", K_TO, RESERVED_KEYWORD)
K_TO : [tT][oO];

  // PG_KEYWORD("using", K_USING, RESERVED_KEYWORD)
K_USING : [uU][sS][iI][nN][gG];

  // PG_KEYWORD("when", K_WHEN, RESERVED_KEYWORD)
K_WHEN : [wW][hH][eE][nN];

  // PG_KEYWORD("while", K_WHILE, RESERVED_KEYWORD)
K_WHILE : [wW][hH][iI][lL][eE];

  // PG_KEYWORD("absolute", K_ABSOLUTE, UNRESERVED_KEYWORD)
K_ABSOLUTE : [aA][bB][sS][oO][lL][uU][tT][eE];

  // PG_KEYWORD("alias", K_ALIAS, UNRESERVED_KEYWORD)
K_ALIAS : [aA][lL][iI][aA][sS];

  // PG_KEYWORD("array", K_ARRAY, UNRESERVED_KEYWORD)
K_ARRAY : [aA][rR][rR][aA][yY];

  // PG_KEYWORD("backward", K_BACKWARD, UNRESERVED_KEYWORD)
K_BACKWARD : [bB][aA][cC][kK][wW][aA][rR][dD];

  // PG_KEYWORD("constant", K_CONSTANT, UNRESERVED_KEYWORD)
K_CONSTANT : [cC][oO][nN][sS][tT][aA][nN][tT];

  // PG_KEYWORD("current", K_CURRENT, UNRESERVED_KEYWORD)
K_CURRENT : [cC][uU][rR][rR][eE][nN][tT];

  // PG_KEYWORD("cursor", K_CURSOR, UNRESERVED_KEYWORD)
K_CURSOR : [cC][uU][rR][sS][oO][rR];

  // PG_KEYWORD("debug", K_DEBUG, UNRESERVED_KEYWORD)
K_DEBUG : [dD][eE][bB][uU][gG];

  // PG_KEYWORD("detail", K_DETAIL, UNRESERVED_KEYWORD)
K_DETAIL : [dD][eE][tT][aA][iI][lL];

  // PG_KEYWORD("dump", K_DUMP, UNRESERVED_KEYWORD)
K_DUMP : [dD][uU][mM][pP];

  // PG_KEYWORD("errcode", K_ERRCODE, UNRESERVED_KEYWORD)
K_ERRCODE : [eE][rR][rR][cC][oO][dD][eE];

  // PG_KEYWORD("error", K_ERROR, UNRESERVED_KEYWORD)
K_ERROR : [eE][rR][rR][oO][rR];

  // PG_KEYWORD("first", K_FIRST, UNRESERVED_KEYWORD)
K_FIRST : [fF][iI][rR][sS][tT];

  // PG_KEYWORD("forward", K_FORWARD, UNRESERVED_KEYWORD)
K_FORWARD : [fF][oO][rR][wW][aA][rR][dD];

  // PG_KEYWORD("hint", K_HINT, UNRESERVED_KEYWORD)
K_HINT : [hH][iI][nN][tT];

  // PG_KEYWORD("info", K_INFO, UNRESERVED_KEYWORD)
K_INFO : [iI][nN][fF][oO];

  // PG_KEYWORD("is", K_IS, UNRESERVED_KEYWORD)
K_IS : [iI][sS];

  // PG_KEYWORD("last", K_LAST, UNRESERVED_KEYWORD)
K_LAST : [lL][aA][sS][tT];

  // PG_KEYWORD("log", K_LOG, UNRESERVED_KEYWORD)
K_LOG : [lL][oO][gG];

  // PG_KEYWORD("message", K_MESSAGE, UNRESERVED_KEYWORD)
K_MESSAGE : [mM][eE][sS][sS][aA][gG][eE];

  // PG_KEYWORD("message_text", K_MESSAGE_TEXT, UNRESERVED_KEYWORD)
K_MESSAGE_TEXT : [mM][eE][sS][sS][aA][gG][eE][__][tT][eE][xX][tT];

  // PG_KEYWORD("next", K_NEXT, UNRESERVED_KEYWORD)
K_NEXT : [nN][eE][xX][tT];

  // PG_KEYWORD("no", K_NO, UNRESERVED_KEYWORD)
K_NO : [nN][oO];

  // PG_KEYWORD("notice", K_NOTICE, UNRESERVED_KEYWORD)
K_NOTICE : [nN][oO][tT][iI][cC][eE];

  // PG_KEYWORD("option", K_OPTION, UNRESERVED_KEYWORD)
K_OPTION : [oO][pP][tT][iI][oO][nN];

  // PG_KEYWORD("pg_exception_context", K_PG_EXCEPTION_CONTEXT, UNRESERVED_KEYWORD)
K_PG_EXCEPTION_CONTEXT : [pP][gG][__][eE][xX][cC][eE][pP][tT][iI][oO][nN][__][cC][oO][nN][tT][eE][xX][tT];

  // PG_KEYWORD("pg_exception_detail", K_PG_EXCEPTION_DETAIL, UNRESERVED_KEYWORD)
K_PG_EXCEPTION_DETAIL : [pP][gG][__][eE][xX][cC][eE][pP][tT][iI][oO][nN][__][dD][eE][tT][aA][iI][lL];

  // PG_KEYWORD("pg_exception_hint", K_PG_EXCEPTION_HINT, UNRESERVED_KEYWORD)
K_PG_EXCEPTION_HINT : [pP][gG][__][eE][xX][cC][eE][pP][tT][iI][oO][nN][__][hH][iI][nN][tT];

  // PG_KEYWORD("prior", K_PRIOR, UNRESERVED_KEYWORD)
K_PRIOR : [pP][rR][iI][oO][rR];

  // PG_KEYWORD("query", K_QUERY, UNRESERVED_KEYWORD)
K_QUERY : [qQ][uU][eE][rR][yY];

  // PG_KEYWORD("relative", K_RELATIVE, UNRESERVED_KEYWORD)
K_RELATIVE : [rR][eE][lL][aA][tT][iI][vV][eE];

  // PG_KEYWORD("result_oid", K_RESULT_OID, UNRESERVED_KEYWORD)
K_RESULT_OID : [rR][eE][sS][uU][lL][tT][__][oO][iI][dD];

  // PG_KEYWORD("returned_sqlstate", K_RETURNED_SQLSTATE, UNRESERVED_KEYWORD)
K_RETURNED_SQLSTATE : [rR][eE][tT][uU][rR][nN][eE][dD][__][sS][qQ][lL][sS][tT][aA][tT][eE];

  // PG_KEYWORD("reverse", K_REVERSE, UNRESERVED_KEYWORD)
K_REVERSE : [rR][eE][vV][eE][rR][sS][eE];

  // PG_KEYWORD("row_count", K_ROW_COUNT, UNRESERVED_KEYWORD)
K_ROW_COUNT : [rR][oO][wW][__][cC][oO][uU][nN][tT];

  // PG_KEYWORD("rowtype", K_ROWTYPE, UNRESERVED_KEYWORD)
K_ROWTYPE : [rR][oO][wW][tT][yY][pP][eE];

  // PG_KEYWORD("scroll", K_SCROLL, UNRESERVED_KEYWORD)
K_SCROLL : [sS][cC][rR][oO][lL][lL];

  // PG_KEYWORD("slice", K_SLICE, UNRESERVED_KEYWORD)
K_SLICE : [sS][lL][iI][cC][eE];

  // PG_KEYWORD("sqlstate", K_SQLSTATE, UNRESERVED_KEYWORD)
K_SQLSTATE : [sS][qQ][lL][sS][tT][aA][tT][eE];

  // PG_KEYWORD("stacked", K_STACKED, UNRESERVED_KEYWORD)
K_STACKED : [sS][tT][aA][cC][kK][eE][dD];

  // PG_KEYWORD("type", K_TYPE, UNRESERVED_KEYWORD)
K_TYPE : [tT][yY][pP][eE];

  // PG_KEYWORD("use_column", K_USE_COLUMN, UNRESERVED_KEYWORD)
K_USE_COLUMN : [uU][sS][eE][__][cC][oO][lL][uU][mM][nN];

  // PG_KEYWORD("use_variable", K_USE_VARIABLE, UNRESERVED_KEYWORD)
K_USE_VARIABLE : [uU][sS][eE][__][vV][aA][rR][iI][aA][bB][lL][eE];

  // PG_KEYWORD("variable_conflict", K_VARIABLE_CONFLICT, UNRESERVED_KEYWORD)
K_VARIABLE_CONFLICT : [vV][aA][rR][iI][aA][bB][lL][eE][__][cC][oO][nN][fF][lL][iI][cC][tT];

  // PG_KEYWORD("warning", K_WARNING, UNRESERVED_KEYWORD)
K_WARNING : [wW][aA][rR][nN][iI][nN][gG];




//-----------------
//-- src/interfaces/ecpg/preproc/parse.pl

fragment TIME : [Tt][iI][Mm][Ee] ;
fragment WITH : [Ww][iI][Tt][Hh] ;
WITH_TIME : WITH TIME;

TYPECAST     : '::' ;
DOT_DOT      : '..' ;
COLON_EQUALS : ':=' ;

fragment NULLS : [Nn][Uu][Ll][Ll][Ss]   ;
fragment FIRST : [Ff] [Ii] [Rr] [Ss] [Tt] ;
fragment LAST  : [Ll] [Aa] [Ss] [Tt];

NULLS_FIRST : NULLS FIRST ;
NULLS_LAST  : NULLS LAST ;

//-- src/pl/plpgsql/src/pl_scanner.c:
LESS_LESS       : '<<' ;
GREATER_GREATER : '>>' ;


// TODO don't know if this is correct. couldn't find definition anywhere...
T_WORD  : [0-9]* [A-Za-z]+ [0-9]* ;
T_CWORD : T_WORD '.' T_WORD       ;
ICONST  : [0-9]+ ;


// most likely, this is not correct...
T_DATUM : T_WORD | T_CWORD;
