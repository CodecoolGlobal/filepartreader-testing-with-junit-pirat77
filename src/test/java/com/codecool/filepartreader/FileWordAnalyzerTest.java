package com.codecool.filepartreader;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class FileWordAnalyzerTest {
    private FileWordAnalyzer fileWordAnalyzer;
    @Before
    public void setUp() throws Exception {
        this.fileWordAnalyzer = new FileWordAnalyzer(new FilePartReader());
    }

    @After
    public void tearDown() throws Exception {
        this.fileWordAnalyzer = null;
    }

    @Test
    public void getWordsOrderedAlphabetically() {
        fileWordAnalyzer.getFilePartReader().setup("src/main/resources/alphabet.asc", 1, 11);
        List<String> orderedOutput = fileWordAnalyzer.getWordsOrderedAlphabetically();
        assertArrayEquals(new String[]{"kakao", "katamaran", "katana", "koza", "krowa", "solanka", "ziemniak", "zonk"}, orderedOutput.toArray());
    }

    @Test
    public void getWordsContainingSubstring() {
        fileWordAnalyzer.getFilePartReader().setup("src/main/resources/alphabet.asc", 1, 11);
        List<String> containingKa = fileWordAnalyzer.getWordsContainingSubstring("ka");
        assertArrayEquals(new String[]{"kakao", "katamaran", "katana", "solanka"}, containingKa.stream().sorted().toArray());
    }

    @Test
    public void getStringsWhichPalindromes() {

    }
}