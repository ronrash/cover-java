package datastructures.arrays.arraysHashing;

public class ProductOfArrayExceptItsef {

    public static void main(String[] args) {

        int[] a = {1,2,3,4};// output is [24,12,8,6]

        findProduct(a);


    }

    private static void findProduct(final int[] a) {
        int [] output = new int[a.length]; //[1,2,6,24] [4,12,24,24]
       int leftProduct=1;
        for (int i = 0; i < a.length; i++) {
            output[i] = leftProduct;
            leftProduct = leftProduct* a[i];
        }
    }
}
