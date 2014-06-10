package de.zalando.plpgsql.ast;

import java.io.File;
import java.io.FileInputStream;

import java.util.ArrayList;
import java.util.Collection;

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
        testIfIsFolder(SPROC_TEST_FOLDER);
    }

    private void testIfIsFolder(final String testFolder) throws Exception {
        if (testFile.getParent().endsWith(testFolder)) {
            LOGGER.info("Test parsing of file {}", testFile.getName());

            try(final FileInputStream fin = new FileInputStream(testFile)) {
                ParseUtil.parse(fin);
            }
        }
    }

    @Test
    public void testSqlParsing() throws Exception {
        testIfIsFolder(SQL_TEST_FOLDER);
    }
}
