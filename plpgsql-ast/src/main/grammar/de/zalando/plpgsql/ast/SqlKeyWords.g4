
lexer grammar SqlKeyWords;

import PgSqlLexer;

NULLS_FIRST : NULLS_P T_whitespace+ FIRST_P ;
NULLS_LAST  : NULLS_P T_whitespace+ LAST_P ;
WITH_TIME : WITH T_whitespace+ TIME;
//PG_KEYWORD("abort", ABORT_P, UNRESERVED_KEYWORD)
ABORT_P : [aA][bB][oO][rR][tT];

//PG_KEYWORD("absolute", ABSOLUTE_P, UNRESERVED_KEYWORD)
ABSOLUTE_P : [aA][bB][sS][oO][lL][uU][tT][eE];

//PG_KEYWORD("access", ACCESS, UNRESERVED_KEYWORD)
ACCESS : [aA][cC][cC][eE][sS][sS];

//PG_KEYWORD("action", ACTION, UNRESERVED_KEYWORD)
ACTION : [aA][cC][tT][iI][oO][nN];

//PG_KEYWORD("add", ADD_P, UNRESERVED_KEYWORD)
ADD_P : [aA][dD][dD];

//PG_KEYWORD("admin", ADMIN, UNRESERVED_KEYWORD)
ADMIN : [aA][dD][mM][iI][nN];

//PG_KEYWORD("after", AFTER, UNRESERVED_KEYWORD)
AFTER : [aA][fF][tT][eE][rR];

//PG_KEYWORD("aggregate", AGGREGATE, UNRESERVED_KEYWORD)
AGGREGATE : [aA][gG][gG][rR][eE][gG][aA][tT][eE];

//PG_KEYWORD("all", ALL, RESERVED_KEYWORD)
ALL : [aA][lL][lL];

//PG_KEYWORD("also", ALSO, UNRESERVED_KEYWORD)
ALSO : [aA][lL][sS][oO];

//PG_KEYWORD("alter", ALTER, UNRESERVED_KEYWORD)
ALTER : [aA][lL][tT][eE][rR];

//PG_KEYWORD("always", ALWAYS, UNRESERVED_KEYWORD)
ALWAYS : [aA][lL][wW][aA][yY][sS];

//PG_KEYWORD("analyse", ANALYSE, RESERVED_KEYWORD)		/* British spelling */
ANALYSE : [aA][nN][aA][lL][yY][sS][eE];

//PG_KEYWORD("analyze", ANALYZE, RESERVED_KEYWORD)
ANALYZE : [aA][nN][aA][lL][yY][zZ][eE];

//PG_KEYWORD("and", AND, RESERVED_KEYWORD)
AND : [aA][nN][dD];

//PG_KEYWORD("any", ANY, RESERVED_KEYWORD)
ANY : [aA][nN][yY];

//PG_KEYWORD("array", ARRAY, RESERVED_KEYWORD)
ARRAY : [aA][rR][rR][aA][yY];

//PG_KEYWORD("as", AS, RESERVED_KEYWORD)
AS : [aA][sS];

//PG_KEYWORD("asc", ASC, RESERVED_KEYWORD)
ASC : [aA][sS][cC];

//PG_KEYWORD("assertion", ASSERTION, UNRESERVED_KEYWORD)
ASSERTION : [aA][sS][sS][eE][rR][tT][iI][oO][nN];

//PG_KEYWORD("assignment", ASSIGNMENT, UNRESERVED_KEYWORD)
ASSIGNMENT : [aA][sS][sS][iI][gG][nN][mM][eE][nN][tT];

//PG_KEYWORD("asymmetric", ASYMMETRIC, RESERVED_KEYWORD)
ASYMMETRIC : [aA][sS][yY][mM][mM][eE][tT][rR][iI][cC];

//PG_KEYWORD("at", AT, UNRESERVED_KEYWORD)
AT : [aA][tT];

//PG_KEYWORD("attribute", ATTRIBUTE, UNRESERVED_KEYWORD)
ATTRIBUTE : [aA][tT][tT][rR][iI][bB][uU][tT][eE];

//PG_KEYWORD("authorization", AUTHORIZATION, TYPE_FUNC_NAME_KEYWORD)
AUTHORIZATION : [aA][uU][tT][hH][oO][rR][iI][zZ][aA][tT][iI][oO][nN];

//PG_KEYWORD("backward", BACKWARD, UNRESERVED_KEYWORD)
BACKWARD : [bB][aA][cC][kK][wW][aA][rR][dD];

//PG_KEYWORD("before", BEFORE, UNRESERVED_KEYWORD)
BEFORE : [bB][eE][fF][oO][rR][eE];

//PG_KEYWORD("begin", BEGIN_P, UNRESERVED_KEYWORD)
BEGIN_P : [bB][eE][gG][iI][nN];

//PG_KEYWORD("between", BETWEEN, COL_NAME_KEYWORD)
BETWEEN : [bB][eE][tT][wW][eE][eE][nN];

//PG_KEYWORD("bigint", BIGINT, COL_NAME_KEYWORD)
BIGINT : [bB][iI][gG][iI][nN][tT];

//PG_KEYWORD("binary", BINARY, TYPE_FUNC_NAME_KEYWORD)
BINARY : [bB][iI][nN][aA][rR][yY];

//PG_KEYWORD("bit", BIT, COL_NAME_KEYWORD)
BIT : [bB][iI][tT];

//PG_KEYWORD("boolean", BOOLEAN_P, COL_NAME_KEYWORD)
BOOLEAN_P : [bB][oO][oO][lL][eE][aA][nN];

//PG_KEYWORD("both", BOTH, RESERVED_KEYWORD)
BOTH : [bB][oO][tT][hH];

//PG_KEYWORD("by", BY, UNRESERVED_KEYWORD)
BY : [bB][yY];

//PG_KEYWORD("cache", CACHE, UNRESERVED_KEYWORD)
CACHE : [cC][aA][cC][hH][eE];

//PG_KEYWORD("called", CALLED, UNRESERVED_KEYWORD)
CALLED : [cC][aA][lL][lL][eE][dD];

//PG_KEYWORD("cascade", CASCADE, UNRESERVED_KEYWORD)
CASCADE : [cC][aA][sS][cC][aA][dD][eE];

//PG_KEYWORD("cascaded", CASCADED, UNRESERVED_KEYWORD)
CASCADED : [cC][aA][sS][cC][aA][dD][eE][dD];

//PG_KEYWORD("case", CASE, RESERVED_KEYWORD)
CASE : [cC][aA][sS][eE];

//PG_KEYWORD("cast", CAST, RESERVED_KEYWORD)
CAST : [cC][aA][sS][tT];

//PG_KEYWORD("catalog", CATALOG_P, UNRESERVED_KEYWORD)
CATALOG_P : [cC][aA][tT][aA][lL][oO][gG];

//PG_KEYWORD("chain", CHAIN, UNRESERVED_KEYWORD)
CHAIN : [cC][hH][aA][iI][nN];

//PG_KEYWORD("char", CHAR_P, COL_NAME_KEYWORD)
CHAR_P : [cC][hH][aA][rR];

//PG_KEYWORD("character", CHARACTER, COL_NAME_KEYWORD)
CHARACTER : [cC][hH][aA][rR][aA][cC][tT][eE][rR];

//PG_KEYWORD("characteristics", CHARACTERISTICS, UNRESERVED_KEYWORD)
CHARACTERISTICS : [cC][hH][aA][rR][aA][cC][tT][eE][rR][iI][sS][tT][iI][cC][sS];

//PG_KEYWORD("check", CHECK, RESERVED_KEYWORD)
CHECK : [cC][hH][eE][cC][kK];

//PG_KEYWORD("checkpoint", CHECKPOINT, UNRESERVED_KEYWORD)
CHECKPOINT : [cC][hH][eE][cC][kK][pP][oO][iI][nN][tT];

//PG_KEYWORD("class", CLASS, UNRESERVED_KEYWORD)
CLASS : [cC][lL][aA][sS][sS];

