package de.zalando.plpgsql.ast;

import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public final class ParseUtil {
	private ParseUtil(){}
	
	public static ParseTree parse(final InputStream in) throws IOException
	{
	       final ANTLRInputStream input = new ANTLRInputStream(in);

	        // create a lexer that feeds off of input CharStream
	        final PlPgSqlLexer lexer = new PlPgSqlLexer(input);

	        // create a buffer of tokens pulled from the lexer
	        final CommonTokenStream tokens = new CommonTokenStream(lexer);

	        // create a parser that feeds off the tokens buffer
	        final PlPgSqlParser parser = new PlPgSqlParser(tokens);

	        final ParseTree tree = parser.unit();
	        System.out.println(tree.toStringTree(parser)); // print LISP-style tree
	        return tree;
	}
	
}
