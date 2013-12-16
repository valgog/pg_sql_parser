grammar SelectStmtGrammar;

import LexerRules;

// http://www.postgresql.org/docs/9.1/static/queries-overview.html
// http://www.postgresql.org/docs/9.1/static/sql-select.html
// http://www.postgresql.org/docs/9.1/static/plpgsql-statements.html


// see http://www.postgresql.org/docs/9.1/static/queries-overview.html
selectStmt : select ';' ;

// TODO we leave WINDOW out for now
// (WITH withQueries)? 
select :  SELECT  selectList
//			(    
//			   intoClause?     // necessary for selectStmt
//			   fromClause
//			   whereClause?
//		        groupByClause?
//			   havingClause?
//			   bulkOperationClause?
//			   orderByClause?
//			   limitClause?
//			   offsetClause?
//			   fetchClause?
//			   forClause?
//			)? 
			;

selectList          : (ALL | distinctClause )?  ( selectAll | selectSpecific );
distinctClause      : DISTINCT ON expression (',' expression)* ;
selectSpecific      : expression (',' expression)* ; // TODO make labels AS label=ID -> as expression
selectAll           : '*';


intoClause     : INTO mode=STRICT? target=ID ;
limitClause    : LIMIT  limit=( INTEGER | ALL ) ;
offsetClause   : OFFSET offset=INTEGER (ROW | ROWS)? ;

orderByClause  : ORDER_BY orderByItem (',' orderByItem)*
orderByItem    : expression  ordering=( ASC | DESC | USING operator=(LT | LTE | GT | GTE) )?  ( nullsOrdering )?  ;
nullsOrdering  : NULLS  ordering=( FIRST | LAST  );

withQueries    : ;

// http://www.postgresql.org/docs/9.1/static/sql-select.html#SQL-FROM
fromClause        : FROM  tableExpression (',' tableExpression);

// TODO not finished yet
tableExpression   : (only=ONLY)? tableName=QNAME ('*')? (AS?  alias=ID columnAlias?  # fromTable
				  | '(' select ')' AS? alias=ID  columnAlias?                        # fromSelect
			      ;

columnAlias     : '(' columnAliasItem (',' columnAliasItem)* ')' ;
columnAliasItem : ID;


whereClause         : WHERE    condition;
groupByClause       : GROUP_BY expression ; 
havingClause        : HAVING   condition;
bulkOperationClause : ( operator=( UNION | INTERSECT | EXCEPT )   mode=(ALL | DISTINCT) select)? ;


condition : booleanExpr;


// In this syntax, to write anything except a simple integer constant for start or count, 
// you must write parentheses around it. If count is omitted in a FETCH clause, it defaults to 1. 
// ROW and ROWS as well as FIRST and NEXT are noise words that don't influence the effects of these clauses
fetchClause  : FETCH  (FIRST | NEXT )? (count=INTEGER_VALUE)?  (ROW | ROWS)? ONLY;

forClause    :  FOR lockMode=(UPDATE | SHARE)  (lockedTables)?  nowait=NOWAIT?;
lockedTables : OF lockedTable (',' lockedTable)*;
lockedTable  : ID;

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
