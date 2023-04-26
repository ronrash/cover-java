package datastructures.sorting.questions;

public class MissingNumbers {

    public static void main(String[] args) {

        // n distinct numbers find range [o,n] find the only number in the range which is missing
        //o(n) running time complexity and o(1) space time complexity
        int[] a= {3,0,1};

        final int missingNumber = findMissingNumber(a);
        System.out.println(missingNumber);
    }

    private static int findMissingNumber(final int[] a) {

        int i=0;
        while(i<a.length)
        {
            int correctIndex = a[i];
            if(a[i]< a.length && a[i]!=a[correctIndex])
                swap(a,i,correctIndex);
            else
                i++;
        }
        //seacrh for the missing elemnt
        for(int j=0;j<a.length;j++)
        {
            if(a[j]!=j)
                return j;
        }
        return -1;
    }

    private static void swap(final int[] a,final int i ,final int correctIndex) {
        int temp=a[i];
        a[i]=a[correctIndex];
        a[correctIndex]=temp;
    }

}
