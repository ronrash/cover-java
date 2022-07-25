package datastructures.binary.arrays;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {


        int[] array = new int[]{1, 2, 3, 4, 5};

        for (int i : array) {
            System.out.println(i);
        }
        // we can use
        // converts an array to string
        final String s = Arrays.toString(array);
        System.out.println(s);


        // if there is a 2d ARRAY
        System.out.println("printing 2d array");
        int[][] arr = {
                {1, 2, 3}, {4, 5, 6}, {7, 8, 9, 10}
        };
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

        // array of objects
        String[] strings = new String[]{"a", "b"};
        System.out.println(Arrays.toString(strings));

    }
}
