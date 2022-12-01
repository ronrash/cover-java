package leetcode.hashmapQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /*
    * Given an array
    * [2,7,11,15], target =9
    *  a[0]+a[1] = target -- o/p -- [0,1]
    *
    *    map-- K,V
    * */
    public static void main(String[] args) {
        int[] array ={3,2,3};   //
        int target=6;
        final int[] ints = twoSum(array, target);
        System.out.println(Arrays.toString(ints));

    }

    private static int[] twoSum(final int[] array,int target) {
        Map<Integer,Integer> map = new HashMap<>();  // map is empty    2,0     ,

        for(int i=0;i< array.length;i++)
        {
            int diff = target - array[i];
            if(map.containsKey(diff))
                return new int[]{map.get(diff),i};

            map.put(array[i],i);
        }
        return new int[]{-1,-1};
    }
}