//PG_KEYWORD("close", CLOSE, UNRESERVED_KEYWORD)
CLOSE : [cC][lL][oO][sS][eE];

//PG_KEYWORD("cluster", CLUSTER, UNRESERVED_KEYWORD)
CLUSTER : [cC][lL][uU][sS][tT][eE][rR];

//PG_KEYWORD("coalesce", COALESCE, COL_NAME_KEYWORD)
COALESCE : [cC][oO][aA][lL][eE][sS][cC][eE];

//PG_KEYWORD("collate", COLLATE, RESERVED_KEYWORD)
COLLATE : [cC][oO][lL][lL][aA][tT][eE];

//PG_KEYWORD("collation", COLLATION, TYPE_FUNC_NAME_KEYWORD)
COLLATION : [cC][oO][lL][lL][aA][tT][iI][oO][nN];

//PG_KEYWORD("column", COLUMN, RESERVED_KEYWORD)
COLUMN : [cC][oO][lL][uU][mM][nN];

//PG_KEYWORD("comment", COMMENT, UNRESERVED_KEYWORD)
COMMENT : [cC][oO][mM][mM][eE][nN][tT];

//PG_KEYWORD("comments", COMMENTS, UNRESERVED_KEYWORD)
COMMENTS : [cC][oO][mM][mM][eE][nN][tT][sS];

//PG_KEYWORD("commit", COMMIT, UNRESERVED_KEYWORD)
COMMIT : [cC][oO][mM][mM][iI][tT];

//PG_KEYWORD("committed", COMMITTED, UNRESERVED_KEYWORD)
COMMITTED : [cC][oO][mM][mM][iI][tT][tT][eE][dD];

//PG_KEYWORD("concurrently", CONCURRENTLY, TYPE_FUNC_NAME_KEYWORD)
CONCURRENTLY : [cC][oO][nN][cC][uU][rR][rR][eE][nN][tT][lL][yY];

//PG_KEYWORD("configuration", CONFIGURATION, UNRESERVED_KEYWORD)
CONFIGURATION : [cC][oO][nN][fF][iI][gG][uU][rR][aA][tT][iI][oO][nN];

//PG_KEYWORD("connection", CONNECTION, UNRESERVED_KEYWORD)
CONNECTION : [cC][oO][nN][nN][eE][cC][tT][iI][oO][nN];

//PG_KEYWORD("constraint", CONSTRAINT, RESERVED_KEYWORD)
CONSTRAINT : [cC][oO][nN][sS][tT][rR][aA][iI][nN][tT];

//PG_KEYWORD("constraints", CONSTRAINTS, UNRESERVED_KEYWORD)
CONSTRAINTS : [cC][oO][nN][sS][tT][rR][aA][iI][nN][tT][sS];

//PG_KEYWORD("content", CONTENT_P, UNRESERVED_KEYWORD)
CONTENT_P : [cC][oO][nN][tT][eE][nN][tT];

//PG_KEYWORD("continue", CONTINUE_P, UNRESERVED_KEYWORD)
CONTINUE_P : [cC][oO][nN][tT][iI][nN][uU][eE];

//PG_KEYWORD("conversion", CONVERSION_P, UNRESERVED_KEYWORD)
CONVERSION_P : [cC][oO][nN][vV][eE][rR][sS][iI][oO][nN];

//PG_KEYWORD("copy", COPY, UNRESERVED_KEYWORD)
COPY : [cC][oO][pP][yY];

//PG_KEYWORD("cost", COST, UNRESERVED_KEYWORD)
COST : [cC][oO][sS][tT];

//PG_KEYWORD("create", CREATE, RESERVED_KEYWORD)
CREATE : [cC][rR][eE][aA][tT][eE];

//PG_KEYWORD("cross", CROSS, TYPE_FUNC_NAME_KEYWORD)
CROSS : [cC][rR][oO][sS][sS];

//PG_KEYWORD("csv", CSV, UNRESERVED_KEYWORD)
CSV : [cC][sS][vV];

//PG_KEYWORD("current", CURRENT_P, UNRESERVED_KEYWORD)
CURRENT_P : [cC][uU][rR][rR][eE][nN][tT];

//PG_KEYWORD("current_catalog", CURRENT_CATALOG, RESERVED_KEYWORD)
CURRENT_CATALOG : [cC][uU][rR][rR][eE][nN][tT][__][cC][aA][tT][aA][lL][oO][gG];

//PG_KEYWORD("current_date", CURRENT_DATE, RESERVED_KEYWORD)
CURRENT_DATE : [cC][uU][rR][rR][eE][nN][tT][__][dD][aA][tT][eE];

//PG_KEYWORD("current_role", CURRENT_ROLE, RESERVED_KEYWORD)
CURRENT_ROLE : [cC][uU][rR][rR][eE][nN][tT][__][rR][oO][lL][eE];

//PG_KEYWORD("current_schema", CURRENT_SCHEMA, TYPE_FUNC_NAME_KEYWORD)
CURRENT_SCHEMA : [cC][uU][rR][rR][eE][nN][tT][__][sS][cC][hH][eE][mM][aA];

//PG_KEYWORD("current_time", CURRENT_TIME, RESERVED_KEYWORD)
CURRENT_TIME : [cC][uU][rR][rR][eE][nN][tT][__][tT][iI][mM][eE];

//PG_KEYWORD("current_timestamp", CURRENT_TIMESTAMP, RESERVED_KEYWORD)
CURRENT_TIMESTAMP : [cC][uU][rR][rR][eE][nN][tT][__][tT][iI][mM][eE][sS][tT][aA][mM][pP];

//PG_KEYWORD("current_user", CURRENT_USER, RESERVED_KEYWORD)
CURRENT_USER : [cC][uU][rR][rR][eE][nN][tT][__][uU][sS][eE][rR];

//PG_KEYWORD("cursor", CURSOR, UNRESERVED_KEYWORD)
CURSOR : [cC][uU][rR][sS][oO][rR];

//PG_KEYWORD("cycle", CYCLE, UNRESERVED_KEYWORD)
CYCLE : [cC][yY][cC][lL][eE];

//PG_KEYWORD("data", DATA_P, UNRESERVED_KEYWORD)
DATA_P : [dD][aA][tT][aA];

//PG_KEYWORD("database", DATABASE, UNRESERVED_KEYWORD)
DATABASE : [dD][aA][tT][aA][bB][aA][sS][eE];

//PG_KEYWORD("day", DAY_P, UNRESERVED_KEYWORD)
DAY_P : [dD][aA][yY];

//PG_KEYWORD("deallocate", DEALLOCATE, UNRESERVED_KEYWORD)
DEALLOCATE : [dD][eE][aA][lL][lL][oO][cC][aA][tT][eE];

//PG_KEYWORD("dec", DEC, COL_NAME_KEYWORD)
DEC : [dD][eE][cC];

//PG_KEYWORD("decimal", DECIMAL_P, COL_NAME_KEYWORD)
DECIMAL_P : [dD][eE][cC][iI][mM][aA][lL];

//PG_KEYWORD("declare", DECLARE, UNRESERVED_KEYWORD)
DECLARE : [dD][eE][cC][lL][aA][rR][eE];

//PG_KEYWORD("default", DEFAULT, RESERVED_KEYWORD)
DEFAULT : [dD][eE][fF][aA][uU][lL][tT];

//PG_KEYWORD("defaults", DEFAULTS, UNRESERVED_KEYWORD)
DEFAULTS : [dD][eE][fF][aA][uU][lL][tT][sS];

//PG_KEYWORD("deferrable", DEFERRABLE, RESERVED_KEYWORD)
DEFERRABLE : [dD][eE][fF][eE][rR][rR][aA][bB][lL][eE];

//PG_KEYWORD("deferred", DEFERRED, UNRESERVED_KEYWORD)
DEFERRED : [dD][eE][fF][eE][rR][rR][eE][dD];

//PG_KEYWORD("definer", DEFINER, UNRESERVED_KEYWORD)
DEFINER : [dD][eE][fF][iI][nN][eE][rR];

