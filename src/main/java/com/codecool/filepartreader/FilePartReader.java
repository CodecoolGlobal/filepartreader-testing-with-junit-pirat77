package com.codecool.filepartreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilePartReader {
    public String filePath;
    public Integer fromLine;
    public Integer toLine;

    FilePartReader(){
        filePath = "src/main/resources/txt.asc";
        fromLine = 1;
        toLine = 1024;
    }

    public void setup(String filePath, Integer fromLine, Integer toLine) throws IllegalArgumentException {
        if (toLine < fromLine) throw new IllegalArgumentException();
        this.fromLine = fromLine;
        this.toLine = toLine;
        this.filePath = filePath;
    }

    public String read() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        StringBuilder output = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null){
            output.append(line);
            output.append("\n");
        }
        return output.toString();
    }

    public String readLines() {
        StringBuilder output = new StringBuilder();
        try {
            String[] lines;
            String fileContent = read();
            lines = fileContent.split("\n");
            if (((lines.length < fromLine) || (lines.length < toLine))) {
                throw new IllegalArgumentException();
            }
            for (int i = fromLine-1; i <toLine; i++) {
                output.append(lines[i]);
                output.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return output.toString();
    }
}
