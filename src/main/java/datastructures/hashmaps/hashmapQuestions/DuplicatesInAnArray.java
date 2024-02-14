package datastructures.hashmaps.hashmapQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DuplicatesInAnArray {

    public static void main(String[] args) {

        int a[] = new int[]{1,2,3,4,3,2};

        // pudo
        // loop thru and keep adding the count of the array in a map
        // when we find that an elemnt exist in the map we return or do whatever is asked

        // if we have to emit the value then use a Set

        //

        findCountOfEachWord(a);
        findDuplicates(a);

        // removing duplicates in an array
        // using set
        // using hashmap if the entry i already there skip 
    }

    private static void findCountOfEachWord(final int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
                map.put(a[i], map.get(a[i])!=null? map.get(a[i])+1 :1 );
        }
        System.out.println(map);
    }

    public static Set<Integer> findDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }
        System.out.println(duplicates);
        return duplicates;
    }
}
