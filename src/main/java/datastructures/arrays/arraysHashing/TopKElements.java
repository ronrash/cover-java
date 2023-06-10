package datastructures.arrays.arraysHashing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TopKElements {
    public static void main(String[] args) {
       int[] nums = {1,2,2,3,3};
       int k = 2;
        topKFrequent(nums,k);
    }

    public static int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();

        int[] output = new int[k];
        for(int i :nums)
        {
            map.put(i,map.get(i)!=null?map.get(i)+1:1);
        }

        // create a custom Comparator
        Comparator<Integer> valueComparator = (obj1, obj2) -> map.get(obj1)> map.get(obj2)?-1:1;

        Map<Integer, Integer> sortedMap = new TreeMap<>(valueComparator);
        sortedMap.putAll(map);

        System.out.println(sortedMap);

        for(Map.Entry<Integer,Integer> entry: sortedMap.entrySet())
        {
            if(k>0){
                k=k-1;
                output[k]=entry.getKey();
            }

        }
        System.out.println(Arrays.toString(output));
        return output;
    }
}

