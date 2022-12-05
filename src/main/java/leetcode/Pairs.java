package leetcode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Pairs {

    public static void main(String[] args) throws FileNotFoundException {
//        2-4,6-8
//        2-3,4-5
//        5-7,7-9
//        2-8,3-7
//        6-6,4-6
//        2-6,4-8

        File file = new File("/Users/rohitprashar/Downloads/react-aws/Input01.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));

        try {
            reader = new BufferedReader(new FileReader(file));
            String text = null;

            while ((text = reader.readLine()) != null) {

                String[] arr = text.split(",");


                String[] firstPair = text.split("-");
                String[] secondPair = text.split("-");

                System.out.println(arr);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
            }
        }

    }
    }

