// Generated from de/zalando/plpgsql/ast/PlPgSql.g4 by ANTLR 4.2.3
package de.zalando.plpgsql.ast;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlPgSqlParser}.
 */
public interface PlPgSqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#expr_until_loop}.
	 * @param ctx the parse tree
	 */
	void enterExpr_until_loop(@NotNull PlPgSqlParser.Expr_until_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#expr_until_loop}.
	 * @param ctx the parse tree
	 */
	void exitExpr_until_loop(@NotNull PlPgSqlParser.Expr_until_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alterExtensionContentsStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterExtensionContentsStmt(@NotNull PlPgSqlParser.AlterExtensionContentsStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alterExtensionContentsStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterExtensionContentsStmt(@NotNull PlPgSqlParser.AlterExtensionContentsStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#select_no_parens}.
	 * @param ctx the parse tree
	 */
	void enterSelect_no_parens(@NotNull PlPgSqlParser.Select_no_parensContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#select_no_parens}.
	 * @param ctx the parse tree
	 */
	void exitSelect_no_parens(@NotNull PlPgSqlParser.Select_no_parensContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#privileges}.
	 * @param ctx the parse tree
	 */
	void enterPrivileges(@NotNull PlPgSqlParser.PrivilegesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#privileges}.
	 * @param ctx the parse tree
	 */
	void exitPrivileges(@NotNull PlPgSqlParser.PrivilegesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#ruleActionStmtOrEmpty}.
	 * @param ctx the parse tree
	 */
	void enterRuleActionStmtOrEmpty(@NotNull PlPgSqlParser.RuleActionStmtOrEmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#ruleActionStmtOrEmpty}.
	 * @param ctx the parse tree
	 */
	void exitRuleActionStmtOrEmpty(@NotNull PlPgSqlParser.RuleActionStmtOrEmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(@NotNull PlPgSqlParser.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(@NotNull PlPgSqlParser.EventContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#assign_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssign_operator(@NotNull PlPgSqlParser.Assign_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#assign_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssign_operator(@NotNull PlPgSqlParser.Assign_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_instead}.
	 * @param ctx the parse tree
	 */
	void enterOpt_instead(@NotNull PlPgSqlParser.Opt_insteadContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_instead}.
	 * @param ctx the parse tree
	 */
	void exitOpt_instead(@NotNull PlPgSqlParser.Opt_insteadContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#dropFdwStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropFdwStmt(@NotNull PlPgSqlParser.DropFdwStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#dropFdwStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropFdwStmt(@NotNull PlPgSqlParser.DropFdwStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_as}.
	 * @param ctx the parse tree
	 */
	void enterOpt_as(@NotNull PlPgSqlParser.Opt_asContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_as}.
	 * @param ctx the parse tree
	 */
	void exitOpt_as(@NotNull PlPgSqlParser.Opt_asContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#access_method}.
	 * @param ctx the parse tree
	 */
	void enterAccess_method(@NotNull PlPgSqlParser.Access_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#access_method}.
	 * @param ctx the parse tree
	 */
	void exitAccess_method(@NotNull PlPgSqlParser.Access_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#optforeigntableElementList}.
	 * @param ctx the parse tree
	 */
	void enterOptforeigntableElementList(@NotNull PlPgSqlParser.OptforeigntableElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#optforeigntableElementList}.
	 * @param ctx the parse tree
	 */
	void exitOptforeigntableElementList(@NotNull PlPgSqlParser.OptforeigntableElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#array_expr_list}.
	 * @param ctx the parse tree
	 */
	void enterArray_expr_list(@NotNull PlPgSqlParser.Array_expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#array_expr_list}.
	 * @param ctx the parse tree
	 */
	void exitArray_expr_list(@NotNull PlPgSqlParser.Array_expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_label}.
	 * @param ctx the parse tree
	 */
	void enterOpt_label(@NotNull PlPgSqlParser.Opt_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_label}.
	 * @param ctx the parse tree
	 */
	void exitOpt_label(@NotNull PlPgSqlParser.Opt_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alterfunc_opt_list}.
	 * @param ctx the parse tree
	 */
	void enterAlterfunc_opt_list(@NotNull PlPgSqlParser.Alterfunc_opt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alterfunc_opt_list}.
	 * @param ctx the parse tree
	 */
	void exitAlterfunc_opt_list(@NotNull PlPgSqlParser.Alterfunc_opt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#stmt_case}.
	 * @param ctx the parse tree
	 */
	void enterStmt_case(@NotNull PlPgSqlParser.Stmt_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#stmt_case}.
	 * @param ctx the parse tree
	 */
	void exitStmt_case(@NotNull PlPgSqlParser.Stmt_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#frame_extent}.
	 * @param ctx the parse tree
	 */
	void enterFrame_extent(@NotNull PlPgSqlParser.Frame_extentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#frame_extent}.
	 * @param ctx the parse tree
	 */
	void exitFrame_extent(@NotNull PlPgSqlParser.Frame_extentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#characterWithoutLength}.
	 * @param ctx the parse tree
	 */
	void enterCharacterWithoutLength(@NotNull PlPgSqlParser.CharacterWithoutLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#characterWithoutLength}.
	 * @param ctx the parse tree
	 */
	void exitCharacterWithoutLength(@NotNull PlPgSqlParser.CharacterWithoutLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#transaction_mode_item}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_mode_item(@NotNull PlPgSqlParser.Transaction_mode_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#transaction_mode_item}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_mode_item(@NotNull PlPgSqlParser.Transaction_mode_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#vacuumStmt}.
	 * @param ctx the parse tree
	 */
	void enterVacuumStmt(@NotNull PlPgSqlParser.VacuumStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#vacuumStmt}.
	 * @param ctx the parse tree
	 */
	void exitVacuumStmt(@NotNull PlPgSqlParser.VacuumStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opttypedtableElementList}.
	 * @param ctx the parse tree
	 */
	void enterOpttypedtableElementList(@NotNull PlPgSqlParser.OpttypedtableElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opttypedtableElementList}.
	 * @param ctx the parse tree
	 */
	void exitOpttypedtableElementList(@NotNull PlPgSqlParser.OpttypedtableElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_fdw_options}.
	 * @param ctx the parse tree
	 */
	void enterOpt_fdw_options(@NotNull PlPgSqlParser.Opt_fdw_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_fdw_options}.
	 * @param ctx the parse tree
	 */
	void exitOpt_fdw_options(@NotNull PlPgSqlParser.Opt_fdw_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#bit}.
	 * @param ctx the parse tree
	 */
	void enterBit(@NotNull PlPgSqlParser.BitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#bit}.
	 * @param ctx the parse tree
	 */
	void exitBit(@NotNull PlPgSqlParser.BitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(@NotNull PlPgSqlParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(@NotNull PlPgSqlParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#limit_clause}.
	 * @param ctx the parse tree
	 */
	void enterLimit_clause(@NotNull PlPgSqlParser.Limit_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#limit_clause}.
	 * @param ctx the parse tree
	 */
	void exitLimit_clause(@NotNull PlPgSqlParser.Limit_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#discardStmt}.
	 * @param ctx the parse tree
	 */
	void enterDiscardStmt(@NotNull PlPgSqlParser.DiscardStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#discardStmt}.
	 * @param ctx the parse tree
	 */
	void exitDiscardStmt(@NotNull PlPgSqlParser.DiscardStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#constraintsSetStmt}.
	 * @param ctx the parse tree
	 */
	void enterConstraintsSetStmt(@NotNull PlPgSqlParser.ConstraintsSetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#constraintsSetStmt}.
	 * @param ctx the parse tree
	 */
	void exitConstraintsSetStmt(@NotNull PlPgSqlParser.ConstraintsSetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_select_limit}.
	 * @param ctx the parse tree
	 */
	void enterOpt_select_limit(@NotNull PlPgSqlParser.Opt_select_limitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_select_limit}.
	 * @param ctx the parse tree
	 */
	void exitOpt_select_limit(@NotNull PlPgSqlParser.Opt_select_limitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#constInterval}.
	 * @param ctx the parse tree
	 */
	void enterConstInterval(@NotNull PlPgSqlParser.ConstIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#constInterval}.
	 * @param ctx the parse tree
	 */
	void exitConstInterval(@NotNull PlPgSqlParser.ConstIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#copy_generic_opt_arg}.
	 * @param ctx the parse tree
	 */
	void enterCopy_generic_opt_arg(@NotNull PlPgSqlParser.Copy_generic_opt_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#copy_generic_opt_arg}.
	 * @param ctx the parse tree
	 */
	void exitCopy_generic_opt_arg(@NotNull PlPgSqlParser.Copy_generic_opt_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#drop_type}.
	 * @param ctx the parse tree
	 */
	void enterDrop_type(@NotNull PlPgSqlParser.Drop_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#drop_type}.
	 * @param ctx the parse tree
	 */
	void exitDrop_type(@NotNull PlPgSqlParser.Drop_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#explainStmt}.
	 * @param ctx the parse tree
	 */
	void enterExplainStmt(@NotNull PlPgSqlParser.ExplainStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#explainStmt}.
	 * @param ctx the parse tree
	 */
	void exitExplainStmt(@NotNull PlPgSqlParser.ExplainStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#optseqOptList}.
	 * @param ctx the parse tree
	 */
	void enterOptseqOptList(@NotNull PlPgSqlParser.OptseqOptListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#optseqOptList}.
	 * @param ctx the parse tree
	 */
	void exitOptseqOptList(@NotNull PlPgSqlParser.OptseqOptListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#reassignOwnedStmt}.
	 * @param ctx the parse tree
	 */
	void enterReassignOwnedStmt(@NotNull PlPgSqlParser.ReassignOwnedStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#reassignOwnedStmt}.
	 * @param ctx the parse tree
	 */
	void exitReassignOwnedStmt(@NotNull PlPgSqlParser.ReassignOwnedStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#tableLikeClause}.
	 * @param ctx the parse tree
	 */
	void enterTableLikeClause(@NotNull PlPgSqlParser.TableLikeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#tableLikeClause}.
	 * @param ctx the parse tree
	 */
	void exitTableLikeClause(@NotNull PlPgSqlParser.TableLikeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#foreigntableElementList}.
	 * @param ctx the parse tree
	 */
	void enterForeigntableElementList(@NotNull PlPgSqlParser.ForeigntableElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#foreigntableElementList}.
	 * @param ctx the parse tree
	 */
	void exitForeigntableElementList(@NotNull PlPgSqlParser.ForeigntableElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#old_aggr_definition}.
	 * @param ctx the parse tree
	 */
	void enterOld_aggr_definition(@NotNull PlPgSqlParser.Old_aggr_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#old_aggr_definition}.
	 * @param ctx the parse tree
	 */
	void exitOld_aggr_definition(@NotNull PlPgSqlParser.Old_aggr_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#where_or_current_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_or_current_clause(@NotNull PlPgSqlParser.Where_or_current_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#where_or_current_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_or_current_clause(@NotNull PlPgSqlParser.Where_or_current_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_by}.
	 * @param ctx the parse tree
	 */
	void enterOpt_by(@NotNull PlPgSqlParser.Opt_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_by}.
	 * @param ctx the parse tree
	 */
	void exitOpt_by(@NotNull PlPgSqlParser.Opt_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#ctext_expr}.
	 * @param ctx the parse tree
	 */
	void enterCtext_expr(@NotNull PlPgSqlParser.Ctext_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#ctext_expr}.
	 * @param ctx the parse tree
	 */
	void exitCtext_expr(@NotNull PlPgSqlParser.Ctext_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#proc_sect}.
	 * @param ctx the parse tree
	 */
	void enterProc_sect(@NotNull PlPgSqlParser.Proc_sectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#proc_sect}.
	 * @param ctx the parse tree
	 */
	void exitProc_sect(@NotNull PlPgSqlParser.Proc_sectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#func_arg}.
	 * @param ctx the parse tree
	 */
	void enterFunc_arg(@NotNull PlPgSqlParser.Func_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#func_arg}.
	 * @param ctx the parse tree
	 */
	void exitFunc_arg(@NotNull PlPgSqlParser.Func_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#window_specification}.
	 * @param ctx the parse tree
	 */
	void enterWindow_specification(@NotNull PlPgSqlParser.Window_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#window_specification}.
	 * @param ctx the parse tree
	 */
	void exitWindow_specification(@NotNull PlPgSqlParser.Window_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#optTableSpace}.
	 * @param ctx the parse tree
	 */
	void enterOptTableSpace(@NotNull PlPgSqlParser.OptTableSpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#optTableSpace}.
	 * @param ctx the parse tree
	 */
	void exitOptTableSpace(@NotNull PlPgSqlParser.OptTableSpaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_nulls_order}.
	 * @param ctx the parse tree
	 */
	void enterOpt_nulls_order(@NotNull PlPgSqlParser.Opt_nulls_orderContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_nulls_order}.
	 * @param ctx the parse tree
	 */
	void exitOpt_nulls_order(@NotNull PlPgSqlParser.Opt_nulls_orderContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#proc_stmts}.
	 * @param ctx the parse tree
	 */
	void enterProc_stmts(@NotNull PlPgSqlParser.Proc_stmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#proc_stmts}.
	 * @param ctx the parse tree
	 */
	void exitProc_stmts(@NotNull PlPgSqlParser.Proc_stmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#in_expr}.
	 * @param ctx the parse tree
	 */
	void enterIn_expr(@NotNull PlPgSqlParser.In_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#in_expr}.
	 * @param ctx the parse tree
	 */
	void exitIn_expr(@NotNull PlPgSqlParser.In_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void enterHaving_clause(@NotNull PlPgSqlParser.Having_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void exitHaving_clause(@NotNull PlPgSqlParser.Having_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#dropdbStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropdbStmt(@NotNull PlPgSqlParser.DropdbStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#dropdbStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropdbStmt(@NotNull PlPgSqlParser.DropdbStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#characterWithLength}.
	 * @param ctx the parse tree
	 */
	void enterCharacterWithLength(@NotNull PlPgSqlParser.CharacterWithLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#characterWithLength}.
	 * @param ctx the parse tree
	 */
	void exitCharacterWithLength(@NotNull PlPgSqlParser.CharacterWithLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#analyzeStmt}.
	 * @param ctx the parse tree
	 */
	void enterAnalyzeStmt(@NotNull PlPgSqlParser.AnalyzeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#analyzeStmt}.
	 * @param ctx the parse tree
	 */
	void exitAnalyzeStmt(@NotNull PlPgSqlParser.AnalyzeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_distinct}.
	 * @param ctx the parse tree
	 */
	void enterOpt_distinct(@NotNull PlPgSqlParser.Opt_distinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_distinct}.
	 * @param ctx the parse tree
	 */
	void exitOpt_distinct(@NotNull PlPgSqlParser.Opt_distinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alter_using}.
	 * @param ctx the parse tree
	 */
	void enterAlter_using(@NotNull PlPgSqlParser.Alter_usingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alter_using}.
	 * @param ctx the parse tree
	 */
	void exitAlter_using(@NotNull PlPgSqlParser.Alter_usingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#assign_var}.
	 * @param ctx the parse tree
	 */
	void enterAssign_var(@NotNull PlPgSqlParser.Assign_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#assign_var}.
	 * @param ctx the parse tree
	 */
	void exitAssign_var(@NotNull PlPgSqlParser.Assign_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#decl_datatype}.
	 * @param ctx the parse tree
	 */
	void enterDecl_datatype(@NotNull PlPgSqlParser.Decl_datatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#decl_datatype}.
	 * @param ctx the parse tree
	 */
	void exitDecl_datatype(@NotNull PlPgSqlParser.Decl_datatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#proc_exception}.
	 * @param ctx the parse tree
	 */
	void enterProc_exception(@NotNull PlPgSqlParser.Proc_exceptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#proc_exception}.
	 * @param ctx the parse tree
	 */
	void exitProc_exception(@NotNull PlPgSqlParser.Proc_exceptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#getdiag_list_item}.
	 * @param ctx the parse tree
	 */
	void enterGetdiag_list_item(@NotNull PlPgSqlParser.Getdiag_list_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#getdiag_list_item}.
	 * @param ctx the parse tree
	 */
	void exitGetdiag_list_item(@NotNull PlPgSqlParser.Getdiag_list_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#colconstraintElem}.
	 * @param ctx the parse tree
	 */
	void enterColconstraintElem(@NotNull PlPgSqlParser.ColconstraintElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#colconstraintElem}.
	 * @param ctx the parse tree
	 */
	void exitColconstraintElem(@NotNull PlPgSqlParser.ColconstraintElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alter_generic_options}.
	 * @param ctx the parse tree
	 */
	void enterAlter_generic_options(@NotNull PlPgSqlParser.Alter_generic_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alter_generic_options}.
	 * @param ctx the parse tree
	 */
	void exitAlter_generic_options(@NotNull PlPgSqlParser.Alter_generic_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alterEnumStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterEnumStmt(@NotNull PlPgSqlParser.AlterEnumStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alterEnumStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterEnumStmt(@NotNull PlPgSqlParser.AlterEnumStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#decl_stmts}.
	 * @param ctx the parse tree
	 */
	void enterDecl_stmts(@NotNull PlPgSqlParser.Decl_stmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#decl_stmts}.
	 * @param ctx the parse tree
	 */
	void exitDecl_stmts(@NotNull PlPgSqlParser.Decl_stmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_xml_root_standalone}.
	 * @param ctx the parse tree
	 */
	void enterOpt_xml_root_standalone(@NotNull PlPgSqlParser.Opt_xml_root_standaloneContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_xml_root_standalone}.
	 * @param ctx the parse tree
	 */
	void exitOpt_xml_root_standalone(@NotNull PlPgSqlParser.Opt_xml_root_standaloneContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#defACLOptionList}.
	 * @param ctx the parse tree
	 */
	void enterDefACLOptionList(@NotNull PlPgSqlParser.DefACLOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#defACLOptionList}.
	 * @param ctx the parse tree
	 */
	void exitDefACLOptionList(@NotNull PlPgSqlParser.DefACLOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#privilege_target}.
	 * @param ctx the parse tree
	 */
	void enterPrivilege_target(@NotNull PlPgSqlParser.Privilege_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#privilege_target}.
	 * @param ctx the parse tree
	 */
	void exitPrivilege_target(@NotNull PlPgSqlParser.Privilege_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void enterUsing_clause(@NotNull PlPgSqlParser.Using_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void exitUsing_clause(@NotNull PlPgSqlParser.Using_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#deallocateStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeallocateStmt(@NotNull PlPgSqlParser.DeallocateStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#deallocateStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeallocateStmt(@NotNull PlPgSqlParser.DeallocateStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#key_update}.
	 * @param ctx the parse tree
	 */
	void enterKey_update(@NotNull PlPgSqlParser.Key_updateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#key_update}.
	 * @param ctx the parse tree
	 */
	void exitKey_update(@NotNull PlPgSqlParser.Key_updateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#triggerForType}.
	 * @param ctx the parse tree
	 */
	void enterTriggerForType(@NotNull PlPgSqlParser.TriggerForTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#triggerForType}.
	 * @param ctx the parse tree
	 */
	void exitTriggerForType(@NotNull PlPgSqlParser.TriggerForTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_default}.
	 * @param ctx the parse tree
	 */
	void enterOpt_default(@NotNull PlPgSqlParser.Opt_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_default}.
	 * @param ctx the parse tree
	 */
	void exitOpt_default(@NotNull PlPgSqlParser.Opt_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alterRoleStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterRoleStmt(@NotNull PlPgSqlParser.AlterRoleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alterRoleStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterRoleStmt(@NotNull PlPgSqlParser.AlterRoleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#triggerFuncArgs}.
	 * @param ctx the parse tree
	 */
	void enterTriggerFuncArgs(@NotNull PlPgSqlParser.TriggerFuncArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#triggerFuncArgs}.
	 * @param ctx the parse tree
	 */
	void exitTriggerFuncArgs(@NotNull PlPgSqlParser.TriggerFuncArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alterTSDictionaryStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterTSDictionaryStmt(@NotNull PlPgSqlParser.AlterTSDictionaryStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alterTSDictionaryStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterTSDictionaryStmt(@NotNull PlPgSqlParser.AlterTSDictionaryStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_collate}.
	 * @param ctx the parse tree
	 */
	void enterOpt_collate(@NotNull PlPgSqlParser.Opt_collateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_collate}.
	 * @param ctx the parse tree
	 */
	void exitOpt_collate(@NotNull PlPgSqlParser.Opt_collateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alter_extension_opt_list}.
	 * @param ctx the parse tree
	 */
	void enterAlter_extension_opt_list(@NotNull PlPgSqlParser.Alter_extension_opt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alter_extension_opt_list}.
	 * @param ctx the parse tree
	 */
	void exitAlter_extension_opt_list(@NotNull PlPgSqlParser.Alter_extension_opt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#window_definition_list}.
	 * @param ctx the parse tree
	 */
	void enterWindow_definition_list(@NotNull PlPgSqlParser.Window_definition_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#window_definition_list}.
	 * @param ctx the parse tree
	 */
	void exitWindow_definition_list(@NotNull PlPgSqlParser.Window_definition_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#xml_attributes}.
	 * @param ctx the parse tree
	 */
	void enterXml_attributes(@NotNull PlPgSqlParser.Xml_attributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#xml_attributes}.
	 * @param ctx the parse tree
	 */
	void exitXml_attributes(@NotNull PlPgSqlParser.Xml_attributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alter_generic_option_list}.
	 * @param ctx the parse tree
	 */
	void enterAlter_generic_option_list(@NotNull PlPgSqlParser.Alter_generic_option_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alter_generic_option_list}.
	 * @param ctx the parse tree
	 */
	void exitAlter_generic_option_list(@NotNull PlPgSqlParser.Alter_generic_option_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#from_in}.
	 * @param ctx the parse tree
	 */
	void enterFrom_in(@NotNull PlPgSqlParser.From_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#from_in}.
	 * @param ctx the parse tree
	 */
	void exitFrom_in(@NotNull PlPgSqlParser.From_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_concurrently}.
	 * @param ctx the parse tree
	 */
	void enterOpt_concurrently(@NotNull PlPgSqlParser.Opt_concurrentlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_concurrently}.
	 * @param ctx the parse tree
	 */
	void exitOpt_concurrently(@NotNull PlPgSqlParser.Opt_concurrentlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#stmt_close}.
	 * @param ctx the parse tree
	 */
	void enterStmt_close(@NotNull PlPgSqlParser.Stmt_closeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#stmt_close}.
	 * @param ctx the parse tree
	 */
	void exitStmt_close(@NotNull PlPgSqlParser.Stmt_closeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alterDatabaseSetStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterDatabaseSetStmt(@NotNull PlPgSqlParser.AlterDatabaseSetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alterDatabaseSetStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterDatabaseSetStmt(@NotNull PlPgSqlParser.AlterDatabaseSetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#createGroupStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateGroupStmt(@NotNull PlPgSqlParser.CreateGroupStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#createGroupStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateGroupStmt(@NotNull PlPgSqlParser.CreateGroupStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_asymmetric}.
	 * @param ctx the parse tree
	 */
	void enterOpt_asymmetric(@NotNull PlPgSqlParser.Opt_asymmetricContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_asymmetric}.
	 * @param ctx the parse tree
	 */
	void exitOpt_asymmetric(@NotNull PlPgSqlParser.Opt_asymmetricContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#createdb_opt_item}.
	 * @param ctx the parse tree
	 */
	void enterCreatedb_opt_item(@NotNull PlPgSqlParser.Createdb_opt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#createdb_opt_item}.
	 * @param ctx the parse tree
	 */
	void exitCreatedb_opt_item(@NotNull PlPgSqlParser.Createdb_opt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_select_fetch_first_value}.
	 * @param ctx the parse tree
	 */
	void enterOpt_select_fetch_first_value(@NotNull PlPgSqlParser.Opt_select_fetch_first_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_select_fetch_first_value}.
	 * @param ctx the parse tree
	 */
	void exitOpt_select_fetch_first_value(@NotNull PlPgSqlParser.Opt_select_fetch_first_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alterDefaultPrivilegesStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterDefaultPrivilegesStmt(@NotNull PlPgSqlParser.AlterDefaultPrivilegesStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alterDefaultPrivilegesStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterDefaultPrivilegesStmt(@NotNull PlPgSqlParser.AlterDefaultPrivilegesStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#reloption_elem}.
	 * @param ctx the parse tree
	 */
	void enterReloption_elem(@NotNull PlPgSqlParser.Reloption_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#reloption_elem}.
	 * @param ctx the parse tree
	 */
	void exitReloption_elem(@NotNull PlPgSqlParser.Reloption_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alteroptRoleList}.
	 * @param ctx the parse tree
	 */
	void enterAlteroptRoleList(@NotNull PlPgSqlParser.AlteroptRoleListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alteroptRoleList}.
	 * @param ctx the parse tree
	 */
	void exitAlteroptRoleList(@NotNull PlPgSqlParser.AlteroptRoleListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#stmt_execsql}.
	 * @param ctx the parse tree
	 */
	void enterStmt_execsql(@NotNull PlPgSqlParser.Stmt_execsqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#stmt_execsql}.
	 * @param ctx the parse tree
	 */
	void exitStmt_execsql(@NotNull PlPgSqlParser.Stmt_execsqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alter_type_cmds}.
	 * @param ctx the parse tree
	 */
	void enterAlter_type_cmds(@NotNull PlPgSqlParser.Alter_type_cmdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alter_type_cmds}.
	 * @param ctx the parse tree
	 */
	void exitAlter_type_cmds(@NotNull PlPgSqlParser.Alter_type_cmdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#relation_expr}.
	 * @param ctx the parse tree
	 */
	void enterRelation_expr(@NotNull PlPgSqlParser.Relation_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#relation_expr}.
	 * @param ctx the parse tree
	 */
	void exitRelation_expr(@NotNull PlPgSqlParser.Relation_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#func_type}.
	 * @param ctx the parse tree
	 */
	void enterFunc_type(@NotNull PlPgSqlParser.Func_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#func_type}.
	 * @param ctx the parse tree
	 */
	void exitFunc_type(@NotNull PlPgSqlParser.Func_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#cursor_variable}.
	 * @param ctx the parse tree
	 */
	void enterCursor_variable(@NotNull PlPgSqlParser.Cursor_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#cursor_variable}.
	 * @param ctx the parse tree
	 */
	void exitCursor_variable(@NotNull PlPgSqlParser.Cursor_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#comment_type}.
	 * @param ctx the parse tree
	 */
	void enterComment_type(@NotNull PlPgSqlParser.Comment_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#comment_type}.
	 * @param ctx the parse tree
	 */
	void exitComment_type(@NotNull PlPgSqlParser.Comment_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#aexprConst}.
	 * @param ctx the parse tree
	 */
	void enterAexprConst(@NotNull PlPgSqlParser.AexprConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#aexprConst}.
	 * @param ctx the parse tree
	 */
	void exitAexprConst(@NotNull PlPgSqlParser.AexprConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#expr_until_semi}.
	 * @param ctx the parse tree
	 */
	void enterExpr_until_semi(@NotNull PlPgSqlParser.Expr_until_semiContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#expr_until_semi}.
	 * @param ctx the parse tree
	 */
	void exitExpr_until_semi(@NotNull PlPgSqlParser.Expr_until_semiContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#createPLangStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreatePLangStmt(@NotNull PlPgSqlParser.CreatePLangStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#createPLangStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreatePLangStmt(@NotNull PlPgSqlParser.CreatePLangStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#type_function_name}.
	 * @param ctx the parse tree
	 */
	void enterType_function_name(@NotNull PlPgSqlParser.Type_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#type_function_name}.
	 * @param ctx the parse tree
	 */
	void exitType_function_name(@NotNull PlPgSqlParser.Type_function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#defacl_privilege_target}.
	 * @param ctx the parse tree
	 */
	void enterDefacl_privilege_target(@NotNull PlPgSqlParser.Defacl_privilege_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#defacl_privilege_target}.
	 * @param ctx the parse tree
	 */
	void exitDefacl_privilege_target(@NotNull PlPgSqlParser.Defacl_privilege_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#values_clause}.
	 * @param ctx the parse tree
	 */
	void enterValues_clause(@NotNull PlPgSqlParser.Values_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#values_clause}.
	 * @param ctx the parse tree
	 */
	void exitValues_clause(@NotNull PlPgSqlParser.Values_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#comp_option}.
	 * @param ctx the parse tree
	 */
	void enterComp_option(@NotNull PlPgSqlParser.Comp_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#comp_option}.
	 * @param ctx the parse tree
	 */
	void exitComp_option(@NotNull PlPgSqlParser.Comp_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#indirection_el}.
	 * @param ctx the parse tree
	 */
	void enterIndirection_el(@NotNull PlPgSqlParser.Indirection_elContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#indirection_el}.
	 * @param ctx the parse tree
	 */
	void exitIndirection_el(@NotNull PlPgSqlParser.Indirection_elContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#target_el}.
	 * @param ctx the parse tree
	 */
	void enterTarget_el(@NotNull PlPgSqlParser.Target_elContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#target_el}.
	 * @param ctx the parse tree
	 */
	void exitTarget_el(@NotNull PlPgSqlParser.Target_elContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#prepareStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrepareStmt(@NotNull PlPgSqlParser.PrepareStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#prepareStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrepareStmt(@NotNull PlPgSqlParser.PrepareStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#table_func_column}.
	 * @param ctx the parse tree
	 */
	void enterTable_func_column(@NotNull PlPgSqlParser.Table_func_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#table_func_column}.
	 * @param ctx the parse tree
	 */
	void exitTable_func_column(@NotNull PlPgSqlParser.Table_func_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#stmt_for}.
	 * @param ctx the parse tree
	 */
	void enterStmt_for(@NotNull PlPgSqlParser.Stmt_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#stmt_for}.
	 * @param ctx the parse tree
	 */
	void exitStmt_for(@NotNull PlPgSqlParser.Stmt_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#explain_option_name}.
	 * @param ctx the parse tree
	 */
	void enterExplain_option_name(@NotNull PlPgSqlParser.Explain_option_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#explain_option_name}.
	 * @param ctx the parse tree
	 */
	void exitExplain_option_name(@NotNull PlPgSqlParser.Explain_option_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#transaction_mode_list_or_empty}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_mode_list_or_empty(@NotNull PlPgSqlParser.Transaction_mode_list_or_emptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#transaction_mode_list_or_empty}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_mode_list_or_empty(@NotNull PlPgSqlParser.Transaction_mode_list_or_emptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#createdb_opt_list}.
	 * @param ctx the parse tree
	 */
	void enterCreatedb_opt_list(@NotNull PlPgSqlParser.Createdb_opt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#createdb_opt_list}.
	 * @param ctx the parse tree
	 */
	void exitCreatedb_opt_list(@NotNull PlPgSqlParser.Createdb_opt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#func_args_with_defaults_list}.
	 * @param ctx the parse tree
	 */
	void enterFunc_args_with_defaults_list(@NotNull PlPgSqlParser.Func_args_with_defaults_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#func_args_with_defaults_list}.
	 * @param ctx the parse tree
	 */
	void exitFunc_args_with_defaults_list(@NotNull PlPgSqlParser.Func_args_with_defaults_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#transactionStmt}.
	 * @param ctx the parse tree
	 */
	void enterTransactionStmt(@NotNull PlPgSqlParser.TransactionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#transactionStmt}.
	 * @param ctx the parse tree
	 */
	void exitTransactionStmt(@NotNull PlPgSqlParser.TransactionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_granted_by}.
	 * @param ctx the parse tree
	 */
	void enterOpt_granted_by(@NotNull PlPgSqlParser.Opt_granted_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_granted_by}.
	 * @param ctx the parse tree
	 */
	void exitOpt_granted_by(@NotNull PlPgSqlParser.Opt_granted_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#function_with_argtypes_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_with_argtypes_list(@NotNull PlPgSqlParser.Function_with_argtypes_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#function_with_argtypes_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_with_argtypes_list(@NotNull PlPgSqlParser.Function_with_argtypes_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_hold}.
	 * @param ctx the parse tree
	 */
	void enterOpt_hold(@NotNull PlPgSqlParser.Opt_holdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_hold}.
	 * @param ctx the parse tree
	 */
	void exitOpt_hold(@NotNull PlPgSqlParser.Opt_holdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alter_extension_opt_item}.
	 * @param ctx the parse tree
	 */
	void enterAlter_extension_opt_item(@NotNull PlPgSqlParser.Alter_extension_opt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alter_extension_opt_item}.
	 * @param ctx the parse tree
	 */
	void exitAlter_extension_opt_item(@NotNull PlPgSqlParser.Alter_extension_opt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_no_inherit}.
	 * @param ctx the parse tree
	 */
	void enterOpt_no_inherit(@NotNull PlPgSqlParser.Opt_no_inheritContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_no_inherit}.
	 * @param ctx the parse tree
	 */
	void exitOpt_no_inherit(@NotNull PlPgSqlParser.Opt_no_inheritContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#grantee}.
	 * @param ctx the parse tree
	 */
	void enterGrantee(@NotNull PlPgSqlParser.GranteeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#grantee}.
	 * @param ctx the parse tree
	 */
	void exitGrantee(@NotNull PlPgSqlParser.GranteeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#select_with_parens}.
	 * @param ctx the parse tree
	 */
	void enterSelect_with_parens(@NotNull PlPgSqlParser.Select_with_parensContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#select_with_parens}.
	 * @param ctx the parse tree
	 */
	void exitSelect_with_parens(@NotNull PlPgSqlParser.Select_with_parensContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#optInherit}.
	 * @param ctx the parse tree
	 */
	void enterOptInherit(@NotNull PlPgSqlParser.OptInheritContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#optInherit}.
	 * @param ctx the parse tree
	 */
	void exitOptInherit(@NotNull PlPgSqlParser.OptInheritContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#single_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterSingle_set_clause(@NotNull PlPgSqlParser.Single_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#single_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitSingle_set_clause(@NotNull PlPgSqlParser.Single_set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#tableElementList}.
	 * @param ctx the parse tree
	 */
	void enterTableElementList(@NotNull PlPgSqlParser.TableElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#tableElementList}.
	 * @param ctx the parse tree
	 */
	void exitTableElementList(@NotNull PlPgSqlParser.TableElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#create_extension_opt_list}.
	 * @param ctx the parse tree
	 */
	void enterCreate_extension_opt_list(@NotNull PlPgSqlParser.Create_extension_opt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#create_extension_opt_list}.
	 * @param ctx the parse tree
	 */
	void exitCreate_extension_opt_list(@NotNull PlPgSqlParser.Create_extension_opt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#simple_select}.
	 * @param ctx the parse tree
	 */
	void enterSimple_select(@NotNull PlPgSqlParser.Simple_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#simple_select}.
	 * @param ctx the parse tree
	 */
	void exitSimple_select(@NotNull PlPgSqlParser.Simple_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull PlPgSqlParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull PlPgSqlParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#bitWithLength}.
	 * @param ctx the parse tree
	 */
	void enterBitWithLength(@NotNull PlPgSqlParser.BitWithLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#bitWithLength}.
	 * @param ctx the parse tree
	 */
	void exitBitWithLength(@NotNull PlPgSqlParser.BitWithLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#a_expr}.
	 * @param ctx the parse tree
	 */
	void enterA_expr(@NotNull PlPgSqlParser.A_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#a_expr}.
	 * @param ctx the parse tree
	 */
	void exitA_expr(@NotNull PlPgSqlParser.A_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_grant_admin_option}.
	 * @param ctx the parse tree
	 */
	void enterOpt_grant_admin_option(@NotNull PlPgSqlParser.Opt_grant_admin_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_grant_admin_option}.
	 * @param ctx the parse tree
	 */
	void exitOpt_grant_admin_option(@NotNull PlPgSqlParser.Opt_grant_admin_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#table_ref2}.
	 * @param ctx the parse tree
	 */
	void enterTable_ref2(@NotNull PlPgSqlParser.Table_ref2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#table_ref2}.
	 * @param ctx the parse tree
	 */
	void exitTable_ref2(@NotNull PlPgSqlParser.Table_ref2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#mathOp}.
	 * @param ctx the parse tree
	 */
	void enterMathOp(@NotNull PlPgSqlParser.MathOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#mathOp}.
	 * @param ctx the parse tree
	 */
	void exitMathOp(@NotNull PlPgSqlParser.MathOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#foreign_server_version}.
	 * @param ctx the parse tree
	 */
	void enterForeign_server_version(@NotNull PlPgSqlParser.Foreign_server_versionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#foreign_server_version}.
	 * @param ctx the parse tree
	 */
	void exitForeign_server_version(@NotNull PlPgSqlParser.Foreign_server_versionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#auth_ident}.
	 * @param ctx the parse tree
	 */
	void enterAuth_ident(@NotNull PlPgSqlParser.Auth_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#auth_ident}.
	 * @param ctx the parse tree
	 */
	void exitAuth_ident(@NotNull PlPgSqlParser.Auth_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_validator}.
	 * @param ctx the parse tree
	 */
	void enterOpt_validator(@NotNull PlPgSqlParser.Opt_validatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_validator}.
	 * @param ctx the parse tree
	 */
	void exitOpt_validator(@NotNull PlPgSqlParser.Opt_validatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#security_label_type}.
	 * @param ctx the parse tree
	 */
	void enterSecurity_label_type(@NotNull PlPgSqlParser.Security_label_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#security_label_type}.
	 * @param ctx the parse tree
	 */
	void exitSecurity_label_type(@NotNull PlPgSqlParser.Security_label_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(@NotNull PlPgSqlParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(@NotNull PlPgSqlParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#numericOnly_list}.
	 * @param ctx the parse tree
	 */
	void enterNumericOnly_list(@NotNull PlPgSqlParser.NumericOnly_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#numericOnly_list}.
	 * @param ctx the parse tree
	 */
	void exitNumericOnly_list(@NotNull PlPgSqlParser.NumericOnly_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(@NotNull PlPgSqlParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(@NotNull PlPgSqlParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#arg_class}.
	 * @param ctx the parse tree
	 */
	void enterArg_class(@NotNull PlPgSqlParser.Arg_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#arg_class}.
	 * @param ctx the parse tree
	 */
	void exitArg_class(@NotNull PlPgSqlParser.Arg_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_restart_seqs}.
	 * @param ctx the parse tree
	 */
	void enterOpt_restart_seqs(@NotNull PlPgSqlParser.Opt_restart_seqsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_restart_seqs}.
	 * @param ctx the parse tree
	 */
	void exitOpt_restart_seqs(@NotNull PlPgSqlParser.Opt_restart_seqsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#subquery_Op}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_Op(@NotNull PlPgSqlParser.Subquery_OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#subquery_Op}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_Op(@NotNull PlPgSqlParser.Subquery_OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alterdb_opt_list}.
	 * @param ctx the parse tree
	 */
	void enterAlterdb_opt_list(@NotNull PlPgSqlParser.Alterdb_opt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alterdb_opt_list}.
	 * @param ctx the parse tree
	 */
	void exitAlterdb_opt_list(@NotNull PlPgSqlParser.Alterdb_opt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_definition}.
	 * @param ctx the parse tree
	 */
	void enterOpt_definition(@NotNull PlPgSqlParser.Opt_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_definition}.
	 * @param ctx the parse tree
	 */
	void exitOpt_definition(@NotNull PlPgSqlParser.Opt_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#character_def}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_def(@NotNull PlPgSqlParser.Character_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#character_def}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_def(@NotNull PlPgSqlParser.Character_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#genericType}.
	 * @param ctx the parse tree
	 */
	void enterGenericType(@NotNull PlPgSqlParser.GenericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#genericType}.
	 * @param ctx the parse tree
	 */
	void exitGenericType(@NotNull PlPgSqlParser.GenericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#privilege}.
	 * @param ctx the parse tree
	 */
	void enterPrivilege(@NotNull PlPgSqlParser.PrivilegeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#privilege}.
	 * @param ctx the parse tree
	 */
	void exitPrivilege(@NotNull PlPgSqlParser.PrivilegeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#declareCursorStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclareCursorStmt(@NotNull PlPgSqlParser.DeclareCursorStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#declareCursorStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclareCursorStmt(@NotNull PlPgSqlParser.DeclareCursorStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#oper_argtypes}.
	 * @param ctx the parse tree
	 */
	void enterOper_argtypes(@NotNull PlPgSqlParser.Oper_argtypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#oper_argtypes}.
	 * @param ctx the parse tree
	 */
	void exitOper_argtypes(@NotNull PlPgSqlParser.Oper_argtypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#row_or_rows}.
	 * @param ctx the parse tree
	 */
	void enterRow_or_rows(@NotNull PlPgSqlParser.Row_or_rowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#row_or_rows}.
	 * @param ctx the parse tree
	 */
	void exitRow_or_rows(@NotNull PlPgSqlParser.Row_or_rowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#dropGroupStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropGroupStmt(@NotNull PlPgSqlParser.DropGroupStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#dropGroupStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropGroupStmt(@NotNull PlPgSqlParser.DropGroupStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#substr_for}.
	 * @param ctx the parse tree
	 */
	void enterSubstr_for(@NotNull PlPgSqlParser.Substr_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#substr_for}.
	 * @param ctx the parse tree
	 */
	void exitSubstr_for(@NotNull PlPgSqlParser.Substr_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#insert_column_item}.
	 * @param ctx the parse tree
	 */
	void enterInsert_column_item(@NotNull PlPgSqlParser.Insert_column_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#insert_column_item}.
	 * @param ctx the parse tree
	 */
	void exitInsert_column_item(@NotNull PlPgSqlParser.Insert_column_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#pl_block}.
	 * @param ctx the parse tree
	 */
	void enterPl_block(@NotNull PlPgSqlParser.Pl_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#pl_block}.
	 * @param ctx the parse tree
	 */
	void exitPl_block(@NotNull PlPgSqlParser.Pl_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#tableLikeOption}.
	 * @param ctx the parse tree
	 */
	void enterTableLikeOption(@NotNull PlPgSqlParser.TableLikeOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#tableLikeOption}.
	 * @param ctx the parse tree
	 */
	void exitTableLikeOption(@NotNull PlPgSqlParser.TableLikeOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#fetchStmt}.
	 * @param ctx the parse tree
	 */
	void enterFetchStmt(@NotNull PlPgSqlParser.FetchStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#fetchStmt}.
	 * @param ctx the parse tree
	 */
	void exitFetchStmt(@NotNull PlPgSqlParser.FetchStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#func_as}.
	 * @param ctx the parse tree
	 */
	void enterFunc_as(@NotNull PlPgSqlParser.Func_asContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#func_as}.
	 * @param ctx the parse tree
	 */
	void exitFunc_as(@NotNull PlPgSqlParser.Func_asContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#any_identifier}.
	 * @param ctx the parse tree
	 */
	void enterAny_identifier(@NotNull PlPgSqlParser.Any_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#any_identifier}.
	 * @param ctx the parse tree
	 */
	void exitAny_identifier(@NotNull PlPgSqlParser.Any_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#xml_attribute_el}.
	 * @param ctx the parse tree
	 */
	void enterXml_attribute_el(@NotNull PlPgSqlParser.Xml_attribute_elContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#xml_attribute_el}.
	 * @param ctx the parse tree
	 */
	void exitXml_attribute_el(@NotNull PlPgSqlParser.Xml_attribute_elContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#indexStmt}.
	 * @param ctx the parse tree
	 */
	void enterIndexStmt(@NotNull PlPgSqlParser.IndexStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#indexStmt}.
	 * @param ctx the parse tree
	 */
	void exitIndexStmt(@NotNull PlPgSqlParser.IndexStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#stmtblock}.
	 * @param ctx the parse tree
	 */
	void enterStmtblock(@NotNull PlPgSqlParser.StmtblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#stmtblock}.
	 * @param ctx the parse tree
	 */
	void exitStmtblock(@NotNull PlPgSqlParser.StmtblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#decl_defkey}.
	 * @param ctx the parse tree
	 */
	void enterDecl_defkey(@NotNull PlPgSqlParser.Decl_defkeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#decl_defkey}.
	 * @param ctx the parse tree
	 */
	void exitDecl_defkey(@NotNull PlPgSqlParser.Decl_defkeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_fetch_direction}.
	 * @param ctx the parse tree
	 */
	void enterOpt_fetch_direction(@NotNull PlPgSqlParser.Opt_fetch_directionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_fetch_direction}.
	 * @param ctx the parse tree
	 */
	void exitOpt_fetch_direction(@NotNull PlPgSqlParser.Opt_fetch_directionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#when_clause_list}.
	 * @param ctx the parse tree
	 */
	void enterWhen_clause_list(@NotNull PlPgSqlParser.When_clause_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#when_clause_list}.
	 * @param ctx the parse tree
	 */
	void exitWhen_clause_list(@NotNull PlPgSqlParser.When_clause_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#offset_clause}.
	 * @param ctx the parse tree
	 */
	void enterOffset_clause(@NotNull PlPgSqlParser.Offset_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#offset_clause}.
	 * @param ctx the parse tree
	 */
	void exitOffset_clause(@NotNull PlPgSqlParser.Offset_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#getdiag_item}.
	 * @param ctx the parse tree
	 */
	void enterGetdiag_item(@NotNull PlPgSqlParser.Getdiag_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#getdiag_item}.
	 * @param ctx the parse tree
	 */
	void exitGetdiag_item(@NotNull PlPgSqlParser.Getdiag_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_existing_window_name}.
	 * @param ctx the parse tree
	 */
	void enterOpt_existing_window_name(@NotNull PlPgSqlParser.Opt_existing_window_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_existing_window_name}.
	 * @param ctx the parse tree
	 */
	void exitOpt_existing_window_name(@NotNull PlPgSqlParser.Opt_existing_window_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_float}.
	 * @param ctx the parse tree
	 */
	void enterOpt_float(@NotNull PlPgSqlParser.Opt_floatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_float}.
	 * @param ctx the parse tree
	 */
	void exitOpt_float(@NotNull PlPgSqlParser.Opt_floatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#doStmt}.
	 * @param ctx the parse tree
	 */
	void enterDoStmt(@NotNull PlPgSqlParser.DoStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#doStmt}.
	 * @param ctx the parse tree
	 */
	void exitDoStmt(@NotNull PlPgSqlParser.DoStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#createfunc_opt_list}.
	 * @param ctx the parse tree
	 */
	void enterCreatefunc_opt_list(@NotNull PlPgSqlParser.Createfunc_opt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#createfunc_opt_list}.
	 * @param ctx the parse tree
	 */
	void exitCreatefunc_opt_list(@NotNull PlPgSqlParser.Createfunc_opt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#renameStmt}.
	 * @param ctx the parse tree
	 */
	void enterRenameStmt(@NotNull PlPgSqlParser.RenameStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#renameStmt}.
	 * @param ctx the parse tree
	 */
	void exitRenameStmt(@NotNull PlPgSqlParser.RenameStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#stmt_getdiag}.
	 * @param ctx the parse tree
	 */
	void enterStmt_getdiag(@NotNull PlPgSqlParser.Stmt_getdiagContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#stmt_getdiag}.
	 * @param ctx the parse tree
	 */
	void exitStmt_getdiag(@NotNull PlPgSqlParser.Stmt_getdiagContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#deleteStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStmt(@NotNull PlPgSqlParser.DeleteStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#deleteStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStmt(@NotNull PlPgSqlParser.DeleteStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#for_locking_clause}.
	 * @param ctx the parse tree
	 */
	void enterFor_locking_clause(@NotNull PlPgSqlParser.For_locking_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#for_locking_clause}.
	 * @param ctx the parse tree
	 */
	void exitFor_locking_clause(@NotNull PlPgSqlParser.For_locking_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#interval_second}.
	 * @param ctx the parse tree
	 */
	void enterInterval_second(@NotNull PlPgSqlParser.Interval_secondContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#interval_second}.
	 * @param ctx the parse tree
	 */
	void exitInterval_second(@NotNull PlPgSqlParser.Interval_secondContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#stmt_if}.
	 * @param ctx the parse tree
	 */
	void enterStmt_if(@NotNull PlPgSqlParser.Stmt_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#stmt_if}.
	 * @param ctx the parse tree
	 */
	void exitStmt_if(@NotNull PlPgSqlParser.Stmt_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#func_return}.
	 * @param ctx the parse tree
	 */
	void enterFunc_return(@NotNull PlPgSqlParser.Func_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#func_return}.
	 * @param ctx the parse tree
	 */
	void exitFunc_return(@NotNull PlPgSqlParser.Func_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#decl_defval}.
	 * @param ctx the parse tree
	 */
	void enterDecl_defval(@NotNull PlPgSqlParser.Decl_defvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#decl_defval}.
	 * @param ctx the parse tree
	 */
	void exitDecl_defval(@NotNull PlPgSqlParser.Decl_defvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#old_aggr_elem}.
	 * @param ctx the parse tree
	 */
	void enterOld_aggr_elem(@NotNull PlPgSqlParser.Old_aggr_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#old_aggr_elem}.
	 * @param ctx the parse tree
	 */
	void exitOld_aggr_elem(@NotNull PlPgSqlParser.Old_aggr_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_encoding}.
	 * @param ctx the parse tree
	 */
	void enterOpt_encoding(@NotNull PlPgSqlParser.Opt_encodingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_encoding}.
	 * @param ctx the parse tree
	 */
	void exitOpt_encoding(@NotNull PlPgSqlParser.Opt_encodingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#createForeignTableStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateForeignTableStmt(@NotNull PlPgSqlParser.CreateForeignTableStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#createForeignTableStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateForeignTableStmt(@NotNull PlPgSqlParser.CreateForeignTableStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#stmt_else}.
	 * @param ctx the parse tree
	 */
	void enterStmt_else(@NotNull PlPgSqlParser.Stmt_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#stmt_else}.
	 * @param ctx the parse tree
	 */
	void exitStmt_else(@NotNull PlPgSqlParser.Stmt_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#dropPLangStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropPLangStmt(@NotNull PlPgSqlParser.DropPLangStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#dropPLangStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropPLangStmt(@NotNull PlPgSqlParser.DropPLangStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_column}.
	 * @param ctx the parse tree
	 */
	void enterOpt_column(@NotNull PlPgSqlParser.Opt_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_column}.
	 * @param ctx the parse tree
	 */
	void exitOpt_column(@NotNull PlPgSqlParser.Opt_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#onCommitOption}.
	 * @param ctx the parse tree
	 */
	void enterOnCommitOption(@NotNull PlPgSqlParser.OnCommitOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#onCommitOption}.
	 * @param ctx the parse tree
	 */
	void exitOnCommitOption(@NotNull PlPgSqlParser.OnCommitOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_class}.
	 * @param ctx the parse tree
	 */
	void enterOpt_class(@NotNull PlPgSqlParser.Opt_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_class}.
	 * @param ctx the parse tree
	 */
	void exitOpt_class(@NotNull PlPgSqlParser.Opt_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#dropRoleStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropRoleStmt(@NotNull PlPgSqlParser.DropRoleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#dropRoleStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropRoleStmt(@NotNull PlPgSqlParser.DropRoleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#checkPointStmt}.
	 * @param ctx the parse tree
	 */
	void enterCheckPointStmt(@NotNull PlPgSqlParser.CheckPointStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#checkPointStmt}.
	 * @param ctx the parse tree
	 */
	void exitCheckPointStmt(@NotNull PlPgSqlParser.CheckPointStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#copy_delimiter}.
	 * @param ctx the parse tree
	 */
	void enterCopy_delimiter(@NotNull PlPgSqlParser.Copy_delimiterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#copy_delimiter}.
	 * @param ctx the parse tree
	 */
	void exitCopy_delimiter(@NotNull PlPgSqlParser.Copy_delimiterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_full}.
	 * @param ctx the parse tree
	 */
	void enterOpt_full(@NotNull PlPgSqlParser.Opt_fullContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_full}.
	 * @param ctx the parse tree
	 */
	void exitOpt_full(@NotNull PlPgSqlParser.Opt_fullContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(@NotNull PlPgSqlParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(@NotNull PlPgSqlParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_all}.
	 * @param ctx the parse tree
	 */
	void enterOpt_all(@NotNull PlPgSqlParser.Opt_allContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_all}.
	 * @param ctx the parse tree
	 */
	void exitOpt_all(@NotNull PlPgSqlParser.Opt_allContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#removeAggrStmt}.
	 * @param ctx the parse tree
	 */
	void enterRemoveAggrStmt(@NotNull PlPgSqlParser.RemoveAggrStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#removeAggrStmt}.
	 * @param ctx the parse tree
	 */
	void exitRemoveAggrStmt(@NotNull PlPgSqlParser.RemoveAggrStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_scrollable}.
	 * @param ctx the parse tree
	 */
	void enterOpt_scrollable(@NotNull PlPgSqlParser.Opt_scrollableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_scrollable}.
	 * @param ctx the parse tree
	 */
	void exitOpt_scrollable(@NotNull PlPgSqlParser.Opt_scrollableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#cast_context}.
	 * @param ctx the parse tree
	 */
	void enterCast_context(@NotNull PlPgSqlParser.Cast_contextContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#cast_context}.
	 * @param ctx the parse tree
	 */
	void exitCast_context(@NotNull PlPgSqlParser.Cast_contextContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#constraintAttributeSpec}.
	 * @param ctx the parse tree
	 */
	void enterConstraintAttributeSpec(@NotNull PlPgSqlParser.ConstraintAttributeSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#constraintAttributeSpec}.
	 * @param ctx the parse tree
	 */
	void exitConstraintAttributeSpec(@NotNull PlPgSqlParser.ConstraintAttributeSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#xml_attribute_list}.
	 * @param ctx the parse tree
	 */
	void enterXml_attribute_list(@NotNull PlPgSqlParser.Xml_attribute_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#xml_attribute_list}.
	 * @param ctx the parse tree
	 */
	void exitXml_attribute_list(@NotNull PlPgSqlParser.Xml_attribute_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#defACLAction}.
	 * @param ctx the parse tree
	 */
	void enterDefACLAction(@NotNull PlPgSqlParser.DefACLActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#defACLAction}.
	 * @param ctx the parse tree
	 */
	void exitDefACLAction(@NotNull PlPgSqlParser.DefACLActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alterExtensionStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterExtensionStmt(@NotNull PlPgSqlParser.AlterExtensionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alterExtensionStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterExtensionStmt(@NotNull PlPgSqlParser.AlterExtensionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#copy_generic_opt_arg_list_item}.
	 * @param ctx the parse tree
	 */
	void enterCopy_generic_opt_arg_list_item(@NotNull PlPgSqlParser.Copy_generic_opt_arg_list_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#copy_generic_opt_arg_list_item}.
	 * @param ctx the parse tree
	 */
	void exitCopy_generic_opt_arg_list_item(@NotNull PlPgSqlParser.Copy_generic_opt_arg_list_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#seqOptList}.
	 * @param ctx the parse tree
	 */
	void enterSeqOptList(@NotNull PlPgSqlParser.SeqOptListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#seqOptList}.
	 * @param ctx the parse tree
	 */
	void exitSeqOptList(@NotNull PlPgSqlParser.SeqOptListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#func_table}.
	 * @param ctx the parse tree
	 */
	void enterFunc_table(@NotNull PlPgSqlParser.Func_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#func_table}.
	 * @param ctx the parse tree
	 */
	void exitFunc_table(@NotNull PlPgSqlParser.Func_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#common_func_opt_item}.
	 * @param ctx the parse tree
	 */
	void enterCommon_func_opt_item(@NotNull PlPgSqlParser.Common_func_opt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#common_func_opt_item}.
	 * @param ctx the parse tree
	 */
	void exitCommon_func_opt_item(@NotNull PlPgSqlParser.Common_func_opt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#stmtmulti}.
	 * @param ctx the parse tree
	 */
	void enterStmtmulti(@NotNull PlPgSqlParser.StmtmultiContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#stmtmulti}.
	 * @param ctx the parse tree
	 */
	void exitStmtmulti(@NotNull PlPgSqlParser.StmtmultiContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alterOwnerStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterOwnerStmt(@NotNull PlPgSqlParser.AlterOwnerStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alterOwnerStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterOwnerStmt(@NotNull PlPgSqlParser.AlterOwnerStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_block_label}.
	 * @param ctx the parse tree
	 */
	void enterOpt_block_label(@NotNull PlPgSqlParser.Opt_block_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_block_label}.
	 * @param ctx the parse tree
	 */
	void exitOpt_block_label(@NotNull PlPgSqlParser.Opt_block_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#param_name}.
	 * @param ctx the parse tree
	 */
	void enterParam_name(@NotNull PlPgSqlParser.Param_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#param_name}.
	 * @param ctx the parse tree
	 */
	void exitParam_name(@NotNull PlPgSqlParser.Param_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#reloptions}.
	 * @param ctx the parse tree
	 */
	void enterReloptions(@NotNull PlPgSqlParser.ReloptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#reloptions}.
	 * @param ctx the parse tree
	 */
	void exitReloptions(@NotNull PlPgSqlParser.ReloptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#createSchemaStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateSchemaStmt(@NotNull PlPgSqlParser.CreateSchemaStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#createSchemaStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateSchemaStmt(@NotNull PlPgSqlParser.CreateSchemaStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#create_as_target}.
	 * @param ctx the parse tree
	 */
	void enterCreate_as_target(@NotNull PlPgSqlParser.Create_as_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#create_as_target}.
	 * @param ctx the parse tree
	 */
	void exitCreate_as_target(@NotNull PlPgSqlParser.Create_as_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alterObjectSchemaStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterObjectSchemaStmt(@NotNull PlPgSqlParser.AlterObjectSchemaStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alterObjectSchemaStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterObjectSchemaStmt(@NotNull PlPgSqlParser.AlterObjectSchemaStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#comp_options}.
	 * @param ctx the parse tree
	 */
	void enterComp_options(@NotNull PlPgSqlParser.Comp_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#comp_options}.
	 * @param ctx the parse tree
	 */
	void exitComp_options(@NotNull PlPgSqlParser.Comp_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#cte_list}.
	 * @param ctx the parse tree
	 */
	void enterCte_list(@NotNull PlPgSqlParser.Cte_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#cte_list}.
	 * @param ctx the parse tree
	 */
	void exitCte_list(@NotNull PlPgSqlParser.Cte_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#multiple_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_set_clause(@NotNull PlPgSqlParser.Multiple_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#multiple_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_set_clause(@NotNull PlPgSqlParser.Multiple_set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#createConversionStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateConversionStmt(@NotNull PlPgSqlParser.CreateConversionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#createConversionStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateConversionStmt(@NotNull PlPgSqlParser.CreateConversionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#createFdwStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateFdwStmt(@NotNull PlPgSqlParser.CreateFdwStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#createFdwStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateFdwStmt(@NotNull PlPgSqlParser.CreateFdwStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_name_list}.
	 * @param ctx the parse tree
	 */
	void enterOpt_name_list(@NotNull PlPgSqlParser.Opt_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_name_list}.
	 * @param ctx the parse tree
	 */
	void exitOpt_name_list(@NotNull PlPgSqlParser.Opt_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#optRoleList}.
	 * @param ctx the parse tree
	 */
	void enterOptRoleList(@NotNull PlPgSqlParser.OptRoleListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#optRoleList}.
	 * @param ctx the parse tree
	 */
	void exitOptRoleList(@NotNull PlPgSqlParser.OptRoleListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#lock_type}.
	 * @param ctx the parse tree
	 */
	void enterLock_type(@NotNull PlPgSqlParser.Lock_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#lock_type}.
	 * @param ctx the parse tree
	 */
	void exitLock_type(@NotNull PlPgSqlParser.Lock_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#grantRoleStmt}.
	 * @param ctx the parse tree
	 */
	void enterGrantRoleStmt(@NotNull PlPgSqlParser.GrantRoleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#grantRoleStmt}.
	 * @param ctx the parse tree
	 */
	void exitGrantRoleStmt(@NotNull PlPgSqlParser.GrantRoleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#ctext_expr_list}.
	 * @param ctx the parse tree
	 */
	void enterCtext_expr_list(@NotNull PlPgSqlParser.Ctext_expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#ctext_expr_list}.
	 * @param ctx the parse tree
	 */
	void exitCtext_expr_list(@NotNull PlPgSqlParser.Ctext_expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#transaction_mode_list}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_mode_list(@NotNull PlPgSqlParser.Transaction_mode_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#transaction_mode_list}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_mode_list(@NotNull PlPgSqlParser.Transaction_mode_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#xml_whitespace_option}.
	 * @param ctx the parse tree
	 */
	void enterXml_whitespace_option(@NotNull PlPgSqlParser.Xml_whitespace_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#xml_whitespace_option}.
	 * @param ctx the parse tree
	 */
	void exitXml_whitespace_option(@NotNull PlPgSqlParser.Xml_whitespace_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#secLabelStmt}.
	 * @param ctx the parse tree
	 */
	void enterSecLabelStmt(@NotNull PlPgSqlParser.SecLabelStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#secLabelStmt}.
	 * @param ctx the parse tree
	 */
	void exitSecLabelStmt(@NotNull PlPgSqlParser.SecLabelStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#overlay_placing}.
	 * @param ctx the parse tree
	 */
	void enterOverlay_placing(@NotNull PlPgSqlParser.Overlay_placingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#overlay_placing}.
	 * @param ctx the parse tree
	 */
	void exitOverlay_placing(@NotNull PlPgSqlParser.Overlay_placingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#type_func_name_keyword}.
	 * @param ctx the parse tree
	 */
	void enterType_func_name_keyword(@NotNull PlPgSqlParser.Type_func_name_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#type_func_name_keyword}.
	 * @param ctx the parse tree
	 */
	void exitType_func_name_keyword(@NotNull PlPgSqlParser.Type_func_name_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_procedural}.
	 * @param ctx the parse tree
	 */
	void enterOpt_procedural(@NotNull PlPgSqlParser.Opt_proceduralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_procedural}.
	 * @param ctx the parse tree
	 */
	void exitOpt_procedural(@NotNull PlPgSqlParser.Opt_proceduralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#case_default}.
	 * @param ctx the parse tree
	 */
	void enterCase_default(@NotNull PlPgSqlParser.Case_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#case_default}.
	 * @param ctx the parse tree
	 */
	void exitCase_default(@NotNull PlPgSqlParser.Case_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#signedIconst}.
	 * @param ctx the parse tree
	 */
	void enterSignedIconst(@NotNull PlPgSqlParser.SignedIconstContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#signedIconst}.
	 * @param ctx the parse tree
	 */
	void exitSignedIconst(@NotNull PlPgSqlParser.SignedIconstContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#cursor_options}.
	 * @param ctx the parse tree
	 */
	void enterCursor_options(@NotNull PlPgSqlParser.Cursor_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#cursor_options}.
	 * @param ctx the parse tree
	 */
	void exitCursor_options(@NotNull PlPgSqlParser.Cursor_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#locked_rels_list}.
	 * @param ctx the parse tree
	 */
	void enterLocked_rels_list(@NotNull PlPgSqlParser.Locked_rels_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#locked_rels_list}.
	 * @param ctx the parse tree
	 */
	void exitLocked_rels_list(@NotNull PlPgSqlParser.Locked_rels_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alter_table_cmds}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_cmds(@NotNull PlPgSqlParser.Alter_table_cmdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alter_table_cmds}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_cmds(@NotNull PlPgSqlParser.Alter_table_cmdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#stmt_perform}.
	 * @param ctx the parse tree
	 */
	void enterStmt_perform(@NotNull PlPgSqlParser.Stmt_performContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#stmt_perform}.
	 * @param ctx the parse tree
	 */
	void exitStmt_perform(@NotNull PlPgSqlParser.Stmt_performContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#decl_is_for}.
	 * @param ctx the parse tree
	 */
	void enterDecl_is_for(@NotNull PlPgSqlParser.Decl_is_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#decl_is_for}.
	 * @param ctx the parse tree
	 */
	void exitDecl_is_for(@NotNull PlPgSqlParser.Decl_is_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#dostmt_opt_list}.
	 * @param ctx the parse tree
	 */
	void enterDostmt_opt_list(@NotNull PlPgSqlParser.Dostmt_opt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#dostmt_opt_list}.
	 * @param ctx the parse tree
	 */
	void exitDostmt_opt_list(@NotNull PlPgSqlParser.Dostmt_opt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#sort_clause}.
	 * @param ctx the parse tree
	 */
	void enterSort_clause(@NotNull PlPgSqlParser.Sort_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#sort_clause}.
	 * @param ctx the parse tree
	 */
	void exitSort_clause(@NotNull PlPgSqlParser.Sort_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#colId}.
	 * @param ctx the parse tree
	 */
	void enterColId(@NotNull PlPgSqlParser.ColIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#colId}.
	 * @param ctx the parse tree
	 */
	void exitColId(@NotNull PlPgSqlParser.ColIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#group_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroup_clause(@NotNull PlPgSqlParser.Group_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#group_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroup_clause(@NotNull PlPgSqlParser.Group_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_type_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterOpt_type_modifiers(@NotNull PlPgSqlParser.Opt_type_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_type_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitOpt_type_modifiers(@NotNull PlPgSqlParser.Opt_type_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#optWith}.
	 * @param ctx the parse tree
	 */
	void enterOptWith(@NotNull PlPgSqlParser.OptWithContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#optWith}.
	 * @param ctx the parse tree
	 */
	void exitOptWith(@NotNull PlPgSqlParser.OptWithContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#seqOptElem}.
	 * @param ctx the parse tree
	 */
	void enterSeqOptElem(@NotNull PlPgSqlParser.SeqOptElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#seqOptElem}.
	 * @param ctx the parse tree
	 */
	void exitSeqOptElem(@NotNull PlPgSqlParser.SeqOptElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#sortby_list}.
	 * @param ctx the parse tree
	 */
	void enterSortby_list(@NotNull PlPgSqlParser.Sortby_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#sortby_list}.
	 * @param ctx the parse tree
	 */
	void exitSortby_list(@NotNull PlPgSqlParser.Sortby_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#decl_const}.
	 * @param ctx the parse tree
	 */
	void enterDecl_const(@NotNull PlPgSqlParser.Decl_constContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#decl_const}.
	 * @param ctx the parse tree
	 */
	void exitDecl_const(@NotNull PlPgSqlParser.Decl_constContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#prep_type_clause}.
	 * @param ctx the parse tree
	 */
	void enterPrep_type_clause(@NotNull PlPgSqlParser.Prep_type_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#prep_type_clause}.
	 * @param ctx the parse tree
	 */
	void exitPrep_type_clause(@NotNull PlPgSqlParser.Prep_type_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#when_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhen_clause(@NotNull PlPgSqlParser.When_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#when_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhen_clause(@NotNull PlPgSqlParser.When_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_recheck}.
	 * @param ctx the parse tree
	 */
	void enterOpt_recheck(@NotNull PlPgSqlParser.Opt_recheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_recheck}.
	 * @param ctx the parse tree
	 */
	void exitOpt_recheck(@NotNull PlPgSqlParser.Opt_recheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#frame_bound}.
	 * @param ctx the parse tree
	 */
	void enterFrame_bound(@NotNull PlPgSqlParser.Frame_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#frame_bound}.
	 * @param ctx the parse tree
	 */
	void exitFrame_bound(@NotNull PlPgSqlParser.Frame_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#removeFuncStmt}.
	 * @param ctx the parse tree
	 */
	void enterRemoveFuncStmt(@NotNull PlPgSqlParser.RemoveFuncStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#removeFuncStmt}.
	 * @param ctx the parse tree
	 */
	void exitRemoveFuncStmt(@NotNull PlPgSqlParser.RemoveFuncStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#substr_from}.
	 * @param ctx the parse tree
	 */
	void enterSubstr_from(@NotNull PlPgSqlParser.Substr_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#substr_from}.
	 * @param ctx the parse tree
	 */
	void exitSubstr_from(@NotNull PlPgSqlParser.Substr_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#notifyStmt}.
	 * @param ctx the parse tree
	 */
	void enterNotifyStmt(@NotNull PlPgSqlParser.NotifyStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#notifyStmt}.
	 * @param ctx the parse tree
	 */
	void exitNotifyStmt(@NotNull PlPgSqlParser.NotifyStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#attrs}.
	 * @param ctx the parse tree
	 */
	void enterAttrs(@NotNull PlPgSqlParser.AttrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#attrs}.
	 * @param ctx the parse tree
	 */
	void exitAttrs(@NotNull PlPgSqlParser.AttrsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#insertStmt}.
	 * @param ctx the parse tree
	 */
	void enterInsertStmt(@NotNull PlPgSqlParser.InsertStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#insertStmt}.
	 * @param ctx the parse tree
	 */
	void exitInsertStmt(@NotNull PlPgSqlParser.InsertStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alter_type_cmd}.
	 * @param ctx the parse tree
	 */
	void enterAlter_type_cmd(@NotNull PlPgSqlParser.Alter_type_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alter_type_cmd}.
	 * @param ctx the parse tree
	 */
	void exitAlter_type_cmd(@NotNull PlPgSqlParser.Alter_type_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#first_or_next}.
	 * @param ctx the parse tree
	 */
	void enterFirst_or_next(@NotNull PlPgSqlParser.First_or_nextContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#first_or_next}.
	 * @param ctx the parse tree
	 */
	void exitFirst_or_next(@NotNull PlPgSqlParser.First_or_nextContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#decl_cursor_arg}.
	 * @param ctx the parse tree
	 */
	void enterDecl_cursor_arg(@NotNull PlPgSqlParser.Decl_cursor_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#decl_cursor_arg}.
	 * @param ctx the parse tree
	 */
	void exitDecl_cursor_arg(@NotNull PlPgSqlParser.Decl_cursor_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#copy_opt_item}.
	 * @param ctx the parse tree
	 */
	void enterCopy_opt_item(@NotNull PlPgSqlParser.Copy_opt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#copy_opt_item}.
	 * @param ctx the parse tree
	 */
	void exitCopy_opt_item(@NotNull PlPgSqlParser.Copy_opt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#add_drop}.
	 * @param ctx the parse tree
	 */
	void enterAdd_drop(@NotNull PlPgSqlParser.Add_dropContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#add_drop}.
	 * @param ctx the parse tree
	 */
	void exitAdd_drop(@NotNull PlPgSqlParser.Add_dropContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#exit_type}.
	 * @param ctx the parse tree
	 */
	void enterExit_type(@NotNull PlPgSqlParser.Exit_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#exit_type}.
	 * @param ctx the parse tree
	 */
	void exitExit_type(@NotNull PlPgSqlParser.Exit_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#func_args_with_defaults}.
	 * @param ctx the parse tree
	 */
	void enterFunc_args_with_defaults(@NotNull PlPgSqlParser.Func_args_with_defaultsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#func_args_with_defaults}.
	 * @param ctx the parse tree
	 */
	void exitFunc_args_with_defaults(@NotNull PlPgSqlParser.Func_args_with_defaultsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#func_arg_expr}.
	 * @param ctx the parse tree
	 */
	void enterFunc_arg_expr(@NotNull PlPgSqlParser.Func_arg_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#func_arg_expr}.
	 * @param ctx the parse tree
	 */
	void exitFunc_arg_expr(@NotNull PlPgSqlParser.Func_arg_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#var_name}.
	 * @param ctx the parse tree
	 */
	void enterVar_name(@NotNull PlPgSqlParser.Var_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#var_name}.
	 * @param ctx the parse tree
	 */
	void exitVar_name(@NotNull PlPgSqlParser.Var_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#explain_option_list}.
	 * @param ctx the parse tree
	 */
	void enterExplain_option_list(@NotNull PlPgSqlParser.Explain_option_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#explain_option_list}.
	 * @param ctx the parse tree
	 */
	void exitExplain_option_list(@NotNull PlPgSqlParser.Explain_option_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#decl_sect}.
	 * @param ctx the parse tree
	 */
	void enterDecl_sect(@NotNull PlPgSqlParser.Decl_sectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#decl_sect}.
	 * @param ctx the parse tree
	 */
	void exitDecl_sect(@NotNull PlPgSqlParser.Decl_sectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_asc_desc}.
	 * @param ctx the parse tree
	 */
	void enterOpt_asc_desc(@NotNull PlPgSqlParser.Opt_asc_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_asc_desc}.
	 * @param ctx the parse tree
	 */
	void exitOpt_asc_desc(@NotNull PlPgSqlParser.Opt_asc_descContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_grant_grant_option}.
	 * @param ctx the parse tree
	 */
	void enterOpt_grant_grant_option(@NotNull PlPgSqlParser.Opt_grant_grant_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_grant_grant_option}.
	 * @param ctx the parse tree
	 */
	void exitOpt_grant_grant_option(@NotNull PlPgSqlParser.Opt_grant_grant_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_set_data}.
	 * @param ctx the parse tree
	 */
	void enterOpt_set_data(@NotNull PlPgSqlParser.Opt_set_dataContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_set_data}.
	 * @param ctx the parse tree
	 */
	void exitOpt_set_data(@NotNull PlPgSqlParser.Opt_set_dataContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterTableConstraint(@NotNull PlPgSqlParser.TableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitTableConstraint(@NotNull PlPgSqlParser.TableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#grantStmt}.
	 * @param ctx the parse tree
	 */
	void enterGrantStmt(@NotNull PlPgSqlParser.GrantStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#grantStmt}.
	 * @param ctx the parse tree
	 */
	void exitGrantStmt(@NotNull PlPgSqlParser.GrantStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#generic_option_name}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_option_name(@NotNull PlPgSqlParser.Generic_option_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#generic_option_name}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_option_name(@NotNull PlPgSqlParser.Generic_option_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#dostmt_opt_item}.
	 * @param ctx the parse tree
	 */
	void enterDostmt_opt_item(@NotNull PlPgSqlParser.Dostmt_opt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#dostmt_opt_item}.
	 * @param ctx the parse tree
	 */
	void exitDostmt_opt_item(@NotNull PlPgSqlParser.Dostmt_opt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#getdiag_list}.
	 * @param ctx the parse tree
	 */
	void enterGetdiag_list(@NotNull PlPgSqlParser.Getdiag_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#getdiag_list}.
	 * @param ctx the parse tree
	 */
	void exitGetdiag_list(@NotNull PlPgSqlParser.Getdiag_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#var_value}.
	 * @param ctx the parse tree
	 */
	void enterVar_value(@NotNull PlPgSqlParser.Var_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#var_value}.
	 * @param ctx the parse tree
	 */
	void exitVar_value(@NotNull PlPgSqlParser.Var_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#cluster_index_specification}.
	 * @param ctx the parse tree
	 */
	void enterCluster_index_specification(@NotNull PlPgSqlParser.Cluster_index_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#cluster_index_specification}.
	 * @param ctx the parse tree
	 */
	void exitCluster_index_specification(@NotNull PlPgSqlParser.Cluster_index_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#optConsTableSpace}.
	 * @param ctx the parse tree
	 */
	void enterOptConsTableSpace(@NotNull PlPgSqlParser.OptConsTableSpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#optConsTableSpace}.
	 * @param ctx the parse tree
	 */
	void exitOptConsTableSpace(@NotNull PlPgSqlParser.OptConsTableSpaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opttableElementList}.
	 * @param ctx the parse tree
	 */
	void enterOpttableElementList(@NotNull PlPgSqlParser.OpttableElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opttableElementList}.
	 * @param ctx the parse tree
	 */
	void exitOpttableElementList(@NotNull PlPgSqlParser.OpttableElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#access_method_clause}.
	 * @param ctx the parse tree
	 */
	void enterAccess_method_clause(@NotNull PlPgSqlParser.Access_method_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#access_method_clause}.
	 * @param ctx the parse tree
	 */
	void exitAccess_method_clause(@NotNull PlPgSqlParser.Access_method_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#case_arg}.
	 * @param ctx the parse tree
	 */
	void enterCase_arg(@NotNull PlPgSqlParser.Case_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#case_arg}.
	 * @param ctx the parse tree
	 */
	void exitCase_arg(@NotNull PlPgSqlParser.Case_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#stmt_assign}.
	 * @param ctx the parse tree
	 */
	void enterStmt_assign(@NotNull PlPgSqlParser.Stmt_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#stmt_assign}.
	 * @param ctx the parse tree
	 */
	void exitStmt_assign(@NotNull PlPgSqlParser.Stmt_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#dropOpFamilyStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropOpFamilyStmt(@NotNull PlPgSqlParser.DropOpFamilyStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#dropOpFamilyStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropOpFamilyStmt(@NotNull PlPgSqlParser.DropOpFamilyStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#dropCastStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropCastStmt(@NotNull PlPgSqlParser.DropCastStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#dropCastStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropCastStmt(@NotNull PlPgSqlParser.DropCastStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alterSeqStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterSeqStmt(@NotNull PlPgSqlParser.AlterSeqStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alterSeqStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterSeqStmt(@NotNull PlPgSqlParser.AlterSeqStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#decl_start}.
	 * @param ctx the parse tree
	 */
	void enterDecl_start(@NotNull PlPgSqlParser.Decl_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#decl_start}.
	 * @param ctx the parse tree
	 */
	void exitDecl_start(@NotNull PlPgSqlParser.Decl_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#dropOwnedStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropOwnedStmt(@NotNull PlPgSqlParser.DropOwnedStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#dropOwnedStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropOwnedStmt(@NotNull PlPgSqlParser.DropOwnedStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#createdbStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreatedbStmt(@NotNull PlPgSqlParser.CreatedbStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#createdbStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreatedbStmt(@NotNull PlPgSqlParser.CreatedbStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_in_database}.
	 * @param ctx the parse tree
	 */
	void enterOpt_in_database(@NotNull PlPgSqlParser.Opt_in_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_in_database}.
	 * @param ctx the parse tree
	 */
	void exitOpt_in_database(@NotNull PlPgSqlParser.Opt_in_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#createRoleStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateRoleStmt(@NotNull PlPgSqlParser.CreateRoleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#createRoleStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateRoleStmt(@NotNull PlPgSqlParser.CreateRoleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#constbit}.
	 * @param ctx the parse tree
	 */
	void enterConstbit(@NotNull PlPgSqlParser.ConstbitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#constbit}.
	 * @param ctx the parse tree
	 */
	void exitConstbit(@NotNull PlPgSqlParser.ConstbitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#colQualList}.
	 * @param ctx the parse tree
	 */
	void enterColQualList(@NotNull PlPgSqlParser.ColQualListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#colQualList}.
	 * @param ctx the parse tree
	 */
	void exitColQualList(@NotNull PlPgSqlParser.ColQualListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#commentStmt}.
	 * @param ctx the parse tree
	 */
	void enterCommentStmt(@NotNull PlPgSqlParser.CommentStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#commentStmt}.
	 * @param ctx the parse tree
	 */
	void exitCommentStmt(@NotNull PlPgSqlParser.CommentStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opttableFuncElementList}.
	 * @param ctx the parse tree
	 */
	void enterOpttableFuncElementList(@NotNull PlPgSqlParser.OpttableFuncElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opttableFuncElementList}.
	 * @param ctx the parse tree
	 */
	void exitOpttableFuncElementList(@NotNull PlPgSqlParser.OpttableFuncElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opclass_item}.
	 * @param ctx the parse tree
	 */
	void enterOpclass_item(@NotNull PlPgSqlParser.Opclass_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opclass_item}.
	 * @param ctx the parse tree
	 */
	void exitOpclass_item(@NotNull PlPgSqlParser.Opclass_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#ruleActionMulti}.
	 * @param ctx the parse tree
	 */
	void enterRuleActionMulti(@NotNull PlPgSqlParser.RuleActionMultiContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#ruleActionMulti}.
	 * @param ctx the parse tree
	 */
	void exitRuleActionMulti(@NotNull PlPgSqlParser.RuleActionMultiContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#tableFuncElementList}.
	 * @param ctx the parse tree
	 */
	void enterTableFuncElementList(@NotNull PlPgSqlParser.TableFuncElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#tableFuncElementList}.
	 * @param ctx the parse tree
	 */
	void exitTableFuncElementList(@NotNull PlPgSqlParser.TableFuncElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#createFunctionStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunctionStmt(@NotNull PlPgSqlParser.CreateFunctionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#createFunctionStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunctionStmt(@NotNull PlPgSqlParser.CreateFunctionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#b_expr}.
	 * @param ctx the parse tree
	 */
	void enterB_expr(@NotNull PlPgSqlParser.B_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#b_expr}.
	 * @param ctx the parse tree
	 */
	void exitB_expr(@NotNull PlPgSqlParser.B_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_nowait}.
	 * @param ctx the parse tree
	 */
	void enterOpt_nowait(@NotNull PlPgSqlParser.Opt_nowaitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_nowait}.
	 * @param ctx the parse tree
	 */
	void exitOpt_nowait(@NotNull PlPgSqlParser.Opt_nowaitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#stmt_raise}.
	 * @param ctx the parse tree
	 */
	void enterStmt_raise(@NotNull PlPgSqlParser.Stmt_raiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#stmt_raise}.
	 * @param ctx the parse tree
	 */
	void exitStmt_raise(@NotNull PlPgSqlParser.Stmt_raiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void enterWith_clause(@NotNull PlPgSqlParser.With_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void exitWith_clause(@NotNull PlPgSqlParser.With_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#array_expr}.
	 * @param ctx the parse tree
	 */
	void enterArray_expr(@NotNull PlPgSqlParser.Array_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#array_expr}.
	 * @param ctx the parse tree
	 */
	void exitArray_expr(@NotNull PlPgSqlParser.Array_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#key_delete}.
	 * @param ctx the parse tree
	 */
	void enterKey_delete(@NotNull PlPgSqlParser.Key_deleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#key_delete}.
	 * @param ctx the parse tree
	 */
	void exitKey_delete(@NotNull PlPgSqlParser.Key_deleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#constraintElem}.
	 * @param ctx the parse tree
	 */
	void enterConstraintElem(@NotNull PlPgSqlParser.ConstraintElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#constraintElem}.
	 * @param ctx the parse tree
	 */
	void exitConstraintElem(@NotNull PlPgSqlParser.ConstraintElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#unreserved_keyword}.
	 * @param ctx the parse tree
	 */
	void enterUnreserved_keyword(@NotNull PlPgSqlParser.Unreserved_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#unreserved_keyword}.
	 * @param ctx the parse tree
	 */
	void exitUnreserved_keyword(@NotNull PlPgSqlParser.Unreserved_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#createExtensionStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateExtensionStmt(@NotNull PlPgSqlParser.CreateExtensionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#createExtensionStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateExtensionStmt(@NotNull PlPgSqlParser.CreateExtensionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#relation_expr_list}.
	 * @param ctx the parse tree
	 */
	void enterRelation_expr_list(@NotNull PlPgSqlParser.Relation_expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#relation_expr_list}.
	 * @param ctx the parse tree
	 */
	void exitRelation_expr_list(@NotNull PlPgSqlParser.Relation_expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_freeze}.
	 * @param ctx the parse tree
	 */
	void enterOpt_freeze(@NotNull PlPgSqlParser.Opt_freezeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_freeze}.
	 * @param ctx the parse tree
	 */
	void exitOpt_freeze(@NotNull PlPgSqlParser.Opt_freezeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#case_when}.
	 * @param ctx the parse tree
	 */
	void enterCase_when(@NotNull PlPgSqlParser.Case_whenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#case_when}.
	 * @param ctx the parse tree
	 */
	void exitCase_when(@NotNull PlPgSqlParser.Case_whenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#fdw_option}.
	 * @param ctx the parse tree
	 */
	void enterFdw_option(@NotNull PlPgSqlParser.Fdw_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#fdw_option}.
	 * @param ctx the parse tree
	 */
	void exitFdw_option(@NotNull PlPgSqlParser.Fdw_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#typename}.
	 * @param ctx the parse tree
	 */
	void enterTypename(@NotNull PlPgSqlParser.TypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#typename}.
	 * @param ctx the parse tree
	 */
	void exitTypename(@NotNull PlPgSqlParser.TypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#reloption_list}.
	 * @param ctx the parse tree
	 */
	void enterReloption_list(@NotNull PlPgSqlParser.Reloption_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#reloption_list}.
	 * @param ctx the parse tree
	 */
	void exitReloption_list(@NotNull PlPgSqlParser.Reloption_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#numericOnly}.
	 * @param ctx the parse tree
	 */
	void enterNumericOnly(@NotNull PlPgSqlParser.NumericOnlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#numericOnly}.
	 * @param ctx the parse tree
	 */
	void exitNumericOnly(@NotNull PlPgSqlParser.NumericOnlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_charset}.
	 * @param ctx the parse tree
	 */
	void enterOpt_charset(@NotNull PlPgSqlParser.Opt_charsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_charset}.
	 * @param ctx the parse tree
	 */
	void exitOpt_charset(@NotNull PlPgSqlParser.Opt_charsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#optTempTableName}.
	 * @param ctx the parse tree
	 */
	void enterOptTempTableName(@NotNull PlPgSqlParser.OptTempTableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#optTempTableName}.
	 * @param ctx the parse tree
	 */
	void exitOptTempTableName(@NotNull PlPgSqlParser.OptTempTableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#fdw_options}.
	 * @param ctx the parse tree
	 */
	void enterFdw_options(@NotNull PlPgSqlParser.Fdw_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#fdw_options}.
	 * @param ctx the parse tree
	 */
	void exitFdw_options(@NotNull PlPgSqlParser.Fdw_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_with_data}.
	 * @param ctx the parse tree
	 */
	void enterOpt_with_data(@NotNull PlPgSqlParser.Opt_with_dataContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_with_data}.
	 * @param ctx the parse tree
	 */
	void exitOpt_with_data(@NotNull PlPgSqlParser.Opt_with_dataContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#aggr_args}.
	 * @param ctx the parse tree
	 */
	void enterAggr_args(@NotNull PlPgSqlParser.Aggr_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#aggr_args}.
	 * @param ctx the parse tree
	 */
	void exitAggr_args(@NotNull PlPgSqlParser.Aggr_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#truncateStmt}.
	 * @param ctx the parse tree
	 */
	void enterTruncateStmt(@NotNull PlPgSqlParser.TruncateStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#truncateStmt}.
	 * @param ctx the parse tree
	 */
	void exitTruncateStmt(@NotNull PlPgSqlParser.TruncateStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#qual_all_Op}.
	 * @param ctx the parse tree
	 */
	void enterQual_all_Op(@NotNull PlPgSqlParser.Qual_all_OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#qual_all_Op}.
	 * @param ctx the parse tree
	 */
	void exitQual_all_Op(@NotNull PlPgSqlParser.Qual_all_OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_if_exists}.
	 * @param ctx the parse tree
	 */
	void enterOpt_if_exists(@NotNull PlPgSqlParser.Opt_if_existsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_if_exists}.
	 * @param ctx the parse tree
	 */
	void exitOpt_if_exists(@NotNull PlPgSqlParser.Opt_if_existsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_collate_clause}.
	 * @param ctx the parse tree
	 */
	void enterOpt_collate_clause(@NotNull PlPgSqlParser.Opt_collate_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_collate_clause}.
	 * @param ctx the parse tree
	 */
	void exitOpt_collate_clause(@NotNull PlPgSqlParser.Opt_collate_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#defACLOption}.
	 * @param ctx the parse tree
	 */
	void enterDefACLOption(@NotNull PlPgSqlParser.DefACLOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#defACLOption}.
	 * @param ctx the parse tree
	 */
	void exitDefACLOption(@NotNull PlPgSqlParser.DefACLOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#func_arg_with_default}.
	 * @param ctx the parse tree
	 */
	void enterFunc_arg_with_default(@NotNull PlPgSqlParser.Func_arg_with_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#func_arg_with_default}.
	 * @param ctx the parse tree
	 */
	void exitFunc_arg_with_default(@NotNull PlPgSqlParser.Func_arg_with_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#returning_clause}.
	 * @param ctx the parse tree
	 */
	void enterReturning_clause(@NotNull PlPgSqlParser.Returning_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#returning_clause}.
	 * @param ctx the parse tree
	 */
	void exitReturning_clause(@NotNull PlPgSqlParser.Returning_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#grantee_list}.
	 * @param ctx the parse tree
	 */
	void enterGrantee_list(@NotNull PlPgSqlParser.Grantee_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#grantee_list}.
	 * @param ctx the parse tree
	 */
	void exitGrantee_list(@NotNull PlPgSqlParser.Grantee_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#target_list}.
	 * @param ctx the parse tree
	 */
	void enterTarget_list(@NotNull PlPgSqlParser.Target_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#target_list}.
	 * @param ctx the parse tree
	 */
	void exitTarget_list(@NotNull PlPgSqlParser.Target_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_reloptions}.
	 * @param ctx the parse tree
	 */
	void enterOpt_reloptions(@NotNull PlPgSqlParser.Opt_reloptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_reloptions}.
	 * @param ctx the parse tree
	 */
	void exitOpt_reloptions(@NotNull PlPgSqlParser.Opt_reloptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#functionsetResetClause}.
	 * @param ctx the parse tree
	 */
	void enterFunctionsetResetClause(@NotNull PlPgSqlParser.FunctionsetResetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#functionsetResetClause}.
	 * @param ctx the parse tree
	 */
	void exitFunctionsetResetClause(@NotNull PlPgSqlParser.FunctionsetResetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#createUserMappingStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateUserMappingStmt(@NotNull PlPgSqlParser.CreateUserMappingStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#createUserMappingStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateUserMappingStmt(@NotNull PlPgSqlParser.CreateUserMappingStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#unlistenStmt}.
	 * @param ctx the parse tree
	 */
	void enterUnlistenStmt(@NotNull PlPgSqlParser.UnlistenStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#unlistenStmt}.
	 * @param ctx the parse tree
	 */
	void exitUnlistenStmt(@NotNull PlPgSqlParser.UnlistenStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#roleId}.
	 * @param ctx the parse tree
	 */
	void enterRoleId(@NotNull PlPgSqlParser.RoleIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#roleId}.
	 * @param ctx the parse tree
	 */
	void exitRoleId(@NotNull PlPgSqlParser.RoleIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#bitWithoutLength}.
	 * @param ctx the parse tree
	 */
	void enterBitWithoutLength(@NotNull PlPgSqlParser.BitWithoutLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#bitWithoutLength}.
	 * @param ctx the parse tree
	 */
	void exitBitWithoutLength(@NotNull PlPgSqlParser.BitWithoutLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#dropAssertStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropAssertStmt(@NotNull PlPgSqlParser.DropAssertStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#dropAssertStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropAssertStmt(@NotNull PlPgSqlParser.DropAssertStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#sortby}.
	 * @param ctx the parse tree
	 */
	void enterSortby(@NotNull PlPgSqlParser.SortbyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#sortby}.
	 * @param ctx the parse tree
	 */
	void exitSortby(@NotNull PlPgSqlParser.SortbyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#set_clause_list}.
	 * @param ctx the parse tree
	 */
	void enterSet_clause_list(@NotNull PlPgSqlParser.Set_clause_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#set_clause_list}.
	 * @param ctx the parse tree
	 */
	void exitSet_clause_list(@NotNull PlPgSqlParser.Set_clause_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_case_else}.
	 * @param ctx the parse tree
	 */
	void enterOpt_case_else(@NotNull PlPgSqlParser.Opt_case_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_case_else}.
	 * @param ctx the parse tree
	 */
	void exitOpt_case_else(@NotNull PlPgSqlParser.Opt_case_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#tableFuncElement}.
	 * @param ctx the parse tree
	 */
	void enterTableFuncElement(@NotNull PlPgSqlParser.TableFuncElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#tableFuncElement}.
	 * @param ctx the parse tree
	 */
	void exitTableFuncElement(@NotNull PlPgSqlParser.TableFuncElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#clusterStmt}.
	 * @param ctx the parse tree
	 */
	void enterClusterStmt(@NotNull PlPgSqlParser.ClusterStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#clusterStmt}.
	 * @param ctx the parse tree
	 */
	void exitClusterStmt(@NotNull PlPgSqlParser.ClusterStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#func_arg_list}.
	 * @param ctx the parse tree
	 */
	void enterFunc_arg_list(@NotNull PlPgSqlParser.Func_arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#func_arg_list}.
	 * @param ctx the parse tree
	 */
	void exitFunc_arg_list(@NotNull PlPgSqlParser.Func_arg_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#decl_aliasitem}.
	 * @param ctx the parse tree
	 */
	void enterDecl_aliasitem(@NotNull PlPgSqlParser.Decl_aliasitemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#decl_aliasitem}.
	 * @param ctx the parse tree
	 */
	void exitDecl_aliasitem(@NotNull PlPgSqlParser.Decl_aliasitemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#constraints_set_list}.
	 * @param ctx the parse tree
	 */
	void enterConstraints_set_list(@NotNull PlPgSqlParser.Constraints_set_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#constraints_set_list}.
	 * @param ctx the parse tree
	 */
	void exitConstraints_set_list(@NotNull PlPgSqlParser.Constraints_set_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_lock}.
	 * @param ctx the parse tree
	 */
	void enterOpt_lock(@NotNull PlPgSqlParser.Opt_lockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_lock}.
	 * @param ctx the parse tree
	 */
	void exitOpt_lock(@NotNull PlPgSqlParser.Opt_lockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_expr_until_when}.
	 * @param ctx the parse tree
	 */
	void enterOpt_expr_until_when(@NotNull PlPgSqlParser.Opt_expr_until_whenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_expr_until_when}.
	 * @param ctx the parse tree
	 */
	void exitOpt_expr_until_when(@NotNull PlPgSqlParser.Opt_expr_until_whenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#copy_generic_opt_list}.
	 * @param ctx the parse tree
	 */
	void enterCopy_generic_opt_list(@NotNull PlPgSqlParser.Copy_generic_opt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#copy_generic_opt_list}.
	 * @param ctx the parse tree
	 */
	void exitCopy_generic_opt_list(@NotNull PlPgSqlParser.Copy_generic_opt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#triggerForSpec}.
	 * @param ctx the parse tree
	 */
	void enterTriggerForSpec(@NotNull PlPgSqlParser.TriggerForSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#triggerForSpec}.
	 * @param ctx the parse tree
	 */
	void exitTriggerForSpec(@NotNull PlPgSqlParser.TriggerForSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#optTemp}.
	 * @param ctx the parse tree
	 */
	void enterOptTemp(@NotNull PlPgSqlParser.OptTempContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#optTemp}.
	 * @param ctx the parse tree
	 */
	void exitOptTemp(@NotNull PlPgSqlParser.OptTempContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#createForeignServerStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateForeignServerStmt(@NotNull PlPgSqlParser.CreateForeignServerStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#createForeignServerStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateForeignServerStmt(@NotNull PlPgSqlParser.CreateForeignServerStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#tableElement}.
	 * @param ctx the parse tree
	 */
	void enterTableElement(@NotNull PlPgSqlParser.TableElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#tableElement}.
	 * @param ctx the parse tree
	 */
	void exitTableElement(@NotNull PlPgSqlParser.TableElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alterTableStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableStmt(@NotNull PlPgSqlParser.AlterTableStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alterTableStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableStmt(@NotNull PlPgSqlParser.AlterTableStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#def_elem}.
	 * @param ctx the parse tree
	 */
	void enterDef_elem(@NotNull PlPgSqlParser.Def_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#def_elem}.
	 * @param ctx the parse tree
	 */
	void exitDef_elem(@NotNull PlPgSqlParser.Def_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#stmt_elsifs}.
	 * @param ctx the parse tree
	 */
	void enterStmt_elsifs(@NotNull PlPgSqlParser.Stmt_elsifsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#stmt_elsifs}.
	 * @param ctx the parse tree
	 */
	void exitStmt_elsifs(@NotNull PlPgSqlParser.Stmt_elsifsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#index_elem}.
	 * @param ctx the parse tree
	 */
	void enterIndex_elem(@NotNull PlPgSqlParser.Index_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#index_elem}.
	 * @param ctx the parse tree
	 */
	void exitIndex_elem(@NotNull PlPgSqlParser.Index_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#key_actions}.
	 * @param ctx the parse tree
	 */
	void enterKey_actions(@NotNull PlPgSqlParser.Key_actionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#key_actions}.
	 * @param ctx the parse tree
	 */
	void exitKey_actions(@NotNull PlPgSqlParser.Key_actionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#stmt_return}.
	 * @param ctx the parse tree
	 */
	void enterStmt_return(@NotNull PlPgSqlParser.Stmt_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#stmt_return}.
	 * @param ctx the parse tree
	 */
	void exitStmt_return(@NotNull PlPgSqlParser.Stmt_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_using}.
	 * @param ctx the parse tree
	 */
	void enterOpt_using(@NotNull PlPgSqlParser.Opt_usingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_using}.
	 * @param ctx the parse tree
	 */
	void exitOpt_using(@NotNull PlPgSqlParser.Opt_usingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_equal}.
	 * @param ctx the parse tree
	 */
	void enterOpt_equal(@NotNull PlPgSqlParser.Opt_equalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_equal}.
	 * @param ctx the parse tree
	 */
	void exitOpt_equal(@NotNull PlPgSqlParser.Opt_equalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_or_replace}.
	 * @param ctx the parse tree
	 */
	void enterOpt_or_replace(@NotNull PlPgSqlParser.Opt_or_replaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_or_replace}.
	 * @param ctx the parse tree
	 */
	void exitOpt_or_replace(@NotNull PlPgSqlParser.Opt_or_replaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#for_locking_item}.
	 * @param ctx the parse tree
	 */
	void enterFor_locking_item(@NotNull PlPgSqlParser.For_locking_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#for_locking_item}.
	 * @param ctx the parse tree
	 */
	void exitFor_locking_item(@NotNull PlPgSqlParser.For_locking_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#colConstraint}.
	 * @param ctx the parse tree
	 */
	void enterColConstraint(@NotNull PlPgSqlParser.ColConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#colConstraint}.
	 * @param ctx the parse tree
	 */
	void exitColConstraint(@NotNull PlPgSqlParser.ColConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_enum_val_list}.
	 * @param ctx the parse tree
	 */
	void enterOpt_enum_val_list(@NotNull PlPgSqlParser.Opt_enum_val_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_enum_val_list}.
	 * @param ctx the parse tree
	 */
	void exitOpt_enum_val_list(@NotNull PlPgSqlParser.Opt_enum_val_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#optSchemaName}.
	 * @param ctx the parse tree
	 */
	void enterOptSchemaName(@NotNull PlPgSqlParser.OptSchemaNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#optSchemaName}.
	 * @param ctx the parse tree
	 */
	void exitOptSchemaName(@NotNull PlPgSqlParser.OptSchemaNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#stmt_move}.
	 * @param ctx the parse tree
	 */
	void enterStmt_move(@NotNull PlPgSqlParser.Stmt_moveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#stmt_move}.
	 * @param ctx the parse tree
	 */
	void exitStmt_move(@NotNull PlPgSqlParser.Stmt_moveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_restrict}.
	 * @param ctx the parse tree
	 */
	void enterOpt_restrict(@NotNull PlPgSqlParser.Opt_restrictContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_restrict}.
	 * @param ctx the parse tree
	 */
	void exitOpt_restrict(@NotNull PlPgSqlParser.Opt_restrictContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#createStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateStmt(@NotNull PlPgSqlParser.CreateStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#createStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateStmt(@NotNull PlPgSqlParser.CreateStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#exclusionWhereClause}.
	 * @param ctx the parse tree
	 */
	void enterExclusionWhereClause(@NotNull PlPgSqlParser.ExclusionWhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#exclusionWhereClause}.
	 * @param ctx the parse tree
	 */
	void exitExclusionWhereClause(@NotNull PlPgSqlParser.ExclusionWhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#stmt_fetch}.
	 * @param ctx the parse tree
	 */
	void enterStmt_fetch(@NotNull PlPgSqlParser.Stmt_fetchContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#stmt_fetch}.
	 * @param ctx the parse tree
	 */
	void exitStmt_fetch(@NotNull PlPgSqlParser.Stmt_fetchContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#foreigntableElement}.
	 * @param ctx the parse tree
	 */
	void enterForeigntableElement(@NotNull PlPgSqlParser.ForeigntableElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#foreigntableElement}.
	 * @param ctx the parse tree
	 */
	void exitForeigntableElement(@NotNull PlPgSqlParser.ForeigntableElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opclass_purpose}.
	 * @param ctx the parse tree
	 */
	void enterOpclass_purpose(@NotNull PlPgSqlParser.Opclass_purposeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opclass_purpose}.
	 * @param ctx the parse tree
	 */
	void exitOpclass_purpose(@NotNull PlPgSqlParser.Opclass_purposeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alterFdwStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterFdwStmt(@NotNull PlPgSqlParser.AlterFdwStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alterFdwStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterFdwStmt(@NotNull PlPgSqlParser.AlterFdwStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#explain_option_elem}.
	 * @param ctx the parse tree
	 */
	void enterExplain_option_elem(@NotNull PlPgSqlParser.Explain_option_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#explain_option_elem}.
	 * @param ctx the parse tree
	 */
	void exitExplain_option_elem(@NotNull PlPgSqlParser.Explain_option_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#set_rest}.
	 * @param ctx the parse tree
	 */
	void enterSet_rest(@NotNull PlPgSqlParser.Set_restContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#set_rest}.
	 * @param ctx the parse tree
	 */
	void exitSet_rest(@NotNull PlPgSqlParser.Set_restContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alterUserMappingStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterUserMappingStmt(@NotNull PlPgSqlParser.AlterUserMappingStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alterUserMappingStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterUserMappingStmt(@NotNull PlPgSqlParser.AlterUserMappingStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#joined_table}.
	 * @param ctx the parse tree
	 */
	void enterJoined_table(@NotNull PlPgSqlParser.Joined_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#joined_table}.
	 * @param ctx the parse tree
	 */
	void exitJoined_table(@NotNull PlPgSqlParser.Joined_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#create_generic_options}.
	 * @param ctx the parse tree
	 */
	void enterCreate_generic_options(@NotNull PlPgSqlParser.Create_generic_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#create_generic_options}.
	 * @param ctx the parse tree
	 */
	void exitCreate_generic_options(@NotNull PlPgSqlParser.Create_generic_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#func_args}.
	 * @param ctx the parse tree
	 */
	void enterFunc_args(@NotNull PlPgSqlParser.Func_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#func_args}.
	 * @param ctx the parse tree
	 */
	void exitFunc_args(@NotNull PlPgSqlParser.Func_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#ruleActionStmt}.
	 * @param ctx the parse tree
	 */
	void enterRuleActionStmt(@NotNull PlPgSqlParser.RuleActionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#ruleActionStmt}.
	 * @param ctx the parse tree
	 */
	void exitRuleActionStmt(@NotNull PlPgSqlParser.RuleActionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_with_clause}.
	 * @param ctx the parse tree
	 */
	void enterOpt_with_clause(@NotNull PlPgSqlParser.Opt_with_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_with_clause}.
	 * @param ctx the parse tree
	 */
	void exitOpt_with_clause(@NotNull PlPgSqlParser.Opt_with_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_sort_clause}.
	 * @param ctx the parse tree
	 */
	void enterOpt_sort_clause(@NotNull PlPgSqlParser.Opt_sort_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_sort_clause}.
	 * @param ctx the parse tree
	 */
	void exitOpt_sort_clause(@NotNull PlPgSqlParser.Opt_sort_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#insert_rest}.
	 * @param ctx the parse tree
	 */
	void enterInsert_rest(@NotNull PlPgSqlParser.Insert_restContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#insert_rest}.
	 * @param ctx the parse tree
	 */
	void exitInsert_rest(@NotNull PlPgSqlParser.Insert_restContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alterOpFamilyStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterOpFamilyStmt(@NotNull PlPgSqlParser.AlterOpFamilyStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alterOpFamilyStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterOpFamilyStmt(@NotNull PlPgSqlParser.AlterOpFamilyStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#all_Op}.
	 * @param ctx the parse tree
	 */
	void enterAll_Op(@NotNull PlPgSqlParser.All_OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#all_Op}.
	 * @param ctx the parse tree
	 */
	void exitAll_Op(@NotNull PlPgSqlParser.All_OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#fetch_args}.
	 * @param ctx the parse tree
	 */
	void enterFetch_args(@NotNull PlPgSqlParser.Fetch_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#fetch_args}.
	 * @param ctx the parse tree
	 */
	void exitFetch_args(@NotNull PlPgSqlParser.Fetch_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alterCompositeTypeStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterCompositeTypeStmt(@NotNull PlPgSqlParser.AlterCompositeTypeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alterCompositeTypeStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterCompositeTypeStmt(@NotNull PlPgSqlParser.AlterCompositeTypeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alterDomainStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterDomainStmt(@NotNull PlPgSqlParser.AlterDomainStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alterDomainStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterDomainStmt(@NotNull PlPgSqlParser.AlterDomainStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#copy_file_name}.
	 * @param ctx the parse tree
	 */
	void enterCopy_file_name(@NotNull PlPgSqlParser.Copy_file_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#copy_file_name}.
	 * @param ctx the parse tree
	 */
	void exitCopy_file_name(@NotNull PlPgSqlParser.Copy_file_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void enterCursor_name(@NotNull PlPgSqlParser.Cursor_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void exitCursor_name(@NotNull PlPgSqlParser.Cursor_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#position_list}.
	 * @param ctx the parse tree
	 */
	void enterPosition_list(@NotNull PlPgSqlParser.Position_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#position_list}.
	 * @param ctx the parse tree
	 */
	void exitPosition_list(@NotNull PlPgSqlParser.Position_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#createAsStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateAsStmt(@NotNull PlPgSqlParser.CreateAsStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#createAsStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateAsStmt(@NotNull PlPgSqlParser.CreateAsStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#pl_function}.
	 * @param ctx the parse tree
	 */
	void enterPl_function(@NotNull PlPgSqlParser.Pl_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#pl_function}.
	 * @param ctx the parse tree
	 */
	void exitPl_function(@NotNull PlPgSqlParser.Pl_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#name_list}.
	 * @param ctx the parse tree
	 */
	void enterName_list(@NotNull PlPgSqlParser.Name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#name_list}.
	 * @param ctx the parse tree
	 */
	void exitName_list(@NotNull PlPgSqlParser.Name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#dropruleStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropruleStmt(@NotNull PlPgSqlParser.DropruleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#dropruleStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropruleStmt(@NotNull PlPgSqlParser.DropruleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_force}.
	 * @param ctx the parse tree
	 */
	void enterOpt_force(@NotNull PlPgSqlParser.Opt_forceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_force}.
	 * @param ctx the parse tree
	 */
	void exitOpt_force(@NotNull PlPgSqlParser.Opt_forceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#trim_list}.
	 * @param ctx the parse tree
	 */
	void enterTrim_list(@NotNull PlPgSqlParser.Trim_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#trim_list}.
	 * @param ctx the parse tree
	 */
	void exitTrim_list(@NotNull PlPgSqlParser.Trim_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#stmt_null}.
	 * @param ctx the parse tree
	 */
	void enterStmt_null(@NotNull PlPgSqlParser.Stmt_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#stmt_null}.
	 * @param ctx the parse tree
	 */
	void exitStmt_null(@NotNull PlPgSqlParser.Stmt_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alias_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlias_clause(@NotNull PlPgSqlParser.Alias_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alias_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlias_clause(@NotNull PlPgSqlParser.Alias_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#optConstrFromTable}.
	 * @param ctx the parse tree
	 */
	void enterOptConstrFromTable(@NotNull PlPgSqlParser.OptConstrFromTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#optConstrFromTable}.
	 * @param ctx the parse tree
	 */
	void exitOptConstrFromTable(@NotNull PlPgSqlParser.OptConstrFromTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#join_type}.
	 * @param ctx the parse tree
	 */
	void enterJoin_type(@NotNull PlPgSqlParser.Join_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#join_type}.
	 * @param ctx the parse tree
	 */
	void exitJoin_type(@NotNull PlPgSqlParser.Join_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#attr_name}.
	 * @param ctx the parse tree
	 */
	void enterAttr_name(@NotNull PlPgSqlParser.Attr_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#attr_name}.
	 * @param ctx the parse tree
	 */
	void exitAttr_name(@NotNull PlPgSqlParser.Attr_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alterRoleSetStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterRoleSetStmt(@NotNull PlPgSqlParser.AlterRoleSetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alterRoleSetStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterRoleSetStmt(@NotNull PlPgSqlParser.AlterRoleSetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#func_expr}.
	 * @param ctx the parse tree
	 */
	void enterFunc_expr(@NotNull PlPgSqlParser.Func_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#func_expr}.
	 * @param ctx the parse tree
	 */
	void exitFunc_expr(@NotNull PlPgSqlParser.Func_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_transaction}.
	 * @param ctx the parse tree
	 */
	void enterOpt_transaction(@NotNull PlPgSqlParser.Opt_transactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_transaction}.
	 * @param ctx the parse tree
	 */
	void exitOpt_transaction(@NotNull PlPgSqlParser.Opt_transactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#copy_options}.
	 * @param ctx the parse tree
	 */
	void enterCopy_options(@NotNull PlPgSqlParser.Copy_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#copy_options}.
	 * @param ctx the parse tree
	 */
	void exitCopy_options(@NotNull PlPgSqlParser.Copy_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#analyze_keyword}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze_keyword(@NotNull PlPgSqlParser.Analyze_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#analyze_keyword}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze_keyword(@NotNull PlPgSqlParser.Analyze_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alterTSConfigurationStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterTSConfigurationStmt(@NotNull PlPgSqlParser.AlterTSConfigurationStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alterTSConfigurationStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterTSConfigurationStmt(@NotNull PlPgSqlParser.AlterTSConfigurationStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#overlay_list}.
	 * @param ctx the parse tree
	 */
	void enterOverlay_list(@NotNull PlPgSqlParser.Overlay_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#overlay_list}.
	 * @param ctx the parse tree
	 */
	void exitOverlay_list(@NotNull PlPgSqlParser.Overlay_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void enterSelect_clause(@NotNull PlPgSqlParser.Select_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void exitSelect_clause(@NotNull PlPgSqlParser.Select_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#decl_cursor_args}.
	 * @param ctx the parse tree
	 */
	void enterDecl_cursor_args(@NotNull PlPgSqlParser.Decl_cursor_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#decl_cursor_args}.
	 * @param ctx the parse tree
	 */
	void exitDecl_cursor_args(@NotNull PlPgSqlParser.Decl_cursor_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#handler_name}.
	 * @param ctx the parse tree
	 */
	void enterHandler_name(@NotNull PlPgSqlParser.Handler_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#handler_name}.
	 * @param ctx the parse tree
	 */
	void exitHandler_name(@NotNull PlPgSqlParser.Handler_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#updateStmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdateStmt(@NotNull PlPgSqlParser.UpdateStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#updateStmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdateStmt(@NotNull PlPgSqlParser.UpdateStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(@NotNull PlPgSqlParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(@NotNull PlPgSqlParser.Any_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#createTableSpaceStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableSpaceStmt(@NotNull PlPgSqlParser.CreateTableSpaceStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#createTableSpaceStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableSpaceStmt(@NotNull PlPgSqlParser.CreateTableSpaceStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_opfamily}.
	 * @param ctx the parse tree
	 */
	void enterOpt_opfamily(@NotNull PlPgSqlParser.Opt_opfamilyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_opfamily}.
	 * @param ctx the parse tree
	 */
	void exitOpt_opfamily(@NotNull PlPgSqlParser.Opt_opfamilyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#function_with_argtypes}.
	 * @param ctx the parse tree
	 */
	void enterFunction_with_argtypes(@NotNull PlPgSqlParser.Function_with_argtypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#function_with_argtypes}.
	 * @param ctx the parse tree
	 */
	void exitFunction_with_argtypes(@NotNull PlPgSqlParser.Function_with_argtypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#getdiag_target}.
	 * @param ctx the parse tree
	 */
	void enterGetdiag_target(@NotNull PlPgSqlParser.Getdiag_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#getdiag_target}.
	 * @param ctx the parse tree
	 */
	void exitGetdiag_target(@NotNull PlPgSqlParser.Getdiag_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#constraints_set_mode}.
	 * @param ctx the parse tree
	 */
	void enterConstraints_set_mode(@NotNull PlPgSqlParser.Constraints_set_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#constraints_set_mode}.
	 * @param ctx the parse tree
	 */
	void exitConstraints_set_mode(@NotNull PlPgSqlParser.Constraints_set_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alterUserSetStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterUserSetStmt(@NotNull PlPgSqlParser.AlterUserSetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alterUserSetStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterUserSetStmt(@NotNull PlPgSqlParser.AlterUserSetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_type}.
	 * @param ctx the parse tree
	 */
	void enterOpt_type(@NotNull PlPgSqlParser.Opt_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_type}.
	 * @param ctx the parse tree
	 */
	void exitOpt_type(@NotNull PlPgSqlParser.Opt_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#indirection}.
	 * @param ctx the parse tree
	 */
	void enterIndirection(@NotNull PlPgSqlParser.IndirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#indirection}.
	 * @param ctx the parse tree
	 */
	void exitIndirection(@NotNull PlPgSqlParser.IndirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#dropUserStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropUserStmt(@NotNull PlPgSqlParser.DropUserStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#dropUserStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropUserStmt(@NotNull PlPgSqlParser.DropUserStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#xml_root_version}.
	 * @param ctx the parse tree
	 */
	void enterXml_root_version(@NotNull PlPgSqlParser.Xml_root_versionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#xml_root_version}.
	 * @param ctx the parse tree
	 */
	void exitXml_root_version(@NotNull PlPgSqlParser.Xml_root_versionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_exitcond}.
	 * @param ctx the parse tree
	 */
	void enterOpt_exitcond(@NotNull PlPgSqlParser.Opt_exitcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_exitcond}.
	 * @param ctx the parse tree
	 */
	void exitOpt_exitcond(@NotNull PlPgSqlParser.Opt_exitcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#enum_val_list}.
	 * @param ctx the parse tree
	 */
	void enterEnum_val_list(@NotNull PlPgSqlParser.Enum_val_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#enum_val_list}.
	 * @param ctx the parse tree
	 */
	void exitEnum_val_list(@NotNull PlPgSqlParser.Enum_val_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#sub_type}.
	 * @param ctx the parse tree
	 */
	void enterSub_type(@NotNull PlPgSqlParser.Sub_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#sub_type}.
	 * @param ctx the parse tree
	 */
	void exitSub_type(@NotNull PlPgSqlParser.Sub_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_boolean_or_string}.
	 * @param ctx the parse tree
	 */
	void enterOpt_boolean_or_string(@NotNull PlPgSqlParser.Opt_boolean_or_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_boolean_or_string}.
	 * @param ctx the parse tree
	 */
	void exitOpt_boolean_or_string(@NotNull PlPgSqlParser.Opt_boolean_or_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#table_func_column_list}.
	 * @param ctx the parse tree
	 */
	void enterTable_func_column_list(@NotNull PlPgSqlParser.Table_func_column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#table_func_column_list}.
	 * @param ctx the parse tree
	 */
	void exitTable_func_column_list(@NotNull PlPgSqlParser.Table_func_column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#col_name_keyword}.
	 * @param ctx the parse tree
	 */
	void enterCol_name_keyword(@NotNull PlPgSqlParser.Col_name_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#col_name_keyword}.
	 * @param ctx the parse tree
	 */
	void exitCol_name_keyword(@NotNull PlPgSqlParser.Col_name_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#constcharacter}.
	 * @param ctx the parse tree
	 */
	void enterConstcharacter(@NotNull PlPgSqlParser.ConstcharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#constcharacter}.
	 * @param ctx the parse tree
	 */
	void exitConstcharacter(@NotNull PlPgSqlParser.ConstcharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#relation_expr_opt_alias}.
	 * @param ctx the parse tree
	 */
	void enterRelation_expr_opt_alias(@NotNull PlPgSqlParser.Relation_expr_opt_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#relation_expr_opt_alias}.
	 * @param ctx the parse tree
	 */
	void exitRelation_expr_opt_alias(@NotNull PlPgSqlParser.Relation_expr_opt_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_oids}.
	 * @param ctx the parse tree
	 */
	void enterOpt_oids(@NotNull PlPgSqlParser.Opt_oidsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_oids}.
	 * @param ctx the parse tree
	 */
	void exitOpt_oids(@NotNull PlPgSqlParser.Opt_oidsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#set_clause}.
	 * @param ctx the parse tree
	 */
	void enterSet_clause(@NotNull PlPgSqlParser.Set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#set_clause}.
	 * @param ctx the parse tree
	 */
	void exitSet_clause(@NotNull PlPgSqlParser.Set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_column_list}.
	 * @param ctx the parse tree
	 */
	void enterOpt_column_list(@NotNull PlPgSqlParser.Opt_column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_column_list}.
	 * @param ctx the parse tree
	 */
	void exitOpt_column_list(@NotNull PlPgSqlParser.Opt_column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#exception_sect}.
	 * @param ctx the parse tree
	 */
	void enterException_sect(@NotNull PlPgSqlParser.Exception_sectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#exception_sect}.
	 * @param ctx the parse tree
	 */
	void exitException_sect(@NotNull PlPgSqlParser.Exception_sectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#createOptRoleElem}.
	 * @param ctx the parse tree
	 */
	void enterCreateOptRoleElem(@NotNull PlPgSqlParser.CreateOptRoleElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#createOptRoleElem}.
	 * @param ctx the parse tree
	 */
	void exitCreateOptRoleElem(@NotNull PlPgSqlParser.CreateOptRoleElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#dropStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropStmt(@NotNull PlPgSqlParser.DropStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#dropStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropStmt(@NotNull PlPgSqlParser.DropStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#comment_text}.
	 * @param ctx the parse tree
	 */
	void enterComment_text(@NotNull PlPgSqlParser.Comment_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#comment_text}.
	 * @param ctx the parse tree
	 */
	void exitComment_text(@NotNull PlPgSqlParser.Comment_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#privilege_list}.
	 * @param ctx the parse tree
	 */
	void enterPrivilege_list(@NotNull PlPgSqlParser.Privilege_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#privilege_list}.
	 * @param ctx the parse tree
	 */
	void exitPrivilege_list(@NotNull PlPgSqlParser.Privilege_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#table_ref}.
	 * @param ctx the parse tree
	 */
	void enterTable_ref(@NotNull PlPgSqlParser.Table_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#table_ref}.
	 * @param ctx the parse tree
	 */
	void exitTable_ref(@NotNull PlPgSqlParser.Table_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#var_list}.
	 * @param ctx the parse tree
	 */
	void enterVar_list(@NotNull PlPgSqlParser.Var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#var_list}.
	 * @param ctx the parse tree
	 */
	void exitVar_list(@NotNull PlPgSqlParser.Var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#join_qual}.
	 * @param ctx the parse tree
	 */
	void enterJoin_qual(@NotNull PlPgSqlParser.Join_qualContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#join_qual}.
	 * @param ctx the parse tree
	 */
	void exitJoin_qual(@NotNull PlPgSqlParser.Join_qualContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#colId_or_Sconst}.
	 * @param ctx the parse tree
	 */
	void enterColId_or_Sconst(@NotNull PlPgSqlParser.ColId_or_SconstContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#colId_or_Sconst}.
	 * @param ctx the parse tree
	 */
	void exitColId_or_Sconst(@NotNull PlPgSqlParser.ColId_or_SconstContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#qualified_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_name(@NotNull PlPgSqlParser.Qualified_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#qualified_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_name(@NotNull PlPgSqlParser.Qualified_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_drop_behavior}.
	 * @param ctx the parse tree
	 */
	void enterOpt_drop_behavior(@NotNull PlPgSqlParser.Opt_drop_behaviorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_drop_behavior}.
	 * @param ctx the parse tree
	 */
	void exitOpt_drop_behavior(@NotNull PlPgSqlParser.Opt_drop_behaviorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#decl_cursor_arglist}.
	 * @param ctx the parse tree
	 */
	void enterDecl_cursor_arglist(@NotNull PlPgSqlParser.Decl_cursor_arglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#decl_cursor_arglist}.
	 * @param ctx the parse tree
	 */
	void exitDecl_cursor_arglist(@NotNull PlPgSqlParser.Decl_cursor_arglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#decl_varname}.
	 * @param ctx the parse tree
	 */
	void enterDecl_varname(@NotNull PlPgSqlParser.Decl_varnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#decl_varname}.
	 * @param ctx the parse tree
	 */
	void exitDecl_varname(@NotNull PlPgSqlParser.Decl_varnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#ruleActionList}.
	 * @param ctx the parse tree
	 */
	void enterRuleActionList(@NotNull PlPgSqlParser.RuleActionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#ruleActionList}.
	 * @param ctx the parse tree
	 */
	void exitRuleActionList(@NotNull PlPgSqlParser.RuleActionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_verbose}.
	 * @param ctx the parse tree
	 */
	void enterOpt_verbose(@NotNull PlPgSqlParser.Opt_verboseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_verbose}.
	 * @param ctx the parse tree
	 */
	void exitOpt_verbose(@NotNull PlPgSqlParser.Opt_verboseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(@NotNull PlPgSqlParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(@NotNull PlPgSqlParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_for_locking_clause}.
	 * @param ctx the parse tree
	 */
	void enterOpt_for_locking_clause(@NotNull PlPgSqlParser.Opt_for_locking_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_for_locking_clause}.
	 * @param ctx the parse tree
	 */
	void exitOpt_for_locking_clause(@NotNull PlPgSqlParser.Opt_for_locking_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#listenStmt}.
	 * @param ctx the parse tree
	 */
	void enterListenStmt(@NotNull PlPgSqlParser.ListenStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#listenStmt}.
	 * @param ctx the parse tree
	 */
	void exitListenStmt(@NotNull PlPgSqlParser.ListenStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#dropUserMappingStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropUserMappingStmt(@NotNull PlPgSqlParser.DropUserMappingStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#dropUserMappingStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropUserMappingStmt(@NotNull PlPgSqlParser.DropUserMappingStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#dropOpClassStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropOpClassStmt(@NotNull PlPgSqlParser.DropOpClassStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#dropOpClassStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropOpClassStmt(@NotNull PlPgSqlParser.DropOpClassStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#closePortalStmt}.
	 * @param ctx the parse tree
	 */
	void enterClosePortalStmt(@NotNull PlPgSqlParser.ClosePortalStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#closePortalStmt}.
	 * @param ctx the parse tree
	 */
	void exitClosePortalStmt(@NotNull PlPgSqlParser.ClosePortalStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#columnElem}.
	 * @param ctx the parse tree
	 */
	void enterColumnElem(@NotNull PlPgSqlParser.ColumnElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#columnElem}.
	 * @param ctx the parse tree
	 */
	void exitColumnElem(@NotNull PlPgSqlParser.ColumnElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#createfunc_opt_item}.
	 * @param ctx the parse tree
	 */
	void enterCreatefunc_opt_item(@NotNull PlPgSqlParser.Createfunc_opt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#createfunc_opt_item}.
	 * @param ctx the parse tree
	 */
	void exitCreatefunc_opt_item(@NotNull PlPgSqlParser.Createfunc_opt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#reindexStmt}.
	 * @param ctx the parse tree
	 */
	void enterReindexStmt(@NotNull PlPgSqlParser.ReindexStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#reindexStmt}.
	 * @param ctx the parse tree
	 */
	void exitReindexStmt(@NotNull PlPgSqlParser.ReindexStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#case_expr}.
	 * @param ctx the parse tree
	 */
	void enterCase_expr(@NotNull PlPgSqlParser.Case_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#case_expr}.
	 * @param ctx the parse tree
	 */
	void exitCase_expr(@NotNull PlPgSqlParser.Case_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alterFunctionStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterFunctionStmt(@NotNull PlPgSqlParser.AlterFunctionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alterFunctionStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterFunctionStmt(@NotNull PlPgSqlParser.AlterFunctionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#old_aggr_list}.
	 * @param ctx the parse tree
	 */
	void enterOld_aggr_list(@NotNull PlPgSqlParser.Old_aggr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#old_aggr_list}.
	 * @param ctx the parse tree
	 */
	void exitOld_aggr_list(@NotNull PlPgSqlParser.Old_aggr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#variableSetStmt}.
	 * @param ctx the parse tree
	 */
	void enterVariableSetStmt(@NotNull PlPgSqlParser.VariableSetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#variableSetStmt}.
	 * @param ctx the parse tree
	 */
	void exitVariableSetStmt(@NotNull PlPgSqlParser.VariableSetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#any_operator}.
	 * @param ctx the parse tree
	 */
	void enterAny_operator(@NotNull PlPgSqlParser.Any_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#any_operator}.
	 * @param ctx the parse tree
	 */
	void exitAny_operator(@NotNull PlPgSqlParser.Any_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#triggerOneEvent}.
	 * @param ctx the parse tree
	 */
	void enterTriggerOneEvent(@NotNull PlPgSqlParser.TriggerOneEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#triggerOneEvent}.
	 * @param ctx the parse tree
	 */
	void exitTriggerOneEvent(@NotNull PlPgSqlParser.TriggerOneEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#columnDef}.
	 * @param ctx the parse tree
	 */
	void enterColumnDef(@NotNull PlPgSqlParser.ColumnDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#columnDef}.
	 * @param ctx the parse tree
	 */
	void exitColumnDef(@NotNull PlPgSqlParser.ColumnDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#proc_stmt}.
	 * @param ctx the parse tree
	 */
	void enterProc_stmt(@NotNull PlPgSqlParser.Proc_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#proc_stmt}.
	 * @param ctx the parse tree
	 */
	void exitProc_stmt(@NotNull PlPgSqlParser.Proc_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#proc_conditions}.
	 * @param ctx the parse tree
	 */
	void enterProc_conditions(@NotNull PlPgSqlParser.Proc_conditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#proc_conditions}.
	 * @param ctx the parse tree
	 */
	void exitProc_conditions(@NotNull PlPgSqlParser.Proc_conditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#insert_column_list}.
	 * @param ctx the parse tree
	 */
	void enterInsert_column_list(@NotNull PlPgSqlParser.Insert_column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#insert_column_list}.
	 * @param ctx the parse tree
	 */
	void exitInsert_column_list(@NotNull PlPgSqlParser.Insert_column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#optSchemaEltList}.
	 * @param ctx the parse tree
	 */
	void enterOptSchemaEltList(@NotNull PlPgSqlParser.OptSchemaEltListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#optSchemaEltList}.
	 * @param ctx the parse tree
	 */
	void exitOptSchemaEltList(@NotNull PlPgSqlParser.OptSchemaEltListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#tableLikeOptionList}.
	 * @param ctx the parse tree
	 */
	void enterTableLikeOptionList(@NotNull PlPgSqlParser.TableLikeOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#tableLikeOptionList}.
	 * @param ctx the parse tree
	 */
	void exitTableLikeOptionList(@NotNull PlPgSqlParser.TableLikeOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#generic_option_list}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_option_list(@NotNull PlPgSqlParser.Generic_option_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#generic_option_list}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_option_list(@NotNull PlPgSqlParser.Generic_option_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#case_when_list}.
	 * @param ctx the parse tree
	 */
	void enterCase_when_list(@NotNull PlPgSqlParser.Case_when_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#case_when_list}.
	 * @param ctx the parse tree
	 */
	void exitCase_when_list(@NotNull PlPgSqlParser.Case_when_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#revokeStmt}.
	 * @param ctx the parse tree
	 */
	void enterRevokeStmt(@NotNull PlPgSqlParser.RevokeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#revokeStmt}.
	 * @param ctx the parse tree
	 */
	void exitRevokeStmt(@NotNull PlPgSqlParser.RevokeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#copyStmt}.
	 * @param ctx the parse tree
	 */
	void enterCopyStmt(@NotNull PlPgSqlParser.CopyStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#copyStmt}.
	 * @param ctx the parse tree
	 */
	void exitCopyStmt(@NotNull PlPgSqlParser.CopyStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#variableShowStmt}.
	 * @param ctx the parse tree
	 */
	void enterVariableShowStmt(@NotNull PlPgSqlParser.VariableShowStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#variableShowStmt}.
	 * @param ctx the parse tree
	 */
	void exitVariableShowStmt(@NotNull PlPgSqlParser.VariableShowStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#dropTableSpaceStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropTableSpaceStmt(@NotNull PlPgSqlParser.DropTableSpaceStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#dropTableSpaceStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropTableSpaceStmt(@NotNull PlPgSqlParser.DropTableSpaceStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#existingIndex}.
	 * @param ctx the parse tree
	 */
	void enterExistingIndex(@NotNull PlPgSqlParser.ExistingIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#existingIndex}.
	 * @param ctx the parse tree
	 */
	void exitExistingIndex(@NotNull PlPgSqlParser.ExistingIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#validator_clause}.
	 * @param ctx the parse tree
	 */
	void enterValidator_clause(@NotNull PlPgSqlParser.Validator_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#validator_clause}.
	 * @param ctx the parse tree
	 */
	void exitValidator_clause(@NotNull PlPgSqlParser.Validator_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_array_bounds}.
	 * @param ctx the parse tree
	 */
	void enterOpt_array_bounds(@NotNull PlPgSqlParser.Opt_array_boundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_array_bounds}.
	 * @param ctx the parse tree
	 */
	void exitOpt_array_bounds(@NotNull PlPgSqlParser.Opt_array_boundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#func_args_list}.
	 * @param ctx the parse tree
	 */
	void enterFunc_args_list(@NotNull PlPgSqlParser.Func_args_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#func_args_list}.
	 * @param ctx the parse tree
	 */
	void exitFunc_args_list(@NotNull PlPgSqlParser.Func_args_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#numeric}.
	 * @param ctx the parse tree
	 */
	void enterNumeric(@NotNull PlPgSqlParser.NumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#numeric}.
	 * @param ctx the parse tree
	 */
	void exitNumeric(@NotNull PlPgSqlParser.NumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_trusted}.
	 * @param ctx the parse tree
	 */
	void enterOpt_trusted(@NotNull PlPgSqlParser.Opt_trustedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_trusted}.
	 * @param ctx the parse tree
	 */
	void exitOpt_trusted(@NotNull PlPgSqlParser.Opt_trustedContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#stmt_exit}.
	 * @param ctx the parse tree
	 */
	void enterStmt_exit(@NotNull PlPgSqlParser.Stmt_exitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#stmt_exit}.
	 * @param ctx the parse tree
	 */
	void exitStmt_exit(@NotNull PlPgSqlParser.Stmt_exitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#xmlexists_argument}.
	 * @param ctx the parse tree
	 */
	void enterXmlexists_argument(@NotNull PlPgSqlParser.Xmlexists_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#xmlexists_argument}.
	 * @param ctx the parse tree
	 */
	void exitXmlexists_argument(@NotNull PlPgSqlParser.Xmlexists_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#schema_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSchema_stmt(@NotNull PlPgSqlParser.Schema_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#schema_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSchema_stmt(@NotNull PlPgSqlParser.Schema_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#qualified_name_list}.
	 * @param ctx the parse tree
	 */
	void enterQualified_name_list(@NotNull PlPgSqlParser.Qualified_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#qualified_name_list}.
	 * @param ctx the parse tree
	 */
	void exitQualified_name_list(@NotNull PlPgSqlParser.Qualified_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#copy_generic_opt_elem}.
	 * @param ctx the parse tree
	 */
	void enterCopy_generic_opt_elem(@NotNull PlPgSqlParser.Copy_generic_opt_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#copy_generic_opt_elem}.
	 * @param ctx the parse tree
	 */
	void exitCopy_generic_opt_elem(@NotNull PlPgSqlParser.Copy_generic_opt_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#createAssertStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateAssertStmt(@NotNull PlPgSqlParser.CreateAssertStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#createAssertStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateAssertStmt(@NotNull PlPgSqlParser.CreateAssertStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#iConst}.
	 * @param ctx the parse tree
	 */
	void enterIConst(@NotNull PlPgSqlParser.IConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#iConst}.
	 * @param ctx the parse tree
	 */
	void exitIConst(@NotNull PlPgSqlParser.IConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alter_generic_option_elem}.
	 * @param ctx the parse tree
	 */
	void enterAlter_generic_option_elem(@NotNull PlPgSqlParser.Alter_generic_option_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alter_generic_option_elem}.
	 * @param ctx the parse tree
	 */
	void exitAlter_generic_option_elem(@NotNull PlPgSqlParser.Alter_generic_option_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#columnOptions}.
	 * @param ctx the parse tree
	 */
	void enterColumnOptions(@NotNull PlPgSqlParser.ColumnOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#columnOptions}.
	 * @param ctx the parse tree
	 */
	void exitColumnOptions(@NotNull PlPgSqlParser.ColumnOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#decl_notnull}.
	 * @param ctx the parse tree
	 */
	void enterDecl_notnull(@NotNull PlPgSqlParser.Decl_notnullContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#decl_notnull}.
	 * @param ctx the parse tree
	 */
	void exitDecl_notnull(@NotNull PlPgSqlParser.Decl_notnullContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#ruleStmt}.
	 * @param ctx the parse tree
	 */
	void enterRuleStmt(@NotNull PlPgSqlParser.RuleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#ruleStmt}.
	 * @param ctx the parse tree
	 */
	void exitRuleStmt(@NotNull PlPgSqlParser.RuleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#set_rest_more}.
	 * @param ctx the parse tree
	 */
	void enterSet_rest_more(@NotNull PlPgSqlParser.Set_rest_moreContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#set_rest_more}.
	 * @param ctx the parse tree
	 */
	void exitSet_rest_more(@NotNull PlPgSqlParser.Set_rest_moreContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#explainableStmt}.
	 * @param ctx the parse tree
	 */
	void enterExplainableStmt(@NotNull PlPgSqlParser.ExplainableStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#explainableStmt}.
	 * @param ctx the parse tree
	 */
	void exitExplainableStmt(@NotNull PlPgSqlParser.ExplainableStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#expr_until_then}.
	 * @param ctx the parse tree
	 */
	void enterExpr_until_then(@NotNull PlPgSqlParser.Expr_until_thenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#expr_until_then}.
	 * @param ctx the parse tree
	 */
	void exitExpr_until_then(@NotNull PlPgSqlParser.Expr_until_thenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_semi}.
	 * @param ctx the parse tree
	 */
	void enterOpt_semi(@NotNull PlPgSqlParser.Opt_semiContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_semi}.
	 * @param ctx the parse tree
	 */
	void exitOpt_semi(@NotNull PlPgSqlParser.Opt_semiContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#document_or_content}.
	 * @param ctx the parse tree
	 */
	void enterDocument_or_content(@NotNull PlPgSqlParser.Document_or_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#document_or_content}.
	 * @param ctx the parse tree
	 */
	void exitDocument_or_content(@NotNull PlPgSqlParser.Document_or_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#createDomainStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateDomainStmt(@NotNull PlPgSqlParser.CreateDomainStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#createDomainStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateDomainStmt(@NotNull PlPgSqlParser.CreateDomainStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#window_definition}.
	 * @param ctx the parse tree
	 */
	void enterWindow_definition(@NotNull PlPgSqlParser.Window_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#window_definition}.
	 * @param ctx the parse tree
	 */
	void exitWindow_definition(@NotNull PlPgSqlParser.Window_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#select_offset_value2}.
	 * @param ctx the parse tree
	 */
	void enterSelect_offset_value2(@NotNull PlPgSqlParser.Select_offset_value2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#select_offset_value2}.
	 * @param ctx the parse tree
	 */
	void exitSelect_offset_value2(@NotNull PlPgSqlParser.Select_offset_value2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#set_target}.
	 * @param ctx the parse tree
	 */
	void enterSet_target(@NotNull PlPgSqlParser.Set_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#set_target}.
	 * @param ctx the parse tree
	 */
	void exitSet_target(@NotNull PlPgSqlParser.Set_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#for_locking_items}.
	 * @param ctx the parse tree
	 */
	void enterFor_locking_items(@NotNull PlPgSqlParser.For_locking_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#for_locking_items}.
	 * @param ctx the parse tree
	 */
	void exitFor_locking_items(@NotNull PlPgSqlParser.For_locking_itemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#reindex_type}.
	 * @param ctx the parse tree
	 */
	void enterReindex_type(@NotNull PlPgSqlParser.Reindex_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#reindex_type}.
	 * @param ctx the parse tree
	 */
	void exitReindex_type(@NotNull PlPgSqlParser.Reindex_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#reserved_keyword}.
	 * @param ctx the parse tree
	 */
	void enterReserved_keyword(@NotNull PlPgSqlParser.Reserved_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#reserved_keyword}.
	 * @param ctx the parse tree
	 */
	void exitReserved_keyword(@NotNull PlPgSqlParser.Reserved_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void enterOver_clause(@NotNull PlPgSqlParser.Over_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void exitOver_clause(@NotNull PlPgSqlParser.Over_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alterForeignTableStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterForeignTableStmt(@NotNull PlPgSqlParser.AlterForeignTableStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alterForeignTableStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterForeignTableStmt(@NotNull PlPgSqlParser.AlterForeignTableStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#columnList}.
	 * @param ctx the parse tree
	 */
	void enterColumnList(@NotNull PlPgSqlParser.ColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#columnList}.
	 * @param ctx the parse tree
	 */
	void exitColumnList(@NotNull PlPgSqlParser.ColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#copy_generic_opt_arg_list}.
	 * @param ctx the parse tree
	 */
	void enterCopy_generic_opt_arg_list(@NotNull PlPgSqlParser.Copy_generic_opt_arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#copy_generic_opt_arg_list}.
	 * @param ctx the parse tree
	 */
	void exitCopy_generic_opt_arg_list(@NotNull PlPgSqlParser.Copy_generic_opt_arg_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#for_variable}.
	 * @param ctx the parse tree
	 */
	void enterFor_variable(@NotNull PlPgSqlParser.For_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#for_variable}.
	 * @param ctx the parse tree
	 */
	void exitFor_variable(@NotNull PlPgSqlParser.For_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#revokeRoleStmt}.
	 * @param ctx the parse tree
	 */
	void enterRevokeRoleStmt(@NotNull PlPgSqlParser.RevokeRoleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#revokeRoleStmt}.
	 * @param ctx the parse tree
	 */
	void exitRevokeRoleStmt(@NotNull PlPgSqlParser.RevokeRoleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#create_extension_opt_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_extension_opt_item(@NotNull PlPgSqlParser.Create_extension_opt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#create_extension_opt_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_extension_opt_item(@NotNull PlPgSqlParser.Create_extension_opt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#triggerActionTime}.
	 * @param ctx the parse tree
	 */
	void enterTriggerActionTime(@NotNull PlPgSqlParser.TriggerActionTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#triggerActionTime}.
	 * @param ctx the parse tree
	 */
	void exitTriggerActionTime(@NotNull PlPgSqlParser.TriggerActionTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#select_limit_value}.
	 * @param ctx the parse tree
	 */
	void enterSelect_limit_value(@NotNull PlPgSqlParser.Select_limit_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#select_limit_value}.
	 * @param ctx the parse tree
	 */
	void exitSelect_limit_value(@NotNull PlPgSqlParser.Select_limit_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#createOpClassStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateOpClassStmt(@NotNull PlPgSqlParser.CreateOpClassStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#createOpClassStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateOpClassStmt(@NotNull PlPgSqlParser.CreateOpClassStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_index_name}.
	 * @param ctx the parse tree
	 */
	void enterOpt_index_name(@NotNull PlPgSqlParser.Opt_index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_index_name}.
	 * @param ctx the parse tree
	 */
	void exitOpt_index_name(@NotNull PlPgSqlParser.Opt_index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#constDatetime}.
	 * @param ctx the parse tree
	 */
	void enterConstDatetime(@NotNull PlPgSqlParser.ConstDatetimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#constDatetime}.
	 * @param ctx the parse tree
	 */
	void exitConstDatetime(@NotNull PlPgSqlParser.ConstDatetimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#type_list}.
	 * @param ctx the parse tree
	 */
	void enterType_list(@NotNull PlPgSqlParser.Type_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#type_list}.
	 * @param ctx the parse tree
	 */
	void exitType_list(@NotNull PlPgSqlParser.Type_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#createSeqStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateSeqStmt(@NotNull PlPgSqlParser.CreateSeqStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#createSeqStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateSeqStmt(@NotNull PlPgSqlParser.CreateSeqStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alterForeignServerStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterForeignServerStmt(@NotNull PlPgSqlParser.AlterForeignServerStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alterForeignServerStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterForeignServerStmt(@NotNull PlPgSqlParser.AlterForeignServerStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_unique}.
	 * @param ctx the parse tree
	 */
	void enterOpt_unique(@NotNull PlPgSqlParser.Opt_uniqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_unique}.
	 * @param ctx the parse tree
	 */
	void exitOpt_unique(@NotNull PlPgSqlParser.Opt_uniqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alter_table_cmd}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_cmd(@NotNull PlPgSqlParser.Alter_table_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alter_table_cmd}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_cmd(@NotNull PlPgSqlParser.Alter_table_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#select_limit}.
	 * @param ctx the parse tree
	 */
	void enterSelect_limit(@NotNull PlPgSqlParser.Select_limitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#select_limit}.
	 * @param ctx the parse tree
	 */
	void exitSelect_limit(@NotNull PlPgSqlParser.Select_limitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#zone_value}.
	 * @param ctx the parse tree
	 */
	void enterZone_value(@NotNull PlPgSqlParser.Zone_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#zone_value}.
	 * @param ctx the parse tree
	 */
	void exitZone_value(@NotNull PlPgSqlParser.Zone_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#columnref}.
	 * @param ctx the parse tree
	 */
	void enterColumnref(@NotNull PlPgSqlParser.ColumnrefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#columnref}.
	 * @param ctx the parse tree
	 */
	void exitColumnref(@NotNull PlPgSqlParser.ColumnrefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#def_arg}.
	 * @param ctx the parse tree
	 */
	void enterDef_arg(@NotNull PlPgSqlParser.Def_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#def_arg}.
	 * @param ctx the parse tree
	 */
	void exitDef_arg(@NotNull PlPgSqlParser.Def_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#index_params}.
	 * @param ctx the parse tree
	 */
	void enterIndex_params(@NotNull PlPgSqlParser.Index_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#index_params}.
	 * @param ctx the parse tree
	 */
	void exitIndex_params(@NotNull PlPgSqlParser.Index_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(@NotNull PlPgSqlParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(@NotNull PlPgSqlParser.CharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#colLabel}.
	 * @param ctx the parse tree
	 */
	void enterColLabel(@NotNull PlPgSqlParser.ColLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#colLabel}.
	 * @param ctx the parse tree
	 */
	void exitColLabel(@NotNull PlPgSqlParser.ColLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#dropForeignServerStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropForeignServerStmt(@NotNull PlPgSqlParser.DropForeignServerStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#dropForeignServerStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropForeignServerStmt(@NotNull PlPgSqlParser.DropForeignServerStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#constraintAttr}.
	 * @param ctx the parse tree
	 */
	void enterConstraintAttr(@NotNull PlPgSqlParser.ConstraintAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#constraintAttr}.
	 * @param ctx the parse tree
	 */
	void exitConstraintAttr(@NotNull PlPgSqlParser.ConstraintAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_timezone}.
	 * @param ctx the parse tree
	 */
	void enterOpt_timezone(@NotNull PlPgSqlParser.Opt_timezoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_timezone}.
	 * @param ctx the parse tree
	 */
	void exitOpt_timezone(@NotNull PlPgSqlParser.Opt_timezoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#typedtableElement}.
	 * @param ctx the parse tree
	 */
	void enterTypedtableElement(@NotNull PlPgSqlParser.TypedtableElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#typedtableElement}.
	 * @param ctx the parse tree
	 */
	void exitTypedtableElement(@NotNull PlPgSqlParser.TypedtableElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_partition_clause}.
	 * @param ctx the parse tree
	 */
	void enterOpt_partition_clause(@NotNull PlPgSqlParser.Opt_partition_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_partition_clause}.
	 * @param ctx the parse tree
	 */
	void exitOpt_partition_clause(@NotNull PlPgSqlParser.Opt_partition_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#foreach_slice}.
	 * @param ctx the parse tree
	 */
	void enterForeach_slice(@NotNull PlPgSqlParser.Foreach_sliceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#foreach_slice}.
	 * @param ctx the parse tree
	 */
	void exitForeach_slice(@NotNull PlPgSqlParser.Foreach_sliceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#ctext_row}.
	 * @param ctx the parse tree
	 */
	void enterCtext_row(@NotNull PlPgSqlParser.Ctext_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#ctext_row}.
	 * @param ctx the parse tree
	 */
	void exitCtext_row(@NotNull PlPgSqlParser.Ctext_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_check_option}.
	 * @param ctx the parse tree
	 */
	void enterOpt_check_option(@NotNull PlPgSqlParser.Opt_check_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_check_option}.
	 * @param ctx the parse tree
	 */
	void exitOpt_check_option(@NotNull PlPgSqlParser.Opt_check_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#exclusionConstraintList}.
	 * @param ctx the parse tree
	 */
	void enterExclusionConstraintList(@NotNull PlPgSqlParser.ExclusionConstraintListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#exclusionConstraintList}.
	 * @param ctx the parse tree
	 */
	void exitExclusionConstraintList(@NotNull PlPgSqlParser.ExclusionConstraintListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#for_control}.
	 * @param ctx the parse tree
	 */
	void enterFor_control(@NotNull PlPgSqlParser.For_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#for_control}.
	 * @param ctx the parse tree
	 */
	void exitFor_control(@NotNull PlPgSqlParser.For_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#removeOperStmt}.
	 * @param ctx the parse tree
	 */
	void enterRemoveOperStmt(@NotNull PlPgSqlParser.RemoveOperStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#removeOperStmt}.
	 * @param ctx the parse tree
	 */
	void exitRemoveOperStmt(@NotNull PlPgSqlParser.RemoveOperStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alterUserStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterUserStmt(@NotNull PlPgSqlParser.AlterUserStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alterUserStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterUserStmt(@NotNull PlPgSqlParser.AlterUserStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#stmt_dynexecute}.
	 * @param ctx the parse tree
	 */
	void enterStmt_dynexecute(@NotNull PlPgSqlParser.Stmt_dynexecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#stmt_dynexecute}.
	 * @param ctx the parse tree
	 */
	void exitStmt_dynexecute(@NotNull PlPgSqlParser.Stmt_dynexecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#decl_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDecl_stmt(@NotNull PlPgSqlParser.Decl_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#decl_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDecl_stmt(@NotNull PlPgSqlParser.Decl_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#optTableSpaceOwner}.
	 * @param ctx the parse tree
	 */
	void enterOptTableSpaceOwner(@NotNull PlPgSqlParser.OptTableSpaceOwnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#optTableSpaceOwner}.
	 * @param ctx the parse tree
	 */
	void exitOptTableSpaceOwner(@NotNull PlPgSqlParser.OptTableSpaceOwnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#triggerForOptEach}.
	 * @param ctx the parse tree
	 */
	void enterTriggerForOptEach(@NotNull PlPgSqlParser.TriggerForOptEachContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#triggerForOptEach}.
	 * @param ctx the parse tree
	 */
	void exitTriggerForOptEach(@NotNull PlPgSqlParser.TriggerForOptEachContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_inline_handler}.
	 * @param ctx the parse tree
	 */
	void enterOpt_inline_handler(@NotNull PlPgSqlParser.Opt_inline_handlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_inline_handler}.
	 * @param ctx the parse tree
	 */
	void exitOpt_inline_handler(@NotNull PlPgSqlParser.Opt_inline_handlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opclass_drop_list}.
	 * @param ctx the parse tree
	 */
	void enterOpclass_drop_list(@NotNull PlPgSqlParser.Opclass_drop_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opclass_drop_list}.
	 * @param ctx the parse tree
	 */
	void exitOpclass_drop_list(@NotNull PlPgSqlParser.Opclass_drop_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#from_list}.
	 * @param ctx the parse tree
	 */
	void enterFrom_list(@NotNull PlPgSqlParser.From_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#from_list}.
	 * @param ctx the parse tree
	 */
	void exitFrom_list(@NotNull PlPgSqlParser.From_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#func_name}.
	 * @param ctx the parse tree
	 */
	void enterFunc_name(@NotNull PlPgSqlParser.Func_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#func_name}.
	 * @param ctx the parse tree
	 */
	void exitFunc_name(@NotNull PlPgSqlParser.Func_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#expr_until_rightbracket}.
	 * @param ctx the parse tree
	 */
	void enterExpr_until_rightbracket(@NotNull PlPgSqlParser.Expr_until_rightbracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#expr_until_rightbracket}.
	 * @param ctx the parse tree
	 */
	void exitExpr_until_rightbracket(@NotNull PlPgSqlParser.Expr_until_rightbracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectStmt(@NotNull PlPgSqlParser.SelectStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectStmt(@NotNull PlPgSqlParser.SelectStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#simpletypename}.
	 * @param ctx the parse tree
	 */
	void enterSimpletypename(@NotNull PlPgSqlParser.SimpletypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#simpletypename}.
	 * @param ctx the parse tree
	 */
	void exitSimpletypename(@NotNull PlPgSqlParser.SimpletypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#key_action}.
	 * @param ctx the parse tree
	 */
	void enterKey_action(@NotNull PlPgSqlParser.Key_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#key_action}.
	 * @param ctx the parse tree
	 */
	void exitKey_action(@NotNull PlPgSqlParser.Key_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#security_label}.
	 * @param ctx the parse tree
	 */
	void enterSecurity_label(@NotNull PlPgSqlParser.Security_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#security_label}.
	 * @param ctx the parse tree
	 */
	void exitSecurity_label(@NotNull PlPgSqlParser.Security_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#stmt_foreach_a}.
	 * @param ctx the parse tree
	 */
	void enterStmt_foreach_a(@NotNull PlPgSqlParser.Stmt_foreach_aContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#stmt_foreach_a}.
	 * @param ctx the parse tree
	 */
	void exitStmt_foreach_a(@NotNull PlPgSqlParser.Stmt_foreach_aContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#triggerFuncArg}.
	 * @param ctx the parse tree
	 */
	void enterTriggerFuncArg(@NotNull PlPgSqlParser.TriggerFuncArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#triggerFuncArg}.
	 * @param ctx the parse tree
	 */
	void exitTriggerFuncArg(@NotNull PlPgSqlParser.TriggerFuncArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#def_list}.
	 * @param ctx the parse tree
	 */
	void enterDef_list(@NotNull PlPgSqlParser.Def_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#def_list}.
	 * @param ctx the parse tree
	 */
	void exitDef_list(@NotNull PlPgSqlParser.Def_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#dropTrigStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropTrigStmt(@NotNull PlPgSqlParser.DropTrigStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#dropTrigStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropTrigStmt(@NotNull PlPgSqlParser.DropTrigStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_table}.
	 * @param ctx the parse tree
	 */
	void enterOpt_table(@NotNull PlPgSqlParser.Opt_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_table}.
	 * @param ctx the parse tree
	 */
	void exitOpt_table(@NotNull PlPgSqlParser.Opt_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#generic_option_elem}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_option_elem(@NotNull PlPgSqlParser.Generic_option_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#generic_option_elem}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_option_elem(@NotNull PlPgSqlParser.Generic_option_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_frame_clause}.
	 * @param ctx the parse tree
	 */
	void enterOpt_frame_clause(@NotNull PlPgSqlParser.Opt_frame_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_frame_clause}.
	 * @param ctx the parse tree
	 */
	void exitOpt_frame_clause(@NotNull PlPgSqlParser.Opt_frame_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(@NotNull PlPgSqlParser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(@NotNull PlPgSqlParser.Expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opclass_drop}.
	 * @param ctx the parse tree
	 */
	void enterOpclass_drop(@NotNull PlPgSqlParser.Opclass_dropContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opclass_drop}.
	 * @param ctx the parse tree
	 */
	void exitOpclass_drop(@NotNull PlPgSqlParser.Opclass_dropContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#extract_list}.
	 * @param ctx the parse tree
	 */
	void enterExtract_list(@NotNull PlPgSqlParser.Extract_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#extract_list}.
	 * @param ctx the parse tree
	 */
	void exitExtract_list(@NotNull PlPgSqlParser.Extract_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#lockStmt}.
	 * @param ctx the parse tree
	 */
	void enterLockStmt(@NotNull PlPgSqlParser.LockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#lockStmt}.
	 * @param ctx the parse tree
	 */
	void exitLockStmt(@NotNull PlPgSqlParser.LockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_indirection}.
	 * @param ctx the parse tree
	 */
	void enterOpt_indirection(@NotNull PlPgSqlParser.Opt_indirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_indirection}.
	 * @param ctx the parse tree
	 */
	void exitOpt_indirection(@NotNull PlPgSqlParser.Opt_indirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#substr_list}.
	 * @param ctx the parse tree
	 */
	void enterSubstr_list(@NotNull PlPgSqlParser.Substr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#substr_list}.
	 * @param ctx the parse tree
	 */
	void exitSubstr_list(@NotNull PlPgSqlParser.Substr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#key_match}.
	 * @param ctx the parse tree
	 */
	void enterKey_match(@NotNull PlPgSqlParser.Key_matchContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#key_match}.
	 * @param ctx the parse tree
	 */
	void exitKey_match(@NotNull PlPgSqlParser.Key_matchContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#viewStmt}.
	 * @param ctx the parse tree
	 */
	void enterViewStmt(@NotNull PlPgSqlParser.ViewStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#viewStmt}.
	 * @param ctx the parse tree
	 */
	void exitViewStmt(@NotNull PlPgSqlParser.ViewStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#loop_body}.
	 * @param ctx the parse tree
	 */
	void enterLoop_body(@NotNull PlPgSqlParser.Loop_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#loop_body}.
	 * @param ctx the parse tree
	 */
	void exitLoop_body(@NotNull PlPgSqlParser.Loop_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_from_in}.
	 * @param ctx the parse tree
	 */
	void enterOpt_from_in(@NotNull PlPgSqlParser.Opt_from_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_from_in}.
	 * @param ctx the parse tree
	 */
	void exitOpt_from_in(@NotNull PlPgSqlParser.Opt_from_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#vacuum_option_list}.
	 * @param ctx the parse tree
	 */
	void enterVacuum_option_list(@NotNull PlPgSqlParser.Vacuum_option_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#vacuum_option_list}.
	 * @param ctx the parse tree
	 */
	void exitVacuum_option_list(@NotNull PlPgSqlParser.Vacuum_option_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#variableResetStmt}.
	 * @param ctx the parse tree
	 */
	void enterVariableResetStmt(@NotNull PlPgSqlParser.VariableResetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#variableResetStmt}.
	 * @param ctx the parse tree
	 */
	void exitVariableResetStmt(@NotNull PlPgSqlParser.VariableResetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#iso_level}.
	 * @param ctx the parse tree
	 */
	void enterIso_level(@NotNull PlPgSqlParser.Iso_levelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#iso_level}.
	 * @param ctx the parse tree
	 */
	void exitIso_level(@NotNull PlPgSqlParser.Iso_levelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#explain_option_arg}.
	 * @param ctx the parse tree
	 */
	void enterExplain_option_arg(@NotNull PlPgSqlParser.Explain_option_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#explain_option_arg}.
	 * @param ctx the parse tree
	 */
	void exitExplain_option_arg(@NotNull PlPgSqlParser.Explain_option_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#notify_payload}.
	 * @param ctx the parse tree
	 */
	void enterNotify_payload(@NotNull PlPgSqlParser.Notify_payloadContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#notify_payload}.
	 * @param ctx the parse tree
	 */
	void exitNotify_payload(@NotNull PlPgSqlParser.Notify_payloadContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_binary}.
	 * @param ctx the parse tree
	 */
	void enterOpt_binary(@NotNull PlPgSqlParser.Opt_binaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_binary}.
	 * @param ctx the parse tree
	 */
	void exitOpt_binary(@NotNull PlPgSqlParser.Opt_binaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void enterInto_clause(@NotNull PlPgSqlParser.Into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void exitInto_clause(@NotNull PlPgSqlParser.Into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#sConst}.
	 * @param ctx the parse tree
	 */
	void enterSConst(@NotNull PlPgSqlParser.SConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#sConst}.
	 * @param ctx the parse tree
	 */
	void exitSConst(@NotNull PlPgSqlParser.SConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_provider}.
	 * @param ctx the parse tree
	 */
	void enterOpt_provider(@NotNull PlPgSqlParser.Opt_providerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_provider}.
	 * @param ctx the parse tree
	 */
	void exitOpt_provider(@NotNull PlPgSqlParser.Opt_providerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#setResetClause}.
	 * @param ctx the parse tree
	 */
	void enterSetResetClause(@NotNull PlPgSqlParser.SetResetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#setResetClause}.
	 * @param ctx the parse tree
	 */
	void exitSetResetClause(@NotNull PlPgSqlParser.SetResetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#createCastStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateCastStmt(@NotNull PlPgSqlParser.CreateCastStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#createCastStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateCastStmt(@NotNull PlPgSqlParser.CreateCastStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#triggerWhen}.
	 * @param ctx the parse tree
	 */
	void enterTriggerWhen(@NotNull PlPgSqlParser.TriggerWhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#triggerWhen}.
	 * @param ctx the parse tree
	 */
	void exitTriggerWhen(@NotNull PlPgSqlParser.TriggerWhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(@NotNull PlPgSqlParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(@NotNull PlPgSqlParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#window_clause}.
	 * @param ctx the parse tree
	 */
	void enterWindow_clause(@NotNull PlPgSqlParser.Window_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#window_clause}.
	 * @param ctx the parse tree
	 */
	void exitWindow_clause(@NotNull PlPgSqlParser.Window_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_interval}.
	 * @param ctx the parse tree
	 */
	void enterOpt_interval(@NotNull PlPgSqlParser.Opt_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_interval}.
	 * @param ctx the parse tree
	 */
	void exitOpt_interval(@NotNull PlPgSqlParser.Opt_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_foreign_server_version}.
	 * @param ctx the parse tree
	 */
	void enterOpt_foreign_server_version(@NotNull PlPgSqlParser.Opt_foreign_server_versionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_foreign_server_version}.
	 * @param ctx the parse tree
	 */
	void exitOpt_foreign_server_version(@NotNull PlPgSqlParser.Opt_foreign_server_versionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#typedtableElementList}.
	 * @param ctx the parse tree
	 */
	void enterTypedtableElementList(@NotNull PlPgSqlParser.TypedtableElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#typedtableElementList}.
	 * @param ctx the parse tree
	 */
	void exitTypedtableElementList(@NotNull PlPgSqlParser.TypedtableElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#createTrigStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateTrigStmt(@NotNull PlPgSqlParser.CreateTrigStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#createTrigStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateTrigStmt(@NotNull PlPgSqlParser.CreateTrigStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#any_name_list}.
	 * @param ctx the parse tree
	 */
	void enterAny_name_list(@NotNull PlPgSqlParser.Any_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#any_name_list}.
	 * @param ctx the parse tree
	 */
	void exitAny_name_list(@NotNull PlPgSqlParser.Any_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#generic_option_arg}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_option_arg(@NotNull PlPgSqlParser.Generic_option_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#generic_option_arg}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_option_arg(@NotNull PlPgSqlParser.Generic_option_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alterGroupStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterGroupStmt(@NotNull PlPgSqlParser.AlterGroupStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alterGroupStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterGroupStmt(@NotNull PlPgSqlParser.AlterGroupStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#triggerEvents}.
	 * @param ctx the parse tree
	 */
	void enterTriggerEvents(@NotNull PlPgSqlParser.TriggerEventsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#triggerEvents}.
	 * @param ctx the parse tree
	 */
	void exitTriggerEvents(@NotNull PlPgSqlParser.TriggerEventsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#common_table_expr}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expr(@NotNull PlPgSqlParser.Common_table_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#common_table_expr}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expr(@NotNull PlPgSqlParser.Common_table_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#stmt_open}.
	 * @param ctx the parse tree
	 */
	void enterStmt_open(@NotNull PlPgSqlParser.Stmt_openContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#stmt_open}.
	 * @param ctx the parse tree
	 */
	void exitStmt_open(@NotNull PlPgSqlParser.Stmt_openContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#defineStmt}.
	 * @param ctx the parse tree
	 */
	void enterDefineStmt(@NotNull PlPgSqlParser.DefineStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#defineStmt}.
	 * @param ctx the parse tree
	 */
	void exitDefineStmt(@NotNull PlPgSqlParser.DefineStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#createOpFamilyStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateOpFamilyStmt(@NotNull PlPgSqlParser.CreateOpFamilyStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#createOpFamilyStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateOpFamilyStmt(@NotNull PlPgSqlParser.CreateOpFamilyStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#c_expr}.
	 * @param ctx the parse tree
	 */
	void enterC_expr(@NotNull PlPgSqlParser.C_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#c_expr}.
	 * @param ctx the parse tree
	 */
	void exitC_expr(@NotNull PlPgSqlParser.C_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#file_name}.
	 * @param ctx the parse tree
	 */
	void enterFile_name(@NotNull PlPgSqlParser.File_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#file_name}.
	 * @param ctx the parse tree
	 */
	void exitFile_name(@NotNull PlPgSqlParser.File_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#constraintAttributeElem}.
	 * @param ctx the parse tree
	 */
	void enterConstraintAttributeElem(@NotNull PlPgSqlParser.ConstraintAttributeElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#constraintAttributeElem}.
	 * @param ctx the parse tree
	 */
	void exitConstraintAttributeElem(@NotNull PlPgSqlParser.ConstraintAttributeElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alterdb_opt_item}.
	 * @param ctx the parse tree
	 */
	void enterAlterdb_opt_item(@NotNull PlPgSqlParser.Alterdb_opt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alterdb_opt_item}.
	 * @param ctx the parse tree
	 */
	void exitAlterdb_opt_item(@NotNull PlPgSqlParser.Alterdb_opt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#proc_condition}.
	 * @param ctx the parse tree
	 */
	void enterProc_condition(@NotNull PlPgSqlParser.Proc_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#proc_condition}.
	 * @param ctx the parse tree
	 */
	void exitProc_condition(@NotNull PlPgSqlParser.Proc_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#select_offset_value}.
	 * @param ctx the parse tree
	 */
	void enterSelect_offset_value(@NotNull PlPgSqlParser.Select_offset_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#select_offset_value}.
	 * @param ctx the parse tree
	 */
	void exitSelect_offset_value(@NotNull PlPgSqlParser.Select_offset_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alterDatabaseStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterDatabaseStmt(@NotNull PlPgSqlParser.AlterDatabaseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alterDatabaseStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterDatabaseStmt(@NotNull PlPgSqlParser.AlterDatabaseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#executeStmt}.
	 * @param ctx the parse tree
	 */
	void enterExecuteStmt(@NotNull PlPgSqlParser.ExecuteStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#executeStmt}.
	 * @param ctx the parse tree
	 */
	void exitExecuteStmt(@NotNull PlPgSqlParser.ExecuteStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#exclusionconstraintElem}.
	 * @param ctx the parse tree
	 */
	void enterExclusionconstraintElem(@NotNull PlPgSqlParser.ExclusionconstraintElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#exclusionconstraintElem}.
	 * @param ctx the parse tree
	 */
	void exitExclusionconstraintElem(@NotNull PlPgSqlParser.ExclusionconstraintElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opclass_item_list}.
	 * @param ctx the parse tree
	 */
	void enterOpclass_item_list(@NotNull PlPgSqlParser.Opclass_item_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opclass_item_list}.
	 * @param ctx the parse tree
	 */
	void exitOpclass_item_list(@NotNull PlPgSqlParser.Opclass_item_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#decl_collate}.
	 * @param ctx the parse tree
	 */
	void enterDecl_collate(@NotNull PlPgSqlParser.Decl_collateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#decl_collate}.
	 * @param ctx the parse tree
	 */
	void exitDecl_collate(@NotNull PlPgSqlParser.Decl_collateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#extract_arg}.
	 * @param ctx the parse tree
	 */
	void enterExtract_arg(@NotNull PlPgSqlParser.Extract_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#extract_arg}.
	 * @param ctx the parse tree
	 */
	void exitExtract_arg(@NotNull PlPgSqlParser.Extract_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alter_column_default}.
	 * @param ctx the parse tree
	 */
	void enterAlter_column_default(@NotNull PlPgSqlParser.Alter_column_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alter_column_default}.
	 * @param ctx the parse tree
	 */
	void exitAlter_column_default(@NotNull PlPgSqlParser.Alter_column_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#createUserStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateUserStmt(@NotNull PlPgSqlParser.CreateUserStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#createUserStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateUserStmt(@NotNull PlPgSqlParser.CreateUserStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#decl_statement}.
	 * @param ctx the parse tree
	 */
	void enterDecl_statement(@NotNull PlPgSqlParser.Decl_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#decl_statement}.
	 * @param ctx the parse tree
	 */
	void exitDecl_statement(@NotNull PlPgSqlParser.Decl_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#copy_from}.
	 * @param ctx the parse tree
	 */
	void enterCopy_from(@NotNull PlPgSqlParser.Copy_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#copy_from}.
	 * @param ctx the parse tree
	 */
	void exitCopy_from(@NotNull PlPgSqlParser.Copy_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#opt_varying}.
	 * @param ctx the parse tree
	 */
	void enterOpt_varying(@NotNull PlPgSqlParser.Opt_varyingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#opt_varying}.
	 * @param ctx the parse tree
	 */
	void exitOpt_varying(@NotNull PlPgSqlParser.Opt_varyingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#preparableStmt}.
	 * @param ctx the parse tree
	 */
	void enterPreparableStmt(@NotNull PlPgSqlParser.PreparableStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#preparableStmt}.
	 * @param ctx the parse tree
	 */
	void exitPreparableStmt(@NotNull PlPgSqlParser.PreparableStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#stmt_loop}.
	 * @param ctx the parse tree
	 */
	void enterStmt_loop(@NotNull PlPgSqlParser.Stmt_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#stmt_loop}.
	 * @param ctx the parse tree
	 */
	void exitStmt_loop(@NotNull PlPgSqlParser.Stmt_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#decl_cursor_query}.
	 * @param ctx the parse tree
	 */
	void enterDecl_cursor_query(@NotNull PlPgSqlParser.Decl_cursor_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#decl_cursor_query}.
	 * @param ctx the parse tree
	 */
	void exitDecl_cursor_query(@NotNull PlPgSqlParser.Decl_cursor_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(@NotNull PlPgSqlParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(@NotNull PlPgSqlParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#set_target_list}.
	 * @param ctx the parse tree
	 */
	void enterSet_target_list(@NotNull PlPgSqlParser.Set_target_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#set_target_list}.
	 * @param ctx the parse tree
	 */
	void exitSet_target_list(@NotNull PlPgSqlParser.Set_target_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#vacuum_option_elem}.
	 * @param ctx the parse tree
	 */
	void enterVacuum_option_elem(@NotNull PlPgSqlParser.Vacuum_option_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#vacuum_option_elem}.
	 * @param ctx the parse tree
	 */
	void exitVacuum_option_elem(@NotNull PlPgSqlParser.Vacuum_option_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#stmt_while}.
	 * @param ctx the parse tree
	 */
	void enterStmt_while(@NotNull PlPgSqlParser.Stmt_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#stmt_while}.
	 * @param ctx the parse tree
	 */
	void exitStmt_while(@NotNull PlPgSqlParser.Stmt_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#getdiag_area_opt}.
	 * @param ctx the parse tree
	 */
	void enterGetdiag_area_opt(@NotNull PlPgSqlParser.Getdiag_area_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#getdiag_area_opt}.
	 * @param ctx the parse tree
	 */
	void exitGetdiag_area_opt(@NotNull PlPgSqlParser.Getdiag_area_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#execute_param_clause}.
	 * @param ctx the parse tree
	 */
	void enterExecute_param_clause(@NotNull PlPgSqlParser.Execute_param_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#execute_param_clause}.
	 * @param ctx the parse tree
	 */
	void exitExecute_param_clause(@NotNull PlPgSqlParser.Execute_param_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#alterOptRoleElem}.
	 * @param ctx the parse tree
	 */
	void enterAlterOptRoleElem(@NotNull PlPgSqlParser.AlterOptRoleElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#alterOptRoleElem}.
	 * @param ctx the parse tree
	 */
	void exitAlterOptRoleElem(@NotNull PlPgSqlParser.AlterOptRoleElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#consttypename}.
	 * @param ctx the parse tree
	 */
	void enterConsttypename(@NotNull PlPgSqlParser.ConsttypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#consttypename}.
	 * @param ctx the parse tree
	 */
	void exitConsttypename(@NotNull PlPgSqlParser.ConsttypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#copy_opt_list}.
	 * @param ctx the parse tree
	 */
	void enterCopy_opt_list(@NotNull PlPgSqlParser.Copy_opt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#copy_opt_list}.
	 * @param ctx the parse tree
	 */
	void exitCopy_opt_list(@NotNull PlPgSqlParser.Copy_opt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#proc_exceptions}.
	 * @param ctx the parse tree
	 */
	void enterProc_exceptions(@NotNull PlPgSqlParser.Proc_exceptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#proc_exceptions}.
	 * @param ctx the parse tree
	 */
	void exitProc_exceptions(@NotNull PlPgSqlParser.Proc_exceptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#loadStmt}.
	 * @param ctx the parse tree
	 */
	void enterLoadStmt(@NotNull PlPgSqlParser.LoadStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#loadStmt}.
	 * @param ctx the parse tree
	 */
	void exitLoadStmt(@NotNull PlPgSqlParser.LoadStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#qual_Op}.
	 * @param ctx the parse tree
	 */
	void enterQual_Op(@NotNull PlPgSqlParser.Qual_OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#qual_Op}.
	 * @param ctx the parse tree
	 */
	void exitQual_Op(@NotNull PlPgSqlParser.Qual_OpContext ctx);
}