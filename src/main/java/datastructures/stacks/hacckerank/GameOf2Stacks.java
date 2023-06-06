package datastructures.stacks.hacckerank;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GameOf2Stacks {

    public static void main(String[] args) {
       Integer[] array ={5,5,20,5} ;
       Integer[] arr ={5,15,2,5,2};
        ArrayList<Integer> a = new ArrayList<>(List.of(array));
        ArrayList<Integer> b = new ArrayList<>(List.of(arr));
        actaulSolution(40,a,b);
      //  https://www.youtube.com/watch?v=WMmST9al0DE&t=2s video solution
    }

    public static int actaulSolution(int maxSum, List<Integer> a, List<Integer> b) {

        // loop thru any one of the stack
        int finalResult =0;
        int stack1Counter=0;
        int stack2Counter=0;
        int sumSoFar=0;

        // iterating thru first stack
        for(Integer i : a)
        {
            if(sumSoFar+i>maxSum)
                break;
            sumSoFar=sumSoFar+i;
            stack1Counter++;
        }
        finalResult=stack1Counter;
        // iterate thru second stack

        for(Integer i :b)
        {
            sumSoFar=sumSoFar+i;
            stack2Counter++;

            while (sumSoFar>maxSum && stack1Counter>0)
            {
                sumSoFar = sumSoFar - a.get(stack1Counter-1);
                stack1Counter--;
            }

        finalResult = (sumSoFar <=maxSum)?Math.max(stack1Counter+stack2Counter,finalResult) :finalResult;
        }
        System.out.println(finalResult);
        return finalResult;
    }

    // these are bsacially greddy approaches and not actauls solutiins
    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        // Write your code here
       // a[4,2,4,6,1] [1,6,4]
      // b [2,1,8,5]  --no of steps =4

        int tempSum =0;
        int steps=0;

        while(tempSum<maxSum)
        {
            if(a.get(a.size()-1)<b.get(b.size()-1))
            {
                tempSum+=a.get(a.size()-1);
                a.remove(a.size()-1);
            }
            else {
                tempSum+=b.get(b.size()-1);
                b.remove(b.size()-1);
            }
            if(tempSum<maxSum)
            {
                steps++;
            }

        }
        System.out.println(steps);
        return steps;
    }

    public static int twoStackss(int maxSum, List<Integer> a, List<Integer> b) {
        // Write your code here
        // a[4,1,2,3,4,1] [1,6,4]
        // b [2]  --no of steps =4

        int tempSum =0;
        int steps=0;
        while(tempSum<maxSum)
        {
            if(a.isEmpty() && b.isEmpty())
            {
                return steps;
            }
            else if(b.isEmpty() && !a.isEmpty())
            {
                tempSum+= a.get(0);
                a.remove(0);
            }
            else if (a.isEmpty() && !b.isEmpty())
            {
                tempSum+=b.get(0);
                b.remove(0);
            }
           else  if((a.get(0)<b.get(0)))
            {
                tempSum+=a.get(0);
                a.remove(0);
            }
            else {
                tempSum+=b.get(0);
                b.remove(0);
            }
            if(tempSum<maxSum)
            {
                steps++;
            }
        }
        System.out.println(steps);
        return steps;
    }

    public static int twoStackssReal(int maxSum, List<Integer> a, List<Integer> b) {
        // Write your code here
        // a[4,1,2,3,4,1] [1,6,4]
        // b [2]  --no of steps =4

        int result = 0, counter1 = 0, counter2 = 0, sumsofar = 0;

        // Get elements from first stack
        for (Integer i : a) {
            if (sumsofar + i > maxSum)
                break;
            sumsofar += i;
            counter1++;
        }
        result = counter1;

        // Try to use elements of second stack
        for (Integer i : b) {
            sumsofar += i;
            counter2++;
            while (sumsofar > maxSum && counter1 > 0) {
                sumsofar -= a.get(counter1 - 1);
                counter1--;
            }
            result = (sumsofar <= maxSum) ?
                    Math.max(counter1 + counter2, result) : result;
        }
        System.out.println(result);
        return result;
    }


}
