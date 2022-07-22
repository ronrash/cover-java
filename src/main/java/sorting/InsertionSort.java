package sorting;

import java.util.Arrays;

public class InsertionSort
{
    // best cases is 0(n)
    // worst case is o(n2)
    // better than bubble sort as no of swaps are reduced

    public static void main(String[] args) {
        int[] array ={5,3,4,1,2};

        insertionSort(array);


    }

    private static void insertionSort(final int[] array) {

        // algo i range is 0 - n-2
        // j is i+1 --- n-1
        // and if a[j]>a[j-1] then break the inner loop

        for(int i=0;i<= array.length-2;i++)
        {
            System.out.println("Swapping after every iteration "+Arrays.toString(array));
            for(int j=i+1;j>0;j--)
            {
                if(array[j]<=array[j-1])
                    swap(array,j);
                else
                    break;
            }
        }
        System.out.println("Swapping after every iteration "+Arrays.toString(array));
    }

    private static void swap(final int[] array, final int j) {
        int temp = array[j];
        array[j]=array[j-1];
        array[j-1]=temp;
    }
}
