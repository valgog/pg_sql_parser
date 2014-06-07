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
public final class FunctionParseTest {
    private final File testFile;

    private static final String TEST_FOLDER = "src/test/resources/function_parse_test";

    private static final Logger LOGGER = LoggerFactory.getLogger(FunctionParseTest.class);

    @Parameterized.Parameters
    public static Collection<File[]> testSet() {
        final File testFolder = new File(TEST_FOLDER);

// final IOFileFilter filter = FileFilterUtils.suffixFileFilter("strange_parsing_problem.sql", IOCase.INSENSITIVE);

        final IOFileFilter filter = FileFilterUtils.suffixFileFilter(".sql", IOCase.INSENSITIVE);
        final Collection<File> filesCollection = FileUtils.listFiles(testFolder, filter, null);

        final ArrayList<File[]> fileArrayList = Lists.newArrayListWithCapacity(filesCollection.size());
        for (File file : filesCollection) {
            fileArrayList.add(new File[] {file});
        }

        return fileArrayList;
    }

    public FunctionParseTest(final File testFile) {
        this.testFile = testFile;
    }

    @Test
    public void test() throws Exception {
        LOGGER.info("Test parsing of file {}", testFile.getName());

        try(final FileInputStream fin = new FileInputStream(testFile)) {
            ParseUtil.parse(fin);
        }
    }
}
