package datastructures.stacks.questions;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextGreatestToRight {

    public static void main(String[] args) {

        int [] array = new int[]{1,3,2,4};

        // 1-->3
        // 3-->4
        // 2-->4
        // 4-->-1



        // keep pushing into the stack
        // stack emty hai then -1 , top of a[i]> stack.top then push into array 
        
        
        findTheNextGreatestForEveryElement(array);

        System.out.println("ProductCatalog"+Arrays.toString(array));

    }

    private static void findTheNextGreatestForEveryElement(final int[] array) {
        
        int[] result = new int[array.length];
        
       // keep pushing the results in the result array
       Deque<Integer> stack = new ArrayDeque<>();
        int k=0;
        for(int i= array.length-1;i>=0;i--)
        {
            if(stack.isEmpty())
            {
                result[k++]=-1;
            } else if (stack.peek()>array[i]) {
                result[k++]= stack.peek();
            } else if (array[i]> stack.peek()) {
                while(stack.size()>0 && stack.peek()<=array[i])
                {
                        stack.pop();
                }
                if(stack.size()==0)
                {
                    result[k++]=-1;
                }
                else {
                    result[k++]=stack.peek();
                }

            }
            stack.push(array[i]);
        }
        System.out.println(Arrays.toString(result));
        
    }
}
