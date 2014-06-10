grammar Plpgsql;

import PlPgSqlKeyWords;


pl_function		: comp_options pl_block opt_semi
				;

comp_options	:
				| comp_options comp_option
				;

comp_option		: '#' K_OPTION K_DUMP
				| '#' K_VARIABLE_CONFLICT K_ERROR
				| '#' K_VARIABLE_CONFLICT K_USE_VARIABLE
				| '#' K_VARIABLE_CONFLICT K_USE_COLUMN
				;

opt_semi		:
				| ';'
				;

pl_block		: decl_sect K_BEGIN proc_sect exception_sect K_END opt_label
				;


decl_sect		: opt_block_label
				| opt_block_label decl_start
				| opt_block_label decl_start decl_stmts
				;

decl_start		: K_DECLARE
				;

decl_stmts		: decl_stmts decl_stmt
				| decl_stmt
				;

decl_stmt		: decl_statement
				| K_DECLARE
				| LESS_LESS any_identifier GREATER_GREATER
				;

decl_statement	: decl_varname decl_const decl_datatype decl_collate decl_notnull decl_defval
				| decl_varname K_ALIAS K_FOR decl_aliasitem ';'
				| decl_varname opt_scrollable K_CURSOR
				  decl_cursor_args decl_is_for decl_cursor_query
				;

opt_scrollable :
				| K_NO K_SCROLL
				| K_SCROLL
				;

decl_cursor_query :
				;

decl_cursor_args :
				| '(' decl_cursor_arglist ')'
				;

decl_cursor_arglist : decl_cursor_arg
				| decl_cursor_arglist ',' decl_cursor_arg
				;

decl_cursor_arg : decl_varname decl_datatype

				;

decl_is_for		:	K_IS |		/* Oracle */
					K_FOR;		/* SQL standard */

decl_aliasitem	: T_WORD
				| T_CWORD
				;

decl_varname	: T_WORD
				| unreserved_keyword

				;

decl_const		:

				| K_CONSTANT

				;

decl_datatype	:

				;

decl_collate	:

				| K_COLLATE T_WORD

				| K_COLLATE T_CWORD

				;

decl_notnull	:

				| K_NOT K_NULL

				;

decl_defval		: ';'

				| decl_defkey

				;

decl_defkey		: assign_operator
				| K_DEFAULT
				;

assign_operator	: '='
				| COLON_EQUALS
				;

proc_sect		:

				| proc_stmts

				;

proc_stmts		: proc_stmts proc_stmt

				| proc_stmt

				;

proc_stmt		: pl_block ';'

				| stmt_assign

				| stmt_if

				| stmt_case

				| stmt_loop

				| stmt_while

				| stmt_for

				| stmt_foreach_a

				| stmt_exit

				| stmt_return

				| stmt_raise

				| stmt_execsql

				| stmt_dynexecute

				| stmt_perform

				| stmt_getdiag

				| stmt_open

				| stmt_fetch

				| stmt_move

				| stmt_close

				| stmt_null

				;

stmt_perform	: K_PERFORM expr_until_semi

				;

stmt_assign		: assign_var assign_operator expr_until_semi

				;

stmt_getdiag	: K_GET getdiag_area_opt K_DIAGNOSTICS getdiag_list ';'

				;

getdiag_area_opt :

				| K_CURRENT

				| K_STACKED

				;

getdiag_list : getdiag_list ',' getdiag_list_item

				| getdiag_list_item

				;

getdiag_list_item : getdiag_target assign_operator getdiag_item

				;

getdiag_item :

				;

getdiag_target	: T_DATUM

				| T_WORD

				| T_CWORD

				;


assign_var		: T_DATUM

				| assign_var '[' expr_until_rightbracket

				;

stmt_if			: K_IF expr_until_then proc_sect stmt_elsifs stmt_else K_END K_IF ';'

				;

stmt_elsifs		:

				| stmt_elsifs K_ELSIF expr_until_then proc_sect

				;

stmt_else		:

				| K_ELSE proc_sect

				;

stmt_case		: K_CASE opt_expr_until_when case_when_list opt_case_else K_END K_CASE ';'

				;

opt_expr_until_when	:

				;

case_when_list	: case_when_list case_when

				| case_when

				;

case_when		: K_WHEN expr_until_then proc_sect

				;

opt_case_else	:

				| K_ELSE proc_sect

				;

stmt_loop		: opt_block_label K_LOOP loop_body

				;

stmt_while		: opt_block_label K_WHILE expr_until_loop loop_body

				;

stmt_for		: opt_block_label K_FOR for_control loop_body

				;

for_control		: for_variable K_IN

				;

