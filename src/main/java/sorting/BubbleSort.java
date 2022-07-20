package sorting;

import java.util.Arrays;

public class BubbleSort {

    // largest element comes in the end with each iteration
    // // also known as exchange sort
    // exchange the next element with each iteration

    // 1,3,4,5 -- with every pass

    // Space complextity -- O(1) -- no extra space is required
    // time complexity -- o(n2)  -- best case O(n) worst case O(n2)


    public static void main(String[] args) {
        int[] array = {3,4,2,5,1};

        //ist swap -- 3,2,4,5,1
           //           3,2,4,1,5

        bubbleSort(array);
        System.out.println(Arrays.toString(array));

    }

    private static void bubbleSort(final int[] array) {

     boolean swappedOccurred;
        for(int i=0;i<array.length;i++)
        {
            swappedOccurred=false;
            // foreach step, max item will come at the end
            for(int j=1;j<array.length-i;j++)
            {
                // swap if the item is smalller that the previous item
                if(array[j]<array[j-1])
                {
                    //swap
                    int temp = array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                    swappedOccurred=true;
                }
            }
          if (!swappedOccurred)  // basicall means that the array is sorted
              break;
        }
    }
}
