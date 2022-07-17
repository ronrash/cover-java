package datastructures.binary.Questions;

import java.util.Arrays;

public class RotateArray {

    // rotate an array upt k times

    /*
    * algo // reverse an array
    *         reverse upto k elements
    *         rever from k+1 to end
    * */

    public static void main(String[] args) {

        int[] arr= {1,2,3,4,5,6,7}; // {5,6,7,1,2,3,4}
        int k=3; // no of time to be rotated
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        reverse(arr,0,k-1);
        System.out.println(Arrays.toString(arr));
        reverse(arr,k, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(final int[] array,  int start,  int end) {
       while(start<=end)
       {
           int temp = array[start];
           array[start]=array[end];
           array[end]=temp;
           start++;
           end--;

       }



    }
}
