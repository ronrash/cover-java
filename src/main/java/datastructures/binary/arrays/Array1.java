package datastructures.binary.arrays;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {


        int[] array = new int[]{1,2,3,4,5};

        for(int i :array)
        {
            System.out.println(i);
        }
        // we can use
        // converts an array to string
        final String s = Arrays.toString(array);
        System.out.println(s);


        // array of objects
        String[] strings = new String[]{"a","b"};
        System.out.println(Arrays.toString(strings));

     }
}
