package sorting.questions;

import java.util.List;

public class MissingPositive {
    /*
    *
    *   return the smallest missing positive numbers
    *   unsorted array
    *   smallest number means sort the array
    *   missing means number is not at it correct position
    *   number which is at its correct postion means cyclic sorting
    *
    *  {1,2,0}-- o/p - 3
    *  {3,4,-1,1} o/p is 2
    *   {7,8,9,11,12} -- 1
    *
    *   do cyclic sort ignore negative and chcekc whihc index does not have element at correct positin ,, return that
    *
    * */
    public static void main(String[] args) {
        int[] a ={7,8,9,11,12};
        //ans -- 2,3
        // do cyclic sort

       findFirstMissingPositiveNumber(a);
        System.out.println( findFirstMissingPositiveNumber(a));
    }

    private static int findFirstMissingPositiveNumber(final int[] a) {

        int i=0;
        while (i<a.length)
        {
            int correctIndex = a[i]-1;
            if(a[i]>0 && a[i]<a.length && a[i]!=a[correctIndex])
                swap(a,i,correctIndex);
            else
                i++;
        }
        // after swapping find the first missing positive [1,-1,3,4]
        for(int j=0;j<a.length;j++)
        {
            // after swapping find the first missing positive [1,-1,3,4]
            if(a[j]!=j+1)
                return j+1;
        }
        return a.length;
    }

    private static void swap(final int[] a,final int i ,final int correctIndex) {
        int temp=a[i];
        a[i]=a[correctIndex];
        a[correctIndex]=temp;
    }
}
