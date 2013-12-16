// Generated from de/zalando/plpgsql/ast/CommonParserRules.g4 by ANTLR 4.1
package de.zalando.plpgsql.ast;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CommonParserRulesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CommonParserRulesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#functionCallExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpr(@NotNull CommonParserRulesParser.FunctionCallExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#expressionGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionGroup(@NotNull CommonParserRulesParser.ExpressionGroupContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(@NotNull CommonParserRulesParser.UnaryExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#numericalExpressionGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalExpressionGroup(@NotNull CommonParserRulesParser.NumericalExpressionGroupContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#addExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(@NotNull CommonParserRulesParser.AddExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull CommonParserRulesParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#arrayAccessExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccessExpression(@NotNull CommonParserRulesParser.ArrayAccessExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#constantOfOtherTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantOfOtherTypes(@NotNull CommonParserRulesParser.ConstantOfOtherTypesContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#copyType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyType(@NotNull CommonParserRulesParser.CopyTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#arbitraryConstantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArbitraryConstantExpression(@NotNull CommonParserRulesParser.ArbitraryConstantExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#logicalConjunctionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalConjunctionExpression(@NotNull CommonParserRulesParser.LogicalConjunctionExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#booleanVariableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanVariableExpression(@NotNull CommonParserRulesParser.BooleanVariableExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#stringLiteralExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralExpression(@NotNull CommonParserRulesParser.StringLiteralExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#numericalLiteralExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalLiteralExpression(@NotNull CommonParserRulesParser.NumericalLiteralExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#rowType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowType(@NotNull CommonParserRulesParser.RowTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#variableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpression(@NotNull CommonParserRulesParser.VariableExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#numericalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalExpression(@NotNull CommonParserRulesParser.NumericalExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#numericConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericConstant(@NotNull CommonParserRulesParser.NumericConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#booleanConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanConstant(@NotNull CommonParserRulesParser.BooleanConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#subExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpression(@NotNull CommonParserRulesParser.SubExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#mulExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpression(@NotNull CommonParserRulesParser.MulExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#numericalFunctionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalFunctionExpression(@NotNull CommonParserRulesParser.NumericalFunctionExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#assignOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignOperator(@NotNull CommonParserRulesParser.AssignOperatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#numericVariableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericVariableExpression(@NotNull CommonParserRulesParser.NumericVariableExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#divExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpression(@NotNull CommonParserRulesParser.DivExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#exponentiationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponentiationExpression(@NotNull CommonParserRulesParser.ExponentiationExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(@NotNull CommonParserRulesParser.ConstantExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#negateExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegateExpression(@NotNull CommonParserRulesParser.NegateExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpression(@NotNull CommonParserRulesParser.BooleanExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#functionCallExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(@NotNull CommonParserRulesParser.FunctionCallExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#booleanArbitraryConstantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanArbitraryConstantExpression(@NotNull CommonParserRulesParser.BooleanArbitraryConstantExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#booeleanExpressionGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooeleanExpressionGroup(@NotNull CommonParserRulesParser.BooeleanExpressionGroupContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(@NotNull CommonParserRulesParser.ComparisonExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#modExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModExpression(@NotNull CommonParserRulesParser.ModExpressionContext ctx);
}