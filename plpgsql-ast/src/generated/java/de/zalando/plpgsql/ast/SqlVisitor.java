// Generated from de/zalando/plpgsql/ast/Sql.g4 by ANTLR 4.2.3
package de.zalando.plpgsql.ast;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterExtensionContentsStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterExtensionContentsStmt(@NotNull SqlParser.AlterExtensionContentsStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_no_parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_no_parens(@NotNull SqlParser.Select_no_parensContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#privileges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivileges(@NotNull SqlParser.PrivilegesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ruleActionStmtOrEmpty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleActionStmtOrEmpty(@NotNull SqlParser.RuleActionStmtOrEmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent(@NotNull SqlParser.EventContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_instead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_instead(@NotNull SqlParser.Opt_insteadContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropFdwStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropFdwStmt(@NotNull SqlParser.DropFdwStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_as}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_as(@NotNull SqlParser.Opt_asContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#access_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_method(@NotNull SqlParser.Access_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#optforeigntableElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptforeigntableElementList(@NotNull SqlParser.OptforeigntableElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#array_expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_expr_list(@NotNull SqlParser.Array_expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterfunc_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterfunc_opt_list(@NotNull SqlParser.Alterfunc_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#frame_extent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrame_extent(@NotNull SqlParser.Frame_extentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#characterWithoutLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterWithoutLength(@NotNull SqlParser.CharacterWithoutLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#transaction_mode_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_mode_item(@NotNull SqlParser.Transaction_mode_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#vacuumStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuumStmt(@NotNull SqlParser.VacuumStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_fdw_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_fdw_options(@NotNull SqlParser.Opt_fdw_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opttypedtableElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpttypedtableElementList(@NotNull SqlParser.OpttypedtableElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#bit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit(@NotNull SqlParser.BitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(@NotNull SqlParser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#limit_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit_clause(@NotNull SqlParser.Limit_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#discardStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscardStmt(@NotNull SqlParser.DiscardStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#constraintsSetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintsSetStmt(@NotNull SqlParser.ConstraintsSetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_select_limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_select_limit(@NotNull SqlParser.Opt_select_limitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#constInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstInterval(@NotNull SqlParser.ConstIntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#copy_generic_opt_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_generic_opt_arg(@NotNull SqlParser.Copy_generic_opt_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_type(@NotNull SqlParser.Drop_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#explainStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainStmt(@NotNull SqlParser.ExplainStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#optseqOptList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptseqOptList(@NotNull SqlParser.OptseqOptListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#reassignOwnedStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReassignOwnedStmt(@NotNull SqlParser.ReassignOwnedStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#foreigntableElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeigntableElementList(@NotNull SqlParser.ForeigntableElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tableLikeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableLikeClause(@NotNull SqlParser.TableLikeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#old_aggr_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOld_aggr_definition(@NotNull SqlParser.Old_aggr_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#where_or_current_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_or_current_clause(@NotNull SqlParser.Where_or_current_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_by}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_by(@NotNull SqlParser.Opt_byContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ctext_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtext_expr(@NotNull SqlParser.Ctext_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#func_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_arg(@NotNull SqlParser.Func_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#window_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_specification(@NotNull SqlParser.Window_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#optTableSpace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptTableSpace(@NotNull SqlParser.OptTableSpaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_nulls_order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_nulls_order(@NotNull SqlParser.Opt_nulls_orderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#in_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_expr(@NotNull SqlParser.In_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#having_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_clause(@NotNull SqlParser.Having_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropdbStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropdbStmt(@NotNull SqlParser.DropdbStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#characterWithLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterWithLength(@NotNull SqlParser.CharacterWithLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#analyzeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyzeStmt(@NotNull SqlParser.AnalyzeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_distinct(@NotNull SqlParser.Opt_distinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_using}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_using(@NotNull SqlParser.Alter_usingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_generic_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_generic_options(@NotNull SqlParser.Alter_generic_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#colconstraintElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColconstraintElem(@NotNull SqlParser.ColconstraintElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterEnumStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterEnumStmt(@NotNull SqlParser.AlterEnumStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_xml_root_standalone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_xml_root_standalone(@NotNull SqlParser.Opt_xml_root_standaloneContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#defACLOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefACLOptionList(@NotNull SqlParser.DefACLOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#privilege_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilege_target(@NotNull SqlParser.Privilege_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#using_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_clause(@NotNull SqlParser.Using_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#deallocateStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeallocateStmt(@NotNull SqlParser.DeallocateStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#triggerForType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerForType(@NotNull SqlParser.TriggerForTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#key_update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_update(@NotNull SqlParser.Key_updateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_default(@NotNull SqlParser.Opt_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterRoleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterRoleStmt(@NotNull SqlParser.AlterRoleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#triggerFuncArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerFuncArgs(@NotNull SqlParser.TriggerFuncArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterTSDictionaryStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTSDictionaryStmt(@NotNull SqlParser.AlterTSDictionaryStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_collate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_collate(@NotNull SqlParser.Opt_collateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_extension_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_extension_opt_list(@NotNull SqlParser.Alter_extension_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#window_definition_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_definition_list(@NotNull SqlParser.Window_definition_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#xml_attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_attributes(@NotNull SqlParser.Xml_attributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_generic_option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_generic_option_list(@NotNull SqlParser.Alter_generic_option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#from_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_in(@NotNull SqlParser.From_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_concurrently}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_concurrently(@NotNull SqlParser.Opt_concurrentlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterDatabaseSetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDatabaseSetStmt(@NotNull SqlParser.AlterDatabaseSetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createGroupStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateGroupStmt(@NotNull SqlParser.CreateGroupStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_asymmetric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_asymmetric(@NotNull SqlParser.Opt_asymmetricContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createdb_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedb_opt_item(@NotNull SqlParser.Createdb_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_select_fetch_first_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_select_fetch_first_value(@NotNull SqlParser.Opt_select_fetch_first_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterDefaultPrivilegesStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDefaultPrivilegesStmt(@NotNull SqlParser.AlterDefaultPrivilegesStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#reloption_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReloption_elem(@NotNull SqlParser.Reloption_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alteroptRoleList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlteroptRoleList(@NotNull SqlParser.AlteroptRoleListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_type_cmds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_type_cmds(@NotNull SqlParser.Alter_type_cmdsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#relation_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation_expr(@NotNull SqlParser.Relation_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#func_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_type(@NotNull SqlParser.Func_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#comment_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_type(@NotNull SqlParser.Comment_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#aexprConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprConst(@NotNull SqlParser.AexprConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createPLangStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatePLangStmt(@NotNull SqlParser.CreatePLangStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#type_function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_function_name(@NotNull SqlParser.Type_function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#defacl_privilege_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefacl_privilege_target(@NotNull SqlParser.Defacl_privilege_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#values_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues_clause(@NotNull SqlParser.Values_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#indirection_el}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndirection_el(@NotNull SqlParser.Indirection_elContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#target_el}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget_el(@NotNull SqlParser.Target_elContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#prepareStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepareStmt(@NotNull SqlParser.PrepareStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_func_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_func_column(@NotNull SqlParser.Table_func_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#transaction_mode_list_or_empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_mode_list_or_empty(@NotNull SqlParser.Transaction_mode_list_or_emptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#explain_option_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain_option_name(@NotNull SqlParser.Explain_option_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#func_args_with_defaults_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_args_with_defaults_list(@NotNull SqlParser.Func_args_with_defaults_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createdb_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedb_opt_list(@NotNull SqlParser.Createdb_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#transactionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionStmt(@NotNull SqlParser.TransactionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_granted_by}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_granted_by(@NotNull SqlParser.Opt_granted_byContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#function_with_argtypes_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_with_argtypes_list(@NotNull SqlParser.Function_with_argtypes_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_hold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_hold(@NotNull SqlParser.Opt_holdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_extension_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_extension_opt_item(@NotNull SqlParser.Alter_extension_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_no_inherit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_no_inherit(@NotNull SqlParser.Opt_no_inheritContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#grantee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantee(@NotNull SqlParser.GranteeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_with_parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_with_parens(@NotNull SqlParser.Select_with_parensContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#optInherit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptInherit(@NotNull SqlParser.OptInheritContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#single_set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_set_clause(@NotNull SqlParser.Single_set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_extension_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_extension_opt_list(@NotNull SqlParser.Create_extension_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tableElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableElementList(@NotNull SqlParser.TableElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#simple_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_select(@NotNull SqlParser.Simple_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(@NotNull SqlParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#bitWithLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitWithLength(@NotNull SqlParser.BitWithLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#a_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_expr(@NotNull SqlParser.A_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_grant_admin_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_grant_admin_option(@NotNull SqlParser.Opt_grant_admin_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_ref2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_ref2(@NotNull SqlParser.Table_ref2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#mathOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathOp(@NotNull SqlParser.MathOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#foreign_server_version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_server_version(@NotNull SqlParser.Foreign_server_versionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#auth_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuth_ident(@NotNull SqlParser.Auth_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_validator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_validator(@NotNull SqlParser.Opt_validatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#security_label_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurity_label_type(@NotNull SqlParser.Security_label_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(@NotNull SqlParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#numericOnly_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericOnly_list(@NotNull SqlParser.NumericOnly_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(@NotNull SqlParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#arg_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_class(@NotNull SqlParser.Arg_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_restart_seqs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_restart_seqs(@NotNull SqlParser.Opt_restart_seqsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#subquery_Op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery_Op(@NotNull SqlParser.Subquery_OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_definition(@NotNull SqlParser.Opt_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterdb_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterdb_opt_list(@NotNull SqlParser.Alterdb_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#character_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_def(@NotNull SqlParser.Character_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#genericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericType(@NotNull SqlParser.GenericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#privilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilege(@NotNull SqlParser.PrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#oper_argtypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper_argtypes(@NotNull SqlParser.Oper_argtypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#declareCursorStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareCursorStmt(@NotNull SqlParser.DeclareCursorStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#row_or_rows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow_or_rows(@NotNull SqlParser.Row_or_rowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropGroupStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropGroupStmt(@NotNull SqlParser.DropGroupStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#substr_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstr_for(@NotNull SqlParser.Substr_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#insert_column_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_column_item(@NotNull SqlParser.Insert_column_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tableLikeOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableLikeOption(@NotNull SqlParser.TableLikeOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fetchStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetchStmt(@NotNull SqlParser.FetchStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#func_as}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_as(@NotNull SqlParser.Func_asContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#xml_attribute_el}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_attribute_el(@NotNull SqlParser.Xml_attribute_elContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#indexStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexStmt(@NotNull SqlParser.IndexStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#stmtblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtblock(@NotNull SqlParser.StmtblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#when_clause_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen_clause_list(@NotNull SqlParser.When_clause_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#offset_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffset_clause(@NotNull SqlParser.Offset_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_existing_window_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_existing_window_name(@NotNull SqlParser.Opt_existing_window_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_float(@NotNull SqlParser.Opt_floatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#doStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStmt(@NotNull SqlParser.DoStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createfunc_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatefunc_opt_list(@NotNull SqlParser.Createfunc_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#renameStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameStmt(@NotNull SqlParser.RenameStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#deleteStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStmt(@NotNull SqlParser.DeleteStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#for_locking_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_locking_clause(@NotNull SqlParser.For_locking_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#interval_second}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_second(@NotNull SqlParser.Interval_secondContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#func_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_return(@NotNull SqlParser.Func_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#old_aggr_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOld_aggr_elem(@NotNull SqlParser.Old_aggr_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createForeignTableStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateForeignTableStmt(@NotNull SqlParser.CreateForeignTableStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_encoding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_encoding(@NotNull SqlParser.Opt_encodingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropPLangStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropPLangStmt(@NotNull SqlParser.DropPLangStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_column(@NotNull SqlParser.Opt_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#onCommitOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnCommitOption(@NotNull SqlParser.OnCommitOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_class(@NotNull SqlParser.Opt_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropRoleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropRoleStmt(@NotNull SqlParser.DropRoleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#checkPointStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckPointStmt(@NotNull SqlParser.CheckPointStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#copy_delimiter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_delimiter(@NotNull SqlParser.Copy_delimiterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_full}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_full(@NotNull SqlParser.Opt_fullContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(@NotNull SqlParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_all(@NotNull SqlParser.Opt_allContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#removeAggrStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemoveAggrStmt(@NotNull SqlParser.RemoveAggrStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#cast_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_context(@NotNull SqlParser.Cast_contextContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#constraintAttributeSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintAttributeSpec(@NotNull SqlParser.ConstraintAttributeSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#xml_attribute_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_attribute_list(@NotNull SqlParser.Xml_attribute_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#defACLAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefACLAction(@NotNull SqlParser.DefACLActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterExtensionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterExtensionStmt(@NotNull SqlParser.AlterExtensionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#seqOptList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqOptList(@NotNull SqlParser.SeqOptListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#copy_generic_opt_arg_list_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_generic_opt_arg_list_item(@NotNull SqlParser.Copy_generic_opt_arg_list_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#func_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_table(@NotNull SqlParser.Func_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#common_func_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_func_opt_item(@NotNull SqlParser.Common_func_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#stmtmulti}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtmulti(@NotNull SqlParser.StmtmultiContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterOwnerStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOwnerStmt(@NotNull SqlParser.AlterOwnerStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#param_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_name(@NotNull SqlParser.Param_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#reloptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReloptions(@NotNull SqlParser.ReloptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_as_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_as_target(@NotNull SqlParser.Create_as_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createSchemaStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSchemaStmt(@NotNull SqlParser.CreateSchemaStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterObjectSchemaStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterObjectSchemaStmt(@NotNull SqlParser.AlterObjectSchemaStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#cte_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_list(@NotNull SqlParser.Cte_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createConversionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateConversionStmt(@NotNull SqlParser.CreateConversionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#multiple_set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_set_clause(@NotNull SqlParser.Multiple_set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createFdwStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFdwStmt(@NotNull SqlParser.CreateFdwStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#optRoleList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptRoleList(@NotNull SqlParser.OptRoleListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_name_list(@NotNull SqlParser.Opt_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#grantRoleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantRoleStmt(@NotNull SqlParser.GrantRoleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#lock_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_type(@NotNull SqlParser.Lock_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ctext_expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtext_expr_list(@NotNull SqlParser.Ctext_expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#transaction_mode_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_mode_list(@NotNull SqlParser.Transaction_mode_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#xml_whitespace_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_whitespace_option(@NotNull SqlParser.Xml_whitespace_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#secLabelStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecLabelStmt(@NotNull SqlParser.SecLabelStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#overlay_placing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverlay_placing(@NotNull SqlParser.Overlay_placingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#type_func_name_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_func_name_keyword(@NotNull SqlParser.Type_func_name_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_procedural}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_procedural(@NotNull SqlParser.Opt_proceduralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#case_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_default(@NotNull SqlParser.Case_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#signedIconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedIconst(@NotNull SqlParser.SignedIconstContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#cursor_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_options(@NotNull SqlParser.Cursor_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#locked_rels_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocked_rels_list(@NotNull SqlParser.Locked_rels_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_table_cmds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_cmds(@NotNull SqlParser.Alter_table_cmdsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dostmt_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDostmt_opt_list(@NotNull SqlParser.Dostmt_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#sort_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort_clause(@NotNull SqlParser.Sort_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#colId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColId(@NotNull SqlParser.ColIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#group_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_clause(@NotNull SqlParser.Group_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_type_modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_type_modifiers(@NotNull SqlParser.Opt_type_modifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#seqOptElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqOptElem(@NotNull SqlParser.SeqOptElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#optWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptWith(@NotNull SqlParser.OptWithContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#sortby_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortby_list(@NotNull SqlParser.Sortby_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#prep_type_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrep_type_clause(@NotNull SqlParser.Prep_type_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#when_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen_clause(@NotNull SqlParser.When_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_recheck}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_recheck(@NotNull SqlParser.Opt_recheckContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#frame_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrame_bound(@NotNull SqlParser.Frame_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#removeFuncStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemoveFuncStmt(@NotNull SqlParser.RemoveFuncStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#substr_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstr_from(@NotNull SqlParser.Substr_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#notifyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotifyStmt(@NotNull SqlParser.NotifyStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#attrs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrs(@NotNull SqlParser.AttrsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_type_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_type_cmd(@NotNull SqlParser.Alter_type_cmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#insertStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStmt(@NotNull SqlParser.InsertStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#first_or_next}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst_or_next(@NotNull SqlParser.First_or_nextContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#add_drop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_drop(@NotNull SqlParser.Add_dropContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#copy_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_opt_item(@NotNull SqlParser.Copy_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#func_args_with_defaults}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_args_with_defaults(@NotNull SqlParser.Func_args_with_defaultsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#func_arg_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_arg_expr(@NotNull SqlParser.Func_arg_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#var_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_name(@NotNull SqlParser.Var_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_asc_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_asc_desc(@NotNull SqlParser.Opt_asc_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#explain_option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain_option_list(@NotNull SqlParser.Explain_option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_grant_grant_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_grant_grant_option(@NotNull SqlParser.Opt_grant_grant_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_set_data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_set_data(@NotNull SqlParser.Opt_set_dataContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableConstraint(@NotNull SqlParser.TableConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#grantStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantStmt(@NotNull SqlParser.GrantStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#generic_option_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_option_name(@NotNull SqlParser.Generic_option_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dostmt_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDostmt_opt_item(@NotNull SqlParser.Dostmt_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#var_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_value(@NotNull SqlParser.Var_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#optConsTableSpace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptConsTableSpace(@NotNull SqlParser.OptConsTableSpaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opttableElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpttableElementList(@NotNull SqlParser.OpttableElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#access_method_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_method_clause(@NotNull SqlParser.Access_method_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#cluster_index_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCluster_index_specification(@NotNull SqlParser.Cluster_index_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#case_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_arg(@NotNull SqlParser.Case_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropOpFamilyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropOpFamilyStmt(@NotNull SqlParser.DropOpFamilyStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropCastStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropCastStmt(@NotNull SqlParser.DropCastStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterSeqStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSeqStmt(@NotNull SqlParser.AlterSeqStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropOwnedStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropOwnedStmt(@NotNull SqlParser.DropOwnedStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createdbStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedbStmt(@NotNull SqlParser.CreatedbStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_in_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_in_database(@NotNull SqlParser.Opt_in_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createRoleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateRoleStmt(@NotNull SqlParser.CreateRoleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#constbit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstbit(@NotNull SqlParser.ConstbitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#colQualList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColQualList(@NotNull SqlParser.ColQualListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#commentStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentStmt(@NotNull SqlParser.CommentStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opttableFuncElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpttableFuncElementList(@NotNull SqlParser.OpttableFuncElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opclass_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpclass_item(@NotNull SqlParser.Opclass_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ruleActionMulti}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleActionMulti(@NotNull SqlParser.RuleActionMultiContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tableFuncElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFuncElementList(@NotNull SqlParser.TableFuncElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createFunctionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunctionStmt(@NotNull SqlParser.CreateFunctionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#b_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB_expr(@NotNull SqlParser.B_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_nowait}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_nowait(@NotNull SqlParser.Opt_nowaitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_clause(@NotNull SqlParser.With_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#array_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_expr(@NotNull SqlParser.Array_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#key_delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_delete(@NotNull SqlParser.Key_deleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#unreserved_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnreserved_keyword(@NotNull SqlParser.Unreserved_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createExtensionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateExtensionStmt(@NotNull SqlParser.CreateExtensionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#constraintElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintElem(@NotNull SqlParser.ConstraintElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#relation_expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation_expr_list(@NotNull SqlParser.Relation_expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_freeze}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_freeze(@NotNull SqlParser.Opt_freezeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fdw_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFdw_option(@NotNull SqlParser.Fdw_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#typename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypename(@NotNull SqlParser.TypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#numericOnly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericOnly(@NotNull SqlParser.NumericOnlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#reloption_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReloption_list(@NotNull SqlParser.Reloption_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_charset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_charset(@NotNull SqlParser.Opt_charsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#optTempTableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptTempTableName(@NotNull SqlParser.OptTempTableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fdw_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFdw_options(@NotNull SqlParser.Fdw_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#aggr_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggr_args(@NotNull SqlParser.Aggr_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_with_data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_with_data(@NotNull SqlParser.Opt_with_dataContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#truncateStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateStmt(@NotNull SqlParser.TruncateStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#qual_all_Op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQual_all_Op(@NotNull SqlParser.Qual_all_OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_if_exists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_if_exists(@NotNull SqlParser.Opt_if_existsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_collate_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_collate_clause(@NotNull SqlParser.Opt_collate_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#defACLOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefACLOption(@NotNull SqlParser.DefACLOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#func_arg_with_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_arg_with_default(@NotNull SqlParser.Func_arg_with_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#returning_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturning_clause(@NotNull SqlParser.Returning_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#grantee_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantee_list(@NotNull SqlParser.Grantee_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#target_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget_list(@NotNull SqlParser.Target_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_reloptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_reloptions(@NotNull SqlParser.Opt_reloptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#functionsetResetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionsetResetClause(@NotNull SqlParser.FunctionsetResetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createUserMappingStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUserMappingStmt(@NotNull SqlParser.CreateUserMappingStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#unlistenStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnlistenStmt(@NotNull SqlParser.UnlistenStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#roleId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleId(@NotNull SqlParser.RoleIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#bitWithoutLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitWithoutLength(@NotNull SqlParser.BitWithoutLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropAssertStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropAssertStmt(@NotNull SqlParser.DropAssertStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#sortby}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortby(@NotNull SqlParser.SortbyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#set_clause_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_clause_list(@NotNull SqlParser.Set_clause_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tableFuncElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFuncElement(@NotNull SqlParser.TableFuncElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#clusterStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClusterStmt(@NotNull SqlParser.ClusterStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#func_arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_arg_list(@NotNull SqlParser.Func_arg_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#constraints_set_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraints_set_list(@NotNull SqlParser.Constraints_set_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_lock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_lock(@NotNull SqlParser.Opt_lockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#copy_generic_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_generic_opt_list(@NotNull SqlParser.Copy_generic_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#triggerForSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerForSpec(@NotNull SqlParser.TriggerForSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createForeignServerStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateForeignServerStmt(@NotNull SqlParser.CreateForeignServerStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#optTemp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptTemp(@NotNull SqlParser.OptTempContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tableElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableElement(@NotNull SqlParser.TableElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#def_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_elem(@NotNull SqlParser.Def_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterTableStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableStmt(@NotNull SqlParser.AlterTableStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#index_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_elem(@NotNull SqlParser.Index_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#key_actions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_actions(@NotNull SqlParser.Key_actionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_using}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_using(@NotNull SqlParser.Opt_usingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_equal(@NotNull SqlParser.Opt_equalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_or_replace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_or_replace(@NotNull SqlParser.Opt_or_replaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#for_locking_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_locking_item(@NotNull SqlParser.For_locking_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#colConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColConstraint(@NotNull SqlParser.ColConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_enum_val_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_enum_val_list(@NotNull SqlParser.Opt_enum_val_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#optSchemaName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptSchemaName(@NotNull SqlParser.OptSchemaNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_restrict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_restrict(@NotNull SqlParser.Opt_restrictContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateStmt(@NotNull SqlParser.CreateStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#exclusionWhereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusionWhereClause(@NotNull SqlParser.ExclusionWhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#foreigntableElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeigntableElement(@NotNull SqlParser.ForeigntableElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opclass_purpose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpclass_purpose(@NotNull SqlParser.Opclass_purposeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterFdwStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterFdwStmt(@NotNull SqlParser.AlterFdwStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterUserMappingStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUserMappingStmt(@NotNull SqlParser.AlterUserMappingStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#set_rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_rest(@NotNull SqlParser.Set_restContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#explain_option_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain_option_elem(@NotNull SqlParser.Explain_option_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#joined_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoined_table(@NotNull SqlParser.Joined_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_generic_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_generic_options(@NotNull SqlParser.Create_generic_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#func_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_args(@NotNull SqlParser.Func_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ruleActionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleActionStmt(@NotNull SqlParser.RuleActionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_with_clause(@NotNull SqlParser.Opt_with_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_sort_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_sort_clause(@NotNull SqlParser.Opt_sort_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#insert_rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_rest(@NotNull SqlParser.Insert_restContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterOpFamilyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOpFamilyStmt(@NotNull SqlParser.AlterOpFamilyStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#all_Op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_Op(@NotNull SqlParser.All_OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fetch_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_args(@NotNull SqlParser.Fetch_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterCompositeTypeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterCompositeTypeStmt(@NotNull SqlParser.AlterCompositeTypeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#copy_file_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_file_name(@NotNull SqlParser.Copy_file_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterDomainStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDomainStmt(@NotNull SqlParser.AlterDomainStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#cursor_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_name(@NotNull SqlParser.Cursor_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#position_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosition_list(@NotNull SqlParser.Position_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createAsStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateAsStmt(@NotNull SqlParser.CreateAsStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_list(@NotNull SqlParser.Name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropruleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropruleStmt(@NotNull SqlParser.DropruleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_force}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_force(@NotNull SqlParser.Opt_forceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#trim_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrim_list(@NotNull SqlParser.Trim_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alias_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias_clause(@NotNull SqlParser.Alias_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#optConstrFromTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptConstrFromTable(@NotNull SqlParser.OptConstrFromTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#join_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_type(@NotNull SqlParser.Join_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#attr_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_name(@NotNull SqlParser.Attr_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterRoleSetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterRoleSetStmt(@NotNull SqlParser.AlterRoleSetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#func_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_expr(@NotNull SqlParser.Func_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#copy_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_options(@NotNull SqlParser.Copy_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_transaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_transaction(@NotNull SqlParser.Opt_transactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#analyze_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyze_keyword(@NotNull SqlParser.Analyze_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterTSConfigurationStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTSConfigurationStmt(@NotNull SqlParser.AlterTSConfigurationStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#overlay_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverlay_list(@NotNull SqlParser.Overlay_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_clause(@NotNull SqlParser.Select_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#handler_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandler_name(@NotNull SqlParser.Handler_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(@NotNull SqlParser.Any_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#updateStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateStmt(@NotNull SqlParser.UpdateStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createTableSpaceStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableSpaceStmt(@NotNull SqlParser.CreateTableSpaceStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_opfamily}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_opfamily(@NotNull SqlParser.Opt_opfamilyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#function_with_argtypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_with_argtypes(@NotNull SqlParser.Function_with_argtypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#constraints_set_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraints_set_mode(@NotNull SqlParser.Constraints_set_modeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_type(@NotNull SqlParser.Opt_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterUserSetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUserSetStmt(@NotNull SqlParser.AlterUserSetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#indirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndirection(@NotNull SqlParser.IndirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropUserStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropUserStmt(@NotNull SqlParser.DropUserStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#xml_root_version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_root_version(@NotNull SqlParser.Xml_root_versionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#enum_val_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_val_list(@NotNull SqlParser.Enum_val_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#sub_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_type(@NotNull SqlParser.Sub_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_boolean_or_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_boolean_or_string(@NotNull SqlParser.Opt_boolean_or_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_func_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_func_column_list(@NotNull SqlParser.Table_func_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#col_name_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCol_name_keyword(@NotNull SqlParser.Col_name_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#constcharacter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstcharacter(@NotNull SqlParser.ConstcharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#relation_expr_opt_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation_expr_opt_alias(@NotNull SqlParser.Relation_expr_opt_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_oids}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_oids(@NotNull SqlParser.Opt_oidsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_clause(@NotNull SqlParser.Set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_column_list(@NotNull SqlParser.Opt_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createOptRoleElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateOptRoleElem(@NotNull SqlParser.CreateOptRoleElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropStmt(@NotNull SqlParser.DropStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#comment_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_text(@NotNull SqlParser.Comment_textContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#privilege_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilege_list(@NotNull SqlParser.Privilege_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_ref(@NotNull SqlParser.Table_refContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_list(@NotNull SqlParser.Var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#join_qual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_qual(@NotNull SqlParser.Join_qualContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#colId_or_Sconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColId_or_Sconst(@NotNull SqlParser.ColId_or_SconstContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#qualified_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_name(@NotNull SqlParser.Qualified_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_drop_behavior}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_drop_behavior(@NotNull SqlParser.Opt_drop_behaviorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ruleActionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleActionList(@NotNull SqlParser.RuleActionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_verbose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_verbose(@NotNull SqlParser.Opt_verboseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(@NotNull SqlParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_for_locking_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_for_locking_clause(@NotNull SqlParser.Opt_for_locking_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#listenStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListenStmt(@NotNull SqlParser.ListenStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropUserMappingStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropUserMappingStmt(@NotNull SqlParser.DropUserMappingStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropOpClassStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropOpClassStmt(@NotNull SqlParser.DropOpClassStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#closePortalStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosePortalStmt(@NotNull SqlParser.ClosePortalStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#columnElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnElem(@NotNull SqlParser.ColumnElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createfunc_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatefunc_opt_item(@NotNull SqlParser.Createfunc_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#reindexStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReindexStmt(@NotNull SqlParser.ReindexStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#case_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_expr(@NotNull SqlParser.Case_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterFunctionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterFunctionStmt(@NotNull SqlParser.AlterFunctionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#old_aggr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOld_aggr_list(@NotNull SqlParser.Old_aggr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#variableSetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableSetStmt(@NotNull SqlParser.VariableSetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#any_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_operator(@NotNull SqlParser.Any_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#triggerOneEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerOneEvent(@NotNull SqlParser.TriggerOneEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#columnDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDef(@NotNull SqlParser.ColumnDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#optSchemaEltList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptSchemaEltList(@NotNull SqlParser.OptSchemaEltListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#insert_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_column_list(@NotNull SqlParser.Insert_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tableLikeOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableLikeOptionList(@NotNull SqlParser.TableLikeOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#generic_option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_option_list(@NotNull SqlParser.Generic_option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#revokeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeStmt(@NotNull SqlParser.RevokeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropTableSpaceStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTableSpaceStmt(@NotNull SqlParser.DropTableSpaceStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#variableShowStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableShowStmt(@NotNull SqlParser.VariableShowStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#copyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyStmt(@NotNull SqlParser.CopyStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#validator_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidator_clause(@NotNull SqlParser.Validator_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#existingIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistingIndex(@NotNull SqlParser.ExistingIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_array_bounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_array_bounds(@NotNull SqlParser.Opt_array_boundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#func_args_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_args_list(@NotNull SqlParser.Func_args_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric(@NotNull SqlParser.NumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_trusted}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_trusted(@NotNull SqlParser.Opt_trustedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#xmlexists_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlexists_argument(@NotNull SqlParser.Xmlexists_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#schema_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_stmt(@NotNull SqlParser.Schema_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#qualified_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_name_list(@NotNull SqlParser.Qualified_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createAssertStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateAssertStmt(@NotNull SqlParser.CreateAssertStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#copy_generic_opt_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_generic_opt_elem(@NotNull SqlParser.Copy_generic_opt_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#iConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIConst(@NotNull SqlParser.IConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_generic_option_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_generic_option_elem(@NotNull SqlParser.Alter_generic_option_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#columnOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnOptions(@NotNull SqlParser.ColumnOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ruleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleStmt(@NotNull SqlParser.RuleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#set_rest_more}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_rest_more(@NotNull SqlParser.Set_rest_moreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#explainableStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainableStmt(@NotNull SqlParser.ExplainableStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#document_or_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument_or_content(@NotNull SqlParser.Document_or_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createDomainStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDomainStmt(@NotNull SqlParser.CreateDomainStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#window_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_definition(@NotNull SqlParser.Window_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_offset_value2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_offset_value2(@NotNull SqlParser.Select_offset_value2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#set_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_target(@NotNull SqlParser.Set_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#for_locking_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_locking_items(@NotNull SqlParser.For_locking_itemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#reindex_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReindex_type(@NotNull SqlParser.Reindex_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#reserved_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReserved_keyword(@NotNull SqlParser.Reserved_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#over_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOver_clause(@NotNull SqlParser.Over_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterForeignTableStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterForeignTableStmt(@NotNull SqlParser.AlterForeignTableStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#columnList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnList(@NotNull SqlParser.ColumnListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#copy_generic_opt_arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_generic_opt_arg_list(@NotNull SqlParser.Copy_generic_opt_arg_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#revokeRoleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeRoleStmt(@NotNull SqlParser.RevokeRoleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_extension_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_extension_opt_item(@NotNull SqlParser.Create_extension_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#triggerActionTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerActionTime(@NotNull SqlParser.TriggerActionTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_limit_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_limit_value(@NotNull SqlParser.Select_limit_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createOpClassStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateOpClassStmt(@NotNull SqlParser.CreateOpClassStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_index_name(@NotNull SqlParser.Opt_index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#constDatetime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDatetime(@NotNull SqlParser.ConstDatetimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#type_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_list(@NotNull SqlParser.Type_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterForeignServerStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterForeignServerStmt(@NotNull SqlParser.AlterForeignServerStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createSeqStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSeqStmt(@NotNull SqlParser.CreateSeqStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_unique}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_unique(@NotNull SqlParser.Opt_uniqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_table_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_cmd(@NotNull SqlParser.Alter_table_cmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_limit(@NotNull SqlParser.Select_limitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#zone_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZone_value(@NotNull SqlParser.Zone_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#columnref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnref(@NotNull SqlParser.ColumnrefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#def_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_arg(@NotNull SqlParser.Def_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#index_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_params(@NotNull SqlParser.Index_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter(@NotNull SqlParser.CharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#colLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColLabel(@NotNull SqlParser.ColLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropForeignServerStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropForeignServerStmt(@NotNull SqlParser.DropForeignServerStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#constraintAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintAttr(@NotNull SqlParser.ConstraintAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_timezone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_timezone(@NotNull SqlParser.Opt_timezoneContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#typedtableElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedtableElement(@NotNull SqlParser.TypedtableElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_partition_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_partition_clause(@NotNull SqlParser.Opt_partition_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ctext_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtext_row(@NotNull SqlParser.Ctext_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_check_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_check_option(@NotNull SqlParser.Opt_check_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#exclusionConstraintList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusionConstraintList(@NotNull SqlParser.ExclusionConstraintListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#removeOperStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemoveOperStmt(@NotNull SqlParser.RemoveOperStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterUserStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUserStmt(@NotNull SqlParser.AlterUserStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#triggerForOptEach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerForOptEach(@NotNull SqlParser.TriggerForOptEachContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#optTableSpaceOwner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptTableSpaceOwner(@NotNull SqlParser.OptTableSpaceOwnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_inline_handler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_inline_handler(@NotNull SqlParser.Opt_inline_handlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opclass_drop_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpclass_drop_list(@NotNull SqlParser.Opclass_drop_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#from_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_list(@NotNull SqlParser.From_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#func_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_name(@NotNull SqlParser.Func_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#selectStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStmt(@NotNull SqlParser.SelectStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#simpletypename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpletypename(@NotNull SqlParser.SimpletypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#key_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_action(@NotNull SqlParser.Key_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#security_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurity_label(@NotNull SqlParser.Security_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#triggerFuncArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerFuncArg(@NotNull SqlParser.TriggerFuncArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#def_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_list(@NotNull SqlParser.Def_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropTrigStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTrigStmt(@NotNull SqlParser.DropTrigStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_table(@NotNull SqlParser.Opt_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#generic_option_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_option_elem(@NotNull SqlParser.Generic_option_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_frame_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_frame_clause(@NotNull SqlParser.Opt_frame_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list(@NotNull SqlParser.Expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opclass_drop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpclass_drop(@NotNull SqlParser.Opclass_dropContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#extract_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtract_list(@NotNull SqlParser.Extract_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#lockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockStmt(@NotNull SqlParser.LockStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_indirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_indirection(@NotNull SqlParser.Opt_indirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#substr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstr_list(@NotNull SqlParser.Substr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#key_match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_match(@NotNull SqlParser.Key_matchContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#viewStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewStmt(@NotNull SqlParser.ViewStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_from_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_from_in(@NotNull SqlParser.Opt_from_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#vacuum_option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuum_option_list(@NotNull SqlParser.Vacuum_option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#variableResetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableResetStmt(@NotNull SqlParser.VariableResetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#iso_level}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIso_level(@NotNull SqlParser.Iso_levelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#explain_option_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain_option_arg(@NotNull SqlParser.Explain_option_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_binary(@NotNull SqlParser.Opt_binaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#notify_payload}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotify_payload(@NotNull SqlParser.Notify_payloadContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#into_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_clause(@NotNull SqlParser.Into_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#sConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSConst(@NotNull SqlParser.SConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_provider}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_provider(@NotNull SqlParser.Opt_providerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#setResetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetResetClause(@NotNull SqlParser.SetResetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createCastStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateCastStmt(@NotNull SqlParser.CreateCastStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#triggerWhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerWhen(@NotNull SqlParser.TriggerWhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(@NotNull SqlParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#window_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_clause(@NotNull SqlParser.Window_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_interval(@NotNull SqlParser.Opt_intervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_foreign_server_version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_foreign_server_version(@NotNull SqlParser.Opt_foreign_server_versionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#typedtableElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedtableElementList(@NotNull SqlParser.TypedtableElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createTrigStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTrigStmt(@NotNull SqlParser.CreateTrigStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#any_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name_list(@NotNull SqlParser.Any_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#generic_option_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_option_arg(@NotNull SqlParser.Generic_option_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterGroupStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterGroupStmt(@NotNull SqlParser.AlterGroupStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#triggerEvents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerEvents(@NotNull SqlParser.TriggerEventsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#common_table_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_expr(@NotNull SqlParser.Common_table_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#defineStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineStmt(@NotNull SqlParser.DefineStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createOpFamilyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateOpFamilyStmt(@NotNull SqlParser.CreateOpFamilyStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#c_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_expr(@NotNull SqlParser.C_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#file_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_name(@NotNull SqlParser.File_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#constraintAttributeElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintAttributeElem(@NotNull SqlParser.ConstraintAttributeElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterdb_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterdb_opt_item(@NotNull SqlParser.Alterdb_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_offset_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_offset_value(@NotNull SqlParser.Select_offset_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterDatabaseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDatabaseStmt(@NotNull SqlParser.AlterDatabaseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#executeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecuteStmt(@NotNull SqlParser.ExecuteStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#exclusionconstraintElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusionconstraintElem(@NotNull SqlParser.ExclusionconstraintElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opclass_item_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpclass_item_list(@NotNull SqlParser.Opclass_item_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#extract_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtract_arg(@NotNull SqlParser.Extract_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_column_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_column_default(@NotNull SqlParser.Alter_column_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createUserStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUserStmt(@NotNull SqlParser.CreateUserStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#copy_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_from(@NotNull SqlParser.Copy_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_varying}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_varying(@NotNull SqlParser.Opt_varyingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#preparableStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreparableStmt(@NotNull SqlParser.PreparableStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(@NotNull SqlParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#set_target_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_target_list(@NotNull SqlParser.Set_target_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#vacuum_option_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuum_option_elem(@NotNull SqlParser.Vacuum_option_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#execute_param_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_param_clause(@NotNull SqlParser.Execute_param_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterOptRoleElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOptRoleElem(@NotNull SqlParser.AlterOptRoleElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#consttypename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsttypename(@NotNull SqlParser.ConsttypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#copy_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_opt_list(@NotNull SqlParser.Copy_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#loadStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadStmt(@NotNull SqlParser.LoadStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#qual_Op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQual_Op(@NotNull SqlParser.Qual_OpContext ctx);
}