//PG_KEYWORD("delete", DELETE_P, UNRESERVED_KEYWORD)
DELETE_P : [dD][eE][lL][eE][tT][eE];

//PG_KEYWORD("delimiter", DELIMITER, UNRESERVED_KEYWORD)
DELIMITER : [dD][eE][lL][iI][mM][iI][tT][eE][rR];

//PG_KEYWORD("delimiters", DELIMITERS, UNRESERVED_KEYWORD)
DELIMITERS : [dD][eE][lL][iI][mM][iI][tT][eE][rR][sS];

//PG_KEYWORD("desc", DESC, RESERVED_KEYWORD)
DESC : [dD][eE][sS][cC];

//PG_KEYWORD("dictionary", DICTIONARY, UNRESERVED_KEYWORD)
DICTIONARY : [dD][iI][cC][tT][iI][oO][nN][aA][rR][yY];

//PG_KEYWORD("disable", DISABLE_P, UNRESERVED_KEYWORD)
DISABLE_P : [dD][iI][sS][aA][bB][lL][eE];

//PG_KEYWORD("discard", DISCARD, UNRESERVED_KEYWORD)
DISCARD : [dD][iI][sS][cC][aA][rR][dD];

//PG_KEYWORD("distinct", DISTINCT, RESERVED_KEYWORD)
DISTINCT : [dD][iI][sS][tT][iI][nN][cC][tT];

//PG_KEYWORD("do", DO, RESERVED_KEYWORD)
DO : [dD][oO];

//PG_KEYWORD("document", DOCUMENT_P, UNRESERVED_KEYWORD)
DOCUMENT_P : [dD][oO][cC][uU][mM][eE][nN][tT];

//PG_KEYWORD("domain", DOMAIN_P, UNRESERVED_KEYWORD)
DOMAIN_P : [dD][oO][mM][aA][iI][nN];

//PG_KEYWORD("double", DOUBLE_P, UNRESERVED_KEYWORD)
DOUBLE_P : [dD][oO][uU][bB][lL][eE];

//PG_KEYWORD("drop", DROP, UNRESERVED_KEYWORD)
DROP : [dD][rR][oO][pP];

//PG_KEYWORD("each", EACH, UNRESERVED_KEYWORD)
EACH : [eE][aA][cC][hH];

//PG_KEYWORD("else", ELSE, RESERVED_KEYWORD)
ELSE : [eE][lL][sS][eE];

//PG_KEYWORD("enable", ENABLE_P, UNRESERVED_KEYWORD)
ENABLE_P : [eE][nN][aA][bB][lL][eE];

//PG_KEYWORD("encoding", ENCODING, UNRESERVED_KEYWORD)
ENCODING : [eE][nN][cC][oO][dD][iI][nN][gG];

//PG_KEYWORD("encrypted", ENCRYPTED, UNRESERVED_KEYWORD)
ENCRYPTED : [eE][nN][cC][rR][yY][pP][tT][eE][dD];

//PG_KEYWORD("end", END_P, RESERVED_KEYWORD)
END_P : [eE][nN][dD];

//PG_KEYWORD("enum", ENUM_P, UNRESERVED_KEYWORD)
ENUM_P : [eE][nN][uU][mM];

//PG_KEYWORD("escape", ESCAPE, UNRESERVED_KEYWORD)
ESCAPE : [eE][sS][cC][aA][pP][eE];

//PG_KEYWORD("except", EXCEPT, RESERVED_KEYWORD)
EXCEPT : [eE][xX][cC][eE][pP][tT];

//PG_KEYWORD("exclude", EXCLUDE, UNRESERVED_KEYWORD)
EXCLUDE : [eE][xX][cC][lL][uU][dD][eE];

//PG_KEYWORD("excluding", EXCLUDING, UNRESERVED_KEYWORD)
EXCLUDING : [eE][xX][cC][lL][uU][dD][iI][nN][gG];

//PG_KEYWORD("exclusive", EXCLUSIVE, UNRESERVED_KEYWORD)
EXCLUSIVE : [eE][xX][cC][lL][uU][sS][iI][vV][eE];

//PG_KEYWORD("execute", EXECUTE, UNRESERVED_KEYWORD)
EXECUTE : [eE][xX][eE][cC][uU][tT][eE];

//PG_KEYWORD("exists", EXISTS, COL_NAME_KEYWORD)
EXISTS : [eE][xX][iI][sS][tT][sS];

//PG_KEYWORD("explain", EXPLAIN, UNRESERVED_KEYWORD)
EXPLAIN : [eE][xX][pP][lL][aA][iI][nN];

//PG_KEYWORD("extension", EXTENSION, UNRESERVED_KEYWORD)
EXTENSION : [eE][xX][tT][eE][nN][sS][iI][oO][nN];

//PG_KEYWORD("external", EXTERNAL, UNRESERVED_KEYWORD)
EXTERNAL : [eE][xX][tT][eE][rR][nN][aA][lL];

//PG_KEYWORD("extract", EXTRACT, COL_NAME_KEYWORD)
EXTRACT : [eE][xX][tT][rR][aA][cC][tT];

//PG_KEYWORD("false", FALSE_P, RESERVED_KEYWORD)
FALSE_P : [fF][aA][lL][sS][eE];

//PG_KEYWORD("family", FAMILY, UNRESERVED_KEYWORD)
FAMILY : [fF][aA][mM][iI][lL][yY];

//PG_KEYWORD("fetch", FETCH, RESERVED_KEYWORD)
FETCH : [fF][eE][tT][cC][hH];

//PG_KEYWORD("first", FIRST_P, UNRESERVED_KEYWORD)
FIRST_P : [fF][iI][rR][sS][tT];

//PG_KEYWORD("float", FLOAT_P, COL_NAME_KEYWORD)
FLOAT_P : [fF][lL][oO][aA][tT];

//PG_KEYWORD("following", FOLLOWING, UNRESERVED_KEYWORD)
FOLLOWING : [fF][oO][lL][lL][oO][wW][iI][nN][gG];

//PG_KEYWORD("for", FOR, RESERVED_KEYWORD)
FOR : [fF][oO][rR];

//PG_KEYWORD("force", FORCE, UNRESERVED_KEYWORD)
FORCE : [fF][oO][rR][cC][eE];

//PG_KEYWORD("foreign", FOREIGN, RESERVED_KEYWORD)
FOREIGN : [fF][oO][rR][eE][iI][gG][nN];

//PG_KEYWORD("forward", FORWARD, UNRESERVED_KEYWORD)
FORWARD : [fF][oO][rR][wW][aA][rR][dD];

//PG_KEYWORD("freeze", FREEZE, TYPE_FUNC_NAME_KEYWORD)
FREEZE : [fF][rR][eE][eE][zZ][eE];

//PG_KEYWORD("from", FROM, RESERVED_KEYWORD)
FROM : [fF][rR][oO][mM];

//PG_KEYWORD("full", FULL, TYPE_FUNC_NAME_KEYWORD)
FULL : [fF][uU][lL][lL];

//PG_KEYWORD("function", FUNCTION, UNRESERVED_KEYWORD)
FUNCTION : [fF][uU][nN][cC][tT][iI][oO][nN];

//PG_KEYWORD("functions", FUNCTIONS, UNRESERVED_KEYWORD)
FUNCTIONS : [fF][uU][nN][cC][tT][iI][oO][nN][sS];

//PG_KEYWORD("global", GLOBAL, UNRESERVED_KEYWORD)
GLOBAL : [gG][lL][oO][bB][aA][lL];

//PG_KEYWORD("grant", GRANT, RESERVED_KEYWORD)
GRANT : [gG][rR][aA][nN][tT];

//PG_KEYWORD("granted", GRANTED, UNRESERVED_KEYWORD)
GRANTED : [gG][rR][aA][nN][tT][eE][dD];

//PG_KEYWORD("greatest", GREATEST, COL_NAME_KEYWORD)
GREATEST : [gG][rR][eE][aA][tT][eE][sS][tT];

