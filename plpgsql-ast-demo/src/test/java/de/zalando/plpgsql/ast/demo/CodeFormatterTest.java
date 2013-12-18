package de.zalando.plpgsql.ast.demo;

import java.io.File;
import java.io.FileInputStream;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import org.junit.Test;

import de.zalando.plpgsql.ast.ParseUtil;

public final class CodeFormatterTest {

    @Test
    public void test() throws Exception {

        final File file = new File("src/test/resources/sprocs/unformatted_query.sql");
        final ParseTree tree = ParseUtil.parse(new FileInputStream(file));

        final CodeFormatter formatter = new CodeFormatter();

        final ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(formatter, tree);

        System.out.println(formatter.toString());
    }

}
