package com.codecool.filepartreader;

import java.util.ArrayList;
import java.util.List;

public class FileWordAnalyzer {
    private  FilePartReader filePartReader;

    FileWordAnalyzer(FilePartReader filePartReader){
        this.filePartReader = filePartReader;
    }

    public List<String> getWordsOrderedAlphabetically(){
        List<String> outputList = new ArrayList<>();
        String linesToAnalyze = filePartReader.readLines();
        return outputList;
    }

    public List<String> getWordsContainingSubstring(String subString){
        List<String> outputList = new ArrayList<>();
        String linesToAnalyze = filePartReader.readLines();
        return outputList;
    }

    public List<String> getStringsWhichPalindromes(){
        List<String> outputList = new ArrayList<>();
        String linesToAnalyze = filePartReader.readLines();
        return outputList;
    }
}
