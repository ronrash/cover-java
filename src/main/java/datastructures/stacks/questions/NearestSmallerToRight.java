package datastructures.stacks.questions;

import java.util.ArrayDeque;
import java.util.Deque;

public class NearestSmallerToRight {
    public static void main(String[] args) {
        int[] array = new int[]{1,3,2,4};
        // output              [-1,2,-1,-1]

        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> deque = new ArrayDeque<>();

        // stack is used to keep track of the left side of the array or the right side of the array
        // we are going from letf to right checking smaller to current array and insetring in the stack
        for(int i=array.length-1;i>=0;i--)
        {
            if(stack.isEmpty())
            {
                deque.addFirst(-1);
            } else if (array[i]>stack.peekFirst()) {
                deque.addFirst(stack.peekFirst());
            }
            else if(array[i]<stack.peekFirst())
            {
                // unless we find the greatest elemnt in the left side of a[i] current element we keep popping
                while (stack.size()>0 && array[i]< stack.peekFirst()){
                    stack.removeFirst();
                }
                if(stack.isEmpty())
                {
                    deque.addFirst(-1);
                }else {
                    deque.addFirst(stack.peekFirst());
                }
            }
            stack.addFirst(array[i]);
        }


        System.out.println("list elements ie output ::"+deque);
    }
}
