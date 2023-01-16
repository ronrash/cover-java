package datastructures.stacks.questions;

import java.util.ArrayDeque;
import java.util.Deque;

public class NextSmallerToLeft {
    public static void main(String[] args) {
        int[] array = new int[]{1,3,2,4};
        // output              [-1,1,1,2]
        //
        int [] aray = new int[]{6,2,5,4,5,1,6};

        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> deque = new ArrayDeque<>();

        // stack is used to keep track of the left side of the array or the right side of the array
        // we are going from letf to right checking smaller to current array and insetring in the stack
        for (final int j : aray) {
            if (stack.isEmpty()) {
                deque.addLast(-1);
            } else if (j > stack.peekFirst()) {
                deque.addLast(stack.peekFirst());
            } else if (stack.peekFirst() > j) {
                // unless we find the greatest elemnt in the left side of a[i] current element we keep popping
                while (!stack.isEmpty() && stack.peekFirst() > j) {
                    stack.removeFirst();
                }
                if (stack.isEmpty()) {
                    deque.addLast(-1);
                } else {
                    deque.addLast(stack.peekFirst());
                }
            }
            stack.addFirst(j);
        }


        System.out.println("list elements ie output ::"+deque);
    }
}
