package de.zalando.plpgsql.ast;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileInputStream;

import java.util.ArrayList;
import java.util.Collection;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DiagnosticErrorListener;
import org.antlr.v4.runtime.tree.ParseTree;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOCase;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.IOFileFilter;

import org.junit.Ignore;
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
    private static final String OPERATOR_TEST_FOLDER = "src/test/resources/operator_parse_test";

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
    @Ignore
    public void testSprocParsing() throws Exception {
        testIfIsFolder(SPROC_TEST_FOLDER, false);
    }

    @Test
    @Ignore
    public void testSqlParsing() throws Exception {
        testIfIsFolder(SQL_TEST_FOLDER, true);
    }

    @Test
    public void testOperatorParsing() throws Exception {
        testIfIsFolder(OPERATOR_TEST_FOLDER, true);
    }

    private void testIfIsFolder(final String testFolder, final boolean isSql) throws Exception {
        if (testFile.getParent().endsWith(testFolder)) {
            try(final FileInputStream fin = new FileInputStream(testFile)) {

                final ANTLRInputStream input = new ANTLRInputStream(fin);

                // create a lexer that feeds off of input CharStream
                SqlLexer lexer = new SqlLexer(input);

                // create a buffer of tokens pulled from the lexer
                final CommonTokenStream tokens = new CommonTokenStream(lexer);

                // create a parser that feeds off the tokens buffer
                final SqlParser parser = new SqlParser(tokens);

                parser.setErrorHandler(new BailErrorStrategy());
                if (LOGGER.isDebugEnabled()) {
                    parser.addErrorListener(new SyntaxErrorListener());
                    parser.addErrorListener(new DiagnosticErrorListener());
                    parser.setTrace(true);
                }

                ParseTree tree = null;
                if (isSql) {
                    try {
                        tree = parser.stmtblock();
                    } catch (final Exception e) {
                        LOGGER.error("A problem occurred while testing the parsing of file {}", testFile, e);
                        LOGGER.debug("Current token: {}", parser.getCurrentToken());
                        LOGGER.debug("Tokens: {}", tokens.getTokens().toString());

                        fail(e.getMessage());

                    }

                    if (tree != null) {
                        LOGGER.debug("PARSED SQL: {}", tree.toStringTree(parser));
                    }
                }

            }
        }
    }
}
