package datastructures.binary.arrays;

import java.util.Arrays;

public class Array2d {

    public static void main(String[] args) {
        int[][] array = new int[3][3];
        /*{
           {1,2,3}, row[0]
           {4,5},   row[1]
           {6,7,8,9,10} row[3]
         }
       array.length == no of rows

         */
        int i=1;
        for (int row = 0; row < array.length; row++) {
            // for each col in the row
            for (int col = 0; col < array[row].length; col++) {
                array[row][col]=i++;
            }
        }
        for (int row = 0; row < array.length; row++) {
            // for each col in the row
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println(" ");
        }

        //printing this  2d arrray
        // how to print the array
        System.out.println("---------------|--------------");
        for(int row =0;row<array.length;row++)
        {
            System.out.println(Arrays.toString(array[row]));
        }

        // suing for each loop
        // every type is an array
        System.out.println("Using for each loop");
        for(int[] a :array)
        {
            System.out.println(Arrays.toString(a));
        }

    }
}
