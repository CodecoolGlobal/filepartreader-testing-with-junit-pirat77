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

    public boolean isPalindrome(String word){
        char[] chars = word.toCharArray();
        int i = 0;
        int j = chars.length-1;
        while (i<j){
            if (chars[i] != chars[j]) return false;
            i++;
            j--;
        }
        return true;
    }

    public List<String> getStringsWhichPalindromes(){
        List<String> outputList = new ArrayList<>();
        Arrays.stream(extractWordsFromString(filePartReader.readLines()))
                .filter(w -> isPalindrome(w))
                .forEach(w -> outputList.add(w));
        return outputList;
    }
}
