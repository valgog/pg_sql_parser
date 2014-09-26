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

pl_block:        decl_sect BEGIN_P proc_sect exception_sect END_P opt_label
    ;

decl_sect:        opt_block_label decl_start decl_stmts
    |   opt_block_label decl_start
    |   opt_block_label
    ;

decl_start:        DECLARE
    ;

decl_stmts:        decl_stmts decl_stmt
    |   decl_stmt
    ;

decl_stmt:        decl_statement
    |   LESS_LESS any_identifier GREATER_GREATER
    |   DECLARE
    ;

decl_statement:  decl_varname decl_const decl_datatype decl_collate decl_notnull decl_defval
              |  decl_varname opt_scrollable K_CURSOR decl_cursor_args decl_is_for decl_cursor_query ';'
              |  decl_varname K_ALIAS FOR decl_aliasitem ';'
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

decl_is_for:        IS
    |   FOR
    ;

decl_aliasitem:  any_identifier
    ;

decl_varname: any_identifier
            ;

decl_const:
    |   K_CONSTANT
    ;

// FIXME not 100% correct
decl_datatype: typename
    | typename '%' TYPE_P
    | typename '%' K_ROWTYPE
    ;

decl_collate:
    |   K_COLLATE IDENT
    ;

decl_notnull:
    |   NOT NULL_P
    ;

decl_defval:        ';'
    |   decl_defkey stmt ';'
    |   decl_defkey a_expr ';' // FIXME not sure if this is correct
    ;

decl_defkey:        assign_operator
    |   DEFAULT
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
    |   stmt_execsql ';'
    |   stmt_dynexecute
    |   stmt_perform
    |   stmt_getdiag
    |   stmt_open
    |   stmt_fetch
    |   stmt_move
    |   stmt_close
    |   stmt_null
    ;

stmt_perform: K_PERFORM expr_until_semi
            ;

stmt_assign:  assign_var assign_operator expr_until_semi
           ;

stmt_getdiag:  K_GET getdiag_area_opt K_DIAGNOSTICS getdiag_list ';'
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
//    |   IDENT
    |   any_identifier
    ;

stmt_if:        IF_P expr_until_then proc_sect stmt_elsif* stmt_else? END_P IF_P ';'
    ;

// stmt_elsifs :  stmt_elsif*
//            ;

stmt_elsif : K_ELSIF expr_until_then proc_sect
           ;

stmt_else  : ELSE proc_sect
//           |
           ;

stmt_case:        CASE opt_expr_until_when case_when_list opt_case_else END_P CASE ';'
    ;

// TODO
opt_expr_until_when:  a_expr
                   |
                   ;

case_when_list:        case_when_list case_when
    |   case_when
    ;

case_when:        WHEN expr_until_then proc_sect
    ;

opt_case_else:        ELSE proc_sect
    |
    ;

stmt_loop:        opt_block_label K_LOOP loop_body
    ;

stmt_while:         opt_block_label K_WHILE expr_until_loop loop_body
    ;

stmt_for:           opt_block_label FOR for_control loop_body
    ;

// TODO
// TODO what about cursor parameters (see original grammar)?
for_control:  for_variable  IN_P  K_EXECUTE  select_clause                                K_LOOP
           |  for_variable  IN_P             select_clause  USING  a_expr (a_expr ',')*   K_LOOP
           |  for_variable  IN_P             a_expr                                       K_LOOP
           |  for_variable  IN_P             a_expr       DOT_DOT     a_expr              K_LOOP
           |  for_variable  IN_P  K_REVERSE  a_expr       DOT_DOT     a_expr              K_LOOP
           |  for_variable  IN_P             select_clause                                K_LOOP
           ;

// TODO
for_variable:       IDENT
    ;

stmt_foreach_a:     opt_block_label K_FOREACH for_variable foreach_slice IN_P ARRAY expr_until_loop loop_body
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
stmt_return: K_RETURN K_QUERY  select_clause ';'
           | K_RETURN K_NEXT   a_expr ';'
           | K_RETURN          a_expr? ';'
           ;
// TODO
// TODO it seems that there is also something with USING...
stmt_raise:  K_RAISE raiseLevel (format=SCONST (','  raise_expr)*)?  usingClause? ';'
          ;

// TODO
raiseLevel : /* EMPTY */ | K_EXCEPTION | K_WARNING | K_NOTICE | K_INFO | K_LOG | K_DEBUG ;

raise_expr : a_expr;

loop_body:    proc_sect END_P K_LOOP opt_label ';'
    ;

// TODO
// can not reuse SQL rule stmt because it has an empty alternative
// TODO check if ';' is correct
stmt_execsql:  alterDatabaseStmt
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
stmt_dynexecute:  K_EXECUTE a_expr usingClause? (INTO target=IDENT)? ';'
    ;

usingClause : USING '(' usingClauseArgumentsList ')'
            | USING     usingClauseArgumentsList
            ;

usingClauseArgumentsList : usingClauseArgument (',' usingClauseArgument)*
                         ;

usingClauseArgument      :   stmt_assign | any_identifier
                         ;


stmt_open:  K_OPEN cursor_variable (K_NO? K_SCROLL)? FOR  select_clause
         |  K_OPEN cursor_variable (K_NO? K_SCROLL)? FOR  K_EXECUTE queryString=SCONST usingClause?
         |  K_OPEN cursor_variable '(' cursorArgumentsList ')'
         |  K_OPEN cursor_variable
         ;


cursorArgumentsList: cursorArgument (',' cursorArgument)*
                   ;

cursorArgument : IDENT
               ;

stmt_fetch:  K_FETCH opt_fetch_direction cursor_variable INTO target=IDENT ';'
          ;

stmt_move:  K_MOVE opt_fetch_direction cursor_variable ';'
    ;

// TODO
opt_fetch_direction:  | K_FORWARD | K_BACKWARD
    ;

stmt_close:        K_CLOSE cursor_variable ';'
    ;

stmt_null:        NULL_P ';'
    ;

cursor_variable:  IDENT
    ;

// TODO wrong generation? empty was missing
exception_sect:  K_EXCEPTION proc_exceptions a_expr
              |  K_EXCEPTION proc_exceptions
              |
              ;

proc_exceptions:        proc_exceptions proc_exception
    |   proc_exception
    ;

proc_exception:        WHEN proc_conditions THEN proc_sect
    ;

proc_conditions:        proc_conditions OR proc_condition
    |   proc_condition
    ;


proc_condition: IDENT     sqlState=SCONST
              | any_identifier
              ;


//proc_condition: K_SQLSTATE      sqlState=SCONST
//              | any_identifier
//              ;

expr_until_semi: any_identifier
               | a_expr ';'
               | opt_distinct target_list from_clause where_clause ';' // TODO
               ;

expr_until_rightbracket: a_expr ']'  // TODO
    ;

expr_until_then: a_expr THEN    // TODO
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
    |   WHEN expr_until_semi
    ;

// FIXME
any_identifier: qualified_name
| unreserved_keyword
|  IDENT  // TODO
    ;
