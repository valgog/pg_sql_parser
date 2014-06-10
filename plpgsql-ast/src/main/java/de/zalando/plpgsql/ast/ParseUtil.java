package de.zalando.plpgsql.ast;

import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DiagnosticErrorListener;
import org.antlr.v4.runtime.tree.ParseTree;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class ParseUtil {
    private ParseUtil() { }

    private static final Logger LOGGER = LoggerFactory.getLogger(ParseUtil.class);

    public static ParseTree parse(final InputStream in) throws IOException {
        final ANTLRInputStream input = new ANTLRInputStream(in);

        // create a lexer that feeds off of input CharStream
        SqlLexer lexer = new SqlLexer(input);

        // create a buffer of tokens pulled from the lexer
        final CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        final SqlParser parser = new SqlParser(tokens);

// parser.setErrorHandler(new BailErrorStrategy());
        parser.addErrorListener(new SyntaxErrorListener());
        parser.addErrorListener(new DiagnosticErrorListener());
// parser.setTrace(true);

        final ParseTree tree = parser.stmt();
        LOGGER.debug(tree.toStringTree(parser));

// LOGGER.debug(parser.getCurrentToken() + "");
// LOGGER.debug(tokens.getTokens().toString());

        return tree;
    }

}
