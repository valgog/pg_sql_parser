grammar PlPgSql;
import PlPgSqlKeyWords, Sql;

pl_function:        comp_options pl_block opt_semi
    ;

comp_options:        comp_options comp_option
    |
    ;

comp_option:        '#' K_OPTION K_DUMP
    |   '#' K_VARIABLE_CONFLICT K_ERROR
    |   '#' K_VARIABLE_CONFLICT K_USE_VARIABLE
    |   '#' K_VARIABLE_CONFLICT K_USE_COLUMN
    ;

opt_semi:        ';'
    |
    ;

pl_block:        decl_sect K_BEGIN proc_sect exception_sect K_END opt_label
    ;

decl_sect:        opt_block_label decl_start decl_stmts
    |   opt_block_label decl_start
    |   opt_block_label
    ;

decl_start:        K_DECLARE
    ;

decl_stmts:        decl_stmts decl_stmt
    |   decl_stmt
    ;

decl_stmt:        decl_statement
    |   LESS_LESS any_identifier GREATER_GREATER
    |   K_DECLARE
    ;

decl_statement:        decl_varname decl_const decl_datatype decl_collate decl_notnull decl_defval
    |   decl_varname opt_scrollable K_CURSOR decl_cursor_args decl_is_for decl_cursor_query
    |   decl_varname K_ALIAS K_FOR decl_aliasitem ';'
    ;

opt_scrollable:
    |   K_NO K_SCROLL
    |   K_SCROLL
    ;

decl_cursor_query:  stmt
                 ;

decl_cursor_args:  '(' decl_cursor_arglist ')'
                |
                ;

decl_cursor_arglist:        decl_cursor_arglist ',' decl_cursor_arg
    |   decl_cursor_arg
    ;

decl_cursor_arg:        decl_varname decl_datatype
    ;

decl_is_for:        K_IS
    |   K_FOR
    ;

decl_aliasitem:     IDENT
    ;

decl_varname:  unreserved_keyword
            |  IDENT
            ;

decl_const:
    |   K_CONSTANT
    ;

decl_datatype: typename
    ;

decl_collate:
    |   K_COLLATE IDENT
    ;

decl_notnull:
    |   K_NOT K_NULL
    ;

decl_defval:        ';'
    |   decl_defkey stmt
    ;

decl_defkey:        assign_operator
    |   K_DEFAULT
    ;

assign_operator:        '='
    |   COLON_EQUALS
    ;

proc_sect:        proc_stmts
    |
    ;

proc_stmts:  proc_stmts proc_stmt
          |  proc_stmt
          ;

proc_stmt:    pl_block ';'
    |   stmt_assign
    |   stmt_if
    |   stmt_case
    |   stmt_loop
    |   stmt_while
    |   stmt_for
    |   stmt_foreach_a
    |   stmt_exit
    |   stmt_return
    |   stmt_raise
    |   stmt_execsql
    |   stmt_dynexecute
    |   stmt_perform
    |   stmt_getdiag
    |   stmt_open
    |   stmt_fetch
    |   stmt_move
    |   stmt_close
    |   stmt_null
    ;

stmt_perform:        K_PERFORM expr_until_semi
    ;

stmt_assign:        assign_var assign_operator expr_until_semi
    ;

stmt_getdiag:        K_GET getdiag_area_opt K_DIAGNOSTICS getdiag_list ';'
    ;

getdiag_area_opt:
    |   K_CURRENT
    |   K_STACKED
    ;

getdiag_list:        getdiag_list ',' getdiag_list_item
    |   getdiag_list_item
    ;

getdiag_list_item:        getdiag_target assign_operator getdiag_item
    ;

// TODO
getdiag_item  :  K_ROW_COUNT
              | K_RESULT_OID
              | K_PG_EXCEPTION_DETAIL
              | K_PG_EXCEPTION_HINT
              | K_PG_EXCEPTION_CONTEXT
              | K_MESSAGE_TEXT
              | K_RETURNED_SQLSTATE
              ;

// TODO
getdiag_target:  IDENT
              ;

// TODO
assign_var:        assign_var '[' expr_until_rightbracket
    |   IDENT
    ;

stmt_if:        K_IF expr_until_then proc_sect stmt_elsifs stmt_else K_END K_IF ';'
    ;

stmt_elsifs :  stmt_elsif+
            ;

stmt_elsif : K_ELSIF expr_until_then proc_sect
           ;

stmt_else:        K_ELSE proc_sect
    |
    ;

stmt_case:        K_CASE opt_expr_until_when case_when_list opt_case_else K_END K_CASE ';'
    ;

// TODO
opt_expr_until_when:  stmt K_WHEN
                   ;