//PG_KEYWORD("group", GROUP_P, RESERVED_KEYWORD)
GROUP_P : [gG][rR][oO][uU][pP];

//PG_KEYWORD("handler", HANDLER, UNRESERVED_KEYWORD)
HANDLER : [hH][aA][nN][dD][lL][eE][rR];

//PG_KEYWORD("having", HAVING, RESERVED_KEYWORD)
HAVING : [hH][aA][vV][iI][nN][gG];

//PG_KEYWORD("header", HEADER_P, UNRESERVED_KEYWORD)
HEADER_P : [hH][eE][aA][dD][eE][rR];

//PG_KEYWORD("hold", HOLD, UNRESERVED_KEYWORD)
HOLD : [hH][oO][lL][dD];

//PG_KEYWORD("hour", HOUR_P, UNRESERVED_KEYWORD)
HOUR_P : [hH][oO][uU][rR];

//PG_KEYWORD("identity", IDENTITY_P, UNRESERVED_KEYWORD)
IDENTITY_P : [iI][dD][eE][nN][tT][iI][tT][yY];

//PG_KEYWORD("if", IF_P, UNRESERVED_KEYWORD)
IF_P : [iI][fF];

//PG_KEYWORD("ilike", ILIKE, TYPE_FUNC_NAME_KEYWORD)
ILIKE : [iI][lL][iI][kK][eE];

//PG_KEYWORD("immediate", IMMEDIATE, UNRESERVED_KEYWORD)
IMMEDIATE : [iI][mM][mM][eE][dD][iI][aA][tT][eE];

//PG_KEYWORD("immutable", IMMUTABLE, UNRESERVED_KEYWORD)
IMMUTABLE : [iI][mM][mM][uU][tT][aA][bB][lL][eE];

//PG_KEYWORD("implicit", IMPLICIT_P, UNRESERVED_KEYWORD)
IMPLICIT_P : [iI][mM][pP][lL][iI][cC][iI][tT];

//PG_KEYWORD("in", IN_P, RESERVED_KEYWORD)
IN_P : [iI][nN];

//PG_KEYWORD("including", INCLUDING, UNRESERVED_KEYWORD)
INCLUDING : [iI][nN][cC][lL][uU][dD][iI][nN][gG];

//PG_KEYWORD("increment", INCREMENT, UNRESERVED_KEYWORD)
INCREMENT : [iI][nN][cC][rR][eE][mM][eE][nN][tT];

//PG_KEYWORD("index", INDEX, UNRESERVED_KEYWORD)
INDEX : [iI][nN][dD][eE][xX];

//PG_KEYWORD("indexes", INDEXES, UNRESERVED_KEYWORD)
INDEXES : [iI][nN][dD][eE][xX][eE][sS];

//PG_KEYWORD("inherit", INHERIT, UNRESERVED_KEYWORD)
INHERIT : [iI][nN][hH][eE][rR][iI][tT];

//PG_KEYWORD("inherits", INHERITS, UNRESERVED_KEYWORD)
INHERITS : [iI][nN][hH][eE][rR][iI][tT][sS];

//PG_KEYWORD("initially", INITIALLY, RESERVED_KEYWORD)
INITIALLY : [iI][nN][iI][tT][iI][aA][lL][lL][yY];

//PG_KEYWORD("inline", INLINE_P, UNRESERVED_KEYWORD)
INLINE_P : [iI][nN][lL][iI][nN][eE];

//PG_KEYWORD("inner", INNER_P, TYPE_FUNC_NAME_KEYWORD)
INNER_P : [iI][nN][nN][eE][rR];

//PG_KEYWORD("inout", INOUT, COL_NAME_KEYWORD)
INOUT : [iI][nN][oO][uU][tT];

//PG_KEYWORD("input", INPUT_P, UNRESERVED_KEYWORD)
INPUT_P : [iI][nN][pP][uU][tT];

//PG_KEYWORD("insensitive", INSENSITIVE, UNRESERVED_KEYWORD)
INSENSITIVE : [iI][nN][sS][eE][nN][sS][iI][tT][iI][vV][eE];

//PG_KEYWORD("insert", INSERT, UNRESERVED_KEYWORD)
INSERT : [iI][nN][sS][eE][rR][tT];

//PG_KEYWORD("instead", INSTEAD, UNRESERVED_KEYWORD)
INSTEAD : [iI][nN][sS][tT][eE][aA][dD];

//PG_KEYWORD("int", INT_P, COL_NAME_KEYWORD)
INT_P : [iI][nN][tT];

//PG_KEYWORD("integer", INTEGER, COL_NAME_KEYWORD)
INTEGER : [iI][nN][tT][eE][gG][eE][rR];

//PG_KEYWORD("intersect", INTERSECT, RESERVED_KEYWORD)
INTERSECT : [iI][nN][tT][eE][rR][sS][eE][cC][tT];

//PG_KEYWORD("interval", INTERVAL, COL_NAME_KEYWORD)
INTERVAL : [iI][nN][tT][eE][rR][vV][aA][lL];

//PG_KEYWORD("into", INTO, RESERVED_KEYWORD)
INTO : [iI][nN][tT][oO];

//PG_KEYWORD("invoker", INVOKER, UNRESERVED_KEYWORD)
INVOKER : [iI][nN][vV][oO][kK][eE][rR];

//PG_KEYWORD("is", IS, TYPE_FUNC_NAME_KEYWORD)
IS : [iI][sS];

//PG_KEYWORD("isnull", ISNULL, TYPE_FUNC_NAME_KEYWORD)
ISNULL : [iI][sS][nN][uU][lL][lL];

//PG_KEYWORD("isolation", ISOLATION, UNRESERVED_KEYWORD)
ISOLATION : [iI][sS][oO][lL][aA][tT][iI][oO][nN];

//PG_KEYWORD("join", JOIN, TYPE_FUNC_NAME_KEYWORD)
JOIN : [jJ][oO][iI][nN];

//PG_KEYWORD("key", KEY, UNRESERVED_KEYWORD)
KEY : [kK][eE][yY];

//PG_KEYWORD("label", LABEL, UNRESERVED_KEYWORD)
LABEL : [lL][aA][bB][eE][lL];

//PG_KEYWORD("language", LANGUAGE, UNRESERVED_KEYWORD)
LANGUAGE : [lL][aA][nN][gG][uU][aA][gG][eE];

//PG_KEYWORD("large", LARGE_P, UNRESERVED_KEYWORD)
LARGE_P : [lL][aA][rR][gG][eE];

//PG_KEYWORD("last", LAST_P, UNRESERVED_KEYWORD)
LAST_P : [lL][aA][sS][tT];

//PG_KEYWORD("lc_collate", LC_COLLATE_P, UNRESERVED_KEYWORD)
LC_COLLATE_P : [lL][cC][__][cC][oO][lL][lL][aA][tT][eE];

//PG_KEYWORD("lc_ctype", LC_CTYPE_P, UNRESERVED_KEYWORD)
LC_CTYPE_P : [lL][cC][__][cC][tT][yY][pP][eE];

//PG_KEYWORD("leading", LEADING, RESERVED_KEYWORD)
LEADING : [lL][eE][aA][dD][iI][nN][gG];

//PG_KEYWORD("leakproof", LEAKPROOF, UNRESERVED_KEYWORD)
LEAKPROOF : [lL][eE][aA][kK][pP][rR][oO][oO][fF];

//PG_KEYWORD("least", LEAST, COL_NAME_KEYWORD)
LEAST : [lL][eE][aA][sS][tT];

//PG_KEYWORD("left", LEFT, TYPE_FUNC_NAME_KEYWORD)
LEFT : [lL][eE][fF][tT];

//PG_KEYWORD("level", LEVEL, UNRESERVED_KEYWORD)
LEVEL : [lL][eE][vV][eE][lL];

//PG_KEYWORD("like", LIKE, TYPE_FUNC_NAME_KEYWORD)
LIKE : [lL][iI][kK][eE];

