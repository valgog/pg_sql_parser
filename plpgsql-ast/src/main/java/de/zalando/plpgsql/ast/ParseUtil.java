package de.zalando.plpgsql.ast;

import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class ParseUtil {
    private ParseUtil() { }

    private static final Logger LOGGER = LoggerFactory.getLogger(ParseUtil.class);

    public static ParseTree parse(final InputStream in) throws IOException {
        final ANTLRInputStream input = new ANTLRInputStream(in);

        // create a lexer that feeds off of input CharStream
        final PlPgSqlLexer lexer = new PlPgSqlLexer(input);

        // create a buffer of tokens pulled from the lexer
        final CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        final PlPgSqlParser parser = new PlPgSqlParser(tokens);
// parser.setErrorHandler(new BailErrorStrategy());
// parser.addErrorListener(new SyntaxErrorListener());

        final ParseTree tree = parser.unit();
        LOGGER.debug(tree.toStringTree(parser));
        return tree;
    }

}
