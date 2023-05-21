package datastructures.arrays.twopointerQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
    // to find all unique triplets in an array that sum up to a given target value.
    public static void main(String[] args) {
        int[] a = {-1,0,1,2,-1,-4}; // [-1,0,1]=0  [-1,-1,2] =0
        List<List<Integer>> result = threeSum(a);

        bruteForce(a);
    }

    private static void bruteForce(final int[] a) {
//we sort the input array to simplify the problem and make use of the two-pointer approach
        Arrays.sort(a);//[-4,-1,-1,0,1,2]
        int target =0;
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<a.length-2;i++)
        {
            int j=i+1;
            int k=a.length-1;
            while(k>=0)
            {
                if(k==j || k==i)
                {
                  k--;
                  continue;
                }


                int sum = a[i]+a[j]+a[k];
                if(sum==target)
                {
                    List<Integer> list = new ArrayList<>();
                    list.add(a[i]);
                    list.add(a[j]);
                    list.add(a[k]);
                    Collections.sort(list);
                    if(!result.contains(list))
                    {
                        result.add(list);

                    }
                }
                k--;
            }

        }
        System.out.println(result);
    }

    private static List<List<Integer>> threeSum(final int[] a) {

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        return null;
    }

}
