package datastructures.slidingWindow.fixed;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class MaximInSubArray {
    public static void main(String[] args) {

        // find the max element is a subarray of 3
        // this is a difficult problem
        int[] a = new int[]{10, -30, -1, -35, 5, 3, 6, 7};

        // for better understanding
        //   https://youtu.be/xFJXtB5vSmM?list=PL_z_8CaSLPWeM8BDJmIYDaoQ5zuwyxnfj

        // maximum nos in window of size 3 are [10,-1,5,5,6,7]
        int windowSize = 3;
        findMaximumInWindowSet(a, windowSize);
    }

    private static void findMaximumInWindowSet(final int[] a, final int windowSize) {

        // algo
        int i = 0;
        int j = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        // calculation
        while (j < a.length) {
            // calculation to get the value

            while (!deque.isEmpty() && deque.getLast() < a[j]) {
                deque.removeLast();
            }
            deque.addLast(a[j]);

            // the window condition is met
            if (j - i + 1 == windowSize) {
                list.add(deque.peekFirst());

                // for sliding the window removing calculations on previous part
                if (a[i] == deque.peekFirst()) {
                    deque.removeFirst();
                }
                i++;
            }
            j++;
        }
        //
        System.out.println(list);
    }
}
