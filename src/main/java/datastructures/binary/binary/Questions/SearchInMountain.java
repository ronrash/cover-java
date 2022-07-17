package datastructures.binary.Questions;

public class SearchInMountain {

    /*
    * Question is
    * array is [1,2,3,4,5,3,1] -- find min index of target 3 -- output index is 2
    * */
    //algo says first search peak mountain
    // then do binary search in first half and then second half
    public static void main(String[] args) {
        final int[] array = new int[]{1,2,3,4,5,3,1};
        final int target=3;
        // since it is a sorted array binary search apply
        int finalAnswer=-1;
        //1. find peak index
        int peak = peak(array);
        int firstHalf= binarySearch(array,target,0,peak);
        if(firstHalf!=-1)
           finalAnswer=firstHalf;
        else {
            finalAnswer = binarySearch(array, target, peak, array.length - 1);
        }

        System.out.println(finalAnswer);
    }

    private static int peak(final int[] array) {
        int start=0;
        int end =array.length-1;

        while(start<end)
        {
            int mid = start+ (end-start)/2;

            if(array[mid]>array[mid+1])
                end=mid;
            else
                start=mid+1;
        }
        return start;
    }

    private static int binarySearch(int[] array,int target,int start,int end){
        while(start<=end)
        {
            int mid = start+(end-start)/2;

            if(array[mid]==target)
                return mid;
            else if (target>array[mid]) {
                start=mid+1;

            }
            else
                end=mid-1;
        }
        return -1;
    }
}
