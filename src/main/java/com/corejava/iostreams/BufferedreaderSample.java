package com.corejava.iostreams;

import java.io.FileReader;
import java.io.IOException;

public class BufferedreaderSample {
    public static void main(String[] args) throws IOException {
        readAndCountFromAPDFUsingBufferedReader();
    }

    private static void readAndCountFromAPDFUsingBufferedReader() throws IOException {
        StringBuilder stringBuilder;
        try (FileReader fileReader = new FileReader("/Users/rohitprashar/Desktop/con.pdf")) {

            int line;
            stringBuilder = new StringBuilder();
            while ((line = fileReader.read()) != -1) {

                // count the characters
                stringBuilder.append((char) line);
            }
        }
    }


}