//PG_KEYWORD("limit", LIMIT, RESERVED_KEYWORD)
LIMIT : [lL][iI][mM][iI][tT];

//PG_KEYWORD("listen", LISTEN, UNRESERVED_KEYWORD)
LISTEN : [lL][iI][sS][tT][eE][nN];

//PG_KEYWORD("load", LOAD, UNRESERVED_KEYWORD)
LOAD : [lL][oO][aA][dD];

//PG_KEYWORD("local", LOCAL, UNRESERVED_KEYWORD)
LOCAL : [lL][oO][cC][aA][lL];

//PG_KEYWORD("localtime", LOCALTIME, RESERVED_KEYWORD)
LOCALTIME : [lL][oO][cC][aA][lL][tT][iI][mM][eE];

//PG_KEYWORD("localtimestamp", LOCALTIMESTAMP, RESERVED_KEYWORD)
LOCALTIMESTAMP : [lL][oO][cC][aA][lL][tT][iI][mM][eE][sS][tT][aA][mM][pP];

//PG_KEYWORD("location", LOCATION, UNRESERVED_KEYWORD)
LOCATION : [lL][oO][cC][aA][tT][iI][oO][nN];

//PG_KEYWORD("lock", LOCK_P, UNRESERVED_KEYWORD)
LOCK_P : [lL][oO][cC][kK];

//PG_KEYWORD("mapping", MAPPING, UNRESERVED_KEYWORD)
MAPPING : [mM][aA][pP][pP][iI][nN][gG];

//PG_KEYWORD("match", MATCH, UNRESERVED_KEYWORD)
MATCH : [mM][aA][tT][cC][hH];

//PG_KEYWORD("maxvalue", MAXVALUE, UNRESERVED_KEYWORD)
MAXVALUE : [mM][aA][xX][vV][aA][lL][uU][eE];

//PG_KEYWORD("minute", MINUTE_P, UNRESERVED_KEYWORD)
MINUTE_P : [mM][iI][nN][uU][tT][eE];

//PG_KEYWORD("minvalue", MINVALUE, UNRESERVED_KEYWORD)
MINVALUE : [mM][iI][nN][vV][aA][lL][uU][eE];

//PG_KEYWORD("mode", MODE, UNRESERVED_KEYWORD)
MODE : [mM][oO][dD][eE];

//PG_KEYWORD("month", MONTH_P, UNRESERVED_KEYWORD)
MONTH_P : [mM][oO][nN][tT][hH];

//PG_KEYWORD("move", MOVE, UNRESERVED_KEYWORD)
MOVE : [mM][oO][vV][eE];

//PG_KEYWORD("name", NAME_P, UNRESERVED_KEYWORD)
NAME_P : [nN][aA][mM][eE];

//PG_KEYWORD("names", NAMES, UNRESERVED_KEYWORD)
NAMES : [nN][aA][mM][eE][sS];

//PG_KEYWORD("national", NATIONAL, COL_NAME_KEYWORD)
NATIONAL : [nN][aA][tT][iI][oO][nN][aA][lL];

//PG_KEYWORD("natural", NATURAL, TYPE_FUNC_NAME_KEYWORD)
NATURAL : [nN][aA][tT][uU][rR][aA][lL];

//PG_KEYWORD("nchar", NCHAR, COL_NAME_KEYWORD)
NCHAR : [nN][cC][hH][aA][rR];

//PG_KEYWORD("next", NEXT, UNRESERVED_KEYWORD)
NEXT : [nN][eE][xX][tT];

//PG_KEYWORD("no", NO, UNRESERVED_KEYWORD)
NO : [nN][oO];

//PG_KEYWORD("none", NONE, COL_NAME_KEYWORD)
NONE : [nN][oO][nN][eE];

//PG_KEYWORD("not", NOT, RESERVED_KEYWORD)
NOT : [nN][oO][tT];

//PG_KEYWORD("nothing", NOTHING, UNRESERVED_KEYWORD)
NOTHING : [nN][oO][tT][hH][iI][nN][gG];

//PG_KEYWORD("notify", NOTIFY, UNRESERVED_KEYWORD)
NOTIFY : [nN][oO][tT][iI][fF][yY];

//PG_KEYWORD("notnull", NOTNULL, TYPE_FUNC_NAME_KEYWORD)
NOTNULL : [nN][oO][tT][nN][uU][lL][lL];

//PG_KEYWORD("nowait", NOWAIT, UNRESERVED_KEYWORD)
NOWAIT : [nN][oO][wW][aA][iI][tT];

//PG_KEYWORD("null", NULL_P, RESERVED_KEYWORD)
NULL_P : [nN][uU][lL][lL];

//PG_KEYWORD("nullif", NULLIF, COL_NAME_KEYWORD)
NULLIF : [nN][uU][lL][lL][iI][fF];

//PG_KEYWORD("nulls", NULLS_P, UNRESERVED_KEYWORD)
NULLS_P : [nN][uU][lL][lL][sS];

//PG_KEYWORD("numeric", NUMERIC, COL_NAME_KEYWORD)
NUMERIC : [nN][uU][mM][eE][rR][iI][cC];

//PG_KEYWORD("object", OBJECT_P, UNRESERVED_KEYWORD)
OBJECT_P : [oO][bB][jJ][eE][cC][tT];

//PG_KEYWORD("of", OF, UNRESERVED_KEYWORD)
OF : [oO][fF];

//PG_KEYWORD("off", OFF, UNRESERVED_KEYWORD)
OFF : [oO][fF][fF];

//PG_KEYWORD("offset", OFFSET, RESERVED_KEYWORD)
OFFSET : [oO][fF][fF][sS][eE][tT];

//PG_KEYWORD("oids", OIDS, UNRESERVED_KEYWORD)
OIDS : [oO][iI][dD][sS];

//PG_KEYWORD("on", ON, RESERVED_KEYWORD)
ON : [oO][nN];

//PG_KEYWORD("only", ONLY, RESERVED_KEYWORD)
ONLY : [oO][nN][lL][yY];

//PG_KEYWORD("operator", OPERATOR, UNRESERVED_KEYWORD)
OPERATOR : [oO][pP][eE][rR][aA][tT][oO][rR];

//PG_KEYWORD("option", OPTION, UNRESERVED_KEYWORD)
OPTION : [oO][pP][tT][iI][oO][nN];

//PG_KEYWORD("options", OPTIONS, UNRESERVED_KEYWORD)
OPTIONS : [oO][pP][tT][iI][oO][nN][sS];

//PG_KEYWORD("or", OR, RESERVED_KEYWORD)
OR : [oO][rR];

//PG_KEYWORD("order", ORDER, RESERVED_KEYWORD)
ORDER : [oO][rR][dD][eE][rR];

//PG_KEYWORD("out", OUT_P, COL_NAME_KEYWORD)
OUT_P : [oO][uU][tT];

//PG_KEYWORD("outer", OUTER_P, TYPE_FUNC_NAME_KEYWORD)
OUTER_P : [oO][uU][tT][eE][rR];

//PG_KEYWORD("over", OVER, TYPE_FUNC_NAME_KEYWORD)
OVER : [oO][vV][eE][rR];

//PG_KEYWORD("overlaps", OVERLAPS, TYPE_FUNC_NAME_KEYWORD)
OVERLAPS : [oO][vV][eE][rR][lL][aA][pP][sS];

//PG_KEYWORD("overlay", OVERLAY, COL_NAME_KEYWORD)
OVERLAY : [oO][vV][eE][rR][lL][aA][yY];

//PG_KEYWORD("owned", OWNED, UNRESERVED_KEYWORD)
OWNED : [oO][wW][nN][eE][dD];

//PG_KEYWORD("owner", OWNER, UNRESERVED_KEYWORD)
OWNER : [oO][wW][nN][eE][rR];

//PG_KEYWORD("parser", PARSER, UNRESERVED_KEYWORD)
PARSER : [pP][aA][rR][sS][eE][rR];

//PG_KEYWORD("partial", PARTIAL, UNRESERVED_KEYWORD)
PARTIAL : [pP][aA][rR][tT][iI][aA][lL];

