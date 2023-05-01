package datastructures.collectionss.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ListSample {
    public static void main(String[] args) {
         /*
          Collections implement Serializable,implements cloneable
          List also implements RandomAccess -- O(1) -- give me 10 th item or 1lakn itme
        * Underling dats stricture is dynamic array
        * duplicates are allowed null is allowed
        * isnertion order is allowed

         for insertion and deletion ArrayList is worse ,,
         linkedlist is better becoz it has address of next nodes
         list is not synchronized hence performance is best
         
        *
        * */

        // synchronized list
String[] array ={"apples","oranges"};
        List<String> fruits = List.of(array);
        System.out.println(fruits);


    }
}
