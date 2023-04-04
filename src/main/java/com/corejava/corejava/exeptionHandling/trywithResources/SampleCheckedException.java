package com.corejava.corejava.exeptionHandling.trywithResources;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SampleCheckedException {

    // checked exception or compile time exceptions can be handled using try catch or throws keyword

    public static void main(String[] args) {
        PrintWriter pw = null;
        try{
            pw = new PrintWriter("abc.txt");
        }catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            pw.close();
        }
        System.out.println("file saved successfully");
    }
}