//PG_KEYWORD("partition", PARTITION, UNRESERVED_KEYWORD)
PARTITION : [pP][aA][rR][tT][iI][tT][iI][oO][nN];

//PG_KEYWORD("passing", PASSING, UNRESERVED_KEYWORD)
PASSING : [pP][aA][sS][sS][iI][nN][gG];

//PG_KEYWORD("password", PASSWORD, UNRESERVED_KEYWORD)
PASSWORD : [pP][aA][sS][sS][wW][oO][rR][dD];

//PG_KEYWORD("placing", PLACING, RESERVED_KEYWORD)
PLACING : [pP][lL][aA][cC][iI][nN][gG];

//PG_KEYWORD("plans", PLANS, UNRESERVED_KEYWORD)
PLANS : [pP][lL][aA][nN][sS];

//PG_KEYWORD("position", POSITION, COL_NAME_KEYWORD)
POSITION : [pP][oO][sS][iI][tT][iI][oO][nN];

//PG_KEYWORD("preceding", PRECEDING, UNRESERVED_KEYWORD)
PRECEDING : [pP][rR][eE][cC][eE][dD][iI][nN][gG];

//PG_KEYWORD("precision", PRECISION, COL_NAME_KEYWORD)
PRECISION : [pP][rR][eE][cC][iI][sS][iI][oO][nN];

//PG_KEYWORD("prepare", PREPARE, UNRESERVED_KEYWORD)
PREPARE : [pP][rR][eE][pP][aA][rR][eE];

//PG_KEYWORD("prepared", PREPARED, UNRESERVED_KEYWORD)
PREPARED : [pP][rR][eE][pP][aA][rR][eE][dD];

//PG_KEYWORD("preserve", PRESERVE, UNRESERVED_KEYWORD)
PRESERVE : [pP][rR][eE][sS][eE][rR][vV][eE];

//PG_KEYWORD("primary", PRIMARY, RESERVED_KEYWORD)
PRIMARY : [pP][rR][iI][mM][aA][rR][yY];

//PG_KEYWORD("prior", PRIOR, UNRESERVED_KEYWORD)
PRIOR : [pP][rR][iI][oO][rR];

//PG_KEYWORD("privileges", PRIVILEGES, UNRESERVED_KEYWORD)
PRIVILEGES : [pP][rR][iI][vV][iI][lL][eE][gG][eE][sS];

//PG_KEYWORD("procedural", PROCEDURAL, UNRESERVED_KEYWORD)
PROCEDURAL : [pP][rR][oO][cC][eE][dD][uU][rR][aA][lL];

//PG_KEYWORD("procedure", PROCEDURE, UNRESERVED_KEYWORD)
PROCEDURE : [pP][rR][oO][cC][eE][dD][uU][rR][eE];

//PG_KEYWORD("quote", QUOTE, UNRESERVED_KEYWORD)
QUOTE : [qQ][uU][oO][tT][eE];

//PG_KEYWORD("range", RANGE, UNRESERVED_KEYWORD)
RANGE : [rR][aA][nN][gG][eE];

//PG_KEYWORD("read", READ, UNRESERVED_KEYWORD)
READ : [rR][eE][aA][dD];

//PG_KEYWORD("real", REAL, COL_NAME_KEYWORD)
REAL : [rR][eE][aA][lL];

//PG_KEYWORD("reassign", REASSIGN, UNRESERVED_KEYWORD)
REASSIGN : [rR][eE][aA][sS][sS][iI][gG][nN];

//PG_KEYWORD("recheck", RECHECK, UNRESERVED_KEYWORD)
RECHECK : [rR][eE][cC][hH][eE][cC][kK];

//PG_KEYWORD("recursive", RECURSIVE, UNRESERVED_KEYWORD)
RECURSIVE : [rR][eE][cC][uU][rR][sS][iI][vV][eE];

//PG_KEYWORD("ref", REF, UNRESERVED_KEYWORD)
REF : [rR][eE][fF];

//PG_KEYWORD("references", REFERENCES, RESERVED_KEYWORD)
REFERENCES : [rR][eE][fF][eE][rR][eE][nN][cC][eE][sS];

//PG_KEYWORD("reindex", REINDEX, UNRESERVED_KEYWORD)
REINDEX : [rR][eE][iI][nN][dD][eE][xX];

//PG_KEYWORD("relative", RELATIVE_P, UNRESERVED_KEYWORD)
RELATIVE_P : [rR][eE][lL][aA][tT][iI][vV][eE];

//PG_KEYWORD("release", RELEASE, UNRESERVED_KEYWORD)
RELEASE : [rR][eE][lL][eE][aA][sS][eE];

//PG_KEYWORD("rename", RENAME, UNRESERVED_KEYWORD)
RENAME : [rR][eE][nN][aA][mM][eE];

//PG_KEYWORD("repeatable", REPEATABLE, UNRESERVED_KEYWORD)
REPEATABLE : [rR][eE][pP][eE][aA][tT][aA][bB][lL][eE];

//PG_KEYWORD("replace", REPLACE, UNRESERVED_KEYWORD)
REPLACE : [rR][eE][pP][lL][aA][cC][eE];

//PG_KEYWORD("replica", REPLICA, UNRESERVED_KEYWORD)
REPLICA : [rR][eE][pP][lL][iI][cC][aA];

//PG_KEYWORD("reset", RESET, UNRESERVED_KEYWORD)
RESET : [rR][eE][sS][eE][tT];

//PG_KEYWORD("restart", RESTART, UNRESERVED_KEYWORD)
RESTART : [rR][eE][sS][tT][aA][rR][tT];

//PG_KEYWORD("restrict", RESTRICT, UNRESERVED_KEYWORD)
RESTRICT : [rR][eE][sS][tT][rR][iI][cC][tT];

//PG_KEYWORD("returning", RETURNING, RESERVED_KEYWORD)
RETURNING : [rR][eE][tT][uU][rR][nN][iI][nN][gG];

//PG_KEYWORD("returns", RETURNS, UNRESERVED_KEYWORD)
RETURNS : [rR][eE][tT][uU][rR][nN][sS];

//PG_KEYWORD("revoke", REVOKE, UNRESERVED_KEYWORD)
REVOKE : [rR][eE][vV][oO][kK][eE];

//PG_KEYWORD("right", RIGHT, TYPE_FUNC_NAME_KEYWORD)
RIGHT : [rR][iI][gG][hH][tT];

//PG_KEYWORD("role", ROLE, UNRESERVED_KEYWORD)
ROLE : [rR][oO][lL][eE];

//PG_KEYWORD("rollback", ROLLBACK, UNRESERVED_KEYWORD)
ROLLBACK : [rR][oO][lL][lL][bB][aA][cC][kK];

//PG_KEYWORD("row", ROW, COL_NAME_KEYWORD)
ROW : [rR][oO][wW];

//PG_KEYWORD("rows", ROWS, UNRESERVED_KEYWORD)
ROWS : [rR][oO][wW][sS];

//PG_KEYWORD("rule", RULE, UNRESERVED_KEYWORD)
RULE : [rR][uU][lL][eE];

//PG_KEYWORD("savepoint", SAVEPOINT, UNRESERVED_KEYWORD)
SAVEPOINT : [sS][aA][vV][eE][pP][oO][iI][nN][tT];

//PG_KEYWORD("schema", SCHEMA, UNRESERVED_KEYWORD)
SCHEMA : [sS][cC][hH][eE][mM][aA];

//PG_KEYWORD("scroll", SCROLL, UNRESERVED_KEYWORD)
SCROLL : [sS][cC][rR][oO][lL][lL];

//PG_KEYWORD("search", SEARCH, UNRESERVED_KEYWORD)
SEARCH : [sS][eE][aA][rR][cC][hH];

//PG_KEYWORD("second", SECOND_P, UNRESERVED_KEYWORD)
SECOND_P : [sS][eE][cC][oO][nN][dD];

