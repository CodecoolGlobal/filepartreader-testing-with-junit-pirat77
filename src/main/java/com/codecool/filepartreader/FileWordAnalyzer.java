package com.codecool.filepartreader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileWordAnalyzer {
    private  FilePartReader filePartReader;

    public FilePartReader getFilePartReader() {
        return filePartReader;
    }

    FileWordAnalyzer(FilePartReader filePartReader){
        this.filePartReader = filePartReader;
    }

    public String[] extractWordsFromString(String string){
        return string.split("[^a-zA-z]+");
    }

    public List<String> getWordsOrderedAlphabetically(){
        List<String> outputList = new ArrayList<>();
        Arrays.stream(extractWordsFromString(filePartReader.readLines()))
                .sorted()
                .forEach(w -> outputList.add(w));
        return outputList;
    }

    public List<String> getWordsContainingSubstring(String subString){
        List<String> outputList = new ArrayList<>();
        Arrays.stream(extractWordsFromString(filePartReader.readLines()))
                .filter(w -> w.contains(subString))
                .forEach(w -> outputList.add(w));
        return outputList;
    }

    public List<String> getStringsWhichPalindromes(){
        List<String> outputList = new ArrayList<>();
        String linesToAnalyze = filePartReader.readLines();
        return outputList;
    }
}
