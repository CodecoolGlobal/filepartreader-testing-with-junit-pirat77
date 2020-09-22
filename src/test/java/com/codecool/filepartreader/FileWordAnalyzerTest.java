package com.codecool.filepartreader;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
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

    }

    @Test
    public void getWordsContainingSubstring() {

    }

    @Test
    public void getStringsWhichPalindromes() {

    }
}