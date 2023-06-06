package datastructures.stacks.hacckerank;

import java.util.Stack;

public class ValidParanthesis {

    public static void main(String[] args) {
        String s ="(]]";
        System.out.println(isValid(s));;

        // // insert the opening in the  stack and remove the closing from the sack
    }

    public static boolean isValid(String s) {


        Stack<Character > stack = new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);

            if(c=='(' || c=='[' || c=='{')
                stack.push(c);
            else {
                if(c==')')
                {

                    if(stack.pop()!='(' || stack.isEmpty())
                        return false;
                }
                else if(c=='}')
                {
                    if(stack.pop()!='{' || stack.isEmpty())
                        return false;
                }
                else if(c==']')
                {
                    if(stack.pop()!='[' || stack.isEmpty())
                        return false;
                }
            }
        }

        if(!stack.isEmpty())
        {
            return false;
        }


        return true;
    }
}
