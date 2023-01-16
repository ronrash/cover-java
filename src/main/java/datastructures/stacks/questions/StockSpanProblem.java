package datastructures.stacks.questions;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class StockSpanProblem {


    // stock span problem = next greater element to right p
                   //        0  1   2 3  4  5
    //int a[]= new int[]    {100,80,60,70,75,85}; //
  //  next greatest index    0, 0, 1, 1,  1,0   {currentIndex -resultIndex }
     // output       -->   1, 1   1  2   3 5   -- reuslts no of stocks less= the current daya stcok
    // ata any given place stock find all the stock prices which are less than or equal to that amaount +1


    // we need to see the left side of the array

    // brute force

    public static void main(String[] args) {
        int a[]= new int[]    {100,80,60,70,75,85};
        bruteForce(a); // complextity is O(n2) -- reduce it to On

        // we will solve using nextGreatestElemntToLeft an

        nearestGreatestElement(a);
        // in the stack we store the pair <value and index of the array element>
    }

    private static void nearestGreatestElement(final int[] a) {
        Deque<Pair> stack = new ArrayDeque<>();
        // result array will have the indexes [] pair has ngl and index
        int[] resultArray = new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            if(stack.isEmpty())
            {
                // push the elemnt and its index
                resultArray[i]=-1;
            } else if (stack.peek().key>a[i]) {
                resultArray[i]=stack.peek().value;
            } else if (stack.peek().key<a[i]) {
                while (!stack.isEmpty() && stack.peek().key<a[i])
                {
                    stack.pop();
                }
                if(stack.isEmpty())
                {
                    resultArray[i]=-1;
                }
                else {
                    resultArray[i]=stack.peek().value;
                }

            }

            stack.push(new Pair(a[i],i));
        }
        // for final asnwer will will subtract the index with result array index
        System.out.print("[");
        for(int i=0;i<a.length;i++)
        {
            int value =i-resultArray[i];
            System.out.print(value+", ");
        }
        System.out.print("]");
    }

    private static void bruteForce(final int[] a) {
        //
        int[] resultArray = new int[a.length];
        resultArray[0]=1;
        for(int i=1;i<a.length;i++)
        {
            int count=1;
            for(int j=i-1;j>=0;j--)
            {
                if(a[j]<a[i])
                {
                    count++;
                }
                resultArray[i]=count;
            }
        }
        System.out.println(Arrays.toString(resultArray));
    }
}


class Pair{
    int key;
    int value;

    public Pair(int key,int value){
        this.key = key;
        this.value = value;
    }
}
