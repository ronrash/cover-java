package leetcode;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int []a ={12,34,22,10,18};
//        secondLargest(a);
        System.out.println(secondLargest(a));
    }

    private static int secondLargest(final int[] a) {


        // o(n)
        if(a.length<2)
            return 0;

//        Arrays.sort(a);
//        return a[a.length-2];

        // findMax
//        int largest=Integer.MIN_VALUE;
//        for(int i=0;i<a.length;i++)
//        {
//            largest=Math.max(a[i],largest);
//        }
//        int secondLargest=Integer.MIN_VALUE;
//        for(int i=0;i<a.length;i++)
//        {
//            if(a[i]!=largest)
//            secondLargest=Math.max(a[i],secondLargest);
//        }
//        return secondLargest!=Integer.MIN_VALUE?secondLargest:0;
        int i=0,second;
        int first = second = Integer.MIN_VALUE;
        for ( i = 0; i < a.length; i++) {
            /* If current element is greater than
            first then update both first and second */
            if (a[i] > first) {
                second = first;
                first = a[i];
            }

            /* If arr[i] is in between first and
               second then update second  */
            else if (a[i] > second && a[i] != first)
                second = a[i];
        }
        return second;
    }
}
