package de.zalando.plpgsql.ast;

import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DiagnosticErrorListener;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

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

import de.zalando.plpgsql.ast.SqlParser.SconstContext;

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
        final Collection<File[]> operatorFiles = collectFilesInFolder(OPERATOR_TEST_FOLDER);

        final ArrayList<File[]> testFiles = Lists.newArrayListWithCapacity(sprocFiles.size() + sqlFiles.size()
                    + sqlFiles.size());
        testFiles.addAll(sprocFiles);
        testFiles.addAll(sqlFiles);
        testFiles.addAll(operatorFiles);
        return testFiles;
    }

    public ParseTest(final File testFile) {
        this.testFile = testFile;
    }

    @Test
    public void testSprocParsing() throws Exception {
        testIfIsFolder(SPROC_TEST_FOLDER, false);
    }

    @Test
    // @Ignore
    public void testSqlParsing() throws Exception {
        testIfIsFolder(SQL_TEST_FOLDER, true);
    }

    @Test
    @Ignore
    public void testOperatorParsing() throws Exception {
        testIfIsFolder(OPERATOR_TEST_FOLDER, true);
    }

    private void testIfIsFolder(final String testFolder, final boolean isSql) throws Exception {
        if (testFile.getParent().endsWith(testFolder)) {
            try(final FileInputStream fin = new FileInputStream(testFile)) {

                final ANTLRInputStream input = new ANTLRInputStream(fin);

                // create a lexer that feeds off of input CharStream
                final SqlLexer lexer = new SqlLexer(input);

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
                } else {
                    tree = parser.stmtblock();

                    final SprocExtracter extractor = new SprocExtracter();

                    final ParseTreeWalker treeWalker = new ParseTreeWalker();
                    treeWalker.walk(extractor, tree);

                    for (String sprocBody : extractor.getSprocBodies()) {
                        parseSproc(sprocBody);
                    }
                }

            }
        }
    }

    private void parseSproc(final String sprocBody) throws Exception {

        final ByteArrayInputStream bin = new ByteArrayInputStream(sprocBody.getBytes("UTF-8"));
        final ANTLRInputStream input = new ANTLRInputStream(bin);
        final PlPgSqlLexer lexer = new PlPgSqlLexer(input);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final PlPgSqlParser parser = new PlPgSqlParser(tokens);

        parser.setErrorHandler(new BailErrorStrategy());
        if (LOGGER.isDebugEnabled()) {
            parser.addErrorListener(new SyntaxErrorListener());
            parser.addErrorListener(new DiagnosticErrorListener());
            parser.setTrace(true);
        }

        ParseTree tree = null;
        try {
            tree = parser.pl_function();
        } catch (final Exception e) {
            LOGGER.error("A problem occurred while testing the parsing of file {}", testFile, e);
            LOGGER.debug("Current token: {}", parser.getCurrentToken());
            LOGGER.debug("Tokens: {}", tokens.getTokens().toString());
// LOGGER.debug("parsed sproc body: {}", sprocBody);

            fail(e.getMessage());
        }

        if (tree != null) {
            LOGGER.debug("PARSED SPROC: {}", tree.toStringTree(parser));
        }

    }

    private static final class SprocExtracter extends SqlBaseListener {
        private ArrayList<String> sprocBodies;

        public SprocExtracter() {
            sprocBodies = Lists.newArrayList();
        }

        public List<String> getSprocBodies() {
            return sprocBodies;
        }

        @Override
        public void enterFunc_as(@NotNull final SqlParser.Func_asContext ctx) {
            for (SconstContext sconstCtx : ctx.sconst()) {

                // FIXME not correct but ok for first tests
                sprocBodies.add(sconstCtx.getText().replace("$$", ""));
            }
        }

    }
}
