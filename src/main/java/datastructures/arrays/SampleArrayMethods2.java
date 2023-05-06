package datastructures.arrays;

import java.util.Arrays;

public class SampleArrayMethods2 {

    public static void main(String[] args) {


        // sort an aray

        // sample array methods
        // copyOfRange
        String[] array = {"a","b","c","d"};
        String[] strings = Arrays.copyOfRange(array, 0,array.length);// index 2 to 3 3 is exclusive

        System.out.println(Arrays.toString(strings));
    }
}