case_when_list:        case_when_list case_when
    |   case_when
    ;

case_when:        K_WHEN expr_until_then proc_sect
    ;

opt_case_else:        K_ELSE proc_sect
    |
    ;

stmt_loop:        opt_block_label K_LOOP loop_body
    ;

stmt_while:         opt_block_label K_WHILE expr_until_loop loop_body
    ;

stmt_for:           opt_block_label K_FOR for_control loop_body
    ;

// TODO
// TODO what about cursor parameters (see original grammar)?
for_control:  for_variable  K_IN  K_EXECUTE  select_clause                                 K_LOOP
           |  for_variable  K_IN             select_clause  K_USING  a_expr (a_expr ',')*  K_LOOP
           |  for_variable  K_IN             IDENT                                         K_LOOP
           |  for_variable  K_IN             IDENT       DOT_DOT     IDENT                 K_LOOP
           |  for_variable  K_IN  K_REVERSE  IDENT       DOT_DOT     IDENT                 K_LOOP
           |  for_variable  K_IN             select_clause                                 K_LOOP
           ;

// TODO
for_variable:       IDENT
    ;

stmt_foreach_a:     opt_block_label K_FOREACH for_variable foreach_slice K_IN K_ARRAY expr_until_loop loop_body
    ;

foreach_slice:
    |   K_SLICE ICONST
    ;

stmt_exit:        exit_type opt_label opt_exitcond
    ;

exit_type:        K_EXIT
    |   K_CONTINUE
    ;

// TODO
stmt_return: K_RETURN K_QUERY  select_clause
           | K_RETURN K_NEXT   a_expr
           | K_RETURN          a_expr?
           ;
// TODO
// TODO it seems that there is also something with USING...
stmt_raise:  K_RAISE raiseLevel (format=SCONST (','  raise_expr)*)?  ';'
          ;

// TODO
raiseLevel : /* EMPTY */ | K_EXCEPTION | K_WARNING | K_NOTICE | K_INFO | K_LOG | K_DEBUG ;

raise_expr : a_expr;

loop_body:    proc_sect K_END K_LOOP opt_label ';'
    ;

// TODO
// can not reuse SQL rule stmt because it has an empty alternative
stmt_execsql:         alterDatabaseStmt
    |   alterDatabaseSetStmt
    |   alterDefaultPrivilegesStmt
    |   alterDomainStmt
    |   alterEnumStmt
    |   alterExtensionStmt
    |   alterExtensionContentsStmt
    |   alterFdwStmt
    |   alterForeignServerStmt
    |   alterForeignTableStmt
    |   alterFunctionStmt
    |   alterGroupStmt
    |   alterObjectSchemaStmt
    |   alterOwnerStmt
    |   alterSeqStmt
    |   alterTableStmt
    |   alterCompositeTypeStmt
    |   alterRoleSetStmt
    |   alterRoleStmt
    |   alterTSConfigurationStmt
    |   alterTSDictionaryStmt
    |   alterUserMappingStmt
    |   alterUserSetStmt
    |   alterUserStmt
    |   analyzeStmt
    |   checkPointStmt
    |   closePortalStmt
    |   clusterStmt
    |   commentStmt
    |   constraintsSetStmt
    |   copyStmt
    |   createAsStmt
    |   createAssertStmt
    |   createCastStmt
    |   createConversionStmt
    |   createDomainStmt
    |   createExtensionStmt
    |   createFdwStmt
    |   createForeignServerStmt
    |   createForeignTableStmt
    |   createFunctionStmt
    |   createGroupStmt
    |   createOpClassStmt
    |   createOpFamilyStmt
    |   alterOpFamilyStmt
    |   createPLangStmt
    |   createSchemaStmt
    |   createSeqStmt
    |   createStmt
    |   createTableSpaceStmt
    |   createTrigStmt
    |   createRoleStmt
    |   createUserStmt
    |   createUserMappingStmt
    |   createdbStmt
    |   deallocateStmt
    |   declareCursorStmt
    |   defineStmt
    |   deleteStmt
    |   discardStmt
    |   doStmt
    |   dropAssertStmt
    |   dropCastStmt
    |   dropFdwStmt
    |   dropForeignServerStmt
    |   dropGroupStmt
    |   dropOpClassStmt
    |   dropOpFamilyStmt
    |   dropOwnedStmt
    |   dropPLangStmt
    |   dropRuleStmt
    |   dropStmt
    |   dropTableSpaceStmt
    |   dropTrigStmt
    |   dropRoleStmt
    |   dropUserStmt
    |   dropUserMappingStmt
    |   dropdbStmt
    |   executeStmt
    |   explainStmt
    |   fetchStmt
    |   grantStmt
    |   grantRoleStmt
    |   indexStmt
    |   insertStmt
    |   listenStmt
    |   loadStmt
    |   lockStmt
    |   notifyStmt
    |   prepareStmt
    |   reassignOwnedStmt
    |   reindexStmt
    |   removeAggrStmt
    |   removeFuncStmt
    |   removeOperStmt
    |   renameStmt
    |   revokeStmt
    |   revokeRoleStmt
    |   ruleStmt
    |   secLabelStmt
    |   selectStmt
    |   transactionStmt
    |   truncateStmt
    |   unlistenStmt
    |   updateStmt
    |   vacuumStmt
    |   variableResetStmt
    |   variableSetStmt
    |   variableShowStmt
    |   viewStmt
    ;

