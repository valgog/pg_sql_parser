package de.zalando.plpgsql.ast.demo;

import java.util.Stack;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.misc.NotNull;

import com.google.common.base.Strings;

import de.zalando.plpgsql.ast.PlPgSqlBaseListener;
import de.zalando.plpgsql.ast.PlPgSqlParser;
import de.zalando.plpgsql.ast.PlPgSqlParser.IntoClauseContext;
import de.zalando.plpgsql.ast.PlPgSqlParser.SelectAllContext;
import de.zalando.plpgsql.ast.PlPgSqlParser.SelectListContext;
import de.zalando.plpgsql.ast.PlPgSqlParser.SelectSpecificContext;
import de.zalando.plpgsql.ast.PlPgSqlParser.SelectStmtContext;

public class CodeFormatter extends PlPgSqlBaseListener {

    private static final int INDENT = 4;

    private static final int LONGEST_QUERY_PART_SIZE = 7; // SELECT

    private final StringBuilder builder;

    private int currentIndent;
    private final Stack<Integer> indentStack;

    public CodeFormatter() {
        builder = new StringBuilder(1024);
        currentIndent = INDENT;

        indentStack = new Stack<Integer>();
    }

    public void enterSelectSpecific(@NotNull final SelectSpecificContext ctx) {

        appendChildElements(ctx, 0);
    }

    public void enterSelectList(@NotNull final SelectListContext ctx) {

        indentStack.push(currentIndent);

        final String keyWord = "SELECT ";

        appendKeyword(keyWord);
// appendChildElements(ctx, 0);
    }

    public void exitSelectList(@NotNull final SelectListContext ctx) {
        currentIndent = indentStack.pop();

    }

    private void calculateCurrentIndent(final String keyWord) {
        currentIndent += keyWord.length() + (LONGEST_QUERY_PART_SIZE - keyWord.length());
    }

    public void enterIntoClause(@NotNull final IntoClauseContext ctx) {

        String keyWord = "INTO";

        if (ctx.strict != null) {
            keyWord += " STRICT";
        }

        enterNewKeyWord(keyWord, ctx);
        appendChildElements(ctx, 1);

    }

    public void exitIntoClause(@NotNull final IntoClauseContext ctx) {
        currentIndent = indentStack.pop();
    }

    public void exitSelectStmt(@NotNull final SelectStmtContext ctx) {
        for (int indentOnStack : indentStack) {
            currentIndent -= indentOnStack;
        }
    }

    public void enterSelectAll(@NotNull final SelectAllContext ctx) {
        builder.append("*");
    }

    @Override
    public void enterFromClause(@NotNull final PlPgSqlParser.FromClauseContext ctx) {
        enterNewKeyWord("FROM", ctx);
        appendChildElements(ctx, 1);
    }

    @Override
    public void exitFromClause(@NotNull final PlPgSqlParser.FromClauseContext ctx) {
        currentIndent = indentStack.pop();
    }

    @Override
    public void enterInnerJoin(@NotNull final PlPgSqlParser.InnerJoinContext ctx) {

        enterNewKeyWord("JOIN", ctx);

        builder.append(ctx.table.getText());
        builder.append(' ');
        builder.append("ON");
        builder.append(' ');
    }

    @Override
    public void enterLeftJoin(@NotNull final PlPgSqlParser.LeftJoinContext ctx) {
        enterNewKeyWord("LEFT JOIN", ctx);

        builder.append(ctx.table.getText());
        builder.append(' ');
        builder.append("ON");
        builder.append(' ');
    }

    @Override
    public void enterComparisonExpression(@NotNull final PlPgSqlParser.ComparisonExpressionContext ctx) {

        if (ctx.getParent() instanceof PlPgSqlParser.LogicalConjunctionExpressionContext) {
            final PlPgSqlParser.LogicalConjunctionExpressionContext lctx =
                (PlPgSqlParser.LogicalConjunctionExpressionContext) ctx.getParent();

            if (!indentStack.isEmpty()) {
                currentIndent = indentStack.pop();
            }

            enterNewKeyWord(lctx.operator.getText().toUpperCase(), lctx);
        }

        builder.append(ctx.getChild(0).getText());
        builder.append(' ');
        builder.append(ctx.operator.getText().toUpperCase());
        builder.append(' ');
        builder.append(ctx.getChild(2).getText());
    }

    /**
     * {@inheritDoc}
     *
     * <p/>The default implementation does nothing.
     */
    @Override
    public void exitInnerJoin(@NotNull final PlPgSqlParser.InnerJoinContext ctx) {
        currentIndent = indentStack.pop();
    }

    private void enterNewKeyWord(final String keyWord, final RuleContext ctx) {
        indentStack.push(currentIndent);
        builder.append('\n');

        appendKeyword(keyWord + " ");
    }

    private void appendKeyword(final String keyWord) {
        calculateCurrentIndent(keyWord);
        builder.append(Strings.padStart(keyWord, currentIndent, ' '));

    }

    private void appendChildElements(final RuleContext ctx, final int startIndex) {
        final String tmpIndent = Strings.repeat(" ", currentIndent);
        final int numberOfChildren = ctx.getChildCount();

        builder.append(ctx.getChild(startIndex).getText());

        String field;
        for (int i = startIndex + 1; i < numberOfChildren; i++) {
            field = ctx.getChild(i).getText();

            if (!Strings.isNullOrEmpty(field) && !",".equals(field)) {
                builder.append(",\n").append(tmpIndent);
                builder.append(field);
            }
        }
    }

    @Override
    public String toString() {
        return builder.toString();
    }
}
