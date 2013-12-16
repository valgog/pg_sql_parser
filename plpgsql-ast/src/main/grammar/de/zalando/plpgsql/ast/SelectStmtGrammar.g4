grammar SelectStmtGrammar;

import LexerRules;

selectStmt: SELECT (ALL | distinctClause )?
		  ;
		  
distincClause :  DISTINCT ON expression (',' expression)*
		      ;


SELECT   : [Ss][eE][Ll][Ee][cC][Tt];
ALL      : [Aa][lL][lL];
DISTINCT : [Dd][iI][Ss][tT][iI][nN][Cc][tT]; 