package datastructures.binary;

public class BInarySearch3 {
    public static void main(String[] args) {
        // find the next greater number
        // cieling question
        // cieling is the smallest number greater than target

        // 12 13 14 15
        // tagret - 13 -- ceiling is 14



        final int[] array = new int[]{10,20,30,40,50,60,70,80,90,100}; //10,20,30,40,50,60,70,80,90,100
        final int target = 99;
        final int index = cielingBS(array, target);
        System.out.printf("next smallest number greater than the target is  %d%n", index);
    }

    private static int cielingBS(final int[] array, final int target) {

        /*
        * logic
        * when while loop breaks and we are not able to find the number -- so next or closest number to 85 is 90
        * start = end+1 -- therefore start is the answer
        * */

        int start=0;
        int end =array.length-1;

        // check if the array is ascending or descending
        boolean isAscending = array[start]< array[end];
        while (start<=end)
        {
            int mid = start + (end-start)/2;

            if(array[mid]==target)
                return mid;
            if(isAscending)
            {
                if(target > array[mid])
                start= mid+1;
                else
                 end=mid-1;
            }
            else
            {
                if(target > array[mid])
                    start=mid-1;
                else
                    end=mid+1;
            }
        }
        return start;
    }
}
