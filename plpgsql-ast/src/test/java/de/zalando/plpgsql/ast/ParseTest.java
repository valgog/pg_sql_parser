package de.zalando.plpgsql.ast;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import java.nio.charset.StandardCharsets;

import java.util.ArrayList;
import java.util.Collection;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DiagnosticErrorListener;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOCase;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.IOFileFilter;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.junit.runners.Parameterized;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Lists;

@RunWith(Parameterized.class)
public final class ParseTest {
    private final File testFile;

    private static final String SPROC_TEST_FOLDER = "src/test/resources/function_parse_test";
    private static final String SQL_TEST_FOLDER = "src/test/resources/sql_parse_test";

    private static final Logger LOGGER = LoggerFactory.getLogger(ParseTest.class);

    private static Collection<File[]> collectFilesInFolder(final String folderPath) {
        final IOFileFilter filter = FileFilterUtils.suffixFileFilter(".sql", IOCase.INSENSITIVE);

        final File testFolder = new File(folderPath);
        final Collection<File> filesCollection = FileUtils.listFiles(testFolder, filter, null);
        final ArrayList<File[]> fileArrayList = Lists.newArrayListWithCapacity(filesCollection.size());
        for (File file : filesCollection) {
            fileArrayList.add(new File[] {file});
        }

        return fileArrayList;
    }

    @Parameterized.Parameters
    public static Collection<File[]> testSet() {

        final Collection<File[]> sprocFiles = collectFilesInFolder(SPROC_TEST_FOLDER);
        final Collection<File[]> sqlFiles = collectFilesInFolder(SQL_TEST_FOLDER);

        final ArrayList<File[]> testFiles = Lists.newArrayListWithCapacity(sprocFiles.size() + sqlFiles.size());
        testFiles.addAll(sprocFiles);
        testFiles.addAll(sqlFiles);
        return testFiles;
    }

    public ParseTest(final File testFile) {
        this.testFile = testFile;
    }

    @Test
    public void testSprocParsing() throws Exception {
        testIfIsFolder(SPROC_TEST_FOLDER, false);
    }

// @Test
// public void testSqlParsing() throws Exception {
// testIfIsFolder(SQL_TEST_FOLDER, true);
// }

    private void testIfIsFolder(final String testFolder, final boolean isSql) throws Exception {
        if (testFile.getParent().endsWith(testFolder)) {
            LOGGER.info("Test parsing of file {}", testFile.getName());

            try(final FileInputStream fin = new FileInputStream(testFile)) {

                final ANTLRInputStream input = new ANTLRInputStream(fin);

                // create a lexer that feeds off of input CharStream
                SqlLexer lexer = new SqlLexer(input);

                // create a buffer of tokens pulled from the lexer
                final CommonTokenStream tokens = new CommonTokenStream(lexer);

                // create a parser that feeds off the tokens buffer
                // NOTE PlPgParser import Sql.g4 -> grammar is available there
// final PlPgSqlParser parser = new PlPgSqlParser(tokens);

                final SqlParser parser = new SqlParser(tokens);

                // parser.setErrorHandler(new BailErrorStrategy());
                parser.addErrorListener(new SyntaxErrorListener());
                parser.addErrorListener(new DiagnosticErrorListener());
                parser.setTrace(true);

                final ParseTree tree;
                if (isSql) {
                    tree = parser.stmt();
                    LOGGER.debug("PARSED SQL: {}", tree.toStringTree(parser));
                } else {
                    tree = parser.createFunctionStmt();
                    LOGGER.debug("PARSED SQL: {}", tree.toStringTree(parser));

                    FunctionExtractor listener = new FunctionExtractor();
                    final ParseTreeWalker walker = new ParseTreeWalker();
                    walker.walk(listener, tree);

                    final String functionDef = listener.getFunctionDefinition();
                    LOGGER.info("EXTRACTED_FUNCITON_DEF: {}", functionDef);
                    parseSproc(functionDef);
                }

            }
        }
    }

    private void parseSproc(final String functionDef) throws Exception {
        final InputStream in = new ByteArrayInputStream(functionDef.getBytes(StandardCharsets.UTF_8));
        final ANTLRInputStream input = new ANTLRInputStream(in);
        final PlPgSqlLexer lexer = new PlPgSqlLexer(input);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);

        final PlPgSqlParser parser = new PlPgSqlParser(tokens);

        // parser.setErrorHandler(new BailErrorStrategy());
        parser.addErrorListener(new SyntaxErrorListener());
        parser.addErrorListener(new DiagnosticErrorListener());
        parser.setTrace(true);

        final ParseTree tree = parser.pl_function();

        LOGGER.debug("PARSED PLPGSQL: {}", tree.toStringTree(parser));

    }

    private static final class FunctionExtractor extends SqlBaseListener {

        private String functionDefinition;

        @Override
        public void enterFunc_as(@NotNull final SqlParser.Func_asContext ctx) {
            functionDefinition = ctx.sConst().get(0).getText();
        }

        public String getFunctionDefinition() {
            return functionDefinition.replace("$$", "");
        }

    }
}
