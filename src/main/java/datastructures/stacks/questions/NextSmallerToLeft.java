package datastructures.stacks.questions;


import java.util.Arrays;
import java.util.Stack;

public class NextSmallerToLeft {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 2, 4};// [-1,1,1,2]

        nextSmallerToLeft(a);


    }

    private static void nextSmallerToLeft(final int[] a) {
        Stack<Integer> stack = new Stack<>();
        int output[] = new int[a.length];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (stack.isEmpty()) {
                output[k++] = -1;
            } else if (a[i] > stack.peek()) {
                output[k++] = stack.peek();
            } else if (a[i] < stack.peek()) {
                while (!stack.isEmpty() && a[i] < stack.peek()) {
                    stack.pop();
                }
                if (stack.isEmpty())
                    output[k++] = -1;
                else {
                    output[k++] = stack.peek();
                }
            }
            stack.push(a[i]);
        }
        System.out.println(Arrays.toString(output));
    }
}