//PG_KEYWORD("security", SECURITY, UNRESERVED_KEYWORD)
SECURITY : [sS][eE][cC][uU][rR][iI][tT][yY];

//PG_KEYWORD("select", SELECT, RESERVED_KEYWORD)
SELECT : [sS][eE][lL][eE][cC][tT];

//PG_KEYWORD("sequence", SEQUENCE, UNRESERVED_KEYWORD)
SEQUENCE : [sS][eE][qQ][uU][eE][nN][cC][eE];

//PG_KEYWORD("sequences", SEQUENCES, UNRESERVED_KEYWORD)
SEQUENCES : [sS][eE][qQ][uU][eE][nN][cC][eE][sS];

//PG_KEYWORD("serializable", SERIALIZABLE, UNRESERVED_KEYWORD)
SERIALIZABLE : [sS][eE][rR][iI][aA][lL][iI][zZ][aA][bB][lL][eE];

//PG_KEYWORD("server", SERVER, UNRESERVED_KEYWORD)
SERVER : [sS][eE][rR][vV][eE][rR];

//PG_KEYWORD("session", SESSION, UNRESERVED_KEYWORD)
SESSION : [sS][eE][sS][sS][iI][oO][nN];

//PG_KEYWORD("session_user", SESSION_USER, RESERVED_KEYWORD)
SESSION_USER : [sS][eE][sS][sS][iI][oO][nN][__][uU][sS][eE][rR];

//PG_KEYWORD("set", SET, UNRESERVED_KEYWORD)
SET : [sS][eE][tT];

//PG_KEYWORD("setof", SETOF, COL_NAME_KEYWORD)
SETOF : [sS][eE][tT][oO][fF];

//PG_KEYWORD("share", SHARE, UNRESERVED_KEYWORD)
SHARE : [sS][hH][aA][rR][eE];

//PG_KEYWORD("show", SHOW, UNRESERVED_KEYWORD)
SHOW : [sS][hH][oO][wW];

//PG_KEYWORD("similar", SIMILAR, TYPE_FUNC_NAME_KEYWORD)
SIMILAR : [sS][iI][mM][iI][lL][aA][rR];

//PG_KEYWORD("simple", SIMPLE, UNRESERVED_KEYWORD)
SIMPLE : [sS][iI][mM][pP][lL][eE];

//PG_KEYWORD("smallint", SMALLINT, COL_NAME_KEYWORD)
SMALLINT : [sS][mM][aA][lL][lL][iI][nN][tT];

//PG_KEYWORD("snapshot", SNAPSHOT, UNRESERVED_KEYWORD)
SNAPSHOT : [sS][nN][aA][pP][sS][hH][oO][tT];

//PG_KEYWORD("some", SOME, RESERVED_KEYWORD)
SOME : [sS][oO][mM][eE];

//PG_KEYWORD("stable", STABLE, UNRESERVED_KEYWORD)
STABLE : [sS][tT][aA][bB][lL][eE];

//PG_KEYWORD("standalone", STANDALONE_P, UNRESERVED_KEYWORD)
STANDALONE_P : [sS][tT][aA][nN][dD][aA][lL][oO][nN][eE];

//PG_KEYWORD("start", START, UNRESERVED_KEYWORD)
START : [sS][tT][aA][rR][tT];

//PG_KEYWORD("statement", STATEMENT, UNRESERVED_KEYWORD)
STATEMENT : [sS][tT][aA][tT][eE][mM][eE][nN][tT];

//PG_KEYWORD("statistics", STATISTICS, UNRESERVED_KEYWORD)
STATISTICS : [sS][tT][aA][tT][iI][sS][tT][iI][cC][sS];

//PG_KEYWORD("stdin", STDIN, UNRESERVED_KEYWORD)
STDIN : [sS][tT][dD][iI][nN];

//PG_KEYWORD("stdout", STDOUT, UNRESERVED_KEYWORD)
STDOUT : [sS][tT][dD][oO][uU][tT];

//PG_KEYWORD("storage", STORAGE, UNRESERVED_KEYWORD)
STORAGE : [sS][tT][oO][rR][aA][gG][eE];

//PG_KEYWORD("strict", STRICT_P, UNRESERVED_KEYWORD)
STRICT_P : [sS][tT][rR][iI][cC][tT];

//PG_KEYWORD("strip", STRIP_P, UNRESERVED_KEYWORD)
STRIP_P : [sS][tT][rR][iI][pP];

//PG_KEYWORD("substring", SUBSTRING, COL_NAME_KEYWORD)
SUBSTRING : [sS][uU][bB][sS][tT][rR][iI][nN][gG];

//PG_KEYWORD("symmetric", SYMMETRIC, RESERVED_KEYWORD)
SYMMETRIC : [sS][yY][mM][mM][eE][tT][rR][iI][cC];

//PG_KEYWORD("sysid", SYSID, UNRESERVED_KEYWORD)
SYSID : [sS][yY][sS][iI][dD];

//PG_KEYWORD("system", SYSTEM_P, UNRESERVED_KEYWORD)
SYSTEM_P : [sS][yY][sS][tT][eE][mM];

//PG_KEYWORD("table", TABLE, RESERVED_KEYWORD)
TABLE : [tT][aA][bB][lL][eE];

//PG_KEYWORD("tables", TABLES, UNRESERVED_KEYWORD)
TABLES : [tT][aA][bB][lL][eE][sS];

//PG_KEYWORD("tablespace", TABLESPACE, UNRESERVED_KEYWORD)
TABLESPACE : [tT][aA][bB][lL][eE][sS][pP][aA][cC][eE];

//PG_KEYWORD("temp", TEMP, UNRESERVED_KEYWORD)
TEMP : [tT][eE][mM][pP];

//PG_KEYWORD("template", TEMPLATE, UNRESERVED_KEYWORD)
TEMPLATE : [tT][eE][mM][pP][lL][aA][tT][eE];

//PG_KEYWORD("temporary", TEMPORARY, UNRESERVED_KEYWORD)
TEMPORARY : [tT][eE][mM][pP][oO][rR][aA][rR][yY];

//PG_KEYWORD("text", TEXT_P, UNRESERVED_KEYWORD)
TEXT_P : [tT][eE][xX][tT];

//PG_KEYWORD("then", THEN, RESERVED_KEYWORD)
THEN : [tT][hH][eE][nN];

//PG_KEYWORD("time", TIME, COL_NAME_KEYWORD)
TIME : [tT][iI][mM][eE];

//PG_KEYWORD("timestamp", TIMESTAMP, COL_NAME_KEYWORD)
TIMESTAMP : [tT][iI][mM][eE][sS][tT][aA][mM][pP];

//PG_KEYWORD("to", TO, RESERVED_KEYWORD)
TO : [tT][oO];

//PG_KEYWORD("trailing", TRAILING, RESERVED_KEYWORD)
TRAILING : [tT][rR][aA][iI][lL][iI][nN][gG];

//PG_KEYWORD("transaction", TRANSACTION, UNRESERVED_KEYWORD)
TRANSACTION : [tT][rR][aA][nN][sS][aA][cC][tT][iI][oO][nN];

//PG_KEYWORD("treat", TREAT, COL_NAME_KEYWORD)
TREAT : [tT][rR][eE][aA][tT];

//PG_KEYWORD("trigger", TRIGGER, UNRESERVED_KEYWORD)
TRIGGER : [tT][rR][iI][gG][gG][eE][rR];

//PG_KEYWORD("trim", TRIM, COL_NAME_KEYWORD)
TRIM : [tT][rR][iI][mM];

//PG_KEYWORD("true", TRUE_P, RESERVED_KEYWORD)
TRUE_P : [tT][rR][uU][eE];

//PG_KEYWORD("truncate", TRUNCATE, UNRESERVED_KEYWORD)
TRUNCATE : [tT][rR][uU][nN][cC][aA][tT][eE];

//PG_KEYWORD("trusted", TRUSTED, UNRESERVED_KEYWORD)
TRUSTED : [tT][rR][uU][sS][tT][eE][dD];

