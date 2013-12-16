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
	 * Visit a parse tree produced by {@link PlPgSqlParser#functionCallExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpr(@NotNull PlPgSqlParser.FunctionCallExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#functionCosts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCosts(@NotNull PlPgSqlParser.FunctionCostsContext ctx);

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
	 * Visit a parse tree produced by {@link PlPgSqlParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull PlPgSqlParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#arrayAccessExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccessExpression(@NotNull PlPgSqlParser.ArrayAccessExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#notNullExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotNullExpression(@NotNull PlPgSqlParser.NotNullExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#functionArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArg(@NotNull PlPgSqlParser.FunctionArgContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#arbitraryConstantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArbitraryConstantExpression(@NotNull PlPgSqlParser.ArbitraryConstantExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#numericalLiteralExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalLiteralExpression(@NotNull PlPgSqlParser.NumericalLiteralExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#functionRows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionRows(@NotNull PlPgSqlParser.FunctionRowsContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#mulExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpression(@NotNull PlPgSqlParser.MulExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#functionBehavior}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBehavior(@NotNull PlPgSqlParser.FunctionBehaviorContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#numericalFunctionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalFunctionExpression(@NotNull PlPgSqlParser.NumericalFunctionExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#assignOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignOperator(@NotNull PlPgSqlParser.AssignOperatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#functionSecurity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSecurity(@NotNull PlPgSqlParser.FunctionSecurityContext ctx);

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
	 * Visit a parse tree produced by {@link PlPgSqlParser#betweenExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenExpression(@NotNull PlPgSqlParser.BetweenExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#window}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow(@NotNull PlPgSqlParser.WindowContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(@NotNull PlPgSqlParser.ConstantExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#functionCallExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(@NotNull PlPgSqlParser.FunctionCallExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#isExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsExpression(@NotNull PlPgSqlParser.IsExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(@NotNull PlPgSqlParser.FunctionNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#plFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlFunction(@NotNull PlPgSqlParser.PlFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(@NotNull PlPgSqlParser.ComparisonExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#modExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModExpression(@NotNull PlPgSqlParser.ModExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#expressionGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionGroup(@NotNull PlPgSqlParser.ExpressionGroupContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#addExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(@NotNull PlPgSqlParser.AddExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#functionArgsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArgsList(@NotNull PlPgSqlParser.FunctionArgsListContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#numericalExpressionGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalExpressionGroup(@NotNull PlPgSqlParser.NumericalExpressionGroupContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmts(@NotNull PlPgSqlParser.StmtsContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#arrAssignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrAssignStmt(@NotNull PlPgSqlParser.ArrAssignStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#constantOfOtherTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantOfOtherTypes(@NotNull PlPgSqlParser.ConstantOfOtherTypesContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#varDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclarationList(@NotNull PlPgSqlParser.VarDeclarationListContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#copyType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyType(@NotNull PlPgSqlParser.CopyTypeContext ctx);

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
	 * Visit a parse tree produced by {@link PlPgSqlParser#rowType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowType(@NotNull PlPgSqlParser.RowTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stringLiteralExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralExpression(@NotNull PlPgSqlParser.StringLiteralExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#variableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpression(@NotNull PlPgSqlParser.VariableExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#numericConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericConstant(@NotNull PlPgSqlParser.NumericConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#numericalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalExpression(@NotNull PlPgSqlParser.NumericalExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#isNullExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNullExpression(@NotNull PlPgSqlParser.IsNullExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#varAssignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssignStmt(@NotNull PlPgSqlParser.VarAssignStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#subExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpression(@NotNull PlPgSqlParser.SubExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#functionInputHandling}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionInputHandling(@NotNull PlPgSqlParser.FunctionInputHandlingContext ctx);

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
	 * Visit a parse tree produced by {@link PlPgSqlParser#numericVariableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericVariableExpression(@NotNull PlPgSqlParser.NumericVariableExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnit(@NotNull PlPgSqlParser.UnitContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#functionReturns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionReturns(@NotNull PlPgSqlParser.FunctionReturnsContext ctx);

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
	 * Visit a parse tree produced by {@link PlPgSqlParser#aliasDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasDeclaration(@NotNull PlPgSqlParser.AliasDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#isDistinctFromExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsDistinctFromExpression(@NotNull PlPgSqlParser.IsDistinctFromExpressionContext ctx);
}