// TODO
stmt_dynexecute:  K_EXECUTE commandString=SCONST usingClause? (K_INTO target=IDENT)? ';'
    ;

usingClause : K_USING '(' usingClauseArgumentsList ')'
            ;

usingClauseArgumentsList : usingClauseArgument (',' usingClauseArgument)*
                         ;

usingClauseArgument      : IDENT
                         ;


stmt_open:  K_OPEN cursor_variable (K_NO? K_SCROLL)? K_FOR  select_clause
         |  K_OPEN cursor_variable (K_NO? K_SCROLL)? K_FOR  K_EXECUTE queryString=SCONST usingClause?
         |  K_OPEN cursor_variable '(' cursorArgumentsList ')'
         |  K_OPEN cursor_variable
         ;


cursorArgumentsList: cursorArgument (',' cursorArgument)*
                   ;

cursorArgument : IDENT
               ;

stmt_fetch:  K_FETCH opt_fetch_direction cursor_variable K_INTO target=IDENT ';'
          ;

stmt_move:  K_MOVE opt_fetch_direction cursor_variable ';'
    ;

// TODO
opt_fetch_direction:  | K_FORWARD | K_BACKWARD
    ;

stmt_close:        K_CLOSE cursor_variable ';'
    ;

stmt_null:        K_NULL ';'
    ;

cursor_variable:  IDENT
    ;

exception_sect:  K_EXCEPTION proc_exceptions a_expr
              |  K_EXCEPTION proc_exceptions
              ;

proc_exceptions:        proc_exceptions proc_exception
    |   proc_exception
    ;

proc_exception:        K_WHEN proc_conditions K_THEN proc_sect
    ;

proc_conditions:        proc_conditions K_OR proc_condition
    |   proc_condition
    ;

proc_condition: K_SQLSTATE      sqlState=SCONST
              | any_identifier
              ;

expr_until_semi: a_expr ';'  // TODO
    ;

expr_until_rightbracket: a_expr ']'  // TODO
    ;

expr_until_then: a_expr K_THEN    // TODO
    ;

expr_until_loop: a_expr K_LOOP    // TODO
    ;

opt_block_label:        LESS_LESS any_identifier GREATER_GREATER
    |
    ;

opt_label:        any_identifier
    |
    ;

opt_exitcond:        ';'
    |   K_WHEN expr_until_semi
    ;

any_identifier:  IDENT  // TODO
    ;

unreserved_keyword:        K_ABSOLUTE
    |   K_ALIAS
    |   K_ARRAY
    |   K_BACKWARD
    |   K_CONSTANT
    |   K_CURRENT
    |   K_CURSOR
    |   K_DEBUG
    |   K_DETAIL
    |   K_DUMP
    |   K_ERRCODE
    |   K_ERROR
    |   K_FIRST
    |   K_FORWARD
    |   K_HINT
    |   K_INFO
    |   K_IS
    |   K_LAST
    |   K_LOG
    |   K_MESSAGE
    |   K_MESSAGE_TEXT
    |   K_NEXT
    |   K_NO
    |   K_NOTICE
    |   K_OPTION
    |   K_PG_EXCEPTION_CONTEXT
    |   K_PG_EXCEPTION_DETAIL
    |   K_PG_EXCEPTION_HINT
    |   K_PRIOR
    |   K_QUERY
    |   K_RELATIVE
    |   K_RESULT_OID
    |   K_RETURNED_SQLSTATE
    |   K_REVERSE
    |   K_ROW_COUNT
    |   K_ROWTYPE
    |   K_SCROLL
    |   K_SLICE
    |   K_SQLSTATE
    |   K_STACKED
    |   K_TYPE
    |   K_USE_COLUMN
    |   K_USE_VARIABLE
    |   K_VARIABLE_CONFLICT
    |   K_WARNING
    ;


