package datastructures.stacks.questions;

import java.util.Arrays;
import java.util.Stack;

public class DailTemperatures {

    public static void main(String[] args) {

         int[] a = {89,62,70,58,47,47,46,76,100,70};//[0,8,1,5,4,2,1,1,0,0] --> [8,1,5,4,3,2,1,1,0,0]
        dailyTemperatures(a);
    }

    public static int[] dailyTemperatures(int[] a) {


        Stack<Pair1> stack = new Stack<>();
        int[] output = new int[a.length];
        int k =a.length-1;
        for(int i=a.length-1;i>=0;i--)
        {
            if(stack.isEmpty())
            {
                output[k--]=0;
            }
            else if(a[i]<stack.peek().key){
                int diff = stack.peek().value- i;
                output[k--]=diff;
            }
            else if(a[i]>=stack.peek().key)
            {
                while(!stack.isEmpty() && a[i]>=stack.peek().key)
                {
                    stack.pop();
                }
                if(stack.isEmpty())
                    output[k--]=0;
                else{
                    int diff = stack.peek().value- i;
                    output[k--]=diff;
                }
            }
            stack.push(new Pair1(a[i],i));
        }
        System.out.println(Arrays.toString(output));
return output;
    }
}
class Pair1
{
   public int key;
   public int value;
    public Pair1(int key,int value)
    {
        this.key =key;
        this.value=value;
    }


}

