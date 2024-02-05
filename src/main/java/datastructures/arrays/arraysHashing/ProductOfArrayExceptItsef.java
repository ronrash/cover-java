package datastructures.arrays.arraysHashing;

import java.util.Arrays;

public class ProductOfArrayExceptItsef {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};// output is [24,12,8,6]
        // product of any value in the array is prod of the eft side *right side
        // so we use 2 arrays to store leftArray and a rightArray
        findProduct(a);
    }

    private static void findProduct(final int[] a) {
        int[] leftArray = new int[a.length];
        int[] rightArray = new int[a.length];
        int leftProduct = 1;
        int rightProduct = 1;
        //o(n)
        for (int i = 0; i < a.length; i++) {
            leftProduct = leftProduct * a[i];
            leftArray[i] = leftProduct;
        }
        System.out.println("This is the left Array "+Arrays.toString(leftArray));
        for (int i = a.length - 1; i >= 0; i--) {
            rightProduct = rightProduct * a[i];
            rightArray[i] = rightProduct;
        }
        //   int[] a = {1,2,3,4};// output is [24,12,8,6]
        //[1,2,6,24]
        //[24,24,12,4]
        System.out.println("This is the right  Array "+Arrays.toString(rightArray));
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                a[i] = 1 * rightArray[i + 1];
            } else if (i == a.length - 1) {
                a[i] = leftArray[i - 1] * 1;
            } else {
                a[i] = leftArray[i - 1] * rightArray[i + 1];
            }

        }
    }
}
