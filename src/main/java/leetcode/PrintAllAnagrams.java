package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintAllAnagrams {
    public static void main(String[] args) {


        String a[] ={"cat", "dog", "tac", "god", "act"};
        /// all annagram should come together


        findAnagrams(a);
    }

    private static void findAnagrams(final String[] a) {

        // hashMap
        Map<String, List<String>> map = new HashMap<>();

        // loop thru the lsit ===> 0(n)
        // cover them to a char and sort them
        // put it in hash map 0(1)

        for(int i=0;i<a.length;i++)
        {
            String word =a[i];
            // sort this
            final char[] chars = word.toCharArray();
            Arrays.sort(chars);
           String newWord = new String(chars);

           if(!map.containsKey(newWord))
           {
               List list = new ArrayList();
               list.add(word);
               map.put(newWord,list);
           }
           else {
               map.get(newWord).add(word);
           }

        }
        System.out.println(map);
       map.forEach((k,v)-> System.out.println(map.get(k)));
    }
}
