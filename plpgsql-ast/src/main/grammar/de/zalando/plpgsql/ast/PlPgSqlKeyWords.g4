lexer grammar PlPgSqlKeyWords;

//	PG_KEYWORD("all", K_ALL, RESERVED_KEYWORD)
//	PG_KEYWORD("begin", K_BEGIN, RESERVED_KEYWORD)
//	PG_KEYWORD("by", K_BY, RESERVED_KEYWORD)
//	PG_KEYWORD("case", K_CASE, RESERVED_KEYWORD)
//	PG_KEYWORD("close", K_CLOSE, RESERVED_KEYWORD)
//	PG_KEYWORD("collate", K_COLLATE, RESERVED_KEYWORD)
//	PG_KEYWORD("continue", K_CONTINUE, RESERVED_KEYWORD)
//	PG_KEYWORD("declare", K_DECLARE, RESERVED_KEYWORD)
//	PG_KEYWORD("default", K_DEFAULT, RESERVED_KEYWORD)
//	PG_KEYWORD("diagnostics", K_DIAGNOSTICS, RESERVED_KEYWORD)
//	PG_KEYWORD("else", K_ELSE, RESERVED_KEYWORD)
//	PG_KEYWORD("elseif", K_ELSIF, RESERVED_KEYWORD)
//	PG_KEYWORD("elsif", K_ELSIF, RESERVED_KEYWORD)
//	PG_KEYWORD("end", K_END, RESERVED_KEYWORD)
//	PG_KEYWORD("exception", K_EXCEPTION, RESERVED_KEYWORD)
//	PG_KEYWORD("execute", K_EXECUTE, RESERVED_KEYWORD)
//	PG_KEYWORD("exit", K_EXIT, RESERVED_KEYWORD)
//	PG_KEYWORD("fetch", K_FETCH, RESERVED_KEYWORD)
//	PG_KEYWORD("for", K_FOR, RESERVED_KEYWORD)
//	PG_KEYWORD("foreach", K_FOREACH, RESERVED_KEYWORD)
//	PG_KEYWORD("from", K_FROM, RESERVED_KEYWORD)
//	PG_KEYWORD("get", K_GET, RESERVED_KEYWORD)
//	PG_KEYWORD("if", K_IF, RESERVED_KEYWORD)
//	PG_KEYWORD("in", K_IN, RESERVED_KEYWORD)
//	PG_KEYWORD("insert", K_INSERT, RESERVED_KEYWORD)
//	PG_KEYWORD("into", K_INTO, RESERVED_KEYWORD)
//	PG_KEYWORD("loop", K_LOOP, RESERVED_KEYWORD)
//	PG_KEYWORD("move", K_MOVE, RESERVED_KEYWORD)
//	PG_KEYWORD("not", K_NOT, RESERVED_KEYWORD)
//	PG_KEYWORD("null", K_NULL, RESERVED_KEYWORD)
//	PG_KEYWORD("open", K_OPEN, RESERVED_KEYWORD)
//	PG_KEYWORD("or", K_OR, RESERVED_KEYWORD)
//	PG_KEYWORD("perform", K_PERFORM, RESERVED_KEYWORD)
//	PG_KEYWORD("raise", K_RAISE, RESERVED_KEYWORD)
//	PG_KEYWORD("return", K_RETURN, RESERVED_KEYWORD)
//	PG_KEYWORD("strict", K_STRICT, RESERVED_KEYWORD)
//	PG_KEYWORD("then", K_THEN, RESERVED_KEYWORD)
//	PG_KEYWORD("to", K_TO, RESERVED_KEYWORD)
//	PG_KEYWORD("using", K_USING, RESERVED_KEYWORD)
//	PG_KEYWORD("when", K_WHEN, RESERVED_KEYWORD)
//	PG_KEYWORD("while", K_WHILE, RESERVED_KEYWORD)
//	PG_KEYWORD("absolute", K_ABSOLUTE, UNRESERVED_KEYWORD)
//	PG_KEYWORD("alias", K_ALIAS, UNRESERVED_KEYWORD)
//	PG_KEYWORD("array", K_ARRAY, UNRESERVED_KEYWORD)
//	PG_KEYWORD("backward", K_BACKWARD, UNRESERVED_KEYWORD)
//	PG_KEYWORD("constant", K_CONSTANT, UNRESERVED_KEYWORD)
//	PG_KEYWORD("current", K_CURRENT, UNRESERVED_KEYWORD)
//	PG_KEYWORD("cursor", K_CURSOR, UNRESERVED_KEYWORD)
//	PG_KEYWORD("debug", K_DEBUG, UNRESERVED_KEYWORD)
//	PG_KEYWORD("detail", K_DETAIL, UNRESERVED_KEYWORD)
//	PG_KEYWORD("dump", K_DUMP, UNRESERVED_KEYWORD)
//	PG_KEYWORD("errcode", K_ERRCODE, UNRESERVED_KEYWORD)
//	PG_KEYWORD("error", K_ERROR, UNRESERVED_KEYWORD)
//	PG_KEYWORD("first", K_FIRST, UNRESERVED_KEYWORD)
//	PG_KEYWORD("forward", K_FORWARD, UNRESERVED_KEYWORD)
//	PG_KEYWORD("hint", K_HINT, UNRESERVED_KEYWORD)
//	PG_KEYWORD("info", K_INFO, UNRESERVED_KEYWORD)
//	PG_KEYWORD("is", K_IS, UNRESERVED_KEYWORD)
//	PG_KEYWORD("last", K_LAST, UNRESERVED_KEYWORD)
//	PG_KEYWORD("log", K_LOG, UNRESERVED_KEYWORD)
//	PG_KEYWORD("message", K_MESSAGE, UNRESERVED_KEYWORD)
//	PG_KEYWORD("message_text", K_MESSAGE_TEXT, UNRESERVED_KEYWORD)
//	PG_KEYWORD("next", K_NEXT, UNRESERVED_KEYWORD)
//	PG_KEYWORD("no", K_NO, UNRESERVED_KEYWORD)
//	PG_KEYWORD("notice", K_NOTICE, UNRESERVED_KEYWORD)
//	PG_KEYWORD("option", K_OPTION, UNRESERVED_KEYWORD)
//	PG_KEYWORD("pg_exception_context", K_PG_EXCEPTION_CONTEXT, UNRESERVED_KEYWORD)
//	PG_KEYWORD("pg_exception_detail", K_PG_EXCEPTION_DETAIL, UNRESERVED_KEYWORD)
//	PG_KEYWORD("pg_exception_hint", K_PG_EXCEPTION_HINT, UNRESERVED_KEYWORD)
//	PG_KEYWORD("prior", K_PRIOR, UNRESERVED_KEYWORD)
//	PG_KEYWORD("query", K_QUERY, UNRESERVED_KEYWORD)
//	PG_KEYWORD("relative", K_RELATIVE, UNRESERVED_KEYWORD)
//	PG_KEYWORD("result_oid", K_RESULT_OID, UNRESERVED_KEYWORD)
//	PG_KEYWORD("returned_sqlstate", K_RETURNED_SQLSTATE, UNRESERVED_KEYWORD)
//	PG_KEYWORD("reverse", K_REVERSE, UNRESERVED_KEYWORD)
//	PG_KEYWORD("row_count", K_ROW_COUNT, UNRESERVED_KEYWORD)
//	PG_KEYWORD("rowtype", K_ROWTYPE, UNRESERVED_KEYWORD)
//	PG_KEYWORD("scroll", K_SCROLL, UNRESERVED_KEYWORD)
//	PG_KEYWORD("slice", K_SLICE, UNRESERVED_KEYWORD)
//	PG_KEYWORD("sqlstate", K_SQLSTATE, UNRESERVED_KEYWORD)
//	PG_KEYWORD("stacked", K_STACKED, UNRESERVED_KEYWORD)
//	PG_KEYWORD("type", K_TYPE, UNRESERVED_KEYWORD)
//	PG_KEYWORD("use_column", K_USE_COLUMN, UNRESERVED_KEYWORD)
//	PG_KEYWORD("use_variable", K_USE_VARIABLE, UNRESERVED_KEYWORD)
//	PG_KEYWORD("variable_conflict", K_VARIABLE_CONFLICT, UNRESERVED_KEYWORD)
//	PG_KEYWORD("warning", K_WARNING, UNRESERVED_KEYWORD)
//K_THEN : [tT][hH][eE][nN];
K_MESSAGE : [mM][eE][sS][sS][aA][gG][eE];
K_NEXT : [nN][eE][xX][tT];
// K_CASE : [cC][aA][sS][eE];
K_MESSAGE_TEXT : [mM][eE][sS][sS][aA][gG][eE][__][tT][eE][xX][tT];
//K_IS : [iI][sS];
K_STACKED : [sS][tT][aA][cC][kK][eE][dD];
// K_OR : [oO][rR];
K_DIAGNOSTICS : [dD][iI][aA][gG][nN][oO][sS][tT][iI][cC][sS];
K_PG_EXCEPTION_CONTEXT : [pP][gG][__][eE][xX][cC][eE][pP][tT][iI][oO][nN][__][cC][oO][nN][tT][eE][xX][tT];
K_LOOP : [lL][oO][oO][pP];
//K_NULL : [nN][uU][lL][lL];
K_USE_COLUMN : [uU][sS][eE][__][cC][oO][lL][uU][mM][nN];
//K_BEGIN : [bB][eE][gG][iI][nN];
//K_IN : [iI][nN];
//K_DEFAULT : [dD][eE][fF][aA][uU][lL][tT];
K_DUMP : [dD][uU][mM][pP];
K_SLICE : [sS][lL][iI][cC][eE];
//K_END : [eE][nN][dD];
K_EXECUTE : [eE][xX][eE][cC][uU][tT][eE];
//K_IF : [iI][fF];
K_COLLATE : [cC][oO][lL][lL][aA][tT][eE];
K_RESULT_OID : [rR][eE][sS][uU][lL][tT][__][oO][iI][dD];
// K_WHEN : [wW][hH][eE][nN];
K_WHILE : [wW][hH][iI][lL][eE];
K_ERROR : [eE][rR][rR][oO][rR];
K_FORWARD : [fF][oO][rR][wW][aA][rR][dD];
K_FOREACH : [fF][oO][rR][eE][aA][cC][hH];
K_RETURNED_SQLSTATE : [rR][eE][tT][uU][rR][nN][eE][dD][__][sS][qQ][lL][sS][tT][aA][tT][eE];
K_BACKWARD : [bB][aA][cC][kK][wW][aA][rR][dD];
K_EXCEPTION : [eE][xX][cC][eE][pP][tT][iI][oO][nN];
K_HINT : [hH][iI][nN][tT];
K_CURRENT : [cC][uU][rR][rR][eE][nN][tT];
K_RAISE : [rR][aA][iI][sS][eE];
K_OPEN : [oO][pP][eE][nN];
K_DETAIL : [dD][eE][tT][aA][iI][lL];
K_RETURN : [rR][eE][tT][uU][rR][nN];
K_CLOSE : [cC][lL][oO][sS][eE];
K_SCROLL : [sS][cC][rR][oO][lL][lL];
//K_TYPE : [tT][yY][pP][eE];
K_MOVE : [mM][oO][vV][eE];
K_USE_VARIABLE : [uU][sS][eE][__][vV][aA][rR][iI][aA][bB][lL][eE];
//K_DECLARE : [dD][eE][cC][lL][aA][rR][eE];
//K_ALL : [aA][lL][lL];
K_ALIAS : [aA][lL][iI][aA][sS];
K_INFO : [iI][nN][fF][oO];
//K_TO : [tT][oO];
K_NO : [nN][oO];
//K_ELSE : [eE][lL][sS][eE];
K_RELATIVE : [rR][eE][lL][aA][tT][iI][vV][eE];
K_LOG : [lL][oO][gG];
K_QUERY : [qQ][uU][eE][rR][yY];
K_GET : [gG][eE][tT];
//K_INSERT : [iI][nN][sS][eE][rR][tT];
K_CONTINUE : [cC][oO][nN][tT][iI][nN][uU][eE];
K_FETCH : [fF][eE][tT][cC][hH];
K_ROW_COUNT : [rR][oO][wW][__][cC][oO][uU][nN][tT];
K_DEBUG : [dD][eE][bB][uU][gG];
//K_SQLSTATE : [sS][qQ][lL][sS][tT][aA][tT][eE];
K_CONSTANT : [cC][oO][nN][sS][tT][aA][nN][tT];
//K_ARRAY : [aA][rR][rR][aA][yY];
K_CURSOR : [cC][uU][rR][sS][oO][rR];
K_PG_EXCEPTION_DETAIL : [pP][gG][__][eE][xX][cC][eE][pP][tT][iI][oO][nN][__][dD][eE][tT][aA][iI][lL];
K_ELSIF : [eE][lL][sS][eE][iI][fF] | [eE][lL][sS][iI][fF];
K_PRIOR : [pP][rR][iI][oO][rR];
//K_USING : [uU][sS][iI][nN][gG];
K_EXIT : [eE][xX][iI][tT];
//K_STRICT : [sS][tT][rR][iI][cC][tT];
K_ABSOLUTE : [aA][bB][sS][oO][lL][uU][tT][eE];
//K_FOR : [fF][oO][rR];
K_FIRST : [fF][iI][rR][sS][tT];
//K_NOT : [nN][oO][tT];
K_LAST : [lL][aA][sS][tT];
K_ROWTYPE : [rR][oO][wW][tT][yY][pP][eE];
K_VARIABLE_CONFLICT : [vV][aA][rR][iI][aA][bB][lL][eE][__][cC][oO][nN][fF][lL][iI][cC][tT];
K_PG_EXCEPTION_HINT : [pP][gG][__][eE][xX][cC][eE][pP][tT][iI][oO][nN][__][hH][iI][nN][tT];
K_OPTION : [oO][pP][tT][iI][oO][nN];
//K_BY : [bB][yY];
K_NOTICE : [nN][oO][tT][iI][cC][eE];
K_PERFORM : [pP][eE][rR][fF][oO][rR][mM];
// K_INTO :  [iI][nN][tT][oO];
K_WARNING : [wW][aA][rR][nN][iI][nN][gG];
//K_FROM : [fF][rR][oO][mM];
//K_ERRCODE : [eE][rR][rR][cC][oO][dD][eE];
K_REVERSE : [rR][eE][vV][eE][rR][sS][eE];

