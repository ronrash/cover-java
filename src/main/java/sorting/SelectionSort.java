package sorting;

public class SelectionSort {
    // performs well in small list

    /*
     * Algorithm where we find the max elemeet in the array and then swap that with the last element
     * then we reduce the range ie we ignore the last element and so forth
     *
     * */

    public static void main(String[] args) {
        int[] array = {4, 5, 1, 2, 3};
        selectionSort(array);

        //
    }

    private static void selectionSort(final int[] array) {
        //
        for (int i = 0; i < array.length; i++) {
            // find the range
            int last = array.length - i - 1;
            // find the index of the maximum element
            final int maxIndex = maxIndex(array, 0, last);

            // swap the maxIndex eement with the last element
            swap(array,maxIndex,last);
        }

    }

    private static void swap(final int[] array, final int maxIndex, final int last) {

    }

    private static int maxIndex(final int[] array, final int start, final int last) {
        // find the index of the largest element
        int max = array[start];
        int maxIndex = start;
        for (int i = start; i <= last; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }

        }
        return maxIndex;
    }
}
