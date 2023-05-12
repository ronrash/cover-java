package datastructures.arrays.arrayQuestionsleetcode;

import java.util.Arrays;
import java.util.List;

public class ShortestWordDistance {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("practice", "makes", "perfect", "coding", "makes");
        String s1= "coding"; //[a,,,,,,b,,,,,,a,] [a,,,,,,b]
        String s2 ="practice"; // [a,,,,,,b]

        // shortest distance is 1 and not 2
        shortestWordDistance(stringList,s1,s2);
    }

    private static void shortestWordDistance(List<String > list,final String s1, final String s2) {

    //
        int index1 =-1;
        int index2 =-1;
        int min = Integer.MAX_VALUE;
        for(int i=0;i< list.size();i++)
        {

             if(list.get(i).equals(s1))
                 index1=i;

            if(list.get(i).equals(s2))
                index2=i;

            if(index1!=-1 && index2!=-1)
             min = Math.min(min,Math.abs(index1- index2));
        }
        System.out.println(min);
    }
}
