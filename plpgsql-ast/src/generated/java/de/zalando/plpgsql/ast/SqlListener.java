// Generated from de/zalando/plpgsql/ast/Sql.g4 by ANTLR 4.2.3-SNAPSHOT
package de.zalando.plpgsql.ast;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlParser}.
 */
public interface SqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterExtensionContentsStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterExtensionContentsStmt(@NotNull SqlParser.AlterExtensionContentsStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterExtensionContentsStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterExtensionContentsStmt(@NotNull SqlParser.AlterExtensionContentsStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select_no_parens}.
	 * @param ctx the parse tree
	 */
	void enterSelect_no_parens(@NotNull SqlParser.Select_no_parensContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_no_parens}.
	 * @param ctx the parse tree
	 */
	void exitSelect_no_parens(@NotNull SqlParser.Select_no_parensContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#privileges}.
	 * @param ctx the parse tree
	 */
	void enterPrivileges(@NotNull SqlParser.PrivilegesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#privileges}.
	 * @param ctx the parse tree
	 */
	void exitPrivileges(@NotNull SqlParser.PrivilegesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#ruleActionStmtOrEmpty}.
	 * @param ctx the parse tree
	 */
	void enterRuleActionStmtOrEmpty(@NotNull SqlParser.RuleActionStmtOrEmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#ruleActionStmtOrEmpty}.
	 * @param ctx the parse tree
	 */
	void exitRuleActionStmtOrEmpty(@NotNull SqlParser.RuleActionStmtOrEmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(@NotNull SqlParser.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(@NotNull SqlParser.EventContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_instead}.
	 * @param ctx the parse tree
	 */
	void enterOpt_instead(@NotNull SqlParser.Opt_insteadContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_instead}.
	 * @param ctx the parse tree
	 */
	void exitOpt_instead(@NotNull SqlParser.Opt_insteadContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dropFdwStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropFdwStmt(@NotNull SqlParser.DropFdwStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dropFdwStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropFdwStmt(@NotNull SqlParser.DropFdwStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_as}.
	 * @param ctx the parse tree
	 */
	void enterOpt_as(@NotNull SqlParser.Opt_asContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_as}.
	 * @param ctx the parse tree
	 */
	void exitOpt_as(@NotNull SqlParser.Opt_asContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#access_method}.
	 * @param ctx the parse tree
	 */
	void enterAccess_method(@NotNull SqlParser.Access_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#access_method}.
	 * @param ctx the parse tree
	 */
	void exitAccess_method(@NotNull SqlParser.Access_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#optforeigntableElementList}.
	 * @param ctx the parse tree
	 */
	void enterOptforeigntableElementList(@NotNull SqlParser.OptforeigntableElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#optforeigntableElementList}.
	 * @param ctx the parse tree
	 */
	void exitOptforeigntableElementList(@NotNull SqlParser.OptforeigntableElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#array_expr_list}.
	 * @param ctx the parse tree
	 */
	void enterArray_expr_list(@NotNull SqlParser.Array_expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#array_expr_list}.
	 * @param ctx the parse tree
	 */
	void exitArray_expr_list(@NotNull SqlParser.Array_expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterfunc_opt_list}.
	 * @param ctx the parse tree
	 */
	void enterAlterfunc_opt_list(@NotNull SqlParser.Alterfunc_opt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterfunc_opt_list}.
	 * @param ctx the parse tree
	 */
	void exitAlterfunc_opt_list(@NotNull SqlParser.Alterfunc_opt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#frame_extent}.
	 * @param ctx the parse tree
	 */
	void enterFrame_extent(@NotNull SqlParser.Frame_extentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#frame_extent}.
	 * @param ctx the parse tree
	 */
	void exitFrame_extent(@NotNull SqlParser.Frame_extentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#characterWithoutLength}.
	 * @param ctx the parse tree
	 */
	void enterCharacterWithoutLength(@NotNull SqlParser.CharacterWithoutLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#characterWithoutLength}.
	 * @param ctx the parse tree
	 */
	void exitCharacterWithoutLength(@NotNull SqlParser.CharacterWithoutLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#transaction_mode_item}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_mode_item(@NotNull SqlParser.Transaction_mode_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#transaction_mode_item}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_mode_item(@NotNull SqlParser.Transaction_mode_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#vacuumStmt}.
	 * @param ctx the parse tree
	 */
	void enterVacuumStmt(@NotNull SqlParser.VacuumStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#vacuumStmt}.
	 * @param ctx the parse tree
	 */
	void exitVacuumStmt(@NotNull SqlParser.VacuumStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_fdw_options}.
	 * @param ctx the parse tree
	 */
	void enterOpt_fdw_options(@NotNull SqlParser.Opt_fdw_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_fdw_options}.
	 * @param ctx the parse tree
	 */
	void exitOpt_fdw_options(@NotNull SqlParser.Opt_fdw_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opttypedtableElementList}.
	 * @param ctx the parse tree
	 */
	void enterOpttypedtableElementList(@NotNull SqlParser.OpttypedtableElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opttypedtableElementList}.
	 * @param ctx the parse tree
	 */
	void exitOpttypedtableElementList(@NotNull SqlParser.OpttypedtableElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#bit}.
	 * @param ctx the parse tree
	 */
	void enterBit(@NotNull SqlParser.BitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#bit}.
	 * @param ctx the parse tree
	 */
	void exitBit(@NotNull SqlParser.BitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(@NotNull SqlParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(@NotNull SqlParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#limit_clause}.
	 * @param ctx the parse tree
	 */
	void enterLimit_clause(@NotNull SqlParser.Limit_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#limit_clause}.
	 * @param ctx the parse tree
	 */
	void exitLimit_clause(@NotNull SqlParser.Limit_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#discardStmt}.
	 * @param ctx the parse tree
	 */
	void enterDiscardStmt(@NotNull SqlParser.DiscardStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#discardStmt}.
	 * @param ctx the parse tree
	 */
	void exitDiscardStmt(@NotNull SqlParser.DiscardStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#constraintsSetStmt}.
	 * @param ctx the parse tree
	 */
	void enterConstraintsSetStmt(@NotNull SqlParser.ConstraintsSetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#constraintsSetStmt}.
	 * @param ctx the parse tree
	 */
	void exitConstraintsSetStmt(@NotNull SqlParser.ConstraintsSetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_select_limit}.
	 * @param ctx the parse tree
	 */
	void enterOpt_select_limit(@NotNull SqlParser.Opt_select_limitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_select_limit}.
	 * @param ctx the parse tree
	 */
	void exitOpt_select_limit(@NotNull SqlParser.Opt_select_limitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#constInterval}.
	 * @param ctx the parse tree
	 */
	void enterConstInterval(@NotNull SqlParser.ConstIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#constInterval}.
	 * @param ctx the parse tree
	 */
	void exitConstInterval(@NotNull SqlParser.ConstIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#copy_generic_opt_arg}.
	 * @param ctx the parse tree
	 */
	void enterCopy_generic_opt_arg(@NotNull SqlParser.Copy_generic_opt_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#copy_generic_opt_arg}.
	 * @param ctx the parse tree
	 */
	void exitCopy_generic_opt_arg(@NotNull SqlParser.Copy_generic_opt_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_type}.
	 * @param ctx the parse tree
	 */
	void enterDrop_type(@NotNull SqlParser.Drop_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_type}.
	 * @param ctx the parse tree
	 */
	void exitDrop_type(@NotNull SqlParser.Drop_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#explainStmt}.
	 * @param ctx the parse tree
	 */
	void enterExplainStmt(@NotNull SqlParser.ExplainStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#explainStmt}.
	 * @param ctx the parse tree
	 */
	void exitExplainStmt(@NotNull SqlParser.ExplainStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#optseqOptList}.
	 * @param ctx the parse tree
	 */
	void enterOptseqOptList(@NotNull SqlParser.OptseqOptListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#optseqOptList}.
	 * @param ctx the parse tree
	 */
	void exitOptseqOptList(@NotNull SqlParser.OptseqOptListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#reassignOwnedStmt}.
	 * @param ctx the parse tree
	 */
	void enterReassignOwnedStmt(@NotNull SqlParser.ReassignOwnedStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#reassignOwnedStmt}.
	 * @param ctx the parse tree
	 */
	void exitReassignOwnedStmt(@NotNull SqlParser.ReassignOwnedStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#foreigntableElementList}.
	 * @param ctx the parse tree
	 */
	void enterForeigntableElementList(@NotNull SqlParser.ForeigntableElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#foreigntableElementList}.
	 * @param ctx the parse tree
	 */
	void exitForeigntableElementList(@NotNull SqlParser.ForeigntableElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#tableLikeClause}.
	 * @param ctx the parse tree
	 */
	void enterTableLikeClause(@NotNull SqlParser.TableLikeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#tableLikeClause}.
	 * @param ctx the parse tree
	 */
	void exitTableLikeClause(@NotNull SqlParser.TableLikeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#old_aggr_definition}.
	 * @param ctx the parse tree
	 */
	void enterOld_aggr_definition(@NotNull SqlParser.Old_aggr_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#old_aggr_definition}.
	 * @param ctx the parse tree
	 */
	void exitOld_aggr_definition(@NotNull SqlParser.Old_aggr_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#where_or_current_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_or_current_clause(@NotNull SqlParser.Where_or_current_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#where_or_current_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_or_current_clause(@NotNull SqlParser.Where_or_current_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_by}.
	 * @param ctx the parse tree
	 */
	void enterOpt_by(@NotNull SqlParser.Opt_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_by}.
	 * @param ctx the parse tree
	 */
	void exitOpt_by(@NotNull SqlParser.Opt_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#ctext_expr}.
	 * @param ctx the parse tree
	 */
	void enterCtext_expr(@NotNull SqlParser.Ctext_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#ctext_expr}.
	 * @param ctx the parse tree
	 */
	void exitCtext_expr(@NotNull SqlParser.Ctext_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#func_arg}.
	 * @param ctx the parse tree
	 */
	void enterFunc_arg(@NotNull SqlParser.Func_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#func_arg}.
	 * @param ctx the parse tree
	 */
	void exitFunc_arg(@NotNull SqlParser.Func_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#window_specification}.
	 * @param ctx the parse tree
	 */
	void enterWindow_specification(@NotNull SqlParser.Window_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#window_specification}.
	 * @param ctx the parse tree
	 */
	void exitWindow_specification(@NotNull SqlParser.Window_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#optTableSpace}.
	 * @param ctx the parse tree
	 */
	void enterOptTableSpace(@NotNull SqlParser.OptTableSpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#optTableSpace}.
	 * @param ctx the parse tree
	 */
	void exitOptTableSpace(@NotNull SqlParser.OptTableSpaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_nulls_order}.
	 * @param ctx the parse tree
	 */
	void enterOpt_nulls_order(@NotNull SqlParser.Opt_nulls_orderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_nulls_order}.
	 * @param ctx the parse tree
	 */
	void exitOpt_nulls_order(@NotNull SqlParser.Opt_nulls_orderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#in_expr}.
	 * @param ctx the parse tree
	 */
	void enterIn_expr(@NotNull SqlParser.In_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#in_expr}.
	 * @param ctx the parse tree
	 */
	void exitIn_expr(@NotNull SqlParser.In_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void enterHaving_clause(@NotNull SqlParser.Having_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void exitHaving_clause(@NotNull SqlParser.Having_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dropdbStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropdbStmt(@NotNull SqlParser.DropdbStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dropdbStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropdbStmt(@NotNull SqlParser.DropdbStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#characterWithLength}.
	 * @param ctx the parse tree
	 */
	void enterCharacterWithLength(@NotNull SqlParser.CharacterWithLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#characterWithLength}.
	 * @param ctx the parse tree
	 */
	void exitCharacterWithLength(@NotNull SqlParser.CharacterWithLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#analyzeStmt}.
	 * @param ctx the parse tree
	 */
	void enterAnalyzeStmt(@NotNull SqlParser.AnalyzeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#analyzeStmt}.
	 * @param ctx the parse tree
	 */
	void exitAnalyzeStmt(@NotNull SqlParser.AnalyzeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_distinct}.
	 * @param ctx the parse tree
	 */
	void enterOpt_distinct(@NotNull SqlParser.Opt_distinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_distinct}.
	 * @param ctx the parse tree
	 */
	void exitOpt_distinct(@NotNull SqlParser.Opt_distinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_using}.
	 * @param ctx the parse tree
	 */
	void enterAlter_using(@NotNull SqlParser.Alter_usingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_using}.
	 * @param ctx the parse tree
	 */
	void exitAlter_using(@NotNull SqlParser.Alter_usingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_generic_options}.
	 * @param ctx the parse tree
	 */
	void enterAlter_generic_options(@NotNull SqlParser.Alter_generic_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_generic_options}.
	 * @param ctx the parse tree
	 */
	void exitAlter_generic_options(@NotNull SqlParser.Alter_generic_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#colconstraintElem}.
	 * @param ctx the parse tree
	 */
	void enterColconstraintElem(@NotNull SqlParser.ColconstraintElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#colconstraintElem}.
	 * @param ctx the parse tree
	 */
	void exitColconstraintElem(@NotNull SqlParser.ColconstraintElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterEnumStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterEnumStmt(@NotNull SqlParser.AlterEnumStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterEnumStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterEnumStmt(@NotNull SqlParser.AlterEnumStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_xml_root_standalone}.
	 * @param ctx the parse tree
	 */
	void enterOpt_xml_root_standalone(@NotNull SqlParser.Opt_xml_root_standaloneContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_xml_root_standalone}.
	 * @param ctx the parse tree
	 */
	void exitOpt_xml_root_standalone(@NotNull SqlParser.Opt_xml_root_standaloneContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#defACLOptionList}.
	 * @param ctx the parse tree
	 */
	void enterDefACLOptionList(@NotNull SqlParser.DefACLOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#defACLOptionList}.
	 * @param ctx the parse tree
	 */
	void exitDefACLOptionList(@NotNull SqlParser.DefACLOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#privilege_target}.
	 * @param ctx the parse tree
	 */
	void enterPrivilege_target(@NotNull SqlParser.Privilege_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#privilege_target}.
	 * @param ctx the parse tree
	 */
	void exitPrivilege_target(@NotNull SqlParser.Privilege_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void enterUsing_clause(@NotNull SqlParser.Using_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void exitUsing_clause(@NotNull SqlParser.Using_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#deallocateStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeallocateStmt(@NotNull SqlParser.DeallocateStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#deallocateStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeallocateStmt(@NotNull SqlParser.DeallocateStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#triggerForType}.
	 * @param ctx the parse tree
	 */
	void enterTriggerForType(@NotNull SqlParser.TriggerForTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#triggerForType}.
	 * @param ctx the parse tree
	 */
	void exitTriggerForType(@NotNull SqlParser.TriggerForTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#key_update}.
	 * @param ctx the parse tree
	 */
	void enterKey_update(@NotNull SqlParser.Key_updateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#key_update}.
	 * @param ctx the parse tree
	 */
	void exitKey_update(@NotNull SqlParser.Key_updateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_default}.
	 * @param ctx the parse tree
	 */
	void enterOpt_default(@NotNull SqlParser.Opt_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_default}.
	 * @param ctx the parse tree
	 */
	void exitOpt_default(@NotNull SqlParser.Opt_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterRoleStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterRoleStmt(@NotNull SqlParser.AlterRoleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterRoleStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterRoleStmt(@NotNull SqlParser.AlterRoleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#triggerFuncArgs}.
	 * @param ctx the parse tree
	 */
	void enterTriggerFuncArgs(@NotNull SqlParser.TriggerFuncArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#triggerFuncArgs}.
	 * @param ctx the parse tree
	 */
	void exitTriggerFuncArgs(@NotNull SqlParser.TriggerFuncArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterTSDictionaryStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterTSDictionaryStmt(@NotNull SqlParser.AlterTSDictionaryStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterTSDictionaryStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterTSDictionaryStmt(@NotNull SqlParser.AlterTSDictionaryStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_collate}.
	 * @param ctx the parse tree
	 */
	void enterOpt_collate(@NotNull SqlParser.Opt_collateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_collate}.
	 * @param ctx the parse tree
	 */
	void exitOpt_collate(@NotNull SqlParser.Opt_collateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_extension_opt_list}.
	 * @param ctx the parse tree
	 */
	void enterAlter_extension_opt_list(@NotNull SqlParser.Alter_extension_opt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_extension_opt_list}.
	 * @param ctx the parse tree
	 */
	void exitAlter_extension_opt_list(@NotNull SqlParser.Alter_extension_opt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#window_definition_list}.
	 * @param ctx the parse tree
	 */
	void enterWindow_definition_list(@NotNull SqlParser.Window_definition_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#window_definition_list}.
	 * @param ctx the parse tree
	 */
	void exitWindow_definition_list(@NotNull SqlParser.Window_definition_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#xml_attributes}.
	 * @param ctx the parse tree
	 */
	void enterXml_attributes(@NotNull SqlParser.Xml_attributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#xml_attributes}.
	 * @param ctx the parse tree
	 */
	void exitXml_attributes(@NotNull SqlParser.Xml_attributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_generic_option_list}.
	 * @param ctx the parse tree
	 */
	void enterAlter_generic_option_list(@NotNull SqlParser.Alter_generic_option_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_generic_option_list}.
	 * @param ctx the parse tree
	 */
	void exitAlter_generic_option_list(@NotNull SqlParser.Alter_generic_option_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#from_in}.
	 * @param ctx the parse tree
	 */
	void enterFrom_in(@NotNull SqlParser.From_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#from_in}.
	 * @param ctx the parse tree
	 */
	void exitFrom_in(@NotNull SqlParser.From_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_concurrently}.
	 * @param ctx the parse tree
	 */
	void enterOpt_concurrently(@NotNull SqlParser.Opt_concurrentlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_concurrently}.
	 * @param ctx the parse tree
	 */
	void exitOpt_concurrently(@NotNull SqlParser.Opt_concurrentlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterDatabaseSetStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterDatabaseSetStmt(@NotNull SqlParser.AlterDatabaseSetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterDatabaseSetStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterDatabaseSetStmt(@NotNull SqlParser.AlterDatabaseSetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createGroupStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateGroupStmt(@NotNull SqlParser.CreateGroupStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createGroupStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateGroupStmt(@NotNull SqlParser.CreateGroupStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_asymmetric}.
	 * @param ctx the parse tree
	 */
	void enterOpt_asymmetric(@NotNull SqlParser.Opt_asymmetricContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_asymmetric}.
	 * @param ctx the parse tree
	 */
	void exitOpt_asymmetric(@NotNull SqlParser.Opt_asymmetricContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createdb_opt_item}.
	 * @param ctx the parse tree
	 */
	void enterCreatedb_opt_item(@NotNull SqlParser.Createdb_opt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createdb_opt_item}.
	 * @param ctx the parse tree
	 */
	void exitCreatedb_opt_item(@NotNull SqlParser.Createdb_opt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_select_fetch_first_value}.
	 * @param ctx the parse tree
	 */
	void enterOpt_select_fetch_first_value(@NotNull SqlParser.Opt_select_fetch_first_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_select_fetch_first_value}.
	 * @param ctx the parse tree
	 */
	void exitOpt_select_fetch_first_value(@NotNull SqlParser.Opt_select_fetch_first_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterDefaultPrivilegesStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterDefaultPrivilegesStmt(@NotNull SqlParser.AlterDefaultPrivilegesStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterDefaultPrivilegesStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterDefaultPrivilegesStmt(@NotNull SqlParser.AlterDefaultPrivilegesStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#reloption_elem}.
	 * @param ctx the parse tree
	 */
	void enterReloption_elem(@NotNull SqlParser.Reloption_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#reloption_elem}.
	 * @param ctx the parse tree
	 */
	void exitReloption_elem(@NotNull SqlParser.Reloption_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alteroptRoleList}.
	 * @param ctx the parse tree
	 */
	void enterAlteroptRoleList(@NotNull SqlParser.AlteroptRoleListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alteroptRoleList}.
	 * @param ctx the parse tree
	 */
	void exitAlteroptRoleList(@NotNull SqlParser.AlteroptRoleListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_type_cmds}.
	 * @param ctx the parse tree
	 */
	void enterAlter_type_cmds(@NotNull SqlParser.Alter_type_cmdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_type_cmds}.
	 * @param ctx the parse tree
	 */
	void exitAlter_type_cmds(@NotNull SqlParser.Alter_type_cmdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#relation_expr}.
	 * @param ctx the parse tree
	 */
	void enterRelation_expr(@NotNull SqlParser.Relation_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#relation_expr}.
	 * @param ctx the parse tree
	 */
	void exitRelation_expr(@NotNull SqlParser.Relation_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#func_type}.
	 * @param ctx the parse tree
	 */
	void enterFunc_type(@NotNull SqlParser.Func_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#func_type}.
	 * @param ctx the parse tree
	 */
	void exitFunc_type(@NotNull SqlParser.Func_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#comment_type}.
	 * @param ctx the parse tree
	 */
	void enterComment_type(@NotNull SqlParser.Comment_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#comment_type}.
	 * @param ctx the parse tree
	 */
	void exitComment_type(@NotNull SqlParser.Comment_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#aexprConst}.
	 * @param ctx the parse tree
	 */
	void enterAexprConst(@NotNull SqlParser.AexprConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#aexprConst}.
	 * @param ctx the parse tree
	 */
	void exitAexprConst(@NotNull SqlParser.AexprConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createPLangStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreatePLangStmt(@NotNull SqlParser.CreatePLangStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createPLangStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreatePLangStmt(@NotNull SqlParser.CreatePLangStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#type_function_name}.
	 * @param ctx the parse tree
	 */
	void enterType_function_name(@NotNull SqlParser.Type_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#type_function_name}.
	 * @param ctx the parse tree
	 */
	void exitType_function_name(@NotNull SqlParser.Type_function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#defacl_privilege_target}.
	 * @param ctx the parse tree
	 */
	void enterDefacl_privilege_target(@NotNull SqlParser.Defacl_privilege_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#defacl_privilege_target}.
	 * @param ctx the parse tree
	 */
	void exitDefacl_privilege_target(@NotNull SqlParser.Defacl_privilege_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#values_clause}.
	 * @param ctx the parse tree
	 */
	void enterValues_clause(@NotNull SqlParser.Values_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#values_clause}.
	 * @param ctx the parse tree
	 */
	void exitValues_clause(@NotNull SqlParser.Values_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#indirection_el}.
	 * @param ctx the parse tree
	 */
	void enterIndirection_el(@NotNull SqlParser.Indirection_elContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#indirection_el}.
	 * @param ctx the parse tree
	 */
	void exitIndirection_el(@NotNull SqlParser.Indirection_elContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#target_el}.
	 * @param ctx the parse tree
	 */
	void enterTarget_el(@NotNull SqlParser.Target_elContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#target_el}.
	 * @param ctx the parse tree
	 */
	void exitTarget_el(@NotNull SqlParser.Target_elContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#prepareStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrepareStmt(@NotNull SqlParser.PrepareStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#prepareStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrepareStmt(@NotNull SqlParser.PrepareStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_func_column}.
	 * @param ctx the parse tree
	 */
	void enterTable_func_column(@NotNull SqlParser.Table_func_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_func_column}.
	 * @param ctx the parse tree
	 */
	void exitTable_func_column(@NotNull SqlParser.Table_func_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#transaction_mode_list_or_empty}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_mode_list_or_empty(@NotNull SqlParser.Transaction_mode_list_or_emptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#transaction_mode_list_or_empty}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_mode_list_or_empty(@NotNull SqlParser.Transaction_mode_list_or_emptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#explain_option_name}.
	 * @param ctx the parse tree
	 */
	void enterExplain_option_name(@NotNull SqlParser.Explain_option_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#explain_option_name}.
	 * @param ctx the parse tree
	 */
	void exitExplain_option_name(@NotNull SqlParser.Explain_option_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#func_args_with_defaults_list}.
	 * @param ctx the parse tree
	 */
	void enterFunc_args_with_defaults_list(@NotNull SqlParser.Func_args_with_defaults_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#func_args_with_defaults_list}.
	 * @param ctx the parse tree
	 */
	void exitFunc_args_with_defaults_list(@NotNull SqlParser.Func_args_with_defaults_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createdb_opt_list}.
	 * @param ctx the parse tree
	 */
	void enterCreatedb_opt_list(@NotNull SqlParser.Createdb_opt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createdb_opt_list}.
	 * @param ctx the parse tree
	 */
	void exitCreatedb_opt_list(@NotNull SqlParser.Createdb_opt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#transactionStmt}.
	 * @param ctx the parse tree
	 */
	void enterTransactionStmt(@NotNull SqlParser.TransactionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#transactionStmt}.
	 * @param ctx the parse tree
	 */
	void exitTransactionStmt(@NotNull SqlParser.TransactionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_granted_by}.
	 * @param ctx the parse tree
	 */
	void enterOpt_granted_by(@NotNull SqlParser.Opt_granted_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_granted_by}.
	 * @param ctx the parse tree
	 */
	void exitOpt_granted_by(@NotNull SqlParser.Opt_granted_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#function_with_argtypes_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_with_argtypes_list(@NotNull SqlParser.Function_with_argtypes_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#function_with_argtypes_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_with_argtypes_list(@NotNull SqlParser.Function_with_argtypes_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_hold}.
	 * @param ctx the parse tree
	 */
	void enterOpt_hold(@NotNull SqlParser.Opt_holdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_hold}.
	 * @param ctx the parse tree
	 */
	void exitOpt_hold(@NotNull SqlParser.Opt_holdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_extension_opt_item}.
	 * @param ctx the parse tree
	 */
	void enterAlter_extension_opt_item(@NotNull SqlParser.Alter_extension_opt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_extension_opt_item}.
	 * @param ctx the parse tree
	 */
	void exitAlter_extension_opt_item(@NotNull SqlParser.Alter_extension_opt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_no_inherit}.
	 * @param ctx the parse tree
	 */
	void enterOpt_no_inherit(@NotNull SqlParser.Opt_no_inheritContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_no_inherit}.
	 * @param ctx the parse tree
	 */
	void exitOpt_no_inherit(@NotNull SqlParser.Opt_no_inheritContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#grantee}.
	 * @param ctx the parse tree
	 */
	void enterGrantee(@NotNull SqlParser.GranteeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#grantee}.
	 * @param ctx the parse tree
	 */
	void exitGrantee(@NotNull SqlParser.GranteeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select_with_parens}.
	 * @param ctx the parse tree
	 */
	void enterSelect_with_parens(@NotNull SqlParser.Select_with_parensContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_with_parens}.
	 * @param ctx the parse tree
	 */
	void exitSelect_with_parens(@NotNull SqlParser.Select_with_parensContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#optInherit}.
	 * @param ctx the parse tree
	 */
	void enterOptInherit(@NotNull SqlParser.OptInheritContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#optInherit}.
	 * @param ctx the parse tree
	 */
	void exitOptInherit(@NotNull SqlParser.OptInheritContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#single_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterSingle_set_clause(@NotNull SqlParser.Single_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#single_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitSingle_set_clause(@NotNull SqlParser.Single_set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_extension_opt_list}.
	 * @param ctx the parse tree
	 */
	void enterCreate_extension_opt_list(@NotNull SqlParser.Create_extension_opt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_extension_opt_list}.
	 * @param ctx the parse tree
	 */
	void exitCreate_extension_opt_list(@NotNull SqlParser.Create_extension_opt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#tableElementList}.
	 * @param ctx the parse tree
	 */
	void enterTableElementList(@NotNull SqlParser.TableElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#tableElementList}.
	 * @param ctx the parse tree
	 */
	void exitTableElementList(@NotNull SqlParser.TableElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#simple_select}.
	 * @param ctx the parse tree
	 */
	void enterSimple_select(@NotNull SqlParser.Simple_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#simple_select}.
	 * @param ctx the parse tree
	 */
	void exitSimple_select(@NotNull SqlParser.Simple_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull SqlParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull SqlParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#bitWithLength}.
	 * @param ctx the parse tree
	 */
	void enterBitWithLength(@NotNull SqlParser.BitWithLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#bitWithLength}.
	 * @param ctx the parse tree
	 */
	void exitBitWithLength(@NotNull SqlParser.BitWithLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#a_expr}.
	 * @param ctx the parse tree
	 */
	void enterA_expr(@NotNull SqlParser.A_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#a_expr}.
	 * @param ctx the parse tree
	 */
	void exitA_expr(@NotNull SqlParser.A_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_grant_admin_option}.
	 * @param ctx the parse tree
	 */
	void enterOpt_grant_admin_option(@NotNull SqlParser.Opt_grant_admin_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_grant_admin_option}.
	 * @param ctx the parse tree
	 */
	void exitOpt_grant_admin_option(@NotNull SqlParser.Opt_grant_admin_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_ref2}.
	 * @param ctx the parse tree
	 */
	void enterTable_ref2(@NotNull SqlParser.Table_ref2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_ref2}.
	 * @param ctx the parse tree
	 */
	void exitTable_ref2(@NotNull SqlParser.Table_ref2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#mathOp}.
	 * @param ctx the parse tree
	 */
	void enterMathOp(@NotNull SqlParser.MathOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#mathOp}.
	 * @param ctx the parse tree
	 */
	void exitMathOp(@NotNull SqlParser.MathOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#foreign_server_version}.
	 * @param ctx the parse tree
	 */
	void enterForeign_server_version(@NotNull SqlParser.Foreign_server_versionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#foreign_server_version}.
	 * @param ctx the parse tree
	 */
	void exitForeign_server_version(@NotNull SqlParser.Foreign_server_versionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#auth_ident}.
	 * @param ctx the parse tree
	 */
	void enterAuth_ident(@NotNull SqlParser.Auth_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#auth_ident}.
	 * @param ctx the parse tree
	 */
	void exitAuth_ident(@NotNull SqlParser.Auth_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_validator}.
	 * @param ctx the parse tree
	 */
	void enterOpt_validator(@NotNull SqlParser.Opt_validatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_validator}.
	 * @param ctx the parse tree
	 */
	void exitOpt_validator(@NotNull SqlParser.Opt_validatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#security_label_type}.
	 * @param ctx the parse tree
	 */
	void enterSecurity_label_type(@NotNull SqlParser.Security_label_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#security_label_type}.
	 * @param ctx the parse tree
	 */
	void exitSecurity_label_type(@NotNull SqlParser.Security_label_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(@NotNull SqlParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(@NotNull SqlParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#numericOnly_list}.
	 * @param ctx the parse tree
	 */
	void enterNumericOnly_list(@NotNull SqlParser.NumericOnly_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#numericOnly_list}.
	 * @param ctx the parse tree
	 */
	void exitNumericOnly_list(@NotNull SqlParser.NumericOnly_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(@NotNull SqlParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(@NotNull SqlParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#arg_class}.
	 * @param ctx the parse tree
	 */
	void enterArg_class(@NotNull SqlParser.Arg_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#arg_class}.
	 * @param ctx the parse tree
	 */
	void exitArg_class(@NotNull SqlParser.Arg_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_restart_seqs}.
	 * @param ctx the parse tree
	 */
	void enterOpt_restart_seqs(@NotNull SqlParser.Opt_restart_seqsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_restart_seqs}.
	 * @param ctx the parse tree
	 */
	void exitOpt_restart_seqs(@NotNull SqlParser.Opt_restart_seqsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#subquery_Op}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_Op(@NotNull SqlParser.Subquery_OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#subquery_Op}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_Op(@NotNull SqlParser.Subquery_OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_definition}.
	 * @param ctx the parse tree
	 */
	void enterOpt_definition(@NotNull SqlParser.Opt_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_definition}.
	 * @param ctx the parse tree
	 */
	void exitOpt_definition(@NotNull SqlParser.Opt_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterdb_opt_list}.
	 * @param ctx the parse tree
	 */
	void enterAlterdb_opt_list(@NotNull SqlParser.Alterdb_opt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterdb_opt_list}.
	 * @param ctx the parse tree
	 */
	void exitAlterdb_opt_list(@NotNull SqlParser.Alterdb_opt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#character_def}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_def(@NotNull SqlParser.Character_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#character_def}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_def(@NotNull SqlParser.Character_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#genericType}.
	 * @param ctx the parse tree
	 */
	void enterGenericType(@NotNull SqlParser.GenericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#genericType}.
	 * @param ctx the parse tree
	 */
	void exitGenericType(@NotNull SqlParser.GenericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#privilege}.
	 * @param ctx the parse tree
	 */
	void enterPrivilege(@NotNull SqlParser.PrivilegeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#privilege}.
	 * @param ctx the parse tree
	 */
	void exitPrivilege(@NotNull SqlParser.PrivilegeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#oper_argtypes}.
	 * @param ctx the parse tree
	 */
	void enterOper_argtypes(@NotNull SqlParser.Oper_argtypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#oper_argtypes}.
	 * @param ctx the parse tree
	 */
	void exitOper_argtypes(@NotNull SqlParser.Oper_argtypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#declareCursorStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclareCursorStmt(@NotNull SqlParser.DeclareCursorStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#declareCursorStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclareCursorStmt(@NotNull SqlParser.DeclareCursorStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#row_or_rows}.
	 * @param ctx the parse tree
	 */
	void enterRow_or_rows(@NotNull SqlParser.Row_or_rowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#row_or_rows}.
	 * @param ctx the parse tree
	 */
	void exitRow_or_rows(@NotNull SqlParser.Row_or_rowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dropGroupStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropGroupStmt(@NotNull SqlParser.DropGroupStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dropGroupStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropGroupStmt(@NotNull SqlParser.DropGroupStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#substr_for}.
	 * @param ctx the parse tree
	 */
	void enterSubstr_for(@NotNull SqlParser.Substr_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#substr_for}.
	 * @param ctx the parse tree
	 */
	void exitSubstr_for(@NotNull SqlParser.Substr_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#insert_column_item}.
	 * @param ctx the parse tree
	 */
	void enterInsert_column_item(@NotNull SqlParser.Insert_column_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#insert_column_item}.
	 * @param ctx the parse tree
	 */
	void exitInsert_column_item(@NotNull SqlParser.Insert_column_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#tableLikeOption}.
	 * @param ctx the parse tree
	 */
	void enterTableLikeOption(@NotNull SqlParser.TableLikeOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#tableLikeOption}.
	 * @param ctx the parse tree
	 */
	void exitTableLikeOption(@NotNull SqlParser.TableLikeOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#fetchStmt}.
	 * @param ctx the parse tree
	 */
	void enterFetchStmt(@NotNull SqlParser.FetchStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#fetchStmt}.
	 * @param ctx the parse tree
	 */
	void exitFetchStmt(@NotNull SqlParser.FetchStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#func_as}.
	 * @param ctx the parse tree
	 */
	void enterFunc_as(@NotNull SqlParser.Func_asContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#func_as}.
	 * @param ctx the parse tree
	 */
	void exitFunc_as(@NotNull SqlParser.Func_asContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#xml_attribute_el}.
	 * @param ctx the parse tree
	 */
	void enterXml_attribute_el(@NotNull SqlParser.Xml_attribute_elContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#xml_attribute_el}.
	 * @param ctx the parse tree
	 */
	void exitXml_attribute_el(@NotNull SqlParser.Xml_attribute_elContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#indexStmt}.
	 * @param ctx the parse tree
	 */
	void enterIndexStmt(@NotNull SqlParser.IndexStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#indexStmt}.
	 * @param ctx the parse tree
	 */
	void exitIndexStmt(@NotNull SqlParser.IndexStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#stmtblock}.
	 * @param ctx the parse tree
	 */
	void enterStmtblock(@NotNull SqlParser.StmtblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#stmtblock}.
	 * @param ctx the parse tree
	 */
	void exitStmtblock(@NotNull SqlParser.StmtblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#when_clause_list}.
	 * @param ctx the parse tree
	 */
	void enterWhen_clause_list(@NotNull SqlParser.When_clause_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#when_clause_list}.
	 * @param ctx the parse tree
	 */
	void exitWhen_clause_list(@NotNull SqlParser.When_clause_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#offset_clause}.
	 * @param ctx the parse tree
	 */
	void enterOffset_clause(@NotNull SqlParser.Offset_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#offset_clause}.
	 * @param ctx the parse tree
	 */
	void exitOffset_clause(@NotNull SqlParser.Offset_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_existing_window_name}.
	 * @param ctx the parse tree
	 */
	void enterOpt_existing_window_name(@NotNull SqlParser.Opt_existing_window_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_existing_window_name}.
	 * @param ctx the parse tree
	 */
	void exitOpt_existing_window_name(@NotNull SqlParser.Opt_existing_window_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_float}.
	 * @param ctx the parse tree
	 */
	void enterOpt_float(@NotNull SqlParser.Opt_floatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_float}.
	 * @param ctx the parse tree
	 */
	void exitOpt_float(@NotNull SqlParser.Opt_floatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#doStmt}.
	 * @param ctx the parse tree
	 */
	void enterDoStmt(@NotNull SqlParser.DoStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#doStmt}.
	 * @param ctx the parse tree
	 */
	void exitDoStmt(@NotNull SqlParser.DoStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createfunc_opt_list}.
	 * @param ctx the parse tree
	 */
	void enterCreatefunc_opt_list(@NotNull SqlParser.Createfunc_opt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createfunc_opt_list}.
	 * @param ctx the parse tree
	 */
	void exitCreatefunc_opt_list(@NotNull SqlParser.Createfunc_opt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#renameStmt}.
	 * @param ctx the parse tree
	 */
	void enterRenameStmt(@NotNull SqlParser.RenameStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#renameStmt}.
	 * @param ctx the parse tree
	 */
	void exitRenameStmt(@NotNull SqlParser.RenameStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#deleteStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStmt(@NotNull SqlParser.DeleteStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#deleteStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStmt(@NotNull SqlParser.DeleteStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#for_locking_clause}.
	 * @param ctx the parse tree
	 */
	void enterFor_locking_clause(@NotNull SqlParser.For_locking_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#for_locking_clause}.
	 * @param ctx the parse tree
	 */
	void exitFor_locking_clause(@NotNull SqlParser.For_locking_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#interval_second}.
	 * @param ctx the parse tree
	 */
	void enterInterval_second(@NotNull SqlParser.Interval_secondContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#interval_second}.
	 * @param ctx the parse tree
	 */
	void exitInterval_second(@NotNull SqlParser.Interval_secondContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#func_return}.
	 * @param ctx the parse tree
	 */
	void enterFunc_return(@NotNull SqlParser.Func_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#func_return}.
	 * @param ctx the parse tree
	 */
	void exitFunc_return(@NotNull SqlParser.Func_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#old_aggr_elem}.
	 * @param ctx the parse tree
	 */
	void enterOld_aggr_elem(@NotNull SqlParser.Old_aggr_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#old_aggr_elem}.
	 * @param ctx the parse tree
	 */
	void exitOld_aggr_elem(@NotNull SqlParser.Old_aggr_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createForeignTableStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateForeignTableStmt(@NotNull SqlParser.CreateForeignTableStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createForeignTableStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateForeignTableStmt(@NotNull SqlParser.CreateForeignTableStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_encoding}.
	 * @param ctx the parse tree
	 */
	void enterOpt_encoding(@NotNull SqlParser.Opt_encodingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_encoding}.
	 * @param ctx the parse tree
	 */
	void exitOpt_encoding(@NotNull SqlParser.Opt_encodingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dropPLangStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropPLangStmt(@NotNull SqlParser.DropPLangStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dropPLangStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropPLangStmt(@NotNull SqlParser.DropPLangStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_column}.
	 * @param ctx the parse tree
	 */
	void enterOpt_column(@NotNull SqlParser.Opt_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_column}.
	 * @param ctx the parse tree
	 */
	void exitOpt_column(@NotNull SqlParser.Opt_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#onCommitOption}.
	 * @param ctx the parse tree
	 */
	void enterOnCommitOption(@NotNull SqlParser.OnCommitOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#onCommitOption}.
	 * @param ctx the parse tree
	 */
	void exitOnCommitOption(@NotNull SqlParser.OnCommitOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_class}.
	 * @param ctx the parse tree
	 */
	void enterOpt_class(@NotNull SqlParser.Opt_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_class}.
	 * @param ctx the parse tree
	 */
	void exitOpt_class(@NotNull SqlParser.Opt_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dropRoleStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropRoleStmt(@NotNull SqlParser.DropRoleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dropRoleStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropRoleStmt(@NotNull SqlParser.DropRoleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#checkPointStmt}.
	 * @param ctx the parse tree
	 */
	void enterCheckPointStmt(@NotNull SqlParser.CheckPointStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#checkPointStmt}.
	 * @param ctx the parse tree
	 */
	void exitCheckPointStmt(@NotNull SqlParser.CheckPointStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#copy_delimiter}.
	 * @param ctx the parse tree
	 */
	void enterCopy_delimiter(@NotNull SqlParser.Copy_delimiterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#copy_delimiter}.
	 * @param ctx the parse tree
	 */
	void exitCopy_delimiter(@NotNull SqlParser.Copy_delimiterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_full}.
	 * @param ctx the parse tree
	 */
	void enterOpt_full(@NotNull SqlParser.Opt_fullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_full}.
	 * @param ctx the parse tree
	 */
	void exitOpt_full(@NotNull SqlParser.Opt_fullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(@NotNull SqlParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(@NotNull SqlParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_all}.
	 * @param ctx the parse tree
	 */
	void enterOpt_all(@NotNull SqlParser.Opt_allContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_all}.
	 * @param ctx the parse tree
	 */
	void exitOpt_all(@NotNull SqlParser.Opt_allContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#removeAggrStmt}.
	 * @param ctx the parse tree
	 */
	void enterRemoveAggrStmt(@NotNull SqlParser.RemoveAggrStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#removeAggrStmt}.
	 * @param ctx the parse tree
	 */
	void exitRemoveAggrStmt(@NotNull SqlParser.RemoveAggrStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#cast_context}.
	 * @param ctx the parse tree
	 */
	void enterCast_context(@NotNull SqlParser.Cast_contextContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#cast_context}.
	 * @param ctx the parse tree
	 */
	void exitCast_context(@NotNull SqlParser.Cast_contextContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#constraintAttributeSpec}.
	 * @param ctx the parse tree
	 */
	void enterConstraintAttributeSpec(@NotNull SqlParser.ConstraintAttributeSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#constraintAttributeSpec}.
	 * @param ctx the parse tree
	 */
	void exitConstraintAttributeSpec(@NotNull SqlParser.ConstraintAttributeSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#xml_attribute_list}.
	 * @param ctx the parse tree
	 */
	void enterXml_attribute_list(@NotNull SqlParser.Xml_attribute_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#xml_attribute_list}.
	 * @param ctx the parse tree
	 */
	void exitXml_attribute_list(@NotNull SqlParser.Xml_attribute_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#defACLAction}.
	 * @param ctx the parse tree
	 */
	void enterDefACLAction(@NotNull SqlParser.DefACLActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#defACLAction}.
	 * @param ctx the parse tree
	 */
	void exitDefACLAction(@NotNull SqlParser.DefACLActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterExtensionStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterExtensionStmt(@NotNull SqlParser.AlterExtensionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterExtensionStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterExtensionStmt(@NotNull SqlParser.AlterExtensionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#seqOptList}.
	 * @param ctx the parse tree
	 */
	void enterSeqOptList(@NotNull SqlParser.SeqOptListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#seqOptList}.
	 * @param ctx the parse tree
	 */
	void exitSeqOptList(@NotNull SqlParser.SeqOptListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#copy_generic_opt_arg_list_item}.
	 * @param ctx the parse tree
	 */
	void enterCopy_generic_opt_arg_list_item(@NotNull SqlParser.Copy_generic_opt_arg_list_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#copy_generic_opt_arg_list_item}.
	 * @param ctx the parse tree
	 */
	void exitCopy_generic_opt_arg_list_item(@NotNull SqlParser.Copy_generic_opt_arg_list_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#func_table}.
	 * @param ctx the parse tree
	 */
	void enterFunc_table(@NotNull SqlParser.Func_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#func_table}.
	 * @param ctx the parse tree
	 */
	void exitFunc_table(@NotNull SqlParser.Func_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#common_func_opt_item}.
	 * @param ctx the parse tree
	 */
	void enterCommon_func_opt_item(@NotNull SqlParser.Common_func_opt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#common_func_opt_item}.
	 * @param ctx the parse tree
	 */
	void exitCommon_func_opt_item(@NotNull SqlParser.Common_func_opt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#stmtmulti}.
	 * @param ctx the parse tree
	 */
	void enterStmtmulti(@NotNull SqlParser.StmtmultiContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#stmtmulti}.
	 * @param ctx the parse tree
	 */
	void exitStmtmulti(@NotNull SqlParser.StmtmultiContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterOwnerStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterOwnerStmt(@NotNull SqlParser.AlterOwnerStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterOwnerStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterOwnerStmt(@NotNull SqlParser.AlterOwnerStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#param_name}.
	 * @param ctx the parse tree
	 */
	void enterParam_name(@NotNull SqlParser.Param_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#param_name}.
	 * @param ctx the parse tree
	 */
	void exitParam_name(@NotNull SqlParser.Param_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#reloptions}.
	 * @param ctx the parse tree
	 */
	void enterReloptions(@NotNull SqlParser.ReloptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#reloptions}.
	 * @param ctx the parse tree
	 */
	void exitReloptions(@NotNull SqlParser.ReloptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_as_target}.
	 * @param ctx the parse tree
	 */
	void enterCreate_as_target(@NotNull SqlParser.Create_as_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_as_target}.
	 * @param ctx the parse tree
	 */
	void exitCreate_as_target(@NotNull SqlParser.Create_as_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createSchemaStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateSchemaStmt(@NotNull SqlParser.CreateSchemaStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createSchemaStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateSchemaStmt(@NotNull SqlParser.CreateSchemaStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterObjectSchemaStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterObjectSchemaStmt(@NotNull SqlParser.AlterObjectSchemaStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterObjectSchemaStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterObjectSchemaStmt(@NotNull SqlParser.AlterObjectSchemaStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#cte_list}.
	 * @param ctx the parse tree
	 */
	void enterCte_list(@NotNull SqlParser.Cte_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#cte_list}.
	 * @param ctx the parse tree
	 */
	void exitCte_list(@NotNull SqlParser.Cte_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createConversionStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateConversionStmt(@NotNull SqlParser.CreateConversionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createConversionStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateConversionStmt(@NotNull SqlParser.CreateConversionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#multiple_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_set_clause(@NotNull SqlParser.Multiple_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#multiple_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_set_clause(@NotNull SqlParser.Multiple_set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createFdwStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateFdwStmt(@NotNull SqlParser.CreateFdwStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createFdwStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateFdwStmt(@NotNull SqlParser.CreateFdwStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#optRoleList}.
	 * @param ctx the parse tree
	 */
	void enterOptRoleList(@NotNull SqlParser.OptRoleListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#optRoleList}.
	 * @param ctx the parse tree
	 */
	void exitOptRoleList(@NotNull SqlParser.OptRoleListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_name_list}.
	 * @param ctx the parse tree
	 */
	void enterOpt_name_list(@NotNull SqlParser.Opt_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_name_list}.
	 * @param ctx the parse tree
	 */
	void exitOpt_name_list(@NotNull SqlParser.Opt_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#grantRoleStmt}.
	 * @param ctx the parse tree
	 */
	void enterGrantRoleStmt(@NotNull SqlParser.GrantRoleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#grantRoleStmt}.
	 * @param ctx the parse tree
	 */
	void exitGrantRoleStmt(@NotNull SqlParser.GrantRoleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#lock_type}.
	 * @param ctx the parse tree
	 */
	void enterLock_type(@NotNull SqlParser.Lock_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#lock_type}.
	 * @param ctx the parse tree
	 */
	void exitLock_type(@NotNull SqlParser.Lock_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#ctext_expr_list}.
	 * @param ctx the parse tree
	 */
	void enterCtext_expr_list(@NotNull SqlParser.Ctext_expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#ctext_expr_list}.
	 * @param ctx the parse tree
	 */
	void exitCtext_expr_list(@NotNull SqlParser.Ctext_expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#transaction_mode_list}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_mode_list(@NotNull SqlParser.Transaction_mode_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#transaction_mode_list}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_mode_list(@NotNull SqlParser.Transaction_mode_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#xml_whitespace_option}.
	 * @param ctx the parse tree
	 */
	void enterXml_whitespace_option(@NotNull SqlParser.Xml_whitespace_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#xml_whitespace_option}.
	 * @param ctx the parse tree
	 */
	void exitXml_whitespace_option(@NotNull SqlParser.Xml_whitespace_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#secLabelStmt}.
	 * @param ctx the parse tree
	 */
	void enterSecLabelStmt(@NotNull SqlParser.SecLabelStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#secLabelStmt}.
	 * @param ctx the parse tree
	 */
	void exitSecLabelStmt(@NotNull SqlParser.SecLabelStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#overlay_placing}.
	 * @param ctx the parse tree
	 */
	void enterOverlay_placing(@NotNull SqlParser.Overlay_placingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#overlay_placing}.
	 * @param ctx the parse tree
	 */
	void exitOverlay_placing(@NotNull SqlParser.Overlay_placingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#type_func_name_keyword}.
	 * @param ctx the parse tree
	 */
	void enterType_func_name_keyword(@NotNull SqlParser.Type_func_name_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#type_func_name_keyword}.
	 * @param ctx the parse tree
	 */
	void exitType_func_name_keyword(@NotNull SqlParser.Type_func_name_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_procedural}.
	 * @param ctx the parse tree
	 */
	void enterOpt_procedural(@NotNull SqlParser.Opt_proceduralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_procedural}.
	 * @param ctx the parse tree
	 */
	void exitOpt_procedural(@NotNull SqlParser.Opt_proceduralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#case_default}.
	 * @param ctx the parse tree
	 */
	void enterCase_default(@NotNull SqlParser.Case_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#case_default}.
	 * @param ctx the parse tree
	 */
	void exitCase_default(@NotNull SqlParser.Case_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#signedIconst}.
	 * @param ctx the parse tree
	 */
	void enterSignedIconst(@NotNull SqlParser.SignedIconstContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#signedIconst}.
	 * @param ctx the parse tree
	 */
	void exitSignedIconst(@NotNull SqlParser.SignedIconstContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#cursor_options}.
	 * @param ctx the parse tree
	 */
	void enterCursor_options(@NotNull SqlParser.Cursor_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#cursor_options}.
	 * @param ctx the parse tree
	 */
	void exitCursor_options(@NotNull SqlParser.Cursor_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#locked_rels_list}.
	 * @param ctx the parse tree
	 */
	void enterLocked_rels_list(@NotNull SqlParser.Locked_rels_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#locked_rels_list}.
	 * @param ctx the parse tree
	 */
	void exitLocked_rels_list(@NotNull SqlParser.Locked_rels_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_table_cmds}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_cmds(@NotNull SqlParser.Alter_table_cmdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_table_cmds}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_cmds(@NotNull SqlParser.Alter_table_cmdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dostmt_opt_list}.
	 * @param ctx the parse tree
	 */
	void enterDostmt_opt_list(@NotNull SqlParser.Dostmt_opt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dostmt_opt_list}.
	 * @param ctx the parse tree
	 */
	void exitDostmt_opt_list(@NotNull SqlParser.Dostmt_opt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#sort_clause}.
	 * @param ctx the parse tree
	 */
	void enterSort_clause(@NotNull SqlParser.Sort_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sort_clause}.
	 * @param ctx the parse tree
	 */
	void exitSort_clause(@NotNull SqlParser.Sort_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#colId}.
	 * @param ctx the parse tree
	 */
	void enterColId(@NotNull SqlParser.ColIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#colId}.
	 * @param ctx the parse tree
	 */
	void exitColId(@NotNull SqlParser.ColIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#group_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroup_clause(@NotNull SqlParser.Group_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#group_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroup_clause(@NotNull SqlParser.Group_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_type_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterOpt_type_modifiers(@NotNull SqlParser.Opt_type_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_type_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitOpt_type_modifiers(@NotNull SqlParser.Opt_type_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#seqOptElem}.
	 * @param ctx the parse tree
	 */
	void enterSeqOptElem(@NotNull SqlParser.SeqOptElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#seqOptElem}.
	 * @param ctx the parse tree
	 */
	void exitSeqOptElem(@NotNull SqlParser.SeqOptElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#optWith}.
	 * @param ctx the parse tree
	 */
	void enterOptWith(@NotNull SqlParser.OptWithContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#optWith}.
	 * @param ctx the parse tree
	 */
	void exitOptWith(@NotNull SqlParser.OptWithContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#sortby_list}.
	 * @param ctx the parse tree
	 */
	void enterSortby_list(@NotNull SqlParser.Sortby_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sortby_list}.
	 * @param ctx the parse tree
	 */
	void exitSortby_list(@NotNull SqlParser.Sortby_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#prep_type_clause}.
	 * @param ctx the parse tree
	 */
	void enterPrep_type_clause(@NotNull SqlParser.Prep_type_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#prep_type_clause}.
	 * @param ctx the parse tree
	 */
	void exitPrep_type_clause(@NotNull SqlParser.Prep_type_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#when_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhen_clause(@NotNull SqlParser.When_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#when_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhen_clause(@NotNull SqlParser.When_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_recheck}.
	 * @param ctx the parse tree
	 */
	void enterOpt_recheck(@NotNull SqlParser.Opt_recheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_recheck}.
	 * @param ctx the parse tree
	 */
	void exitOpt_recheck(@NotNull SqlParser.Opt_recheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#frame_bound}.
	 * @param ctx the parse tree
	 */
	void enterFrame_bound(@NotNull SqlParser.Frame_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#frame_bound}.
	 * @param ctx the parse tree
	 */
	void exitFrame_bound(@NotNull SqlParser.Frame_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#removeFuncStmt}.
	 * @param ctx the parse tree
	 */
	void enterRemoveFuncStmt(@NotNull SqlParser.RemoveFuncStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#removeFuncStmt}.
	 * @param ctx the parse tree
	 */
	void exitRemoveFuncStmt(@NotNull SqlParser.RemoveFuncStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#substr_from}.
	 * @param ctx the parse tree
	 */
	void enterSubstr_from(@NotNull SqlParser.Substr_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#substr_from}.
	 * @param ctx the parse tree
	 */
	void exitSubstr_from(@NotNull SqlParser.Substr_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#notifyStmt}.
	 * @param ctx the parse tree
	 */
	void enterNotifyStmt(@NotNull SqlParser.NotifyStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#notifyStmt}.
	 * @param ctx the parse tree
	 */
	void exitNotifyStmt(@NotNull SqlParser.NotifyStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#attrs}.
	 * @param ctx the parse tree
	 */
	void enterAttrs(@NotNull SqlParser.AttrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#attrs}.
	 * @param ctx the parse tree
	 */
	void exitAttrs(@NotNull SqlParser.AttrsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_type_cmd}.
	 * @param ctx the parse tree
	 */
	void enterAlter_type_cmd(@NotNull SqlParser.Alter_type_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_type_cmd}.
	 * @param ctx the parse tree
	 */
	void exitAlter_type_cmd(@NotNull SqlParser.Alter_type_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#insertStmt}.
	 * @param ctx the parse tree
	 */
	void enterInsertStmt(@NotNull SqlParser.InsertStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#insertStmt}.
	 * @param ctx the parse tree
	 */
	void exitInsertStmt(@NotNull SqlParser.InsertStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#first_or_next}.
	 * @param ctx the parse tree
	 */
	void enterFirst_or_next(@NotNull SqlParser.First_or_nextContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#first_or_next}.
	 * @param ctx the parse tree
	 */
	void exitFirst_or_next(@NotNull SqlParser.First_or_nextContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#add_drop}.
	 * @param ctx the parse tree
	 */
	void enterAdd_drop(@NotNull SqlParser.Add_dropContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#add_drop}.
	 * @param ctx the parse tree
	 */
	void exitAdd_drop(@NotNull SqlParser.Add_dropContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#copy_opt_item}.
	 * @param ctx the parse tree
	 */
	void enterCopy_opt_item(@NotNull SqlParser.Copy_opt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#copy_opt_item}.
	 * @param ctx the parse tree
	 */
	void exitCopy_opt_item(@NotNull SqlParser.Copy_opt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#func_args_with_defaults}.
	 * @param ctx the parse tree
	 */
	void enterFunc_args_with_defaults(@NotNull SqlParser.Func_args_with_defaultsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#func_args_with_defaults}.
	 * @param ctx the parse tree
	 */
	void exitFunc_args_with_defaults(@NotNull SqlParser.Func_args_with_defaultsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#func_arg_expr}.
	 * @param ctx the parse tree
	 */
	void enterFunc_arg_expr(@NotNull SqlParser.Func_arg_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#func_arg_expr}.
	 * @param ctx the parse tree
	 */
	void exitFunc_arg_expr(@NotNull SqlParser.Func_arg_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#var_name}.
	 * @param ctx the parse tree
	 */
	void enterVar_name(@NotNull SqlParser.Var_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#var_name}.
	 * @param ctx the parse tree
	 */
	void exitVar_name(@NotNull SqlParser.Var_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_asc_desc}.
	 * @param ctx the parse tree
	 */
	void enterOpt_asc_desc(@NotNull SqlParser.Opt_asc_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_asc_desc}.
	 * @param ctx the parse tree
	 */
	void exitOpt_asc_desc(@NotNull SqlParser.Opt_asc_descContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#explain_option_list}.
	 * @param ctx the parse tree
	 */
	void enterExplain_option_list(@NotNull SqlParser.Explain_option_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#explain_option_list}.
	 * @param ctx the parse tree
	 */
	void exitExplain_option_list(@NotNull SqlParser.Explain_option_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_grant_grant_option}.
	 * @param ctx the parse tree
	 */
	void enterOpt_grant_grant_option(@NotNull SqlParser.Opt_grant_grant_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_grant_grant_option}.
	 * @param ctx the parse tree
	 */
	void exitOpt_grant_grant_option(@NotNull SqlParser.Opt_grant_grant_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_set_data}.
	 * @param ctx the parse tree
	 */
	void enterOpt_set_data(@NotNull SqlParser.Opt_set_dataContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_set_data}.
	 * @param ctx the parse tree
	 */
	void exitOpt_set_data(@NotNull SqlParser.Opt_set_dataContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterTableConstraint(@NotNull SqlParser.TableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitTableConstraint(@NotNull SqlParser.TableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#grantStmt}.
	 * @param ctx the parse tree
	 */
	void enterGrantStmt(@NotNull SqlParser.GrantStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#grantStmt}.
	 * @param ctx the parse tree
	 */
	void exitGrantStmt(@NotNull SqlParser.GrantStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#generic_option_name}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_option_name(@NotNull SqlParser.Generic_option_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#generic_option_name}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_option_name(@NotNull SqlParser.Generic_option_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dostmt_opt_item}.
	 * @param ctx the parse tree
	 */
	void enterDostmt_opt_item(@NotNull SqlParser.Dostmt_opt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dostmt_opt_item}.
	 * @param ctx the parse tree
	 */
	void exitDostmt_opt_item(@NotNull SqlParser.Dostmt_opt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#var_value}.
	 * @param ctx the parse tree
	 */
	void enterVar_value(@NotNull SqlParser.Var_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#var_value}.
	 * @param ctx the parse tree
	 */
	void exitVar_value(@NotNull SqlParser.Var_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#optConsTableSpace}.
	 * @param ctx the parse tree
	 */
	void enterOptConsTableSpace(@NotNull SqlParser.OptConsTableSpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#optConsTableSpace}.
	 * @param ctx the parse tree
	 */
	void exitOptConsTableSpace(@NotNull SqlParser.OptConsTableSpaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opttableElementList}.
	 * @param ctx the parse tree
	 */
	void enterOpttableElementList(@NotNull SqlParser.OpttableElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opttableElementList}.
	 * @param ctx the parse tree
	 */
	void exitOpttableElementList(@NotNull SqlParser.OpttableElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#access_method_clause}.
	 * @param ctx the parse tree
	 */
	void enterAccess_method_clause(@NotNull SqlParser.Access_method_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#access_method_clause}.
	 * @param ctx the parse tree
	 */
	void exitAccess_method_clause(@NotNull SqlParser.Access_method_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#cluster_index_specification}.
	 * @param ctx the parse tree
	 */
	void enterCluster_index_specification(@NotNull SqlParser.Cluster_index_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#cluster_index_specification}.
	 * @param ctx the parse tree
	 */
	void exitCluster_index_specification(@NotNull SqlParser.Cluster_index_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#case_arg}.
	 * @param ctx the parse tree
	 */
	void enterCase_arg(@NotNull SqlParser.Case_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#case_arg}.
	 * @param ctx the parse tree
	 */
	void exitCase_arg(@NotNull SqlParser.Case_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dropOpFamilyStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropOpFamilyStmt(@NotNull SqlParser.DropOpFamilyStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dropOpFamilyStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropOpFamilyStmt(@NotNull SqlParser.DropOpFamilyStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dropCastStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropCastStmt(@NotNull SqlParser.DropCastStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dropCastStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropCastStmt(@NotNull SqlParser.DropCastStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterSeqStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterSeqStmt(@NotNull SqlParser.AlterSeqStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterSeqStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterSeqStmt(@NotNull SqlParser.AlterSeqStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dropOwnedStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropOwnedStmt(@NotNull SqlParser.DropOwnedStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dropOwnedStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropOwnedStmt(@NotNull SqlParser.DropOwnedStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createdbStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreatedbStmt(@NotNull SqlParser.CreatedbStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createdbStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreatedbStmt(@NotNull SqlParser.CreatedbStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_in_database}.
	 * @param ctx the parse tree
	 */
	void enterOpt_in_database(@NotNull SqlParser.Opt_in_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_in_database}.
	 * @param ctx the parse tree
	 */
	void exitOpt_in_database(@NotNull SqlParser.Opt_in_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createRoleStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateRoleStmt(@NotNull SqlParser.CreateRoleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createRoleStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateRoleStmt(@NotNull SqlParser.CreateRoleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#constbit}.
	 * @param ctx the parse tree
	 */
	void enterConstbit(@NotNull SqlParser.ConstbitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#constbit}.
	 * @param ctx the parse tree
	 */
	void exitConstbit(@NotNull SqlParser.ConstbitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#colQualList}.
	 * @param ctx the parse tree
	 */
	void enterColQualList(@NotNull SqlParser.ColQualListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#colQualList}.
	 * @param ctx the parse tree
	 */
	void exitColQualList(@NotNull SqlParser.ColQualListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#commentStmt}.
	 * @param ctx the parse tree
	 */
	void enterCommentStmt(@NotNull SqlParser.CommentStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#commentStmt}.
	 * @param ctx the parse tree
	 */
	void exitCommentStmt(@NotNull SqlParser.CommentStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opttableFuncElementList}.
	 * @param ctx the parse tree
	 */
	void enterOpttableFuncElementList(@NotNull SqlParser.OpttableFuncElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opttableFuncElementList}.
	 * @param ctx the parse tree
	 */
	void exitOpttableFuncElementList(@NotNull SqlParser.OpttableFuncElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opclass_item}.
	 * @param ctx the parse tree
	 */
	void enterOpclass_item(@NotNull SqlParser.Opclass_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opclass_item}.
	 * @param ctx the parse tree
	 */
	void exitOpclass_item(@NotNull SqlParser.Opclass_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#ruleActionMulti}.
	 * @param ctx the parse tree
	 */
	void enterRuleActionMulti(@NotNull SqlParser.RuleActionMultiContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#ruleActionMulti}.
	 * @param ctx the parse tree
	 */
	void exitRuleActionMulti(@NotNull SqlParser.RuleActionMultiContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#tableFuncElementList}.
	 * @param ctx the parse tree
	 */
	void enterTableFuncElementList(@NotNull SqlParser.TableFuncElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#tableFuncElementList}.
	 * @param ctx the parse tree
	 */
	void exitTableFuncElementList(@NotNull SqlParser.TableFuncElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createFunctionStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunctionStmt(@NotNull SqlParser.CreateFunctionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createFunctionStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunctionStmt(@NotNull SqlParser.CreateFunctionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#b_expr}.
	 * @param ctx the parse tree
	 */
	void enterB_expr(@NotNull SqlParser.B_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#b_expr}.
	 * @param ctx the parse tree
	 */
	void exitB_expr(@NotNull SqlParser.B_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_nowait}.
	 * @param ctx the parse tree
	 */
	void enterOpt_nowait(@NotNull SqlParser.Opt_nowaitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_nowait}.
	 * @param ctx the parse tree
	 */
	void exitOpt_nowait(@NotNull SqlParser.Opt_nowaitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void enterWith_clause(@NotNull SqlParser.With_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void exitWith_clause(@NotNull SqlParser.With_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#array_expr}.
	 * @param ctx the parse tree
	 */
	void enterArray_expr(@NotNull SqlParser.Array_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#array_expr}.
	 * @param ctx the parse tree
	 */
	void exitArray_expr(@NotNull SqlParser.Array_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#key_delete}.
	 * @param ctx the parse tree
	 */
	void enterKey_delete(@NotNull SqlParser.Key_deleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#key_delete}.
	 * @param ctx the parse tree
	 */
	void exitKey_delete(@NotNull SqlParser.Key_deleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#unreserved_keyword}.
	 * @param ctx the parse tree
	 */
	void enterUnreserved_keyword(@NotNull SqlParser.Unreserved_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#unreserved_keyword}.
	 * @param ctx the parse tree
	 */
	void exitUnreserved_keyword(@NotNull SqlParser.Unreserved_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createExtensionStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateExtensionStmt(@NotNull SqlParser.CreateExtensionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createExtensionStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateExtensionStmt(@NotNull SqlParser.CreateExtensionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#constraintElem}.
	 * @param ctx the parse tree
	 */
	void enterConstraintElem(@NotNull SqlParser.ConstraintElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#constraintElem}.
	 * @param ctx the parse tree
	 */
	void exitConstraintElem(@NotNull SqlParser.ConstraintElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#relation_expr_list}.
	 * @param ctx the parse tree
	 */
	void enterRelation_expr_list(@NotNull SqlParser.Relation_expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#relation_expr_list}.
	 * @param ctx the parse tree
	 */
	void exitRelation_expr_list(@NotNull SqlParser.Relation_expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_freeze}.
	 * @param ctx the parse tree
	 */
	void enterOpt_freeze(@NotNull SqlParser.Opt_freezeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_freeze}.
	 * @param ctx the parse tree
	 */
	void exitOpt_freeze(@NotNull SqlParser.Opt_freezeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#fdw_option}.
	 * @param ctx the parse tree
	 */
	void enterFdw_option(@NotNull SqlParser.Fdw_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#fdw_option}.
	 * @param ctx the parse tree
	 */
	void exitFdw_option(@NotNull SqlParser.Fdw_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#typename}.
	 * @param ctx the parse tree
	 */
	void enterTypename(@NotNull SqlParser.TypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#typename}.
	 * @param ctx the parse tree
	 */
	void exitTypename(@NotNull SqlParser.TypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#numericOnly}.
	 * @param ctx the parse tree
	 */
	void enterNumericOnly(@NotNull SqlParser.NumericOnlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#numericOnly}.
	 * @param ctx the parse tree
	 */
	void exitNumericOnly(@NotNull SqlParser.NumericOnlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#reloption_list}.
	 * @param ctx the parse tree
	 */
	void enterReloption_list(@NotNull SqlParser.Reloption_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#reloption_list}.
	 * @param ctx the parse tree
	 */
	void exitReloption_list(@NotNull SqlParser.Reloption_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_charset}.
	 * @param ctx the parse tree
	 */
	void enterOpt_charset(@NotNull SqlParser.Opt_charsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_charset}.
	 * @param ctx the parse tree
	 */
	void exitOpt_charset(@NotNull SqlParser.Opt_charsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#optTempTableName}.
	 * @param ctx the parse tree
	 */
	void enterOptTempTableName(@NotNull SqlParser.OptTempTableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#optTempTableName}.
	 * @param ctx the parse tree
	 */
	void exitOptTempTableName(@NotNull SqlParser.OptTempTableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#fdw_options}.
	 * @param ctx the parse tree
	 */
	void enterFdw_options(@NotNull SqlParser.Fdw_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#fdw_options}.
	 * @param ctx the parse tree
	 */
	void exitFdw_options(@NotNull SqlParser.Fdw_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#aggr_args}.
	 * @param ctx the parse tree
	 */
	void enterAggr_args(@NotNull SqlParser.Aggr_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#aggr_args}.
	 * @param ctx the parse tree
	 */
	void exitAggr_args(@NotNull SqlParser.Aggr_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_with_data}.
	 * @param ctx the parse tree
	 */
	void enterOpt_with_data(@NotNull SqlParser.Opt_with_dataContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_with_data}.
	 * @param ctx the parse tree
	 */
	void exitOpt_with_data(@NotNull SqlParser.Opt_with_dataContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#truncateStmt}.
	 * @param ctx the parse tree
	 */
	void enterTruncateStmt(@NotNull SqlParser.TruncateStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#truncateStmt}.
	 * @param ctx the parse tree
	 */
	void exitTruncateStmt(@NotNull SqlParser.TruncateStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#qual_all_Op}.
	 * @param ctx the parse tree
	 */
	void enterQual_all_Op(@NotNull SqlParser.Qual_all_OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#qual_all_Op}.
	 * @param ctx the parse tree
	 */
	void exitQual_all_Op(@NotNull SqlParser.Qual_all_OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_if_exists}.
	 * @param ctx the parse tree
	 */
	void enterOpt_if_exists(@NotNull SqlParser.Opt_if_existsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_if_exists}.
	 * @param ctx the parse tree
	 */
	void exitOpt_if_exists(@NotNull SqlParser.Opt_if_existsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_collate_clause}.
	 * @param ctx the parse tree
	 */
	void enterOpt_collate_clause(@NotNull SqlParser.Opt_collate_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_collate_clause}.
	 * @param ctx the parse tree
	 */
	void exitOpt_collate_clause(@NotNull SqlParser.Opt_collate_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#defACLOption}.
	 * @param ctx the parse tree
	 */
	void enterDefACLOption(@NotNull SqlParser.DefACLOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#defACLOption}.
	 * @param ctx the parse tree
	 */
	void exitDefACLOption(@NotNull SqlParser.DefACLOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#func_arg_with_default}.
	 * @param ctx the parse tree
	 */
	void enterFunc_arg_with_default(@NotNull SqlParser.Func_arg_with_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#func_arg_with_default}.
	 * @param ctx the parse tree
	 */
	void exitFunc_arg_with_default(@NotNull SqlParser.Func_arg_with_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#returning_clause}.
	 * @param ctx the parse tree
	 */
	void enterReturning_clause(@NotNull SqlParser.Returning_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#returning_clause}.
	 * @param ctx the parse tree
	 */
	void exitReturning_clause(@NotNull SqlParser.Returning_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#grantee_list}.
	 * @param ctx the parse tree
	 */
	void enterGrantee_list(@NotNull SqlParser.Grantee_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#grantee_list}.
	 * @param ctx the parse tree
	 */
	void exitGrantee_list(@NotNull SqlParser.Grantee_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#target_list}.
	 * @param ctx the parse tree
	 */
	void enterTarget_list(@NotNull SqlParser.Target_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#target_list}.
	 * @param ctx the parse tree
	 */
	void exitTarget_list(@NotNull SqlParser.Target_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_reloptions}.
	 * @param ctx the parse tree
	 */
	void enterOpt_reloptions(@NotNull SqlParser.Opt_reloptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_reloptions}.
	 * @param ctx the parse tree
	 */
	void exitOpt_reloptions(@NotNull SqlParser.Opt_reloptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#functionsetResetClause}.
	 * @param ctx the parse tree
	 */
	void enterFunctionsetResetClause(@NotNull SqlParser.FunctionsetResetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#functionsetResetClause}.
	 * @param ctx the parse tree
	 */
	void exitFunctionsetResetClause(@NotNull SqlParser.FunctionsetResetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createUserMappingStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateUserMappingStmt(@NotNull SqlParser.CreateUserMappingStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createUserMappingStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateUserMappingStmt(@NotNull SqlParser.CreateUserMappingStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#unlistenStmt}.
	 * @param ctx the parse tree
	 */
	void enterUnlistenStmt(@NotNull SqlParser.UnlistenStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#unlistenStmt}.
	 * @param ctx the parse tree
	 */
	void exitUnlistenStmt(@NotNull SqlParser.UnlistenStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#roleId}.
	 * @param ctx the parse tree
	 */
	void enterRoleId(@NotNull SqlParser.RoleIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#roleId}.
	 * @param ctx the parse tree
	 */
	void exitRoleId(@NotNull SqlParser.RoleIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#bitWithoutLength}.
	 * @param ctx the parse tree
	 */
	void enterBitWithoutLength(@NotNull SqlParser.BitWithoutLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#bitWithoutLength}.
	 * @param ctx the parse tree
	 */
	void exitBitWithoutLength(@NotNull SqlParser.BitWithoutLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dropAssertStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropAssertStmt(@NotNull SqlParser.DropAssertStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dropAssertStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropAssertStmt(@NotNull SqlParser.DropAssertStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#sortby}.
	 * @param ctx the parse tree
	 */
	void enterSortby(@NotNull SqlParser.SortbyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sortby}.
	 * @param ctx the parse tree
	 */
	void exitSortby(@NotNull SqlParser.SortbyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#set_clause_list}.
	 * @param ctx the parse tree
	 */
	void enterSet_clause_list(@NotNull SqlParser.Set_clause_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#set_clause_list}.
	 * @param ctx the parse tree
	 */
	void exitSet_clause_list(@NotNull SqlParser.Set_clause_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#tableFuncElement}.
	 * @param ctx the parse tree
	 */
	void enterTableFuncElement(@NotNull SqlParser.TableFuncElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#tableFuncElement}.
	 * @param ctx the parse tree
	 */
	void exitTableFuncElement(@NotNull SqlParser.TableFuncElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#clusterStmt}.
	 * @param ctx the parse tree
	 */
	void enterClusterStmt(@NotNull SqlParser.ClusterStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#clusterStmt}.
	 * @param ctx the parse tree
	 */
	void exitClusterStmt(@NotNull SqlParser.ClusterStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#func_arg_list}.
	 * @param ctx the parse tree
	 */
	void enterFunc_arg_list(@NotNull SqlParser.Func_arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#func_arg_list}.
	 * @param ctx the parse tree
	 */
	void exitFunc_arg_list(@NotNull SqlParser.Func_arg_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#constraints_set_list}.
	 * @param ctx the parse tree
	 */
	void enterConstraints_set_list(@NotNull SqlParser.Constraints_set_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#constraints_set_list}.
	 * @param ctx the parse tree
	 */
	void exitConstraints_set_list(@NotNull SqlParser.Constraints_set_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_lock}.
	 * @param ctx the parse tree
	 */
	void enterOpt_lock(@NotNull SqlParser.Opt_lockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_lock}.
	 * @param ctx the parse tree
	 */
	void exitOpt_lock(@NotNull SqlParser.Opt_lockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#copy_generic_opt_list}.
	 * @param ctx the parse tree
	 */
	void enterCopy_generic_opt_list(@NotNull SqlParser.Copy_generic_opt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#copy_generic_opt_list}.
	 * @param ctx the parse tree
	 */
	void exitCopy_generic_opt_list(@NotNull SqlParser.Copy_generic_opt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#triggerForSpec}.
	 * @param ctx the parse tree
	 */
	void enterTriggerForSpec(@NotNull SqlParser.TriggerForSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#triggerForSpec}.
	 * @param ctx the parse tree
	 */
	void exitTriggerForSpec(@NotNull SqlParser.TriggerForSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createForeignServerStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateForeignServerStmt(@NotNull SqlParser.CreateForeignServerStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createForeignServerStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateForeignServerStmt(@NotNull SqlParser.CreateForeignServerStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#optTemp}.
	 * @param ctx the parse tree
	 */
	void enterOptTemp(@NotNull SqlParser.OptTempContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#optTemp}.
	 * @param ctx the parse tree
	 */
	void exitOptTemp(@NotNull SqlParser.OptTempContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#tableElement}.
	 * @param ctx the parse tree
	 */
	void enterTableElement(@NotNull SqlParser.TableElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#tableElement}.
	 * @param ctx the parse tree
	 */
	void exitTableElement(@NotNull SqlParser.TableElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#def_elem}.
	 * @param ctx the parse tree
	 */
	void enterDef_elem(@NotNull SqlParser.Def_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#def_elem}.
	 * @param ctx the parse tree
	 */
	void exitDef_elem(@NotNull SqlParser.Def_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterTableStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableStmt(@NotNull SqlParser.AlterTableStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterTableStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableStmt(@NotNull SqlParser.AlterTableStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#index_elem}.
	 * @param ctx the parse tree
	 */
	void enterIndex_elem(@NotNull SqlParser.Index_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#index_elem}.
	 * @param ctx the parse tree
	 */
	void exitIndex_elem(@NotNull SqlParser.Index_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#key_actions}.
	 * @param ctx the parse tree
	 */
	void enterKey_actions(@NotNull SqlParser.Key_actionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#key_actions}.
	 * @param ctx the parse tree
	 */
	void exitKey_actions(@NotNull SqlParser.Key_actionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_using}.
	 * @param ctx the parse tree
	 */
	void enterOpt_using(@NotNull SqlParser.Opt_usingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_using}.
	 * @param ctx the parse tree
	 */
	void exitOpt_using(@NotNull SqlParser.Opt_usingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_equal}.
	 * @param ctx the parse tree
	 */
	void enterOpt_equal(@NotNull SqlParser.Opt_equalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_equal}.
	 * @param ctx the parse tree
	 */
	void exitOpt_equal(@NotNull SqlParser.Opt_equalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_or_replace}.
	 * @param ctx the parse tree
	 */
	void enterOpt_or_replace(@NotNull SqlParser.Opt_or_replaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_or_replace}.
	 * @param ctx the parse tree
	 */
	void exitOpt_or_replace(@NotNull SqlParser.Opt_or_replaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#for_locking_item}.
	 * @param ctx the parse tree
	 */
	void enterFor_locking_item(@NotNull SqlParser.For_locking_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#for_locking_item}.
	 * @param ctx the parse tree
	 */
	void exitFor_locking_item(@NotNull SqlParser.For_locking_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#colConstraint}.
	 * @param ctx the parse tree
	 */
	void enterColConstraint(@NotNull SqlParser.ColConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#colConstraint}.
	 * @param ctx the parse tree
	 */
	void exitColConstraint(@NotNull SqlParser.ColConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_enum_val_list}.
	 * @param ctx the parse tree
	 */
	void enterOpt_enum_val_list(@NotNull SqlParser.Opt_enum_val_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_enum_val_list}.
	 * @param ctx the parse tree
	 */
	void exitOpt_enum_val_list(@NotNull SqlParser.Opt_enum_val_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#optSchemaName}.
	 * @param ctx the parse tree
	 */
	void enterOptSchemaName(@NotNull SqlParser.OptSchemaNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#optSchemaName}.
	 * @param ctx the parse tree
	 */
	void exitOptSchemaName(@NotNull SqlParser.OptSchemaNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_restrict}.
	 * @param ctx the parse tree
	 */
	void enterOpt_restrict(@NotNull SqlParser.Opt_restrictContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_restrict}.
	 * @param ctx the parse tree
	 */
	void exitOpt_restrict(@NotNull SqlParser.Opt_restrictContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateStmt(@NotNull SqlParser.CreateStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateStmt(@NotNull SqlParser.CreateStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#exclusionWhereClause}.
	 * @param ctx the parse tree
	 */
	void enterExclusionWhereClause(@NotNull SqlParser.ExclusionWhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#exclusionWhereClause}.
	 * @param ctx the parse tree
	 */
	void exitExclusionWhereClause(@NotNull SqlParser.ExclusionWhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#foreigntableElement}.
	 * @param ctx the parse tree
	 */
	void enterForeigntableElement(@NotNull SqlParser.ForeigntableElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#foreigntableElement}.
	 * @param ctx the parse tree
	 */
	void exitForeigntableElement(@NotNull SqlParser.ForeigntableElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opclass_purpose}.
	 * @param ctx the parse tree
	 */
	void enterOpclass_purpose(@NotNull SqlParser.Opclass_purposeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opclass_purpose}.
	 * @param ctx the parse tree
	 */
	void exitOpclass_purpose(@NotNull SqlParser.Opclass_purposeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterFdwStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterFdwStmt(@NotNull SqlParser.AlterFdwStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterFdwStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterFdwStmt(@NotNull SqlParser.AlterFdwStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterUserMappingStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterUserMappingStmt(@NotNull SqlParser.AlterUserMappingStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterUserMappingStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterUserMappingStmt(@NotNull SqlParser.AlterUserMappingStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#set_rest}.
	 * @param ctx the parse tree
	 */
	void enterSet_rest(@NotNull SqlParser.Set_restContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#set_rest}.
	 * @param ctx the parse tree
	 */
	void exitSet_rest(@NotNull SqlParser.Set_restContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#explain_option_elem}.
	 * @param ctx the parse tree
	 */
	void enterExplain_option_elem(@NotNull SqlParser.Explain_option_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#explain_option_elem}.
	 * @param ctx the parse tree
	 */
	void exitExplain_option_elem(@NotNull SqlParser.Explain_option_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#joined_table}.
	 * @param ctx the parse tree
	 */
	void enterJoined_table(@NotNull SqlParser.Joined_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#joined_table}.
	 * @param ctx the parse tree
	 */
	void exitJoined_table(@NotNull SqlParser.Joined_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_generic_options}.
	 * @param ctx the parse tree
	 */
	void enterCreate_generic_options(@NotNull SqlParser.Create_generic_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_generic_options}.
	 * @param ctx the parse tree
	 */
	void exitCreate_generic_options(@NotNull SqlParser.Create_generic_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#func_args}.
	 * @param ctx the parse tree
	 */
	void enterFunc_args(@NotNull SqlParser.Func_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#func_args}.
	 * @param ctx the parse tree
	 */
	void exitFunc_args(@NotNull SqlParser.Func_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#ruleActionStmt}.
	 * @param ctx the parse tree
	 */
	void enterRuleActionStmt(@NotNull SqlParser.RuleActionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#ruleActionStmt}.
	 * @param ctx the parse tree
	 */
	void exitRuleActionStmt(@NotNull SqlParser.RuleActionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_with_clause}.
	 * @param ctx the parse tree
	 */
	void enterOpt_with_clause(@NotNull SqlParser.Opt_with_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_with_clause}.
	 * @param ctx the parse tree
	 */
	void exitOpt_with_clause(@NotNull SqlParser.Opt_with_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_sort_clause}.
	 * @param ctx the parse tree
	 */
	void enterOpt_sort_clause(@NotNull SqlParser.Opt_sort_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_sort_clause}.
	 * @param ctx the parse tree
	 */
	void exitOpt_sort_clause(@NotNull SqlParser.Opt_sort_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#insert_rest}.
	 * @param ctx the parse tree
	 */
	void enterInsert_rest(@NotNull SqlParser.Insert_restContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#insert_rest}.
	 * @param ctx the parse tree
	 */
	void exitInsert_rest(@NotNull SqlParser.Insert_restContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterOpFamilyStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterOpFamilyStmt(@NotNull SqlParser.AlterOpFamilyStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterOpFamilyStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterOpFamilyStmt(@NotNull SqlParser.AlterOpFamilyStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#all_Op}.
	 * @param ctx the parse tree
	 */
	void enterAll_Op(@NotNull SqlParser.All_OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#all_Op}.
	 * @param ctx the parse tree
	 */
	void exitAll_Op(@NotNull SqlParser.All_OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#fetch_args}.
	 * @param ctx the parse tree
	 */
	void enterFetch_args(@NotNull SqlParser.Fetch_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#fetch_args}.
	 * @param ctx the parse tree
	 */
	void exitFetch_args(@NotNull SqlParser.Fetch_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterCompositeTypeStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterCompositeTypeStmt(@NotNull SqlParser.AlterCompositeTypeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterCompositeTypeStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterCompositeTypeStmt(@NotNull SqlParser.AlterCompositeTypeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#copy_file_name}.
	 * @param ctx the parse tree
	 */
	void enterCopy_file_name(@NotNull SqlParser.Copy_file_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#copy_file_name}.
	 * @param ctx the parse tree
	 */
	void exitCopy_file_name(@NotNull SqlParser.Copy_file_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterDomainStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterDomainStmt(@NotNull SqlParser.AlterDomainStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterDomainStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterDomainStmt(@NotNull SqlParser.AlterDomainStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void enterCursor_name(@NotNull SqlParser.Cursor_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void exitCursor_name(@NotNull SqlParser.Cursor_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#position_list}.
	 * @param ctx the parse tree
	 */
	void enterPosition_list(@NotNull SqlParser.Position_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#position_list}.
	 * @param ctx the parse tree
	 */
	void exitPosition_list(@NotNull SqlParser.Position_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createAsStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateAsStmt(@NotNull SqlParser.CreateAsStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createAsStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateAsStmt(@NotNull SqlParser.CreateAsStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#name_list}.
	 * @param ctx the parse tree
	 */
	void enterName_list(@NotNull SqlParser.Name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#name_list}.
	 * @param ctx the parse tree
	 */
	void exitName_list(@NotNull SqlParser.Name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dropruleStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropruleStmt(@NotNull SqlParser.DropruleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dropruleStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropruleStmt(@NotNull SqlParser.DropruleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_force}.
	 * @param ctx the parse tree
	 */
	void enterOpt_force(@NotNull SqlParser.Opt_forceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_force}.
	 * @param ctx the parse tree
	 */
	void exitOpt_force(@NotNull SqlParser.Opt_forceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#trim_list}.
	 * @param ctx the parse tree
	 */
	void enterTrim_list(@NotNull SqlParser.Trim_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#trim_list}.
	 * @param ctx the parse tree
	 */
	void exitTrim_list(@NotNull SqlParser.Trim_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alias_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlias_clause(@NotNull SqlParser.Alias_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alias_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlias_clause(@NotNull SqlParser.Alias_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#optConstrFromTable}.
	 * @param ctx the parse tree
	 */
	void enterOptConstrFromTable(@NotNull SqlParser.OptConstrFromTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#optConstrFromTable}.
	 * @param ctx the parse tree
	 */
	void exitOptConstrFromTable(@NotNull SqlParser.OptConstrFromTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#join_type}.
	 * @param ctx the parse tree
	 */
	void enterJoin_type(@NotNull SqlParser.Join_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#join_type}.
	 * @param ctx the parse tree
	 */
	void exitJoin_type(@NotNull SqlParser.Join_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#attr_name}.
	 * @param ctx the parse tree
	 */
	void enterAttr_name(@NotNull SqlParser.Attr_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#attr_name}.
	 * @param ctx the parse tree
	 */
	void exitAttr_name(@NotNull SqlParser.Attr_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterRoleSetStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterRoleSetStmt(@NotNull SqlParser.AlterRoleSetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterRoleSetStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterRoleSetStmt(@NotNull SqlParser.AlterRoleSetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#func_expr}.
	 * @param ctx the parse tree
	 */
	void enterFunc_expr(@NotNull SqlParser.Func_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#func_expr}.
	 * @param ctx the parse tree
	 */
	void exitFunc_expr(@NotNull SqlParser.Func_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#copy_options}.
	 * @param ctx the parse tree
	 */
	void enterCopy_options(@NotNull SqlParser.Copy_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#copy_options}.
	 * @param ctx the parse tree
	 */
	void exitCopy_options(@NotNull SqlParser.Copy_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_transaction}.
	 * @param ctx the parse tree
	 */
	void enterOpt_transaction(@NotNull SqlParser.Opt_transactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_transaction}.
	 * @param ctx the parse tree
	 */
	void exitOpt_transaction(@NotNull SqlParser.Opt_transactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#analyze_keyword}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze_keyword(@NotNull SqlParser.Analyze_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#analyze_keyword}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze_keyword(@NotNull SqlParser.Analyze_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterTSConfigurationStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterTSConfigurationStmt(@NotNull SqlParser.AlterTSConfigurationStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterTSConfigurationStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterTSConfigurationStmt(@NotNull SqlParser.AlterTSConfigurationStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#overlay_list}.
	 * @param ctx the parse tree
	 */
	void enterOverlay_list(@NotNull SqlParser.Overlay_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#overlay_list}.
	 * @param ctx the parse tree
	 */
	void exitOverlay_list(@NotNull SqlParser.Overlay_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void enterSelect_clause(@NotNull SqlParser.Select_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void exitSelect_clause(@NotNull SqlParser.Select_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#handler_name}.
	 * @param ctx the parse tree
	 */
	void enterHandler_name(@NotNull SqlParser.Handler_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#handler_name}.
	 * @param ctx the parse tree
	 */
	void exitHandler_name(@NotNull SqlParser.Handler_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(@NotNull SqlParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(@NotNull SqlParser.Any_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#updateStmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdateStmt(@NotNull SqlParser.UpdateStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#updateStmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdateStmt(@NotNull SqlParser.UpdateStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createTableSpaceStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableSpaceStmt(@NotNull SqlParser.CreateTableSpaceStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createTableSpaceStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableSpaceStmt(@NotNull SqlParser.CreateTableSpaceStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_opfamily}.
	 * @param ctx the parse tree
	 */
	void enterOpt_opfamily(@NotNull SqlParser.Opt_opfamilyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_opfamily}.
	 * @param ctx the parse tree
	 */
	void exitOpt_opfamily(@NotNull SqlParser.Opt_opfamilyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#function_with_argtypes}.
	 * @param ctx the parse tree
	 */
	void enterFunction_with_argtypes(@NotNull SqlParser.Function_with_argtypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#function_with_argtypes}.
	 * @param ctx the parse tree
	 */
	void exitFunction_with_argtypes(@NotNull SqlParser.Function_with_argtypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#constraints_set_mode}.
	 * @param ctx the parse tree
	 */
	void enterConstraints_set_mode(@NotNull SqlParser.Constraints_set_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#constraints_set_mode}.
	 * @param ctx the parse tree
	 */
	void exitConstraints_set_mode(@NotNull SqlParser.Constraints_set_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_type}.
	 * @param ctx the parse tree
	 */
	void enterOpt_type(@NotNull SqlParser.Opt_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_type}.
	 * @param ctx the parse tree
	 */
	void exitOpt_type(@NotNull SqlParser.Opt_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterUserSetStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterUserSetStmt(@NotNull SqlParser.AlterUserSetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterUserSetStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterUserSetStmt(@NotNull SqlParser.AlterUserSetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#indirection}.
	 * @param ctx the parse tree
	 */
	void enterIndirection(@NotNull SqlParser.IndirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#indirection}.
	 * @param ctx the parse tree
	 */
	void exitIndirection(@NotNull SqlParser.IndirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dropUserStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropUserStmt(@NotNull SqlParser.DropUserStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dropUserStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropUserStmt(@NotNull SqlParser.DropUserStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#xml_root_version}.
	 * @param ctx the parse tree
	 */
	void enterXml_root_version(@NotNull SqlParser.Xml_root_versionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#xml_root_version}.
	 * @param ctx the parse tree
	 */
	void exitXml_root_version(@NotNull SqlParser.Xml_root_versionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#enum_val_list}.
	 * @param ctx the parse tree
	 */
	void enterEnum_val_list(@NotNull SqlParser.Enum_val_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#enum_val_list}.
	 * @param ctx the parse tree
	 */
	void exitEnum_val_list(@NotNull SqlParser.Enum_val_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#sub_type}.
	 * @param ctx the parse tree
	 */
	void enterSub_type(@NotNull SqlParser.Sub_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sub_type}.
	 * @param ctx the parse tree
	 */
	void exitSub_type(@NotNull SqlParser.Sub_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_boolean_or_string}.
	 * @param ctx the parse tree
	 */
	void enterOpt_boolean_or_string(@NotNull SqlParser.Opt_boolean_or_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_boolean_or_string}.
	 * @param ctx the parse tree
	 */
	void exitOpt_boolean_or_string(@NotNull SqlParser.Opt_boolean_or_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_func_column_list}.
	 * @param ctx the parse tree
	 */
	void enterTable_func_column_list(@NotNull SqlParser.Table_func_column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_func_column_list}.
	 * @param ctx the parse tree
	 */
	void exitTable_func_column_list(@NotNull SqlParser.Table_func_column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#col_name_keyword}.
	 * @param ctx the parse tree
	 */
	void enterCol_name_keyword(@NotNull SqlParser.Col_name_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#col_name_keyword}.
	 * @param ctx the parse tree
	 */
	void exitCol_name_keyword(@NotNull SqlParser.Col_name_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#constcharacter}.
	 * @param ctx the parse tree
	 */
	void enterConstcharacter(@NotNull SqlParser.ConstcharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#constcharacter}.
	 * @param ctx the parse tree
	 */
	void exitConstcharacter(@NotNull SqlParser.ConstcharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#relation_expr_opt_alias}.
	 * @param ctx the parse tree
	 */
	void enterRelation_expr_opt_alias(@NotNull SqlParser.Relation_expr_opt_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#relation_expr_opt_alias}.
	 * @param ctx the parse tree
	 */
	void exitRelation_expr_opt_alias(@NotNull SqlParser.Relation_expr_opt_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_oids}.
	 * @param ctx the parse tree
	 */
	void enterOpt_oids(@NotNull SqlParser.Opt_oidsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_oids}.
	 * @param ctx the parse tree
	 */
	void exitOpt_oids(@NotNull SqlParser.Opt_oidsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#set_clause}.
	 * @param ctx the parse tree
	 */
	void enterSet_clause(@NotNull SqlParser.Set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#set_clause}.
	 * @param ctx the parse tree
	 */
	void exitSet_clause(@NotNull SqlParser.Set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_column_list}.
	 * @param ctx the parse tree
	 */
	void enterOpt_column_list(@NotNull SqlParser.Opt_column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_column_list}.
	 * @param ctx the parse tree
	 */
	void exitOpt_column_list(@NotNull SqlParser.Opt_column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createOptRoleElem}.
	 * @param ctx the parse tree
	 */
	void enterCreateOptRoleElem(@NotNull SqlParser.CreateOptRoleElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createOptRoleElem}.
	 * @param ctx the parse tree
	 */
	void exitCreateOptRoleElem(@NotNull SqlParser.CreateOptRoleElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dropStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropStmt(@NotNull SqlParser.DropStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dropStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropStmt(@NotNull SqlParser.DropStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#comment_text}.
	 * @param ctx the parse tree
	 */
	void enterComment_text(@NotNull SqlParser.Comment_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#comment_text}.
	 * @param ctx the parse tree
	 */
	void exitComment_text(@NotNull SqlParser.Comment_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#privilege_list}.
	 * @param ctx the parse tree
	 */
	void enterPrivilege_list(@NotNull SqlParser.Privilege_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#privilege_list}.
	 * @param ctx the parse tree
	 */
	void exitPrivilege_list(@NotNull SqlParser.Privilege_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_ref}.
	 * @param ctx the parse tree
	 */
	void enterTable_ref(@NotNull SqlParser.Table_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_ref}.
	 * @param ctx the parse tree
	 */
	void exitTable_ref(@NotNull SqlParser.Table_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#var_list}.
	 * @param ctx the parse tree
	 */
	void enterVar_list(@NotNull SqlParser.Var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#var_list}.
	 * @param ctx the parse tree
	 */
	void exitVar_list(@NotNull SqlParser.Var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#join_qual}.
	 * @param ctx the parse tree
	 */
	void enterJoin_qual(@NotNull SqlParser.Join_qualContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#join_qual}.
	 * @param ctx the parse tree
	 */
	void exitJoin_qual(@NotNull SqlParser.Join_qualContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#colId_or_Sconst}.
	 * @param ctx the parse tree
	 */
	void enterColId_or_Sconst(@NotNull SqlParser.ColId_or_SconstContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#colId_or_Sconst}.
	 * @param ctx the parse tree
	 */
	void exitColId_or_Sconst(@NotNull SqlParser.ColId_or_SconstContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#qualified_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_name(@NotNull SqlParser.Qualified_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#qualified_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_name(@NotNull SqlParser.Qualified_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_drop_behavior}.
	 * @param ctx the parse tree
	 */
	void enterOpt_drop_behavior(@NotNull SqlParser.Opt_drop_behaviorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_drop_behavior}.
	 * @param ctx the parse tree
	 */
	void exitOpt_drop_behavior(@NotNull SqlParser.Opt_drop_behaviorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#ruleActionList}.
	 * @param ctx the parse tree
	 */
	void enterRuleActionList(@NotNull SqlParser.RuleActionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#ruleActionList}.
	 * @param ctx the parse tree
	 */
	void exitRuleActionList(@NotNull SqlParser.RuleActionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_verbose}.
	 * @param ctx the parse tree
	 */
	void enterOpt_verbose(@NotNull SqlParser.Opt_verboseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_verbose}.
	 * @param ctx the parse tree
	 */
	void exitOpt_verbose(@NotNull SqlParser.Opt_verboseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(@NotNull SqlParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(@NotNull SqlParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_for_locking_clause}.
	 * @param ctx the parse tree
	 */
	void enterOpt_for_locking_clause(@NotNull SqlParser.Opt_for_locking_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_for_locking_clause}.
	 * @param ctx the parse tree
	 */
	void exitOpt_for_locking_clause(@NotNull SqlParser.Opt_for_locking_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#listenStmt}.
	 * @param ctx the parse tree
	 */
	void enterListenStmt(@NotNull SqlParser.ListenStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#listenStmt}.
	 * @param ctx the parse tree
	 */
	void exitListenStmt(@NotNull SqlParser.ListenStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dropUserMappingStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropUserMappingStmt(@NotNull SqlParser.DropUserMappingStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dropUserMappingStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropUserMappingStmt(@NotNull SqlParser.DropUserMappingStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dropOpClassStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropOpClassStmt(@NotNull SqlParser.DropOpClassStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dropOpClassStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropOpClassStmt(@NotNull SqlParser.DropOpClassStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#closePortalStmt}.
	 * @param ctx the parse tree
	 */
	void enterClosePortalStmt(@NotNull SqlParser.ClosePortalStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#closePortalStmt}.
	 * @param ctx the parse tree
	 */
	void exitClosePortalStmt(@NotNull SqlParser.ClosePortalStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#columnElem}.
	 * @param ctx the parse tree
	 */
	void enterColumnElem(@NotNull SqlParser.ColumnElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#columnElem}.
	 * @param ctx the parse tree
	 */
	void exitColumnElem(@NotNull SqlParser.ColumnElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createfunc_opt_item}.
	 * @param ctx the parse tree
	 */
	void enterCreatefunc_opt_item(@NotNull SqlParser.Createfunc_opt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createfunc_opt_item}.
	 * @param ctx the parse tree
	 */
	void exitCreatefunc_opt_item(@NotNull SqlParser.Createfunc_opt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#reindexStmt}.
	 * @param ctx the parse tree
	 */
	void enterReindexStmt(@NotNull SqlParser.ReindexStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#reindexStmt}.
	 * @param ctx the parse tree
	 */
	void exitReindexStmt(@NotNull SqlParser.ReindexStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#case_expr}.
	 * @param ctx the parse tree
	 */
	void enterCase_expr(@NotNull SqlParser.Case_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#case_expr}.
	 * @param ctx the parse tree
	 */
	void exitCase_expr(@NotNull SqlParser.Case_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterFunctionStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterFunctionStmt(@NotNull SqlParser.AlterFunctionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterFunctionStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterFunctionStmt(@NotNull SqlParser.AlterFunctionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#old_aggr_list}.
	 * @param ctx the parse tree
	 */
	void enterOld_aggr_list(@NotNull SqlParser.Old_aggr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#old_aggr_list}.
	 * @param ctx the parse tree
	 */
	void exitOld_aggr_list(@NotNull SqlParser.Old_aggr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#variableSetStmt}.
	 * @param ctx the parse tree
	 */
	void enterVariableSetStmt(@NotNull SqlParser.VariableSetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#variableSetStmt}.
	 * @param ctx the parse tree
	 */
	void exitVariableSetStmt(@NotNull SqlParser.VariableSetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#any_operator}.
	 * @param ctx the parse tree
	 */
	void enterAny_operator(@NotNull SqlParser.Any_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#any_operator}.
	 * @param ctx the parse tree
	 */
	void exitAny_operator(@NotNull SqlParser.Any_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#triggerOneEvent}.
	 * @param ctx the parse tree
	 */
	void enterTriggerOneEvent(@NotNull SqlParser.TriggerOneEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#triggerOneEvent}.
	 * @param ctx the parse tree
	 */
	void exitTriggerOneEvent(@NotNull SqlParser.TriggerOneEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#columnDef}.
	 * @param ctx the parse tree
	 */
	void enterColumnDef(@NotNull SqlParser.ColumnDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#columnDef}.
	 * @param ctx the parse tree
	 */
	void exitColumnDef(@NotNull SqlParser.ColumnDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#optSchemaEltList}.
	 * @param ctx the parse tree
	 */
	void enterOptSchemaEltList(@NotNull SqlParser.OptSchemaEltListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#optSchemaEltList}.
	 * @param ctx the parse tree
	 */
	void exitOptSchemaEltList(@NotNull SqlParser.OptSchemaEltListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#insert_column_list}.
	 * @param ctx the parse tree
	 */
	void enterInsert_column_list(@NotNull SqlParser.Insert_column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#insert_column_list}.
	 * @param ctx the parse tree
	 */
	void exitInsert_column_list(@NotNull SqlParser.Insert_column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#tableLikeOptionList}.
	 * @param ctx the parse tree
	 */
	void enterTableLikeOptionList(@NotNull SqlParser.TableLikeOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#tableLikeOptionList}.
	 * @param ctx the parse tree
	 */
	void exitTableLikeOptionList(@NotNull SqlParser.TableLikeOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#generic_option_list}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_option_list(@NotNull SqlParser.Generic_option_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#generic_option_list}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_option_list(@NotNull SqlParser.Generic_option_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#revokeStmt}.
	 * @param ctx the parse tree
	 */
	void enterRevokeStmt(@NotNull SqlParser.RevokeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#revokeStmt}.
	 * @param ctx the parse tree
	 */
	void exitRevokeStmt(@NotNull SqlParser.RevokeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dropTableSpaceStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropTableSpaceStmt(@NotNull SqlParser.DropTableSpaceStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dropTableSpaceStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropTableSpaceStmt(@NotNull SqlParser.DropTableSpaceStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#variableShowStmt}.
	 * @param ctx the parse tree
	 */
	void enterVariableShowStmt(@NotNull SqlParser.VariableShowStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#variableShowStmt}.
	 * @param ctx the parse tree
	 */
	void exitVariableShowStmt(@NotNull SqlParser.VariableShowStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#copyStmt}.
	 * @param ctx the parse tree
	 */
	void enterCopyStmt(@NotNull SqlParser.CopyStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#copyStmt}.
	 * @param ctx the parse tree
	 */
	void exitCopyStmt(@NotNull SqlParser.CopyStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#validator_clause}.
	 * @param ctx the parse tree
	 */
	void enterValidator_clause(@NotNull SqlParser.Validator_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#validator_clause}.
	 * @param ctx the parse tree
	 */
	void exitValidator_clause(@NotNull SqlParser.Validator_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#existingIndex}.
	 * @param ctx the parse tree
	 */
	void enterExistingIndex(@NotNull SqlParser.ExistingIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#existingIndex}.
	 * @param ctx the parse tree
	 */
	void exitExistingIndex(@NotNull SqlParser.ExistingIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_array_bounds}.
	 * @param ctx the parse tree
	 */
	void enterOpt_array_bounds(@NotNull SqlParser.Opt_array_boundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_array_bounds}.
	 * @param ctx the parse tree
	 */
	void exitOpt_array_bounds(@NotNull SqlParser.Opt_array_boundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#func_args_list}.
	 * @param ctx the parse tree
	 */
	void enterFunc_args_list(@NotNull SqlParser.Func_args_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#func_args_list}.
	 * @param ctx the parse tree
	 */
	void exitFunc_args_list(@NotNull SqlParser.Func_args_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#numeric}.
	 * @param ctx the parse tree
	 */
	void enterNumeric(@NotNull SqlParser.NumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#numeric}.
	 * @param ctx the parse tree
	 */
	void exitNumeric(@NotNull SqlParser.NumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_trusted}.
	 * @param ctx the parse tree
	 */
	void enterOpt_trusted(@NotNull SqlParser.Opt_trustedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_trusted}.
	 * @param ctx the parse tree
	 */
	void exitOpt_trusted(@NotNull SqlParser.Opt_trustedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#xmlexists_argument}.
	 * @param ctx the parse tree
	 */
	void enterXmlexists_argument(@NotNull SqlParser.Xmlexists_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#xmlexists_argument}.
	 * @param ctx the parse tree
	 */
	void exitXmlexists_argument(@NotNull SqlParser.Xmlexists_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#schema_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSchema_stmt(@NotNull SqlParser.Schema_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#schema_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSchema_stmt(@NotNull SqlParser.Schema_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#qualified_name_list}.
	 * @param ctx the parse tree
	 */
	void enterQualified_name_list(@NotNull SqlParser.Qualified_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#qualified_name_list}.
	 * @param ctx the parse tree
	 */
	void exitQualified_name_list(@NotNull SqlParser.Qualified_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createAssertStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateAssertStmt(@NotNull SqlParser.CreateAssertStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createAssertStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateAssertStmt(@NotNull SqlParser.CreateAssertStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#copy_generic_opt_elem}.
	 * @param ctx the parse tree
	 */
	void enterCopy_generic_opt_elem(@NotNull SqlParser.Copy_generic_opt_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#copy_generic_opt_elem}.
	 * @param ctx the parse tree
	 */
	void exitCopy_generic_opt_elem(@NotNull SqlParser.Copy_generic_opt_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#iConst}.
	 * @param ctx the parse tree
	 */
	void enterIConst(@NotNull SqlParser.IConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#iConst}.
	 * @param ctx the parse tree
	 */
	void exitIConst(@NotNull SqlParser.IConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_generic_option_elem}.
	 * @param ctx the parse tree
	 */
	void enterAlter_generic_option_elem(@NotNull SqlParser.Alter_generic_option_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_generic_option_elem}.
	 * @param ctx the parse tree
	 */
	void exitAlter_generic_option_elem(@NotNull SqlParser.Alter_generic_option_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#columnOptions}.
	 * @param ctx the parse tree
	 */
	void enterColumnOptions(@NotNull SqlParser.ColumnOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#columnOptions}.
	 * @param ctx the parse tree
	 */
	void exitColumnOptions(@NotNull SqlParser.ColumnOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#ruleStmt}.
	 * @param ctx the parse tree
	 */
	void enterRuleStmt(@NotNull SqlParser.RuleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#ruleStmt}.
	 * @param ctx the parse tree
	 */
	void exitRuleStmt(@NotNull SqlParser.RuleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#set_rest_more}.
	 * @param ctx the parse tree
	 */
	void enterSet_rest_more(@NotNull SqlParser.Set_rest_moreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#set_rest_more}.
	 * @param ctx the parse tree
	 */
	void exitSet_rest_more(@NotNull SqlParser.Set_rest_moreContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#explainableStmt}.
	 * @param ctx the parse tree
	 */
	void enterExplainableStmt(@NotNull SqlParser.ExplainableStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#explainableStmt}.
	 * @param ctx the parse tree
	 */
	void exitExplainableStmt(@NotNull SqlParser.ExplainableStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#document_or_content}.
	 * @param ctx the parse tree
	 */
	void enterDocument_or_content(@NotNull SqlParser.Document_or_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#document_or_content}.
	 * @param ctx the parse tree
	 */
	void exitDocument_or_content(@NotNull SqlParser.Document_or_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createDomainStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateDomainStmt(@NotNull SqlParser.CreateDomainStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createDomainStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateDomainStmt(@NotNull SqlParser.CreateDomainStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#window_definition}.
	 * @param ctx the parse tree
	 */
	void enterWindow_definition(@NotNull SqlParser.Window_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#window_definition}.
	 * @param ctx the parse tree
	 */
	void exitWindow_definition(@NotNull SqlParser.Window_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select_offset_value2}.
	 * @param ctx the parse tree
	 */
	void enterSelect_offset_value2(@NotNull SqlParser.Select_offset_value2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_offset_value2}.
	 * @param ctx the parse tree
	 */
	void exitSelect_offset_value2(@NotNull SqlParser.Select_offset_value2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#set_target}.
	 * @param ctx the parse tree
	 */
	void enterSet_target(@NotNull SqlParser.Set_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#set_target}.
	 * @param ctx the parse tree
	 */
	void exitSet_target(@NotNull SqlParser.Set_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#for_locking_items}.
	 * @param ctx the parse tree
	 */
	void enterFor_locking_items(@NotNull SqlParser.For_locking_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#for_locking_items}.
	 * @param ctx the parse tree
	 */
	void exitFor_locking_items(@NotNull SqlParser.For_locking_itemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#reindex_type}.
	 * @param ctx the parse tree
	 */
	void enterReindex_type(@NotNull SqlParser.Reindex_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#reindex_type}.
	 * @param ctx the parse tree
	 */
	void exitReindex_type(@NotNull SqlParser.Reindex_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#reserved_keyword}.
	 * @param ctx the parse tree
	 */
	void enterReserved_keyword(@NotNull SqlParser.Reserved_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#reserved_keyword}.
	 * @param ctx the parse tree
	 */
	void exitReserved_keyword(@NotNull SqlParser.Reserved_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void enterOver_clause(@NotNull SqlParser.Over_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void exitOver_clause(@NotNull SqlParser.Over_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterForeignTableStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterForeignTableStmt(@NotNull SqlParser.AlterForeignTableStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterForeignTableStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterForeignTableStmt(@NotNull SqlParser.AlterForeignTableStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#columnList}.
	 * @param ctx the parse tree
	 */
	void enterColumnList(@NotNull SqlParser.ColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#columnList}.
	 * @param ctx the parse tree
	 */
	void exitColumnList(@NotNull SqlParser.ColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#copy_generic_opt_arg_list}.
	 * @param ctx the parse tree
	 */
	void enterCopy_generic_opt_arg_list(@NotNull SqlParser.Copy_generic_opt_arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#copy_generic_opt_arg_list}.
	 * @param ctx the parse tree
	 */
	void exitCopy_generic_opt_arg_list(@NotNull SqlParser.Copy_generic_opt_arg_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#revokeRoleStmt}.
	 * @param ctx the parse tree
	 */
	void enterRevokeRoleStmt(@NotNull SqlParser.RevokeRoleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#revokeRoleStmt}.
	 * @param ctx the parse tree
	 */
	void exitRevokeRoleStmt(@NotNull SqlParser.RevokeRoleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_extension_opt_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_extension_opt_item(@NotNull SqlParser.Create_extension_opt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_extension_opt_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_extension_opt_item(@NotNull SqlParser.Create_extension_opt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#triggerActionTime}.
	 * @param ctx the parse tree
	 */
	void enterTriggerActionTime(@NotNull SqlParser.TriggerActionTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#triggerActionTime}.
	 * @param ctx the parse tree
	 */
	void exitTriggerActionTime(@NotNull SqlParser.TriggerActionTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select_limit_value}.
	 * @param ctx the parse tree
	 */
	void enterSelect_limit_value(@NotNull SqlParser.Select_limit_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_limit_value}.
	 * @param ctx the parse tree
	 */
	void exitSelect_limit_value(@NotNull SqlParser.Select_limit_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createOpClassStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateOpClassStmt(@NotNull SqlParser.CreateOpClassStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createOpClassStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateOpClassStmt(@NotNull SqlParser.CreateOpClassStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_index_name}.
	 * @param ctx the parse tree
	 */
	void enterOpt_index_name(@NotNull SqlParser.Opt_index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_index_name}.
	 * @param ctx the parse tree
	 */
	void exitOpt_index_name(@NotNull SqlParser.Opt_index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#constDatetime}.
	 * @param ctx the parse tree
	 */
	void enterConstDatetime(@NotNull SqlParser.ConstDatetimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#constDatetime}.
	 * @param ctx the parse tree
	 */
	void exitConstDatetime(@NotNull SqlParser.ConstDatetimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#type_list}.
	 * @param ctx the parse tree
	 */
	void enterType_list(@NotNull SqlParser.Type_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#type_list}.
	 * @param ctx the parse tree
	 */
	void exitType_list(@NotNull SqlParser.Type_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterForeignServerStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterForeignServerStmt(@NotNull SqlParser.AlterForeignServerStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterForeignServerStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterForeignServerStmt(@NotNull SqlParser.AlterForeignServerStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createSeqStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateSeqStmt(@NotNull SqlParser.CreateSeqStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createSeqStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateSeqStmt(@NotNull SqlParser.CreateSeqStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_unique}.
	 * @param ctx the parse tree
	 */
	void enterOpt_unique(@NotNull SqlParser.Opt_uniqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_unique}.
	 * @param ctx the parse tree
	 */
	void exitOpt_unique(@NotNull SqlParser.Opt_uniqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_table_cmd}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_cmd(@NotNull SqlParser.Alter_table_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_table_cmd}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_cmd(@NotNull SqlParser.Alter_table_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select_limit}.
	 * @param ctx the parse tree
	 */
	void enterSelect_limit(@NotNull SqlParser.Select_limitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_limit}.
	 * @param ctx the parse tree
	 */
	void exitSelect_limit(@NotNull SqlParser.Select_limitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#zone_value}.
	 * @param ctx the parse tree
	 */
	void enterZone_value(@NotNull SqlParser.Zone_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#zone_value}.
	 * @param ctx the parse tree
	 */
	void exitZone_value(@NotNull SqlParser.Zone_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#columnref}.
	 * @param ctx the parse tree
	 */
	void enterColumnref(@NotNull SqlParser.ColumnrefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#columnref}.
	 * @param ctx the parse tree
	 */
	void exitColumnref(@NotNull SqlParser.ColumnrefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#def_arg}.
	 * @param ctx the parse tree
	 */
	void enterDef_arg(@NotNull SqlParser.Def_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#def_arg}.
	 * @param ctx the parse tree
	 */
	void exitDef_arg(@NotNull SqlParser.Def_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#index_params}.
	 * @param ctx the parse tree
	 */
	void enterIndex_params(@NotNull SqlParser.Index_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#index_params}.
	 * @param ctx the parse tree
	 */
	void exitIndex_params(@NotNull SqlParser.Index_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(@NotNull SqlParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(@NotNull SqlParser.CharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#colLabel}.
	 * @param ctx the parse tree
	 */
	void enterColLabel(@NotNull SqlParser.ColLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#colLabel}.
	 * @param ctx the parse tree
	 */
	void exitColLabel(@NotNull SqlParser.ColLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dropForeignServerStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropForeignServerStmt(@NotNull SqlParser.DropForeignServerStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dropForeignServerStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropForeignServerStmt(@NotNull SqlParser.DropForeignServerStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#constraintAttr}.
	 * @param ctx the parse tree
	 */
	void enterConstraintAttr(@NotNull SqlParser.ConstraintAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#constraintAttr}.
	 * @param ctx the parse tree
	 */
	void exitConstraintAttr(@NotNull SqlParser.ConstraintAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_timezone}.
	 * @param ctx the parse tree
	 */
	void enterOpt_timezone(@NotNull SqlParser.Opt_timezoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_timezone}.
	 * @param ctx the parse tree
	 */
	void exitOpt_timezone(@NotNull SqlParser.Opt_timezoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#typedtableElement}.
	 * @param ctx the parse tree
	 */
	void enterTypedtableElement(@NotNull SqlParser.TypedtableElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#typedtableElement}.
	 * @param ctx the parse tree
	 */
	void exitTypedtableElement(@NotNull SqlParser.TypedtableElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_partition_clause}.
	 * @param ctx the parse tree
	 */
	void enterOpt_partition_clause(@NotNull SqlParser.Opt_partition_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_partition_clause}.
	 * @param ctx the parse tree
	 */
	void exitOpt_partition_clause(@NotNull SqlParser.Opt_partition_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#ctext_row}.
	 * @param ctx the parse tree
	 */
	void enterCtext_row(@NotNull SqlParser.Ctext_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#ctext_row}.
	 * @param ctx the parse tree
	 */
	void exitCtext_row(@NotNull SqlParser.Ctext_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_check_option}.
	 * @param ctx the parse tree
	 */
	void enterOpt_check_option(@NotNull SqlParser.Opt_check_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_check_option}.
	 * @param ctx the parse tree
	 */
	void exitOpt_check_option(@NotNull SqlParser.Opt_check_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#exclusionConstraintList}.
	 * @param ctx the parse tree
	 */
	void enterExclusionConstraintList(@NotNull SqlParser.ExclusionConstraintListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#exclusionConstraintList}.
	 * @param ctx the parse tree
	 */
	void exitExclusionConstraintList(@NotNull SqlParser.ExclusionConstraintListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#removeOperStmt}.
	 * @param ctx the parse tree
	 */
	void enterRemoveOperStmt(@NotNull SqlParser.RemoveOperStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#removeOperStmt}.
	 * @param ctx the parse tree
	 */
	void exitRemoveOperStmt(@NotNull SqlParser.RemoveOperStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterUserStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterUserStmt(@NotNull SqlParser.AlterUserStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterUserStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterUserStmt(@NotNull SqlParser.AlterUserStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#triggerForOptEach}.
	 * @param ctx the parse tree
	 */
	void enterTriggerForOptEach(@NotNull SqlParser.TriggerForOptEachContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#triggerForOptEach}.
	 * @param ctx the parse tree
	 */
	void exitTriggerForOptEach(@NotNull SqlParser.TriggerForOptEachContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#optTableSpaceOwner}.
	 * @param ctx the parse tree
	 */
	void enterOptTableSpaceOwner(@NotNull SqlParser.OptTableSpaceOwnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#optTableSpaceOwner}.
	 * @param ctx the parse tree
	 */
	void exitOptTableSpaceOwner(@NotNull SqlParser.OptTableSpaceOwnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_inline_handler}.
	 * @param ctx the parse tree
	 */
	void enterOpt_inline_handler(@NotNull SqlParser.Opt_inline_handlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_inline_handler}.
	 * @param ctx the parse tree
	 */
	void exitOpt_inline_handler(@NotNull SqlParser.Opt_inline_handlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opclass_drop_list}.
	 * @param ctx the parse tree
	 */
	void enterOpclass_drop_list(@NotNull SqlParser.Opclass_drop_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opclass_drop_list}.
	 * @param ctx the parse tree
	 */
	void exitOpclass_drop_list(@NotNull SqlParser.Opclass_drop_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#from_list}.
	 * @param ctx the parse tree
	 */
	void enterFrom_list(@NotNull SqlParser.From_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#from_list}.
	 * @param ctx the parse tree
	 */
	void exitFrom_list(@NotNull SqlParser.From_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#func_name}.
	 * @param ctx the parse tree
	 */
	void enterFunc_name(@NotNull SqlParser.Func_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#func_name}.
	 * @param ctx the parse tree
	 */
	void exitFunc_name(@NotNull SqlParser.Func_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectStmt(@NotNull SqlParser.SelectStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectStmt(@NotNull SqlParser.SelectStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#simpletypename}.
	 * @param ctx the parse tree
	 */
	void enterSimpletypename(@NotNull SqlParser.SimpletypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#simpletypename}.
	 * @param ctx the parse tree
	 */
	void exitSimpletypename(@NotNull SqlParser.SimpletypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#key_action}.
	 * @param ctx the parse tree
	 */
	void enterKey_action(@NotNull SqlParser.Key_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#key_action}.
	 * @param ctx the parse tree
	 */
	void exitKey_action(@NotNull SqlParser.Key_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#security_label}.
	 * @param ctx the parse tree
	 */
	void enterSecurity_label(@NotNull SqlParser.Security_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#security_label}.
	 * @param ctx the parse tree
	 */
	void exitSecurity_label(@NotNull SqlParser.Security_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#triggerFuncArg}.
	 * @param ctx the parse tree
	 */
	void enterTriggerFuncArg(@NotNull SqlParser.TriggerFuncArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#triggerFuncArg}.
	 * @param ctx the parse tree
	 */
	void exitTriggerFuncArg(@NotNull SqlParser.TriggerFuncArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#def_list}.
	 * @param ctx the parse tree
	 */
	void enterDef_list(@NotNull SqlParser.Def_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#def_list}.
	 * @param ctx the parse tree
	 */
	void exitDef_list(@NotNull SqlParser.Def_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dropTrigStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropTrigStmt(@NotNull SqlParser.DropTrigStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dropTrigStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropTrigStmt(@NotNull SqlParser.DropTrigStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_table}.
	 * @param ctx the parse tree
	 */
	void enterOpt_table(@NotNull SqlParser.Opt_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_table}.
	 * @param ctx the parse tree
	 */
	void exitOpt_table(@NotNull SqlParser.Opt_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#generic_option_elem}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_option_elem(@NotNull SqlParser.Generic_option_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#generic_option_elem}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_option_elem(@NotNull SqlParser.Generic_option_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_frame_clause}.
	 * @param ctx the parse tree
	 */
	void enterOpt_frame_clause(@NotNull SqlParser.Opt_frame_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_frame_clause}.
	 * @param ctx the parse tree
	 */
	void exitOpt_frame_clause(@NotNull SqlParser.Opt_frame_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(@NotNull SqlParser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(@NotNull SqlParser.Expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opclass_drop}.
	 * @param ctx the parse tree
	 */
	void enterOpclass_drop(@NotNull SqlParser.Opclass_dropContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opclass_drop}.
	 * @param ctx the parse tree
	 */
	void exitOpclass_drop(@NotNull SqlParser.Opclass_dropContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#extract_list}.
	 * @param ctx the parse tree
	 */
	void enterExtract_list(@NotNull SqlParser.Extract_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#extract_list}.
	 * @param ctx the parse tree
	 */
	void exitExtract_list(@NotNull SqlParser.Extract_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#lockStmt}.
	 * @param ctx the parse tree
	 */
	void enterLockStmt(@NotNull SqlParser.LockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#lockStmt}.
	 * @param ctx the parse tree
	 */
	void exitLockStmt(@NotNull SqlParser.LockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_indirection}.
	 * @param ctx the parse tree
	 */
	void enterOpt_indirection(@NotNull SqlParser.Opt_indirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_indirection}.
	 * @param ctx the parse tree
	 */
	void exitOpt_indirection(@NotNull SqlParser.Opt_indirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#substr_list}.
	 * @param ctx the parse tree
	 */
	void enterSubstr_list(@NotNull SqlParser.Substr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#substr_list}.
	 * @param ctx the parse tree
	 */
	void exitSubstr_list(@NotNull SqlParser.Substr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#key_match}.
	 * @param ctx the parse tree
	 */
	void enterKey_match(@NotNull SqlParser.Key_matchContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#key_match}.
	 * @param ctx the parse tree
	 */
	void exitKey_match(@NotNull SqlParser.Key_matchContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#viewStmt}.
	 * @param ctx the parse tree
	 */
	void enterViewStmt(@NotNull SqlParser.ViewStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#viewStmt}.
	 * @param ctx the parse tree
	 */
	void exitViewStmt(@NotNull SqlParser.ViewStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_from_in}.
	 * @param ctx the parse tree
	 */
	void enterOpt_from_in(@NotNull SqlParser.Opt_from_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_from_in}.
	 * @param ctx the parse tree
	 */
	void exitOpt_from_in(@NotNull SqlParser.Opt_from_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#vacuum_option_list}.
	 * @param ctx the parse tree
	 */
	void enterVacuum_option_list(@NotNull SqlParser.Vacuum_option_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#vacuum_option_list}.
	 * @param ctx the parse tree
	 */
	void exitVacuum_option_list(@NotNull SqlParser.Vacuum_option_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#variableResetStmt}.
	 * @param ctx the parse tree
	 */
	void enterVariableResetStmt(@NotNull SqlParser.VariableResetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#variableResetStmt}.
	 * @param ctx the parse tree
	 */
	void exitVariableResetStmt(@NotNull SqlParser.VariableResetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#iso_level}.
	 * @param ctx the parse tree
	 */
	void enterIso_level(@NotNull SqlParser.Iso_levelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#iso_level}.
	 * @param ctx the parse tree
	 */
	void exitIso_level(@NotNull SqlParser.Iso_levelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#explain_option_arg}.
	 * @param ctx the parse tree
	 */
	void enterExplain_option_arg(@NotNull SqlParser.Explain_option_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#explain_option_arg}.
	 * @param ctx the parse tree
	 */
	void exitExplain_option_arg(@NotNull SqlParser.Explain_option_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_binary}.
	 * @param ctx the parse tree
	 */
	void enterOpt_binary(@NotNull SqlParser.Opt_binaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_binary}.
	 * @param ctx the parse tree
	 */
	void exitOpt_binary(@NotNull SqlParser.Opt_binaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#notify_payload}.
	 * @param ctx the parse tree
	 */
	void enterNotify_payload(@NotNull SqlParser.Notify_payloadContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#notify_payload}.
	 * @param ctx the parse tree
	 */
	void exitNotify_payload(@NotNull SqlParser.Notify_payloadContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void enterInto_clause(@NotNull SqlParser.Into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void exitInto_clause(@NotNull SqlParser.Into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#sConst}.
	 * @param ctx the parse tree
	 */
	void enterSConst(@NotNull SqlParser.SConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sConst}.
	 * @param ctx the parse tree
	 */
	void exitSConst(@NotNull SqlParser.SConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_provider}.
	 * @param ctx the parse tree
	 */
	void enterOpt_provider(@NotNull SqlParser.Opt_providerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_provider}.
	 * @param ctx the parse tree
	 */
	void exitOpt_provider(@NotNull SqlParser.Opt_providerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#setResetClause}.
	 * @param ctx the parse tree
	 */
	void enterSetResetClause(@NotNull SqlParser.SetResetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#setResetClause}.
	 * @param ctx the parse tree
	 */
	void exitSetResetClause(@NotNull SqlParser.SetResetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createCastStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateCastStmt(@NotNull SqlParser.CreateCastStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createCastStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateCastStmt(@NotNull SqlParser.CreateCastStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#triggerWhen}.
	 * @param ctx the parse tree
	 */
	void enterTriggerWhen(@NotNull SqlParser.TriggerWhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#triggerWhen}.
	 * @param ctx the parse tree
	 */
	void exitTriggerWhen(@NotNull SqlParser.TriggerWhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(@NotNull SqlParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(@NotNull SqlParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#window_clause}.
	 * @param ctx the parse tree
	 */
	void enterWindow_clause(@NotNull SqlParser.Window_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#window_clause}.
	 * @param ctx the parse tree
	 */
	void exitWindow_clause(@NotNull SqlParser.Window_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_interval}.
	 * @param ctx the parse tree
	 */
	void enterOpt_interval(@NotNull SqlParser.Opt_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_interval}.
	 * @param ctx the parse tree
	 */
	void exitOpt_interval(@NotNull SqlParser.Opt_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_foreign_server_version}.
	 * @param ctx the parse tree
	 */
	void enterOpt_foreign_server_version(@NotNull SqlParser.Opt_foreign_server_versionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_foreign_server_version}.
	 * @param ctx the parse tree
	 */
	void exitOpt_foreign_server_version(@NotNull SqlParser.Opt_foreign_server_versionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#typedtableElementList}.
	 * @param ctx the parse tree
	 */
	void enterTypedtableElementList(@NotNull SqlParser.TypedtableElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#typedtableElementList}.
	 * @param ctx the parse tree
	 */
	void exitTypedtableElementList(@NotNull SqlParser.TypedtableElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createTrigStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateTrigStmt(@NotNull SqlParser.CreateTrigStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createTrigStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateTrigStmt(@NotNull SqlParser.CreateTrigStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#any_name_list}.
	 * @param ctx the parse tree
	 */
	void enterAny_name_list(@NotNull SqlParser.Any_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#any_name_list}.
	 * @param ctx the parse tree
	 */
	void exitAny_name_list(@NotNull SqlParser.Any_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#generic_option_arg}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_option_arg(@NotNull SqlParser.Generic_option_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#generic_option_arg}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_option_arg(@NotNull SqlParser.Generic_option_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterGroupStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterGroupStmt(@NotNull SqlParser.AlterGroupStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterGroupStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterGroupStmt(@NotNull SqlParser.AlterGroupStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#triggerEvents}.
	 * @param ctx the parse tree
	 */
	void enterTriggerEvents(@NotNull SqlParser.TriggerEventsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#triggerEvents}.
	 * @param ctx the parse tree
	 */
	void exitTriggerEvents(@NotNull SqlParser.TriggerEventsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#common_table_expr}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expr(@NotNull SqlParser.Common_table_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#common_table_expr}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expr(@NotNull SqlParser.Common_table_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#defineStmt}.
	 * @param ctx the parse tree
	 */
	void enterDefineStmt(@NotNull SqlParser.DefineStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#defineStmt}.
	 * @param ctx the parse tree
	 */
	void exitDefineStmt(@NotNull SqlParser.DefineStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createOpFamilyStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateOpFamilyStmt(@NotNull SqlParser.CreateOpFamilyStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createOpFamilyStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateOpFamilyStmt(@NotNull SqlParser.CreateOpFamilyStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#c_expr}.
	 * @param ctx the parse tree
	 */
	void enterC_expr(@NotNull SqlParser.C_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#c_expr}.
	 * @param ctx the parse tree
	 */
	void exitC_expr(@NotNull SqlParser.C_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#file_name}.
	 * @param ctx the parse tree
	 */
	void enterFile_name(@NotNull SqlParser.File_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#file_name}.
	 * @param ctx the parse tree
	 */
	void exitFile_name(@NotNull SqlParser.File_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#constraintAttributeElem}.
	 * @param ctx the parse tree
	 */
	void enterConstraintAttributeElem(@NotNull SqlParser.ConstraintAttributeElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#constraintAttributeElem}.
	 * @param ctx the parse tree
	 */
	void exitConstraintAttributeElem(@NotNull SqlParser.ConstraintAttributeElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterdb_opt_item}.
	 * @param ctx the parse tree
	 */
	void enterAlterdb_opt_item(@NotNull SqlParser.Alterdb_opt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterdb_opt_item}.
	 * @param ctx the parse tree
	 */
	void exitAlterdb_opt_item(@NotNull SqlParser.Alterdb_opt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select_offset_value}.
	 * @param ctx the parse tree
	 */
	void enterSelect_offset_value(@NotNull SqlParser.Select_offset_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_offset_value}.
	 * @param ctx the parse tree
	 */
	void exitSelect_offset_value(@NotNull SqlParser.Select_offset_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterDatabaseStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterDatabaseStmt(@NotNull SqlParser.AlterDatabaseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterDatabaseStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterDatabaseStmt(@NotNull SqlParser.AlterDatabaseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#executeStmt}.
	 * @param ctx the parse tree
	 */
	void enterExecuteStmt(@NotNull SqlParser.ExecuteStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#executeStmt}.
	 * @param ctx the parse tree
	 */
	void exitExecuteStmt(@NotNull SqlParser.ExecuteStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#exclusionconstraintElem}.
	 * @param ctx the parse tree
	 */
	void enterExclusionconstraintElem(@NotNull SqlParser.ExclusionconstraintElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#exclusionconstraintElem}.
	 * @param ctx the parse tree
	 */
	void exitExclusionconstraintElem(@NotNull SqlParser.ExclusionconstraintElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opclass_item_list}.
	 * @param ctx the parse tree
	 */
	void enterOpclass_item_list(@NotNull SqlParser.Opclass_item_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opclass_item_list}.
	 * @param ctx the parse tree
	 */
	void exitOpclass_item_list(@NotNull SqlParser.Opclass_item_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#extract_arg}.
	 * @param ctx the parse tree
	 */
	void enterExtract_arg(@NotNull SqlParser.Extract_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#extract_arg}.
	 * @param ctx the parse tree
	 */
	void exitExtract_arg(@NotNull SqlParser.Extract_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_column_default}.
	 * @param ctx the parse tree
	 */
	void enterAlter_column_default(@NotNull SqlParser.Alter_column_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_column_default}.
	 * @param ctx the parse tree
	 */
	void exitAlter_column_default(@NotNull SqlParser.Alter_column_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createUserStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateUserStmt(@NotNull SqlParser.CreateUserStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createUserStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateUserStmt(@NotNull SqlParser.CreateUserStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#copy_from}.
	 * @param ctx the parse tree
	 */
	void enterCopy_from(@NotNull SqlParser.Copy_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#copy_from}.
	 * @param ctx the parse tree
	 */
	void exitCopy_from(@NotNull SqlParser.Copy_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#opt_varying}.
	 * @param ctx the parse tree
	 */
	void enterOpt_varying(@NotNull SqlParser.Opt_varyingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#opt_varying}.
	 * @param ctx the parse tree
	 */
	void exitOpt_varying(@NotNull SqlParser.Opt_varyingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#preparableStmt}.
	 * @param ctx the parse tree
	 */
	void enterPreparableStmt(@NotNull SqlParser.PreparableStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#preparableStmt}.
	 * @param ctx the parse tree
	 */
	void exitPreparableStmt(@NotNull SqlParser.PreparableStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(@NotNull SqlParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(@NotNull SqlParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#set_target_list}.
	 * @param ctx the parse tree
	 */
	void enterSet_target_list(@NotNull SqlParser.Set_target_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#set_target_list}.
	 * @param ctx the parse tree
	 */
	void exitSet_target_list(@NotNull SqlParser.Set_target_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#vacuum_option_elem}.
	 * @param ctx the parse tree
	 */
	void enterVacuum_option_elem(@NotNull SqlParser.Vacuum_option_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#vacuum_option_elem}.
	 * @param ctx the parse tree
	 */
	void exitVacuum_option_elem(@NotNull SqlParser.Vacuum_option_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#execute_param_clause}.
	 * @param ctx the parse tree
	 */
	void enterExecute_param_clause(@NotNull SqlParser.Execute_param_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#execute_param_clause}.
	 * @param ctx the parse tree
	 */
	void exitExecute_param_clause(@NotNull SqlParser.Execute_param_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alterOptRoleElem}.
	 * @param ctx the parse tree
	 */
	void enterAlterOptRoleElem(@NotNull SqlParser.AlterOptRoleElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alterOptRoleElem}.
	 * @param ctx the parse tree
	 */
	void exitAlterOptRoleElem(@NotNull SqlParser.AlterOptRoleElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#consttypename}.
	 * @param ctx the parse tree
	 */
	void enterConsttypename(@NotNull SqlParser.ConsttypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#consttypename}.
	 * @param ctx the parse tree
	 */
	void exitConsttypename(@NotNull SqlParser.ConsttypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#copy_opt_list}.
	 * @param ctx the parse tree
	 */
	void enterCopy_opt_list(@NotNull SqlParser.Copy_opt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#copy_opt_list}.
	 * @param ctx the parse tree
	 */
	void exitCopy_opt_list(@NotNull SqlParser.Copy_opt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#loadStmt}.
	 * @param ctx the parse tree
	 */
	void enterLoadStmt(@NotNull SqlParser.LoadStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#loadStmt}.
	 * @param ctx the parse tree
	 */
	void exitLoadStmt(@NotNull SqlParser.LoadStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#qual_Op}.
	 * @param ctx the parse tree
	 */
	void enterQual_Op(@NotNull SqlParser.Qual_OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#qual_Op}.
	 * @param ctx the parse tree
	 */
	void exitQual_Op(@NotNull SqlParser.Qual_OpContext ctx);
}