package iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileInputStream01Sample {

    //there are 4 types of stream in java
//    1. ByteStream --> read or write data one by one using byte
//    2.CharacterStream --> reads unicode one at time 
//    3.BufferedStream -- this is a wrapper on byte and charactertream , can read buld data
//    4.ObjectsStream -- read/writes objects to files serialization
//    fall under java.io

    /*
     *  InputStream,OutputStream
     *  FileInputTsream,FileOutputStream they are good for byte data
     *  are wrappers on Inputstream and OutputStream
     *  Reader and writer are used for Byte nad character stream or character or text data
     *  File is handle for the folder where file is stored

     *  Exception throw FileNotFound and
     * */


    public static void main(String[] args) throws IOException {

      //  readAmdWriteUsingFileInputAndOutPutStream();
        useReaderAndWriter();

    }

    private static void useReaderAndWriter() throws IOException {
        try {
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
        try (FileInputStream fileInputStream = new FileInputStream("/Users/rohitprashar/Desktop/file01.txt");
             FileOutputStream fileOutputStream = new FileOutputStream("/Users/rohitprashar/Desktop/file02.txt")) {
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
