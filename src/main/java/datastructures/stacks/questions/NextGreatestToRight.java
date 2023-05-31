package datastructures.stacks.questions;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;

public class NextGreatestToRight {

    public static void main(String[] args) {

        int[] array = new int[]{1, 5,2,3,4};//[5,-1,3,4,-1]

        // 1-->3
        // 3-->4
        // 2-->4
        // 4-->-1


        // keep pushing into the stack
        // stack emty hai then -1 , top of a[i]> stack.top then push into array 


        findTheNextGreatestForEveryElement(array);

        nextGreatestToRight(array);

    }

    private static void findTheNextGreatestForEveryElement(final int[] array) {

        int[] result = new int[array.length];

        // keep pushing the results in the result array
        Deque<Integer> stack = new ArrayDeque<>();
        int k = array.length - 1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                result[k--] = -1;
            } else if (array[i] < stack.peek()) {
                result[k--] = stack.peek();
            } else if (array[i] > stack.peek()) {
                while (stack.size() > 0 && array[i] > stack.peek()) {
                    stack.pop();
                }
                if (stack.size() == 0) {
                    result[k--] = -1;
                } else {
                    result[k--] = stack.peek();
                }

            }
            stack.push(array[i]);
        }
        System.out.println("new technique "+Arrays.toString(result));

    }


    private static int[] nextGreatestToRight(final int[] a) {
        Stack<Integer> stack = new Stack<>();
        int[] output = new int[a.length];
        int k = a.length - 1;
        for (int i = a.length - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                output[k--] = -1;
                stack.push(a[i]);
            } else {
                while (!stack.isEmpty()) {
                    if (a[i] > stack.peek()) {
                        stack.pop();
                    } else if (a[i] < stack.peek()) {
                        output[k--] = stack.peek();
                        stack.push(a[i]);
                        break;
                    }
                    if (stack.isEmpty()) {
                        stack.push(a[i]);
                        output[k--] = -1;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(output));
        return output;
    }
}
