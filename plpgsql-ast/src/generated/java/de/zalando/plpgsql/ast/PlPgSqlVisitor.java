// Generated from de/zalando/plpgsql/ast/PlPgSql.g4 by ANTLR 4.1
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
	 * Visit a parse tree produced by {@link PlPgSqlParser#fetchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetchClause(@NotNull PlPgSqlParser.FetchClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#functionCosts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCosts(@NotNull PlPgSqlParser.FunctionCostsContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#exceptionWhenCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionWhenCondition(@NotNull PlPgSqlParser.ExceptionWhenConditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#arrayAccessExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccessExpression(@NotNull PlPgSqlParser.ArrayAccessExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#usingOrdering}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingOrdering(@NotNull PlPgSqlParser.UsingOrderingContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#deleteStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStmt(@NotNull PlPgSqlParser.DeleteStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#functionArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArg(@NotNull PlPgSqlParser.FunctionArgContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#updateMultiSetAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateMultiSetAssignment(@NotNull PlPgSqlParser.UpdateMultiSetAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#arbitraryConstantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArbitraryConstantExpression(@NotNull PlPgSqlParser.ArbitraryConstantExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#selectSpecific}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectSpecific(@NotNull PlPgSqlParser.SelectSpecificContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#insertColumnList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertColumnList(@NotNull PlPgSqlParser.InsertColumnListContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#functionRows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionRows(@NotNull PlPgSqlParser.FunctionRowsContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#fromTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromTable(@NotNull PlPgSqlParser.FromTableContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#fullJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullJoin(@NotNull PlPgSqlParser.FullJoinContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#nullsOrdering}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullsOrdering(@NotNull PlPgSqlParser.NullsOrderingContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decimalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(@NotNull PlPgSqlParser.DecimalLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#assignOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignOperator(@NotNull PlPgSqlParser.AssignOperatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#divExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpression(@NotNull PlPgSqlParser.DivExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#exponentiationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponentiationExpression(@NotNull PlPgSqlParser.ExponentiationExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#insertColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertColumn(@NotNull PlPgSqlParser.InsertColumnContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#returningIntoTargets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturningIntoTargets(@NotNull PlPgSqlParser.ReturningIntoTargetsContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#orderByUsing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByUsing(@NotNull PlPgSqlParser.OrderByUsingContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#functionCallExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(@NotNull PlPgSqlParser.FunctionCallExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#plFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlFunction(@NotNull PlPgSqlParser.PlFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(@NotNull PlPgSqlParser.ForClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#updateMultiSetColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateMultiSetColumn(@NotNull PlPgSqlParser.UpdateMultiSetColumnContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#booleanLiteralExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteralExpression(@NotNull PlPgSqlParser.BooleanLiteralExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#lockedTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockedTable(@NotNull PlPgSqlParser.LockedTableContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#addExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(@NotNull PlPgSqlParser.AddExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(@NotNull PlPgSqlParser.HavingClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#updateMultiSetValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateMultiSetValues(@NotNull PlPgSqlParser.UpdateMultiSetValuesContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#labelExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelExpression(@NotNull PlPgSqlParser.LabelExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#insertDefaultValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertDefaultValues(@NotNull PlPgSqlParser.InsertDefaultValuesContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#constantOfOtherTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantOfOtherTypes(@NotNull PlPgSqlParser.ConstantOfOtherTypesContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#withRecursiveClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithRecursiveClause(@NotNull PlPgSqlParser.WithRecursiveClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(@NotNull PlPgSqlParser.DeleteContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#varDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclarationList(@NotNull PlPgSqlParser.VarDeclarationListContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#intoClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntoClause(@NotNull PlPgSqlParser.IntoClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#usingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingClause(@NotNull PlPgSqlParser.UsingClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#leftOuterJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftOuterJoin(@NotNull PlPgSqlParser.LeftOuterJoinContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#variableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpression(@NotNull PlPgSqlParser.VariableExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#updateSingleSetAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateSingleSetAssignment(@NotNull PlPgSqlParser.UpdateSingleSetAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#functionInputHandling}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionInputHandling(@NotNull PlPgSqlParser.FunctionInputHandlingContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#exceptionWhenConditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionWhenConditions(@NotNull PlPgSqlParser.ExceptionWhenConditionsContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#returningClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturningClause(@NotNull PlPgSqlParser.ReturningClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(@NotNull PlPgSqlParser.OrderByClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(@NotNull PlPgSqlParser.BooleanLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#selectStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStmt(@NotNull PlPgSqlParser.SelectStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#withQueries}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithQueries(@NotNull PlPgSqlParser.WithQueriesContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#standardOrdering}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardOrdering(@NotNull PlPgSqlParser.StandardOrderingContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stringLiteralExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralExpr(@NotNull PlPgSqlParser.StringLiteralExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#offsetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffsetClause(@NotNull PlPgSqlParser.OffsetClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#negateExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegateExpression(@NotNull PlPgSqlParser.NegateExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#blockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStmt(@NotNull PlPgSqlParser.BlockStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#numericalConstantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalConstantExpression(@NotNull PlPgSqlParser.NumericalConstantExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert(@NotNull PlPgSqlParser.InsertContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#functionCallExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpr(@NotNull PlPgSqlParser.FunctionCallExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(@NotNull PlPgSqlParser.WhereClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#updateSingleSetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateSingleSetClause(@NotNull PlPgSqlParser.UpdateSingleSetClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(@NotNull PlPgSqlParser.LimitClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#functionSettings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSettings(@NotNull PlPgSqlParser.FunctionSettingsContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(@NotNull PlPgSqlParser.UnaryExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#updateMultiSetColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateMultiSetColumns(@NotNull PlPgSqlParser.UpdateMultiSetColumnsContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#distinctClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinctClause(@NotNull PlPgSqlParser.DistinctClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#leftJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftJoin(@NotNull PlPgSqlParser.LeftJoinContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#insertValuesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertValuesClause(@NotNull PlPgSqlParser.InsertValuesClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#returningAll}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturningAll(@NotNull PlPgSqlParser.ReturningAllContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#insertValueTuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertValueTuple(@NotNull PlPgSqlParser.InsertValueTupleContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#insertStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStmt(@NotNull PlPgSqlParser.InsertStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#updateSetValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateSetValue(@NotNull PlPgSqlParser.UpdateSetValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#withClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithClause(@NotNull PlPgSqlParser.WithClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#rightJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightJoin(@NotNull PlPgSqlParser.RightJoinContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#crossJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrossJoin(@NotNull PlPgSqlParser.CrossJoinContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#numericalLiteralExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalLiteralExpression(@NotNull PlPgSqlParser.NumericalLiteralExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#updateStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateStmt(@NotNull PlPgSqlParser.UpdateStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#updateMultiSetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateMultiSetClause(@NotNull PlPgSqlParser.UpdateMultiSetClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#exceptionHandlingBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionHandlingBlock(@NotNull PlPgSqlParser.ExceptionHandlingBlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(@NotNull PlPgSqlParser.ConditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#mulExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpression(@NotNull PlPgSqlParser.MulExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(@NotNull PlPgSqlParser.SelectContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#fullOuterJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullOuterJoin(@NotNull PlPgSqlParser.FullOuterJoinContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#functionBehavior}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBehavior(@NotNull PlPgSqlParser.FunctionBehaviorContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#joinClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinClause(@NotNull PlPgSqlParser.JoinClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#functionSecurity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSecurity(@NotNull PlPgSqlParser.FunctionSecurityContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#lockedTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockedTables(@NotNull PlPgSqlParser.LockedTablesContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#window}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow(@NotNull PlPgSqlParser.WindowContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#columnAliasItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnAliasItem(@NotNull PlPgSqlParser.ColumnAliasItemContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(@NotNull PlPgSqlParser.ComparisonExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#innerJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerJoin(@NotNull PlPgSqlParser.InnerJoinContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#modExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModExpression(@NotNull PlPgSqlParser.ModExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#usingTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingTable(@NotNull PlPgSqlParser.UsingTableContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(@NotNull PlPgSqlParser.FromClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#columnAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnAlias(@NotNull PlPgSqlParser.ColumnAliasContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(@NotNull PlPgSqlParser.UpdateContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#withQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithQuery(@NotNull PlPgSqlParser.WithQueryContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#expressionGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionGroup(@NotNull PlPgSqlParser.ExpressionGroupContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#functionArgsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArgsList(@NotNull PlPgSqlParser.FunctionArgsListContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#varExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExpr(@NotNull PlPgSqlParser.VarExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmts(@NotNull PlPgSqlParser.StmtsContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#selectList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectList(@NotNull PlPgSqlParser.SelectListContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#returningOutputExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturningOutputExpression(@NotNull PlPgSqlParser.ReturningOutputExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#returningIntoTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturningIntoTarget(@NotNull PlPgSqlParser.ReturningIntoTargetContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(@NotNull PlPgSqlParser.IntegerLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#subQueryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubQueryExpression(@NotNull PlPgSqlParser.SubQueryExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#rightOuterJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightOuterJoin(@NotNull PlPgSqlParser.RightOuterJoinContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#logicalConjunctionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalConjunctionExpression(@NotNull PlPgSqlParser.LogicalConjunctionExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(@NotNull PlPgSqlParser.VarDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stringLiteralExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralExpression(@NotNull PlPgSqlParser.StringLiteralExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#numericConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericConstant(@NotNull PlPgSqlParser.NumericConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#returningIntoClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturningIntoClause(@NotNull PlPgSqlParser.ReturningIntoClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#subExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpression(@NotNull PlPgSqlParser.SubExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(@NotNull PlPgSqlParser.StmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(@NotNull PlPgSqlParser.FunctionBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#fromSelect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromSelect(@NotNull PlPgSqlParser.FromSelectContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#selectAll}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectAll(@NotNull PlPgSqlParser.SelectAllContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnit(@NotNull PlPgSqlParser.UnitContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#assignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(@NotNull PlPgSqlParser.AssignStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#bulkOperationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBulkOperationClause(@NotNull PlPgSqlParser.BulkOperationClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#functionReturns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionReturns(@NotNull PlPgSqlParser.FunctionReturnsContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#inExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInExpression(@NotNull PlPgSqlParser.InExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#returningExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturningExpressions(@NotNull PlPgSqlParser.ReturningExpressionsContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#aliasDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasDeclaration(@NotNull PlPgSqlParser.AliasDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(@NotNull PlPgSqlParser.GroupByClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#insertValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertValues(@NotNull PlPgSqlParser.InsertValuesContext ctx);
}