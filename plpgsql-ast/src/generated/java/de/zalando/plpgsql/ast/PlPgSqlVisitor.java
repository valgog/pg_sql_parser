// Generated from de/zalando/plpgsql/ast/PlPgSql.g4 by ANTLR 4.2.3
package de.zalando.plpgsql.ast;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PlPgSqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PlPgSqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#expr_until_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_until_loop(@NotNull PlPgSqlParser.Expr_until_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterExtensionContentsStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterExtensionContentsStmt(@NotNull PlPgSqlParser.AlterExtensionContentsStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#select_no_parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_no_parens(@NotNull PlPgSqlParser.Select_no_parensContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#privileges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivileges(@NotNull PlPgSqlParser.PrivilegesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#ruleActionStmtOrEmpty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleActionStmtOrEmpty(@NotNull PlPgSqlParser.RuleActionStmtOrEmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent(@NotNull PlPgSqlParser.EventContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#assign_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_operator(@NotNull PlPgSqlParser.Assign_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_instead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_instead(@NotNull PlPgSqlParser.Opt_insteadContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dropFdwStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropFdwStmt(@NotNull PlPgSqlParser.DropFdwStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_as}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_as(@NotNull PlPgSqlParser.Opt_asContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#access_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_method(@NotNull PlPgSqlParser.Access_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#optforeigntableElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptforeigntableElementList(@NotNull PlPgSqlParser.OptforeigntableElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#array_expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_expr_list(@NotNull PlPgSqlParser.Array_expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_label(@NotNull PlPgSqlParser.Opt_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterfunc_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterfunc_opt_list(@NotNull PlPgSqlParser.Alterfunc_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_case(@NotNull PlPgSqlParser.Stmt_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#frame_extent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrame_extent(@NotNull PlPgSqlParser.Frame_extentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#characterWithoutLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterWithoutLength(@NotNull PlPgSqlParser.CharacterWithoutLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#transaction_mode_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_mode_item(@NotNull PlPgSqlParser.Transaction_mode_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#vacuumStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuumStmt(@NotNull PlPgSqlParser.VacuumStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opttypedtableElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpttypedtableElementList(@NotNull PlPgSqlParser.OpttypedtableElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_fdw_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_fdw_options(@NotNull PlPgSqlParser.Opt_fdw_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#bit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit(@NotNull PlPgSqlParser.BitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(@NotNull PlPgSqlParser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#limit_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit_clause(@NotNull PlPgSqlParser.Limit_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#discardStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscardStmt(@NotNull PlPgSqlParser.DiscardStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#constraintsSetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintsSetStmt(@NotNull PlPgSqlParser.ConstraintsSetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_select_limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_select_limit(@NotNull PlPgSqlParser.Opt_select_limitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#constInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstInterval(@NotNull PlPgSqlParser.ConstIntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#copy_generic_opt_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_generic_opt_arg(@NotNull PlPgSqlParser.Copy_generic_opt_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#drop_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_type(@NotNull PlPgSqlParser.Drop_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#explainStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainStmt(@NotNull PlPgSqlParser.ExplainStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#optseqOptList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptseqOptList(@NotNull PlPgSqlParser.OptseqOptListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#reassignOwnedStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReassignOwnedStmt(@NotNull PlPgSqlParser.ReassignOwnedStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#tableLikeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableLikeClause(@NotNull PlPgSqlParser.TableLikeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#foreigntableElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeigntableElementList(@NotNull PlPgSqlParser.ForeigntableElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#old_aggr_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOld_aggr_definition(@NotNull PlPgSqlParser.Old_aggr_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#where_or_current_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_or_current_clause(@NotNull PlPgSqlParser.Where_or_current_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_by}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_by(@NotNull PlPgSqlParser.Opt_byContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#ctext_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtext_expr(@NotNull PlPgSqlParser.Ctext_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#proc_sect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_sect(@NotNull PlPgSqlParser.Proc_sectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#func_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_arg(@NotNull PlPgSqlParser.Func_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#window_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_specification(@NotNull PlPgSqlParser.Window_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#optTableSpace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptTableSpace(@NotNull PlPgSqlParser.OptTableSpaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_nulls_order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_nulls_order(@NotNull PlPgSqlParser.Opt_nulls_orderContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#proc_stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_stmts(@NotNull PlPgSqlParser.Proc_stmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#in_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_expr(@NotNull PlPgSqlParser.In_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#having_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_clause(@NotNull PlPgSqlParser.Having_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dropdbStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropdbStmt(@NotNull PlPgSqlParser.DropdbStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#characterWithLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterWithLength(@NotNull PlPgSqlParser.CharacterWithLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#analyzeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyzeStmt(@NotNull PlPgSqlParser.AnalyzeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_distinct(@NotNull PlPgSqlParser.Opt_distinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alter_using}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_using(@NotNull PlPgSqlParser.Alter_usingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#assign_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_var(@NotNull PlPgSqlParser.Assign_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decl_datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_datatype(@NotNull PlPgSqlParser.Decl_datatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#proc_exception}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_exception(@NotNull PlPgSqlParser.Proc_exceptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#getdiag_list_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetdiag_list_item(@NotNull PlPgSqlParser.Getdiag_list_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#colconstraintElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColconstraintElem(@NotNull PlPgSqlParser.ColconstraintElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alter_generic_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_generic_options(@NotNull PlPgSqlParser.Alter_generic_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterEnumStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterEnumStmt(@NotNull PlPgSqlParser.AlterEnumStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decl_stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_stmts(@NotNull PlPgSqlParser.Decl_stmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_xml_root_standalone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_xml_root_standalone(@NotNull PlPgSqlParser.Opt_xml_root_standaloneContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#defACLOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefACLOptionList(@NotNull PlPgSqlParser.DefACLOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#privilege_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilege_target(@NotNull PlPgSqlParser.Privilege_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#using_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_clause(@NotNull PlPgSqlParser.Using_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#deallocateStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeallocateStmt(@NotNull PlPgSqlParser.DeallocateStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#key_update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_update(@NotNull PlPgSqlParser.Key_updateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#triggerForType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerForType(@NotNull PlPgSqlParser.TriggerForTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_default(@NotNull PlPgSqlParser.Opt_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterRoleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterRoleStmt(@NotNull PlPgSqlParser.AlterRoleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#triggerFuncArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerFuncArgs(@NotNull PlPgSqlParser.TriggerFuncArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterTSDictionaryStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTSDictionaryStmt(@NotNull PlPgSqlParser.AlterTSDictionaryStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_collate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_collate(@NotNull PlPgSqlParser.Opt_collateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alter_extension_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_extension_opt_list(@NotNull PlPgSqlParser.Alter_extension_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#window_definition_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_definition_list(@NotNull PlPgSqlParser.Window_definition_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#xml_attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_attributes(@NotNull PlPgSqlParser.Xml_attributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alter_generic_option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_generic_option_list(@NotNull PlPgSqlParser.Alter_generic_option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#from_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_in(@NotNull PlPgSqlParser.From_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_concurrently}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_concurrently(@NotNull PlPgSqlParser.Opt_concurrentlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_close}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_close(@NotNull PlPgSqlParser.Stmt_closeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterDatabaseSetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDatabaseSetStmt(@NotNull PlPgSqlParser.AlterDatabaseSetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createGroupStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateGroupStmt(@NotNull PlPgSqlParser.CreateGroupStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_asymmetric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_asymmetric(@NotNull PlPgSqlParser.Opt_asymmetricContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createdb_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedb_opt_item(@NotNull PlPgSqlParser.Createdb_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_select_fetch_first_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_select_fetch_first_value(@NotNull PlPgSqlParser.Opt_select_fetch_first_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterDefaultPrivilegesStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDefaultPrivilegesStmt(@NotNull PlPgSqlParser.AlterDefaultPrivilegesStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#reloption_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReloption_elem(@NotNull PlPgSqlParser.Reloption_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alteroptRoleList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlteroptRoleList(@NotNull PlPgSqlParser.AlteroptRoleListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_execsql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_execsql(@NotNull PlPgSqlParser.Stmt_execsqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alter_type_cmds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_type_cmds(@NotNull PlPgSqlParser.Alter_type_cmdsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#relation_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation_expr(@NotNull PlPgSqlParser.Relation_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#func_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_type(@NotNull PlPgSqlParser.Func_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#cursor_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_variable(@NotNull PlPgSqlParser.Cursor_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#comment_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_type(@NotNull PlPgSqlParser.Comment_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#aexprConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprConst(@NotNull PlPgSqlParser.AexprConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#expr_until_semi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_until_semi(@NotNull PlPgSqlParser.Expr_until_semiContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createPLangStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatePLangStmt(@NotNull PlPgSqlParser.CreatePLangStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#type_function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_function_name(@NotNull PlPgSqlParser.Type_function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#defacl_privilege_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefacl_privilege_target(@NotNull PlPgSqlParser.Defacl_privilege_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#values_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues_clause(@NotNull PlPgSqlParser.Values_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#comp_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_option(@NotNull PlPgSqlParser.Comp_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#indirection_el}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndirection_el(@NotNull PlPgSqlParser.Indirection_elContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#target_el}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget_el(@NotNull PlPgSqlParser.Target_elContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#prepareStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepareStmt(@NotNull PlPgSqlParser.PrepareStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#table_func_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_func_column(@NotNull PlPgSqlParser.Table_func_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_for(@NotNull PlPgSqlParser.Stmt_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#explain_option_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain_option_name(@NotNull PlPgSqlParser.Explain_option_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#transaction_mode_list_or_empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_mode_list_or_empty(@NotNull PlPgSqlParser.Transaction_mode_list_or_emptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createdb_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedb_opt_list(@NotNull PlPgSqlParser.Createdb_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#func_args_with_defaults_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_args_with_defaults_list(@NotNull PlPgSqlParser.Func_args_with_defaults_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#transactionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionStmt(@NotNull PlPgSqlParser.TransactionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_granted_by}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_granted_by(@NotNull PlPgSqlParser.Opt_granted_byContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#function_with_argtypes_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_with_argtypes_list(@NotNull PlPgSqlParser.Function_with_argtypes_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_hold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_hold(@NotNull PlPgSqlParser.Opt_holdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alter_extension_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_extension_opt_item(@NotNull PlPgSqlParser.Alter_extension_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_no_inherit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_no_inherit(@NotNull PlPgSqlParser.Opt_no_inheritContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#grantee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantee(@NotNull PlPgSqlParser.GranteeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#select_with_parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_with_parens(@NotNull PlPgSqlParser.Select_with_parensContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#optInherit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptInherit(@NotNull PlPgSqlParser.OptInheritContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#single_set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_set_clause(@NotNull PlPgSqlParser.Single_set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#tableElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableElementList(@NotNull PlPgSqlParser.TableElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#create_extension_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_extension_opt_list(@NotNull PlPgSqlParser.Create_extension_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#simple_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_select(@NotNull PlPgSqlParser.Simple_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(@NotNull PlPgSqlParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#bitWithLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitWithLength(@NotNull PlPgSqlParser.BitWithLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#a_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_expr(@NotNull PlPgSqlParser.A_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_grant_admin_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_grant_admin_option(@NotNull PlPgSqlParser.Opt_grant_admin_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#table_ref2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_ref2(@NotNull PlPgSqlParser.Table_ref2Context ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#mathOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathOp(@NotNull PlPgSqlParser.MathOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#foreign_server_version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_server_version(@NotNull PlPgSqlParser.Foreign_server_versionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#auth_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuth_ident(@NotNull PlPgSqlParser.Auth_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_validator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_validator(@NotNull PlPgSqlParser.Opt_validatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#security_label_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurity_label_type(@NotNull PlPgSqlParser.Security_label_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(@NotNull PlPgSqlParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#numericOnly_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericOnly_list(@NotNull PlPgSqlParser.NumericOnly_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(@NotNull PlPgSqlParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#arg_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_class(@NotNull PlPgSqlParser.Arg_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_restart_seqs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_restart_seqs(@NotNull PlPgSqlParser.Opt_restart_seqsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#subquery_Op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery_Op(@NotNull PlPgSqlParser.Subquery_OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterdb_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterdb_opt_list(@NotNull PlPgSqlParser.Alterdb_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_definition(@NotNull PlPgSqlParser.Opt_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#character_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_def(@NotNull PlPgSqlParser.Character_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#genericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericType(@NotNull PlPgSqlParser.GenericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#privilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilege(@NotNull PlPgSqlParser.PrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#declareCursorStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareCursorStmt(@NotNull PlPgSqlParser.DeclareCursorStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#oper_argtypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper_argtypes(@NotNull PlPgSqlParser.Oper_argtypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#row_or_rows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow_or_rows(@NotNull PlPgSqlParser.Row_or_rowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dropGroupStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropGroupStmt(@NotNull PlPgSqlParser.DropGroupStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#substr_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstr_for(@NotNull PlPgSqlParser.Substr_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#insert_column_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_column_item(@NotNull PlPgSqlParser.Insert_column_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#pl_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPl_block(@NotNull PlPgSqlParser.Pl_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#tableLikeOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableLikeOption(@NotNull PlPgSqlParser.TableLikeOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#fetchStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetchStmt(@NotNull PlPgSqlParser.FetchStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#func_as}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_as(@NotNull PlPgSqlParser.Func_asContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#any_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_identifier(@NotNull PlPgSqlParser.Any_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#xml_attribute_el}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_attribute_el(@NotNull PlPgSqlParser.Xml_attribute_elContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#indexStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexStmt(@NotNull PlPgSqlParser.IndexStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmtblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtblock(@NotNull PlPgSqlParser.StmtblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decl_defkey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_defkey(@NotNull PlPgSqlParser.Decl_defkeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_fetch_direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_fetch_direction(@NotNull PlPgSqlParser.Opt_fetch_directionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#when_clause_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen_clause_list(@NotNull PlPgSqlParser.When_clause_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#offset_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffset_clause(@NotNull PlPgSqlParser.Offset_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#getdiag_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetdiag_item(@NotNull PlPgSqlParser.Getdiag_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_existing_window_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_existing_window_name(@NotNull PlPgSqlParser.Opt_existing_window_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_float(@NotNull PlPgSqlParser.Opt_floatContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#doStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStmt(@NotNull PlPgSqlParser.DoStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createfunc_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatefunc_opt_list(@NotNull PlPgSqlParser.Createfunc_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#renameStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameStmt(@NotNull PlPgSqlParser.RenameStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_getdiag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_getdiag(@NotNull PlPgSqlParser.Stmt_getdiagContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#deleteStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStmt(@NotNull PlPgSqlParser.DeleteStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#for_locking_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_locking_clause(@NotNull PlPgSqlParser.For_locking_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#interval_second}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_second(@NotNull PlPgSqlParser.Interval_secondContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_if(@NotNull PlPgSqlParser.Stmt_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#func_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_return(@NotNull PlPgSqlParser.Func_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decl_defval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_defval(@NotNull PlPgSqlParser.Decl_defvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#old_aggr_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOld_aggr_elem(@NotNull PlPgSqlParser.Old_aggr_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_encoding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_encoding(@NotNull PlPgSqlParser.Opt_encodingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createForeignTableStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateForeignTableStmt(@NotNull PlPgSqlParser.CreateForeignTableStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_else(@NotNull PlPgSqlParser.Stmt_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dropPLangStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropPLangStmt(@NotNull PlPgSqlParser.DropPLangStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_column(@NotNull PlPgSqlParser.Opt_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#onCommitOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnCommitOption(@NotNull PlPgSqlParser.OnCommitOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_class(@NotNull PlPgSqlParser.Opt_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dropRoleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropRoleStmt(@NotNull PlPgSqlParser.DropRoleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#checkPointStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckPointStmt(@NotNull PlPgSqlParser.CheckPointStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#copy_delimiter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_delimiter(@NotNull PlPgSqlParser.Copy_delimiterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_full}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_full(@NotNull PlPgSqlParser.Opt_fullContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(@NotNull PlPgSqlParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_all(@NotNull PlPgSqlParser.Opt_allContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#removeAggrStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemoveAggrStmt(@NotNull PlPgSqlParser.RemoveAggrStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_scrollable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_scrollable(@NotNull PlPgSqlParser.Opt_scrollableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#cast_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_context(@NotNull PlPgSqlParser.Cast_contextContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#constraintAttributeSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintAttributeSpec(@NotNull PlPgSqlParser.ConstraintAttributeSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#xml_attribute_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_attribute_list(@NotNull PlPgSqlParser.Xml_attribute_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#defACLAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefACLAction(@NotNull PlPgSqlParser.DefACLActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterExtensionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterExtensionStmt(@NotNull PlPgSqlParser.AlterExtensionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#copy_generic_opt_arg_list_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_generic_opt_arg_list_item(@NotNull PlPgSqlParser.Copy_generic_opt_arg_list_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#seqOptList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqOptList(@NotNull PlPgSqlParser.SeqOptListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#func_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_table(@NotNull PlPgSqlParser.Func_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#common_func_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_func_opt_item(@NotNull PlPgSqlParser.Common_func_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmtmulti}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtmulti(@NotNull PlPgSqlParser.StmtmultiContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterOwnerStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOwnerStmt(@NotNull PlPgSqlParser.AlterOwnerStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_block_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_block_label(@NotNull PlPgSqlParser.Opt_block_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#param_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_name(@NotNull PlPgSqlParser.Param_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#reloptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReloptions(@NotNull PlPgSqlParser.ReloptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createSchemaStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSchemaStmt(@NotNull PlPgSqlParser.CreateSchemaStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#create_as_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_as_target(@NotNull PlPgSqlParser.Create_as_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterObjectSchemaStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterObjectSchemaStmt(@NotNull PlPgSqlParser.AlterObjectSchemaStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#comp_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_options(@NotNull PlPgSqlParser.Comp_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#cte_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_list(@NotNull PlPgSqlParser.Cte_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#multiple_set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_set_clause(@NotNull PlPgSqlParser.Multiple_set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createConversionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateConversionStmt(@NotNull PlPgSqlParser.CreateConversionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createFdwStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFdwStmt(@NotNull PlPgSqlParser.CreateFdwStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_name_list(@NotNull PlPgSqlParser.Opt_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#optRoleList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptRoleList(@NotNull PlPgSqlParser.OptRoleListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#lock_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_type(@NotNull PlPgSqlParser.Lock_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#grantRoleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantRoleStmt(@NotNull PlPgSqlParser.GrantRoleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#ctext_expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtext_expr_list(@NotNull PlPgSqlParser.Ctext_expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#transaction_mode_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_mode_list(@NotNull PlPgSqlParser.Transaction_mode_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#xml_whitespace_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_whitespace_option(@NotNull PlPgSqlParser.Xml_whitespace_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#secLabelStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecLabelStmt(@NotNull PlPgSqlParser.SecLabelStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#overlay_placing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverlay_placing(@NotNull PlPgSqlParser.Overlay_placingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#type_func_name_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_func_name_keyword(@NotNull PlPgSqlParser.Type_func_name_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_procedural}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_procedural(@NotNull PlPgSqlParser.Opt_proceduralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#case_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_default(@NotNull PlPgSqlParser.Case_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#signedIconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedIconst(@NotNull PlPgSqlParser.SignedIconstContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#cursor_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_options(@NotNull PlPgSqlParser.Cursor_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#locked_rels_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocked_rels_list(@NotNull PlPgSqlParser.Locked_rels_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alter_table_cmds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_cmds(@NotNull PlPgSqlParser.Alter_table_cmdsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_perform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_perform(@NotNull PlPgSqlParser.Stmt_performContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decl_is_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_is_for(@NotNull PlPgSqlParser.Decl_is_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dostmt_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDostmt_opt_list(@NotNull PlPgSqlParser.Dostmt_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#sort_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort_clause(@NotNull PlPgSqlParser.Sort_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#colId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColId(@NotNull PlPgSqlParser.ColIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#group_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_clause(@NotNull PlPgSqlParser.Group_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_type_modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_type_modifiers(@NotNull PlPgSqlParser.Opt_type_modifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#optWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptWith(@NotNull PlPgSqlParser.OptWithContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#seqOptElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqOptElem(@NotNull PlPgSqlParser.SeqOptElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#sortby_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortby_list(@NotNull PlPgSqlParser.Sortby_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decl_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_const(@NotNull PlPgSqlParser.Decl_constContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#prep_type_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrep_type_clause(@NotNull PlPgSqlParser.Prep_type_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#when_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen_clause(@NotNull PlPgSqlParser.When_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_recheck}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_recheck(@NotNull PlPgSqlParser.Opt_recheckContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#frame_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrame_bound(@NotNull PlPgSqlParser.Frame_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#removeFuncStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemoveFuncStmt(@NotNull PlPgSqlParser.RemoveFuncStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#substr_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstr_from(@NotNull PlPgSqlParser.Substr_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#notifyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotifyStmt(@NotNull PlPgSqlParser.NotifyStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#attrs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrs(@NotNull PlPgSqlParser.AttrsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#insertStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStmt(@NotNull PlPgSqlParser.InsertStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alter_type_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_type_cmd(@NotNull PlPgSqlParser.Alter_type_cmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#first_or_next}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst_or_next(@NotNull PlPgSqlParser.First_or_nextContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decl_cursor_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_cursor_arg(@NotNull PlPgSqlParser.Decl_cursor_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#copy_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_opt_item(@NotNull PlPgSqlParser.Copy_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#add_drop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_drop(@NotNull PlPgSqlParser.Add_dropContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#exit_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_type(@NotNull PlPgSqlParser.Exit_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#func_args_with_defaults}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_args_with_defaults(@NotNull PlPgSqlParser.Func_args_with_defaultsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#func_arg_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_arg_expr(@NotNull PlPgSqlParser.Func_arg_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#var_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_name(@NotNull PlPgSqlParser.Var_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#explain_option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain_option_list(@NotNull PlPgSqlParser.Explain_option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decl_sect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_sect(@NotNull PlPgSqlParser.Decl_sectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_asc_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_asc_desc(@NotNull PlPgSqlParser.Opt_asc_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_grant_grant_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_grant_grant_option(@NotNull PlPgSqlParser.Opt_grant_grant_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_set_data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_set_data(@NotNull PlPgSqlParser.Opt_set_dataContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableConstraint(@NotNull PlPgSqlParser.TableConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#grantStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantStmt(@NotNull PlPgSqlParser.GrantStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#generic_option_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_option_name(@NotNull PlPgSqlParser.Generic_option_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dostmt_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDostmt_opt_item(@NotNull PlPgSqlParser.Dostmt_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#getdiag_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetdiag_list(@NotNull PlPgSqlParser.Getdiag_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#var_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_value(@NotNull PlPgSqlParser.Var_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#cluster_index_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCluster_index_specification(@NotNull PlPgSqlParser.Cluster_index_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#optConsTableSpace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptConsTableSpace(@NotNull PlPgSqlParser.OptConsTableSpaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opttableElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpttableElementList(@NotNull PlPgSqlParser.OpttableElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#access_method_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_method_clause(@NotNull PlPgSqlParser.Access_method_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#case_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_arg(@NotNull PlPgSqlParser.Case_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_assign(@NotNull PlPgSqlParser.Stmt_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dropOpFamilyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropOpFamilyStmt(@NotNull PlPgSqlParser.DropOpFamilyStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dropCastStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropCastStmt(@NotNull PlPgSqlParser.DropCastStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterSeqStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSeqStmt(@NotNull PlPgSqlParser.AlterSeqStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decl_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_start(@NotNull PlPgSqlParser.Decl_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dropOwnedStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropOwnedStmt(@NotNull PlPgSqlParser.DropOwnedStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createdbStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedbStmt(@NotNull PlPgSqlParser.CreatedbStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_in_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_in_database(@NotNull PlPgSqlParser.Opt_in_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createRoleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateRoleStmt(@NotNull PlPgSqlParser.CreateRoleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#constbit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstbit(@NotNull PlPgSqlParser.ConstbitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#colQualList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColQualList(@NotNull PlPgSqlParser.ColQualListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#commentStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentStmt(@NotNull PlPgSqlParser.CommentStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opttableFuncElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpttableFuncElementList(@NotNull PlPgSqlParser.OpttableFuncElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opclass_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpclass_item(@NotNull PlPgSqlParser.Opclass_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#ruleActionMulti}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleActionMulti(@NotNull PlPgSqlParser.RuleActionMultiContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#tableFuncElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFuncElementList(@NotNull PlPgSqlParser.TableFuncElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createFunctionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunctionStmt(@NotNull PlPgSqlParser.CreateFunctionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#b_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB_expr(@NotNull PlPgSqlParser.B_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_nowait}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_nowait(@NotNull PlPgSqlParser.Opt_nowaitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_raise}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_raise(@NotNull PlPgSqlParser.Stmt_raiseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_clause(@NotNull PlPgSqlParser.With_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#array_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_expr(@NotNull PlPgSqlParser.Array_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#key_delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_delete(@NotNull PlPgSqlParser.Key_deleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#constraintElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintElem(@NotNull PlPgSqlParser.ConstraintElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#unreserved_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnreserved_keyword(@NotNull PlPgSqlParser.Unreserved_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createExtensionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateExtensionStmt(@NotNull PlPgSqlParser.CreateExtensionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#relation_expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation_expr_list(@NotNull PlPgSqlParser.Relation_expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_freeze}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_freeze(@NotNull PlPgSqlParser.Opt_freezeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#case_when}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_when(@NotNull PlPgSqlParser.Case_whenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#fdw_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFdw_option(@NotNull PlPgSqlParser.Fdw_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#typename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypename(@NotNull PlPgSqlParser.TypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#reloption_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReloption_list(@NotNull PlPgSqlParser.Reloption_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#numericOnly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericOnly(@NotNull PlPgSqlParser.NumericOnlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_charset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_charset(@NotNull PlPgSqlParser.Opt_charsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#optTempTableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptTempTableName(@NotNull PlPgSqlParser.OptTempTableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#fdw_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFdw_options(@NotNull PlPgSqlParser.Fdw_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_with_data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_with_data(@NotNull PlPgSqlParser.Opt_with_dataContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#aggr_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggr_args(@NotNull PlPgSqlParser.Aggr_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#truncateStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateStmt(@NotNull PlPgSqlParser.TruncateStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#qual_all_Op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQual_all_Op(@NotNull PlPgSqlParser.Qual_all_OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_if_exists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_if_exists(@NotNull PlPgSqlParser.Opt_if_existsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_collate_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_collate_clause(@NotNull PlPgSqlParser.Opt_collate_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#defACLOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefACLOption(@NotNull PlPgSqlParser.DefACLOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#func_arg_with_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_arg_with_default(@NotNull PlPgSqlParser.Func_arg_with_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#returning_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturning_clause(@NotNull PlPgSqlParser.Returning_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#grantee_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantee_list(@NotNull PlPgSqlParser.Grantee_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#target_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget_list(@NotNull PlPgSqlParser.Target_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_reloptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_reloptions(@NotNull PlPgSqlParser.Opt_reloptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#functionsetResetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionsetResetClause(@NotNull PlPgSqlParser.FunctionsetResetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createUserMappingStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUserMappingStmt(@NotNull PlPgSqlParser.CreateUserMappingStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#unlistenStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnlistenStmt(@NotNull PlPgSqlParser.UnlistenStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#roleId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleId(@NotNull PlPgSqlParser.RoleIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#bitWithoutLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitWithoutLength(@NotNull PlPgSqlParser.BitWithoutLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dropAssertStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropAssertStmt(@NotNull PlPgSqlParser.DropAssertStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#sortby}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortby(@NotNull PlPgSqlParser.SortbyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#set_clause_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_clause_list(@NotNull PlPgSqlParser.Set_clause_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_case_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_case_else(@NotNull PlPgSqlParser.Opt_case_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#tableFuncElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFuncElement(@NotNull PlPgSqlParser.TableFuncElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#clusterStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClusterStmt(@NotNull PlPgSqlParser.ClusterStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#func_arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_arg_list(@NotNull PlPgSqlParser.Func_arg_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decl_aliasitem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_aliasitem(@NotNull PlPgSqlParser.Decl_aliasitemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#constraints_set_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraints_set_list(@NotNull PlPgSqlParser.Constraints_set_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_lock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_lock(@NotNull PlPgSqlParser.Opt_lockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_expr_until_when}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_expr_until_when(@NotNull PlPgSqlParser.Opt_expr_until_whenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#copy_generic_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_generic_opt_list(@NotNull PlPgSqlParser.Copy_generic_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#triggerForSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerForSpec(@NotNull PlPgSqlParser.TriggerForSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#optTemp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptTemp(@NotNull PlPgSqlParser.OptTempContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createForeignServerStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateForeignServerStmt(@NotNull PlPgSqlParser.CreateForeignServerStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#tableElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableElement(@NotNull PlPgSqlParser.TableElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterTableStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableStmt(@NotNull PlPgSqlParser.AlterTableStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#def_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_elem(@NotNull PlPgSqlParser.Def_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_elsifs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_elsifs(@NotNull PlPgSqlParser.Stmt_elsifsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#index_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_elem(@NotNull PlPgSqlParser.Index_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#key_actions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_actions(@NotNull PlPgSqlParser.Key_actionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_return(@NotNull PlPgSqlParser.Stmt_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_using}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_using(@NotNull PlPgSqlParser.Opt_usingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_equal(@NotNull PlPgSqlParser.Opt_equalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_or_replace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_or_replace(@NotNull PlPgSqlParser.Opt_or_replaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#for_locking_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_locking_item(@NotNull PlPgSqlParser.For_locking_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#colConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColConstraint(@NotNull PlPgSqlParser.ColConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_enum_val_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_enum_val_list(@NotNull PlPgSqlParser.Opt_enum_val_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#optSchemaName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptSchemaName(@NotNull PlPgSqlParser.OptSchemaNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_move}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_move(@NotNull PlPgSqlParser.Stmt_moveContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_restrict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_restrict(@NotNull PlPgSqlParser.Opt_restrictContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateStmt(@NotNull PlPgSqlParser.CreateStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#exclusionWhereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusionWhereClause(@NotNull PlPgSqlParser.ExclusionWhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_fetch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_fetch(@NotNull PlPgSqlParser.Stmt_fetchContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#foreigntableElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeigntableElement(@NotNull PlPgSqlParser.ForeigntableElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opclass_purpose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpclass_purpose(@NotNull PlPgSqlParser.Opclass_purposeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterFdwStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterFdwStmt(@NotNull PlPgSqlParser.AlterFdwStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#explain_option_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain_option_elem(@NotNull PlPgSqlParser.Explain_option_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#set_rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_rest(@NotNull PlPgSqlParser.Set_restContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterUserMappingStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUserMappingStmt(@NotNull PlPgSqlParser.AlterUserMappingStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#joined_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoined_table(@NotNull PlPgSqlParser.Joined_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#create_generic_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_generic_options(@NotNull PlPgSqlParser.Create_generic_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#func_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_args(@NotNull PlPgSqlParser.Func_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#ruleActionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleActionStmt(@NotNull PlPgSqlParser.RuleActionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_with_clause(@NotNull PlPgSqlParser.Opt_with_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_sort_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_sort_clause(@NotNull PlPgSqlParser.Opt_sort_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#insert_rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_rest(@NotNull PlPgSqlParser.Insert_restContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterOpFamilyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOpFamilyStmt(@NotNull PlPgSqlParser.AlterOpFamilyStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#all_Op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_Op(@NotNull PlPgSqlParser.All_OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#fetch_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_args(@NotNull PlPgSqlParser.Fetch_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterCompositeTypeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterCompositeTypeStmt(@NotNull PlPgSqlParser.AlterCompositeTypeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterDomainStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDomainStmt(@NotNull PlPgSqlParser.AlterDomainStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#copy_file_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_file_name(@NotNull PlPgSqlParser.Copy_file_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#cursor_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_name(@NotNull PlPgSqlParser.Cursor_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#position_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosition_list(@NotNull PlPgSqlParser.Position_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createAsStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateAsStmt(@NotNull PlPgSqlParser.CreateAsStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#pl_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPl_function(@NotNull PlPgSqlParser.Pl_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_list(@NotNull PlPgSqlParser.Name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dropruleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropruleStmt(@NotNull PlPgSqlParser.DropruleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_force}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_force(@NotNull PlPgSqlParser.Opt_forceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#trim_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrim_list(@NotNull PlPgSqlParser.Trim_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_null(@NotNull PlPgSqlParser.Stmt_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alias_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias_clause(@NotNull PlPgSqlParser.Alias_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#optConstrFromTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptConstrFromTable(@NotNull PlPgSqlParser.OptConstrFromTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#join_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_type(@NotNull PlPgSqlParser.Join_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#attr_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_name(@NotNull PlPgSqlParser.Attr_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterRoleSetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterRoleSetStmt(@NotNull PlPgSqlParser.AlterRoleSetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#func_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_expr(@NotNull PlPgSqlParser.Func_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_transaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_transaction(@NotNull PlPgSqlParser.Opt_transactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#copy_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_options(@NotNull PlPgSqlParser.Copy_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#analyze_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyze_keyword(@NotNull PlPgSqlParser.Analyze_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterTSConfigurationStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTSConfigurationStmt(@NotNull PlPgSqlParser.AlterTSConfigurationStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#overlay_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverlay_list(@NotNull PlPgSqlParser.Overlay_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#select_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_clause(@NotNull PlPgSqlParser.Select_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decl_cursor_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_cursor_args(@NotNull PlPgSqlParser.Decl_cursor_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#handler_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandler_name(@NotNull PlPgSqlParser.Handler_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#updateStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateStmt(@NotNull PlPgSqlParser.UpdateStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(@NotNull PlPgSqlParser.Any_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createTableSpaceStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableSpaceStmt(@NotNull PlPgSqlParser.CreateTableSpaceStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_opfamily}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_opfamily(@NotNull PlPgSqlParser.Opt_opfamilyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#function_with_argtypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_with_argtypes(@NotNull PlPgSqlParser.Function_with_argtypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#getdiag_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetdiag_target(@NotNull PlPgSqlParser.Getdiag_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#constraints_set_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraints_set_mode(@NotNull PlPgSqlParser.Constraints_set_modeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterUserSetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUserSetStmt(@NotNull PlPgSqlParser.AlterUserSetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_type(@NotNull PlPgSqlParser.Opt_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#indirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndirection(@NotNull PlPgSqlParser.IndirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dropUserStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropUserStmt(@NotNull PlPgSqlParser.DropUserStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#xml_root_version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_root_version(@NotNull PlPgSqlParser.Xml_root_versionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_exitcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_exitcond(@NotNull PlPgSqlParser.Opt_exitcondContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#enum_val_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_val_list(@NotNull PlPgSqlParser.Enum_val_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#sub_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_type(@NotNull PlPgSqlParser.Sub_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_boolean_or_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_boolean_or_string(@NotNull PlPgSqlParser.Opt_boolean_or_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#table_func_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_func_column_list(@NotNull PlPgSqlParser.Table_func_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#col_name_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCol_name_keyword(@NotNull PlPgSqlParser.Col_name_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#constcharacter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstcharacter(@NotNull PlPgSqlParser.ConstcharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#relation_expr_opt_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation_expr_opt_alias(@NotNull PlPgSqlParser.Relation_expr_opt_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_oids}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_oids(@NotNull PlPgSqlParser.Opt_oidsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_clause(@NotNull PlPgSqlParser.Set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_column_list(@NotNull PlPgSqlParser.Opt_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#exception_sect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_sect(@NotNull PlPgSqlParser.Exception_sectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createOptRoleElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateOptRoleElem(@NotNull PlPgSqlParser.CreateOptRoleElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dropStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropStmt(@NotNull PlPgSqlParser.DropStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#comment_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_text(@NotNull PlPgSqlParser.Comment_textContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#privilege_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilege_list(@NotNull PlPgSqlParser.Privilege_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#table_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_ref(@NotNull PlPgSqlParser.Table_refContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_list(@NotNull PlPgSqlParser.Var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#join_qual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_qual(@NotNull PlPgSqlParser.Join_qualContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#colId_or_Sconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColId_or_Sconst(@NotNull PlPgSqlParser.ColId_or_SconstContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#qualified_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_name(@NotNull PlPgSqlParser.Qualified_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_drop_behavior}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_drop_behavior(@NotNull PlPgSqlParser.Opt_drop_behaviorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decl_cursor_arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_cursor_arglist(@NotNull PlPgSqlParser.Decl_cursor_arglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decl_varname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_varname(@NotNull PlPgSqlParser.Decl_varnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#ruleActionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleActionList(@NotNull PlPgSqlParser.RuleActionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_verbose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_verbose(@NotNull PlPgSqlParser.Opt_verboseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(@NotNull PlPgSqlParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_for_locking_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_for_locking_clause(@NotNull PlPgSqlParser.Opt_for_locking_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#listenStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListenStmt(@NotNull PlPgSqlParser.ListenStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dropUserMappingStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropUserMappingStmt(@NotNull PlPgSqlParser.DropUserMappingStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dropOpClassStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropOpClassStmt(@NotNull PlPgSqlParser.DropOpClassStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#closePortalStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosePortalStmt(@NotNull PlPgSqlParser.ClosePortalStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#columnElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnElem(@NotNull PlPgSqlParser.ColumnElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createfunc_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatefunc_opt_item(@NotNull PlPgSqlParser.Createfunc_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#reindexStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReindexStmt(@NotNull PlPgSqlParser.ReindexStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#case_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_expr(@NotNull PlPgSqlParser.Case_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterFunctionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterFunctionStmt(@NotNull PlPgSqlParser.AlterFunctionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#old_aggr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOld_aggr_list(@NotNull PlPgSqlParser.Old_aggr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#variableSetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableSetStmt(@NotNull PlPgSqlParser.VariableSetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#any_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_operator(@NotNull PlPgSqlParser.Any_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#triggerOneEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerOneEvent(@NotNull PlPgSqlParser.TriggerOneEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#columnDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDef(@NotNull PlPgSqlParser.ColumnDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#proc_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_stmt(@NotNull PlPgSqlParser.Proc_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#proc_conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_conditions(@NotNull PlPgSqlParser.Proc_conditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#insert_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_column_list(@NotNull PlPgSqlParser.Insert_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#optSchemaEltList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptSchemaEltList(@NotNull PlPgSqlParser.OptSchemaEltListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#tableLikeOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableLikeOptionList(@NotNull PlPgSqlParser.TableLikeOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#generic_option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_option_list(@NotNull PlPgSqlParser.Generic_option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#case_when_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_when_list(@NotNull PlPgSqlParser.Case_when_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#revokeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeStmt(@NotNull PlPgSqlParser.RevokeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#copyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyStmt(@NotNull PlPgSqlParser.CopyStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#variableShowStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableShowStmt(@NotNull PlPgSqlParser.VariableShowStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dropTableSpaceStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTableSpaceStmt(@NotNull PlPgSqlParser.DropTableSpaceStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#existingIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistingIndex(@NotNull PlPgSqlParser.ExistingIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#validator_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidator_clause(@NotNull PlPgSqlParser.Validator_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_array_bounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_array_bounds(@NotNull PlPgSqlParser.Opt_array_boundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#func_args_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_args_list(@NotNull PlPgSqlParser.Func_args_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric(@NotNull PlPgSqlParser.NumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_trusted}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_trusted(@NotNull PlPgSqlParser.Opt_trustedContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_exit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_exit(@NotNull PlPgSqlParser.Stmt_exitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#xmlexists_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlexists_argument(@NotNull PlPgSqlParser.Xmlexists_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#schema_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_stmt(@NotNull PlPgSqlParser.Schema_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#qualified_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_name_list(@NotNull PlPgSqlParser.Qualified_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#copy_generic_opt_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_generic_opt_elem(@NotNull PlPgSqlParser.Copy_generic_opt_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createAssertStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateAssertStmt(@NotNull PlPgSqlParser.CreateAssertStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#iConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIConst(@NotNull PlPgSqlParser.IConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alter_generic_option_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_generic_option_elem(@NotNull PlPgSqlParser.Alter_generic_option_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#columnOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnOptions(@NotNull PlPgSqlParser.ColumnOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decl_notnull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_notnull(@NotNull PlPgSqlParser.Decl_notnullContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#ruleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleStmt(@NotNull PlPgSqlParser.RuleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#set_rest_more}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_rest_more(@NotNull PlPgSqlParser.Set_rest_moreContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#explainableStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainableStmt(@NotNull PlPgSqlParser.ExplainableStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#expr_until_then}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_until_then(@NotNull PlPgSqlParser.Expr_until_thenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_semi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_semi(@NotNull PlPgSqlParser.Opt_semiContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#document_or_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument_or_content(@NotNull PlPgSqlParser.Document_or_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createDomainStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDomainStmt(@NotNull PlPgSqlParser.CreateDomainStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#window_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_definition(@NotNull PlPgSqlParser.Window_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#select_offset_value2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_offset_value2(@NotNull PlPgSqlParser.Select_offset_value2Context ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#set_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_target(@NotNull PlPgSqlParser.Set_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#for_locking_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_locking_items(@NotNull PlPgSqlParser.For_locking_itemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#reindex_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReindex_type(@NotNull PlPgSqlParser.Reindex_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#reserved_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReserved_keyword(@NotNull PlPgSqlParser.Reserved_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#over_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOver_clause(@NotNull PlPgSqlParser.Over_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterForeignTableStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterForeignTableStmt(@NotNull PlPgSqlParser.AlterForeignTableStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#columnList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnList(@NotNull PlPgSqlParser.ColumnListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#copy_generic_opt_arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_generic_opt_arg_list(@NotNull PlPgSqlParser.Copy_generic_opt_arg_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#for_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_variable(@NotNull PlPgSqlParser.For_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#revokeRoleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeRoleStmt(@NotNull PlPgSqlParser.RevokeRoleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#create_extension_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_extension_opt_item(@NotNull PlPgSqlParser.Create_extension_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#triggerActionTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerActionTime(@NotNull PlPgSqlParser.TriggerActionTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#select_limit_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_limit_value(@NotNull PlPgSqlParser.Select_limit_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createOpClassStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateOpClassStmt(@NotNull PlPgSqlParser.CreateOpClassStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_index_name(@NotNull PlPgSqlParser.Opt_index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#constDatetime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDatetime(@NotNull PlPgSqlParser.ConstDatetimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#type_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_list(@NotNull PlPgSqlParser.Type_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createSeqStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSeqStmt(@NotNull PlPgSqlParser.CreateSeqStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterForeignServerStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterForeignServerStmt(@NotNull PlPgSqlParser.AlterForeignServerStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_unique}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_unique(@NotNull PlPgSqlParser.Opt_uniqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alter_table_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_cmd(@NotNull PlPgSqlParser.Alter_table_cmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#select_limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_limit(@NotNull PlPgSqlParser.Select_limitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#zone_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZone_value(@NotNull PlPgSqlParser.Zone_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#columnref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnref(@NotNull PlPgSqlParser.ColumnrefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#def_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_arg(@NotNull PlPgSqlParser.Def_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#index_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_params(@NotNull PlPgSqlParser.Index_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter(@NotNull PlPgSqlParser.CharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#colLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColLabel(@NotNull PlPgSqlParser.ColLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dropForeignServerStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropForeignServerStmt(@NotNull PlPgSqlParser.DropForeignServerStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#constraintAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintAttr(@NotNull PlPgSqlParser.ConstraintAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_timezone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_timezone(@NotNull PlPgSqlParser.Opt_timezoneContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#typedtableElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedtableElement(@NotNull PlPgSqlParser.TypedtableElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_partition_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_partition_clause(@NotNull PlPgSqlParser.Opt_partition_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#foreach_slice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach_slice(@NotNull PlPgSqlParser.Foreach_sliceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#ctext_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtext_row(@NotNull PlPgSqlParser.Ctext_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_check_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_check_option(@NotNull PlPgSqlParser.Opt_check_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#exclusionConstraintList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusionConstraintList(@NotNull PlPgSqlParser.ExclusionConstraintListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#for_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_control(@NotNull PlPgSqlParser.For_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#removeOperStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemoveOperStmt(@NotNull PlPgSqlParser.RemoveOperStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterUserStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUserStmt(@NotNull PlPgSqlParser.AlterUserStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_dynexecute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_dynexecute(@NotNull PlPgSqlParser.Stmt_dynexecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decl_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_stmt(@NotNull PlPgSqlParser.Decl_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#optTableSpaceOwner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptTableSpaceOwner(@NotNull PlPgSqlParser.OptTableSpaceOwnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#triggerForOptEach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerForOptEach(@NotNull PlPgSqlParser.TriggerForOptEachContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_inline_handler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_inline_handler(@NotNull PlPgSqlParser.Opt_inline_handlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opclass_drop_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpclass_drop_list(@NotNull PlPgSqlParser.Opclass_drop_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#from_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_list(@NotNull PlPgSqlParser.From_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#func_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_name(@NotNull PlPgSqlParser.Func_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#expr_until_rightbracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_until_rightbracket(@NotNull PlPgSqlParser.Expr_until_rightbracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#selectStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStmt(@NotNull PlPgSqlParser.SelectStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#simpletypename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpletypename(@NotNull PlPgSqlParser.SimpletypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#key_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_action(@NotNull PlPgSqlParser.Key_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#security_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurity_label(@NotNull PlPgSqlParser.Security_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_foreach_a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_foreach_a(@NotNull PlPgSqlParser.Stmt_foreach_aContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#triggerFuncArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerFuncArg(@NotNull PlPgSqlParser.TriggerFuncArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#def_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_list(@NotNull PlPgSqlParser.Def_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dropTrigStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTrigStmt(@NotNull PlPgSqlParser.DropTrigStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_table(@NotNull PlPgSqlParser.Opt_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#generic_option_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_option_elem(@NotNull PlPgSqlParser.Generic_option_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_frame_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_frame_clause(@NotNull PlPgSqlParser.Opt_frame_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list(@NotNull PlPgSqlParser.Expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opclass_drop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpclass_drop(@NotNull PlPgSqlParser.Opclass_dropContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#extract_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtract_list(@NotNull PlPgSqlParser.Extract_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#lockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockStmt(@NotNull PlPgSqlParser.LockStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_indirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_indirection(@NotNull PlPgSqlParser.Opt_indirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#substr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstr_list(@NotNull PlPgSqlParser.Substr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#key_match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_match(@NotNull PlPgSqlParser.Key_matchContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#viewStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewStmt(@NotNull PlPgSqlParser.ViewStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#loop_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_body(@NotNull PlPgSqlParser.Loop_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_from_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_from_in(@NotNull PlPgSqlParser.Opt_from_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#vacuum_option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuum_option_list(@NotNull PlPgSqlParser.Vacuum_option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#variableResetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableResetStmt(@NotNull PlPgSqlParser.VariableResetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#iso_level}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIso_level(@NotNull PlPgSqlParser.Iso_levelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#explain_option_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain_option_arg(@NotNull PlPgSqlParser.Explain_option_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#notify_payload}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotify_payload(@NotNull PlPgSqlParser.Notify_payloadContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_binary(@NotNull PlPgSqlParser.Opt_binaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#into_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_clause(@NotNull PlPgSqlParser.Into_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#sConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSConst(@NotNull PlPgSqlParser.SConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_provider}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_provider(@NotNull PlPgSqlParser.Opt_providerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#setResetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetResetClause(@NotNull PlPgSqlParser.SetResetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createCastStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateCastStmt(@NotNull PlPgSqlParser.CreateCastStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#triggerWhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerWhen(@NotNull PlPgSqlParser.TriggerWhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(@NotNull PlPgSqlParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#window_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_clause(@NotNull PlPgSqlParser.Window_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_interval(@NotNull PlPgSqlParser.Opt_intervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_foreign_server_version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_foreign_server_version(@NotNull PlPgSqlParser.Opt_foreign_server_versionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#typedtableElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedtableElementList(@NotNull PlPgSqlParser.TypedtableElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createTrigStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTrigStmt(@NotNull PlPgSqlParser.CreateTrigStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#any_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name_list(@NotNull PlPgSqlParser.Any_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#generic_option_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_option_arg(@NotNull PlPgSqlParser.Generic_option_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterGroupStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterGroupStmt(@NotNull PlPgSqlParser.AlterGroupStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#triggerEvents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerEvents(@NotNull PlPgSqlParser.TriggerEventsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#common_table_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_expr(@NotNull PlPgSqlParser.Common_table_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_open}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_open(@NotNull PlPgSqlParser.Stmt_openContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#defineStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineStmt(@NotNull PlPgSqlParser.DefineStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createOpFamilyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateOpFamilyStmt(@NotNull PlPgSqlParser.CreateOpFamilyStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#c_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_expr(@NotNull PlPgSqlParser.C_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#file_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_name(@NotNull PlPgSqlParser.File_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#constraintAttributeElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintAttributeElem(@NotNull PlPgSqlParser.ConstraintAttributeElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterdb_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterdb_opt_item(@NotNull PlPgSqlParser.Alterdb_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#proc_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_condition(@NotNull PlPgSqlParser.Proc_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#select_offset_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_offset_value(@NotNull PlPgSqlParser.Select_offset_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterDatabaseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDatabaseStmt(@NotNull PlPgSqlParser.AlterDatabaseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#executeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecuteStmt(@NotNull PlPgSqlParser.ExecuteStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#exclusionconstraintElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusionconstraintElem(@NotNull PlPgSqlParser.ExclusionconstraintElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opclass_item_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpclass_item_list(@NotNull PlPgSqlParser.Opclass_item_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decl_collate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_collate(@NotNull PlPgSqlParser.Decl_collateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#extract_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtract_arg(@NotNull PlPgSqlParser.Extract_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alter_column_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_column_default(@NotNull PlPgSqlParser.Alter_column_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createUserStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUserStmt(@NotNull PlPgSqlParser.CreateUserStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decl_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_statement(@NotNull PlPgSqlParser.Decl_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#copy_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_from(@NotNull PlPgSqlParser.Copy_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_varying}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_varying(@NotNull PlPgSqlParser.Opt_varyingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#preparableStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreparableStmt(@NotNull PlPgSqlParser.PreparableStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_loop(@NotNull PlPgSqlParser.Stmt_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decl_cursor_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_cursor_query(@NotNull PlPgSqlParser.Decl_cursor_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(@NotNull PlPgSqlParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#set_target_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_target_list(@NotNull PlPgSqlParser.Set_target_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#vacuum_option_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuum_option_elem(@NotNull PlPgSqlParser.Vacuum_option_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_while(@NotNull PlPgSqlParser.Stmt_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#getdiag_area_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetdiag_area_opt(@NotNull PlPgSqlParser.Getdiag_area_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#execute_param_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_param_clause(@NotNull PlPgSqlParser.Execute_param_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterOptRoleElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOptRoleElem(@NotNull PlPgSqlParser.AlterOptRoleElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#consttypename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsttypename(@NotNull PlPgSqlParser.ConsttypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#copy_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_opt_list(@NotNull PlPgSqlParser.Copy_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#proc_exceptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_exceptions(@NotNull PlPgSqlParser.Proc_exceptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#loadStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadStmt(@NotNull PlPgSqlParser.LoadStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#qual_Op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQual_Op(@NotNull PlPgSqlParser.Qual_OpContext ctx);
}