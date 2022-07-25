package datastructures.binary.binary;

public class BinarySearch2 {
    public static void main(String[] args) {
        final int[] array = new int[]{12,10,9,8,7,5,4,3,2,1};
        final int target = 12;
        final int index = orderAgnosticBs(array, target);
        System.out.printf("searched element is at position %d%n", index);
    }

    // return an index of the search element
    // return -1 if the element is not present
    static int orderAgnosticBs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find if the array is ascending order sorted or descnding
        boolean isAsceding = arr[start] < arr[end];


        while (start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2; // might be possible that the start+end value be greater than integer value

            // check
            if (arr[mid] == target)
                return mid;

            if (isAsceding) {
                if (target > arr[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
            else
            {
                if (target < arr[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }
}