/*
 * Processing the for_variable is tricky because we don't yet know if the
 * FOR is an integer FOR loop or a loop over query results.  In the former
 * case, the variable is just a name that we must instantiate as a loop
 * local variable, regardless of any other definition it might have.
 * Therefore, we always save the actual identifier into $$.name where it
 * can be used for that case.  We also save the outer-variable definition,
 * if any, because that's what we need for the loop-over-query case.  Note
 * that we must NOT apply check_assignable() or any other semantic check
 * until we know what's what.
 *
 * However, if we see a comma-separated list of names, we know that it
 * can't be an integer FOR loop and so it's OK to check the variables
 * immediately.  In particular, for T_WORD followed by comma, we should
 * complain that the name is not known rather than say it's a syntax error.
 * Note that the non-error result of this case sets *both* $$.scalar and
 * $$.row; see the for_control production.
 */
for_variable	: T_DATUM

				| T_WORD

				| T_CWORD

				;

stmt_foreach_a	: opt_block_label K_FOREACH for_variable foreach_slice K_IN K_ARRAY expr_until_loop loop_body

				;

foreach_slice	:

				| K_SLICE ICONST

				;

stmt_exit		: exit_type opt_label opt_exitcond

				;

exit_type		: K_EXIT

				| K_CONTINUE

				;

stmt_return		: K_RETURN

				;

stmt_raise		: K_RAISE

				;

loop_body		: proc_sect K_END K_LOOP opt_label ';'

				;

/*
 * T_WORD+T_CWORD match any initial identifier that is not a known plpgsql
 * variable.  (The composite case is probably a syntax error, but we'll let
 * the core parser decide that.)  Normally, we should assume that such a
 * word is a SQL statement keyword that isn't also a plpgsql keyword.
 * However, if the next token is assignment or '[', it can't be a valid
 * SQL statement, and what we're probably looking at is an intended variable
 * assignment.  Give an appropriate complaint for that, instead of letting
 * the core parser throw an unhelpful "syntax error".
 */
stmt_execsql	: K_INSERT

				| T_WORD

				| T_CWORD

				;

stmt_dynexecute : K_EXECUTE

				;


stmt_open		: K_OPEN cursor_variable

				;

stmt_fetch		: K_FETCH opt_fetch_direction cursor_variable K_INTO

				;

stmt_move		: K_MOVE opt_fetch_direction cursor_variable ';'

				;

opt_fetch_direction	:

				;

stmt_close		: K_CLOSE cursor_variable ';'

				;

stmt_null		: K_NULL ';'

				;

cursor_variable	: T_DATUM

				| T_WORD

				| T_CWORD

				;

exception_sect	:

				| K_EXCEPTION

					proc_exceptions

				;

proc_exceptions	: proc_exceptions proc_exception

				| proc_exception

				;

proc_exception	: K_WHEN proc_conditions K_THEN proc_sect

				;

proc_conditions	: proc_conditions K_OR proc_condition

				| proc_condition

				;

proc_condition	: any_identifier

				;

expr_until_semi :

				;

expr_until_rightbracket :

				;

expr_until_then :

				;

expr_until_loop :

				;

opt_block_label	:

				| LESS_LESS any_identifier GREATER_GREATER

				;

opt_label	:

				| any_identifier

				;

opt_exitcond	: ';'

				| K_WHEN expr_until_semi

				;

/*
 * need both options because scanner will have tried to resolve as variable
 */
any_identifier	: T_WORD

				| T_DATUM

				;

unreserved_keyword	:
				K_ABSOLUTE
				| K_ALIAS
				| K_ARRAY
				| K_BACKWARD
				| K_CONSTANT
				| K_CURRENT
				| K_CURSOR
				| K_DEBUG
				| K_DETAIL
				| K_DUMP
				| K_ERRCODE
				| K_ERROR
				| K_FIRST
				| K_FORWARD
				| K_HINT
				| K_INFO
				| K_IS
				| K_LAST
				| K_LOG
				| K_MESSAGE
				| K_MESSAGE_TEXT
				| K_NEXT
				| K_NO
				| K_NOTICE
				| K_OPTION
				| K_PG_EXCEPTION_CONTEXT
				| K_PG_EXCEPTION_DETAIL
				| K_PG_EXCEPTION_HINT
				| K_PRIOR
				| K_QUERY
				| K_RELATIVE
				| K_RESULT_OID
				| K_RETURNED_SQLSTATE
				| K_REVERSE
				| K_ROW_COUNT
				| K_ROWTYPE
				| K_SCROLL
				| K_SLICE
				| K_SQLSTATE
				| K_STACKED
				| K_TYPE
				| K_USE_COLUMN
				| K_USE_VARIABLE
				| K_VARIABLE_CONFLICT
				| K_WARNING
				;
