package datastructures.arrays.Questions;

import java.util.Arrays;

public class InsertElementsInArray {
    public static void main(String[] args) {

        // insert at beigining
        int[] a = {10,2,3,4};
        int target =90;
        int position=1;
        insertAtStart(a,target);
        insertAtAnyPosition(a,88,position);
    }

    private static void insertAtStart(final int[] a, final int target) {
        //start from the end
        // shift alelemt till 1st index
        // and pt the target elemnt in the 0th postion
        for(int i=a.length-1;i>0;i--)
        {
            a[i]=a[i-1];

        }
        a[0]=target;
        System.out.println(Arrays.toString(a));
    }

    private static void insertAtAnyPosition(final int[] a, final int target,final int position) {
        // start from the end
        // shift alelemt till postion index index
        // and pt the target elemnt in the  postion
        for(int i=a.length-1;i>position;i--)
        {
            a[i]=a[i-1];

        }
        a[position]=target;
        System.out.println(Arrays.toString(a));
    }
}
