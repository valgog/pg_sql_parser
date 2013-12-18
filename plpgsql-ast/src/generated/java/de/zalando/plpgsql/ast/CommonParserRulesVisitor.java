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
	 * Visit a parse tree produced by {@link CommonParserRulesParser#booleanLiteralExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteralExpression(@NotNull CommonParserRulesParser.BooleanLiteralExpressionContext ctx);

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
	 * Visit a parse tree produced by {@link CommonParserRulesParser#varExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExpr(@NotNull CommonParserRulesParser.VarExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#addExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(@NotNull CommonParserRulesParser.AddExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(@NotNull CommonParserRulesParser.IntegerLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#labelExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelExpression(@NotNull CommonParserRulesParser.LabelExpressionContext ctx);

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
	 * Visit a parse tree produced by {@link CommonParserRulesParser#numericalLiteralExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalLiteralExpression(@NotNull CommonParserRulesParser.NumericalLiteralExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#stringLiteralExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralExpression(@NotNull CommonParserRulesParser.StringLiteralExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#variableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpression(@NotNull CommonParserRulesParser.VariableExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#numericConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericConstant(@NotNull CommonParserRulesParser.NumericConstantContext ctx);

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
	 * Visit a parse tree produced by {@link CommonParserRulesParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(@NotNull CommonParserRulesParser.BooleanLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#stringLiteralExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralExpr(@NotNull CommonParserRulesParser.StringLiteralExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#decimalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(@NotNull CommonParserRulesParser.DecimalLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#assignOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignOperator(@NotNull CommonParserRulesParser.AssignOperatorContext ctx);

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
	 * Visit a parse tree produced by {@link CommonParserRulesParser#negateExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegateExpression(@NotNull CommonParserRulesParser.NegateExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#functionCallExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(@NotNull CommonParserRulesParser.FunctionCallExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParserRulesParser#numericalConstantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalConstantExpression(@NotNull CommonParserRulesParser.NumericalConstantExpressionContext ctx);

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