//PG_KEYWORD("type", TYPE_P, UNRESERVED_KEYWORD)
TYPE_P : [tT][yY][pP][eE];

//PG_KEYWORD("types", TYPES_P, UNRESERVED_KEYWORD)
TYPES_P : [tT][yY][pP][eE][sS];

//PG_KEYWORD("unbounded", UNBOUNDED, UNRESERVED_KEYWORD)
UNBOUNDED : [uU][nN][bB][oO][uU][nN][dD][eE][dD];

//PG_KEYWORD("uncommitted", UNCOMMITTED, UNRESERVED_KEYWORD)
UNCOMMITTED : [uU][nN][cC][oO][mM][mM][iI][tT][tT][eE][dD];

//PG_KEYWORD("unencrypted", UNENCRYPTED, UNRESERVED_KEYWORD)
UNENCRYPTED : [uU][nN][eE][nN][cC][rR][yY][pP][tT][eE][dD];

//PG_KEYWORD("union", UNION, RESERVED_KEYWORD)
UNION : [uU][nN][iI][oO][nN];

//PG_KEYWORD("unique", UNIQUE, RESERVED_KEYWORD)
UNIQUE : [uU][nN][iI][qQ][uU][eE];

//PG_KEYWORD("unknown", UNKNOWN, UNRESERVED_KEYWORD)
UNKNOWN : [uU][nN][kK][nN][oO][wW][nN];

//PG_KEYWORD("unlisten", UNLISTEN, UNRESERVED_KEYWORD)
UNLISTEN : [uU][nN][lL][iI][sS][tT][eE][nN];

//PG_KEYWORD("unlogged", UNLOGGED, UNRESERVED_KEYWORD)
UNLOGGED : [uU][nN][lL][oO][gG][gG][eE][dD];

//PG_KEYWORD("until", UNTIL, UNRESERVED_KEYWORD)
UNTIL : [uU][nN][tT][iI][lL];

//PG_KEYWORD("update", UPDATE, UNRESERVED_KEYWORD)
UPDATE : [uU][pP][dD][aA][tT][eE];

//PG_KEYWORD("user", USER, RESERVED_KEYWORD)
USER : [uU][sS][eE][rR];

//PG_KEYWORD("using", USING, RESERVED_KEYWORD)
USING : [uU][sS][iI][nN][gG];

//PG_KEYWORD("vacuum", VACUUM, UNRESERVED_KEYWORD)
VACUUM : [vV][aA][cC][uU][uU][mM];

//PG_KEYWORD("valid", VALID, UNRESERVED_KEYWORD)
VALID : [vV][aA][lL][iI][dD];

//PG_KEYWORD("validate", VALIDATE, UNRESERVED_KEYWORD)
VALIDATE : [vV][aA][lL][iI][dD][aA][tT][eE];

//PG_KEYWORD("validator", VALIDATOR, UNRESERVED_KEYWORD)
VALIDATOR : [vV][aA][lL][iI][dD][aA][tT][oO][rR];

//PG_KEYWORD("value", VALUE_P, UNRESERVED_KEYWORD)
VALUE_P : [vV][aA][lL][uU][eE];

//PG_KEYWORD("values", VALUES, COL_NAME_KEYWORD)
VALUES : [vV][aA][lL][uU][eE][sS];

//PG_KEYWORD("varchar", VARCHAR, COL_NAME_KEYWORD)
VARCHAR : [vV][aA][rR][cC][hH][aA][rR];

//PG_KEYWORD("variadic", VARIADIC, RESERVED_KEYWORD)
VARIADIC : [vV][aA][rR][iI][aA][dD][iI][cC];

//PG_KEYWORD("varying", VARYING, UNRESERVED_KEYWORD)
VARYING : [vV][aA][rR][yY][iI][nN][gG];

//PG_KEYWORD("verbose", VERBOSE, TYPE_FUNC_NAME_KEYWORD)
VERBOSE : [vV][eE][rR][bB][oO][sS][eE];

//PG_KEYWORD("version", VERSION_P, UNRESERVED_KEYWORD)
VERSION_P : [vV][eE][rR][sS][iI][oO][nN];

//PG_KEYWORD("view", VIEW, UNRESERVED_KEYWORD)
VIEW : [vV][iI][eE][wW];

//PG_KEYWORD("volatile", VOLATILE, UNRESERVED_KEYWORD)
VOLATILE : [vV][oO][lL][aA][tT][iI][lL][eE];

//PG_KEYWORD("when", WHEN, RESERVED_KEYWORD)
WHEN : [wW][hH][eE][nN];

//PG_KEYWORD("where", WHERE, RESERVED_KEYWORD)
WHERE : [wW][hH][eE][rR][eE];

//PG_KEYWORD("whitespace", WHITESPACE_P, UNRESERVED_KEYWORD)
WHITESPACE_P : [wW][hH][iI][tT][eE][sS][pP][aA][cC][eE];

//PG_KEYWORD("window", WINDOW, RESERVED_KEYWORD)
WINDOW : [wW][iI][nN][dD][oO][wW];

//PG_KEYWORD("with", WITH, RESERVED_KEYWORD)
WITH : [wW][iI][tT][hH];

//PG_KEYWORD("without", WITHOUT, UNRESERVED_KEYWORD)
WITHOUT : [wW][iI][tT][hH][oO][uU][tT];

//PG_KEYWORD("work", WORK, UNRESERVED_KEYWORD)
WORK : [wW][oO][rR][kK];

//PG_KEYWORD("wrapper", WRAPPER, UNRESERVED_KEYWORD)
WRAPPER : [wW][rR][aA][pP][pP][eE][rR];

//PG_KEYWORD("write", WRITE, UNRESERVED_KEYWORD)
WRITE : [wW][rR][iI][tT][eE];

//PG_KEYWORD("xml", XML_P, UNRESERVED_KEYWORD)
XML_P : [xX][mM][lL];

//PG_KEYWORD("xmlattributes", XMLATTRIBUTES, COL_NAME_KEYWORD)
XMLATTRIBUTES : [xX][mM][lL][aA][tT][tT][rR][iI][bB][uU][tT][eE][sS];

//PG_KEYWORD("xmlconcat", XMLCONCAT, COL_NAME_KEYWORD)
XMLCONCAT : [xX][mM][lL][cC][oO][nN][cC][aA][tT];

//PG_KEYWORD("xmlelement", XMLELEMENT, COL_NAME_KEYWORD)
XMLELEMENT : [xX][mM][lL][eE][lL][eE][mM][eE][nN][tT];

//PG_KEYWORD("xmlexists", XMLEXISTS, COL_NAME_KEYWORD)
XMLEXISTS : [xX][mM][lL][eE][xX][iI][sS][tT][sS];

//PG_KEYWORD("xmlforest", XMLFOREST, COL_NAME_KEYWORD)
XMLFOREST : [xX][mM][lL][fF][oO][rR][eE][sS][tT];

//PG_KEYWORD("xmlparse", XMLPARSE, COL_NAME_KEYWORD)
XMLPARSE : [xX][mM][lL][pP][aA][rR][sS][eE];

//PG_KEYWORD("xmlpi", XMLPI, COL_NAME_KEYWORD)
XMLPI : [xX][mM][lL][pP][iI];

//PG_KEYWORD("xmlroot", XMLROOT, COL_NAME_KEYWORD)
XMLROOT : [xX][mM][lL][rR][oO][oO][tT];

//PG_KEYWORD("xmlserialize", XMLSERIALIZE, COL_NAME_KEYWORD)
XMLSERIALIZE : [xX][mM][lL][sS][eE][rR][iI][aA][lL][iI][zZ][eE];

//PG_KEYWORD("year", YEAR_P, UNRESERVED_KEYWORD)
YEAR_P : [yY][eE][aA][rR];

//PG_KEYWORD("yes", YES_P, UNRESERVED_KEYWORD)
YES_P : [yY][eE][sS];

//PG_KEYWORD("zone", ZONE, UNRESERVED_KEYWORD)
ZONE : [zZ][oO][nN][eE];


