package com.corejava.iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileInputStream01Sample {

    //there are 4 types of stream in java
//    1.ByteStream --> read or write data one by one using byte
//    2.CharacterStream --> reads unicode one at time 
//    3.BufferedStream -- this is a wrapper on byte and charactertream , can read buld data
//    4.ObjectsStream -- read/writes objects to files serialization
//    fall under java.io

    /*
     *  InputStream,OutputStream
     *  FileInputTsream,FileOutputStream they are good for byte data -->
     *  are wrappers on Inputstream and OutputStream
     *  Reader and writer are used for Byte nad character stream or character or text data
     *  File is handle for the folder where file is stored

     *  Exception throw FileNotFound and
     *
     *   file vs fileReader
     *   Creates a new File instance by converting the given pathname string into an abstract pathname.
     *  If the given string is the empty string, then the result is the empty abstract pathname.
     *
     * fileReader is just used for reading the file
     * vs file is a handler to handle the file it will not read -- if the file is not there it will create
     *  difference between FileReader and FileInputStream in Java.
     *  So, use FileReader if you intend to read streams of character and use the FileInputSream if you want to read streams of raw bytes.
     * It's better to use FileReader for reading text files because it will take care of converting bytes to characters
     * but remember that FileReader uses the platform's default character encoding.
     * If you are reading a file that is encoded in a character encoding other than the host's default char encoding then you should use the InputStreamReader.

Read more: https://www.java67.com/2016/03/difference-between-filereader-vs.html#ixzz7mZaq8rjc

Read more: https://www.java67.com/2016/03/difference-between-filereader-vs.html#ixzz7mZajG4xG
     *
     *   file
     * */


    public static void main(String[] args) throws IOException {

        readAmdWriteUsingFileInputAndOutPutStream();
       // useReaderAndWriter();

    }

    private static void useReaderAndWriter() throws IOException {
        try {
//            FileReader fileReader1  = new FileReader("/Users/rohitprashar/Downloads/javares/src/main/resources/file0w.txt");
//            System.out.println(fileReader1);
            FileReader fileReader = new FileReader("/Users/rohitprashar/Desktop/file01.docx");
            final String encoding = fileReader.getEncoding();

            System.out.println(encoding);

            try {
                FileWriter fileWriter = new FileWriter("/Users/rohitprashar/Desktop/file02.txt");
                try {
                    System.out.println("Reading the file");
                    int i = 0;
                    // fileInputStream.read()  returns and int and reads one byte at a time
                    // convert that into a character
                    while ((i = fileReader.read()) != -1) {
                        System.out.print((char) i);
                        fileWriter.write((char) i);
                    }
                } finally {
                    fileWriter.close();
                }
            } finally {
                fileReader.close();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readAmdWriteUsingFileInputAndOutPutStream() throws IOException {

        // using try with resources
        FileReader fileReader  = new FileReader(new File("/Users/rohitprashar/Desktop/file021212212.txt"));


        try (FileInputStream fileInputStream = new FileInputStream(new File("/Users/rohitprashar/Desktop/file01.txt"));
             FileOutputStream fileOutputStream = new FileOutputStream(new File("/Users/rohitprashar/Desktop/file01.txt"))) {
            System.out.println("Reading the file");
            int i = 0;
            // fileInputStream.read()  returns and int and reads one byte at a time
            // convert that into a character
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char) i);
                fileOutputStream.write((char) i);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
