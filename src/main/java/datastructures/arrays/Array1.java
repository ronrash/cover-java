package datastructures.arrays;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {


        int[] array = new int[]{1, 2, 3, 4, 5}; // declaration and intialization
        int[] arrr= new int[10]; //declaration
        String [] names ={"rohit","swati"};
        for(int i=1;i<=10;i++)
        {
            arrr[i-1]=i*10;
        }
        System.out.println(Arrays.toString(arrr));
        System.out.println(Arrays.toString(names));

        for (int i : array) { // enhanced for loop
            System.out.print(i);
        }
        // we can use
        // converts an array to string
        // display ecah element in the
        final String s = Arrays.toString(array);
        Array1.customString(array);
        System.out.println(s);


        // if there is a 2d ARRAY
        System.out.println("printing 2d array");
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9, 10}
        };
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

        // array of objects
        String[] strings = new String[]{"a", "b"};
        System.out.println(Arrays.toString(strings));

    }

    private static void customString(final int[] array) {
        System.out.println("inside custom array");
        for(int i :array)
        {
            System.out.print(String.valueOf(i)+" ");
        }
    }


}
