package de.zalando.plpgsql.ast;

import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SyntaxErrorListener extends BaseErrorListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(SyntaxErrorListener.class);

    @Override
    public void syntaxError(final Recognizer<?, ?> recognizer, final Object offendingSymbol, final int line,
            final int charPositionInLine, final String msg, final RecognitionException e) {

        super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);

        if (e != null) {
            final Parser parser = (Parser) recognizer;
            final List<String> stack = parser.getRuleInvocationStack();
            Collections.reverse(stack);

            LOGGER.error("rule stack: {}", stack);
            LOGGER.error("line {} position {} : {} at {}",
                new Object[] {line, charPositionInLine, msg, offendingSymbol, e});
        }

    }
}
