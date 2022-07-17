package datastructures.binary.Questions;

public class FirstAndLastPosition {

    // smallest letter greater than target
    // array is sorted in non dreasing order
    // retrn the  smallest character int the array that is larger than the target
    // cieling question
    /*
     * examples
     *
     * */

    public static void main(String[] args) {
        int[] array = new int[]{5, 7, 7, 7, 7, 8, 8, 10}; // answer is c
        int target = 7;
        int[] result = new int[2];

        int startIndex = search(array, target, true);
        if (startIndex != -1) {
            result[1] = search(array, target, false);
        }
        result[0] = startIndex;


        System.out.println(result[0] + " " + result[1]);
        /*
         * Solution approach
         * Same approach as cieling instead that we need to remove the equals condition because it wants the next greatest
         * we have to return the start % length of an aray
         * */
    }

    private static int search(final int[] array, final int target, final boolean firstIndex) {

        int start = 0;
        int end = array.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > array[mid])
                start = mid + 1;
            else if (target < array[mid])
                end = mid - 1;
            else {
                ans = mid;
                if (firstIndex) {
                    end = mid - 1;

                } else
                    start = mid + 1;
            }
        }
        return ans;
    }
}
