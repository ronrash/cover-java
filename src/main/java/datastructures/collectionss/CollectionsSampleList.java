package datastructures.collectionss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsSample {
    /*
    *   Collection is an interface ,, Collections is an implemetation class
    *  COllections have utility methods -- like sort
    *
    *   Collection(I) --> LIst(I)--> ArrayList and linkedLIst -- in java is double linkedlIst
    *                 --> Set(I) --> sortedSet(I) -->NavigableSet(I)--TreeSet
    *
    *    LIst<I> -- duplicates are allowed and insertion order is maintained
    *    Collection -- represents a group of individual objects (List ArrayList Vector Stack )
    *    Set -->Insertion order not there duplicate not allowd SortedSet->NavigableSet-> TreeSet HashSet
    *   Map does not come under Collection interface --> group of objects represented as key vaue
    *    HashMap --- Is an implementation
    *    Keys should
    *
    *                                                             Collection(I)
    *             LIst(I)                              Set
    *        ArrayList LinkedLIst Vector Stack     HashSet    SortedSet
    *                                            LinkedHashSet NAvigableSet
    * */

    public static void main(String[] args) {

        // group of individual objects --list internall is a dynamic array
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        list.add(20); // added to the end of the list
        list.add(2,34); // this will add 34 at index 2 and shift all the elements to the right
        list.set(0,100); // set replaces elemnt at a particalur index

        list.get(4); // get element at a particular index
        list.indexOf(3); // return the index of the object ie its first occurence
        list.lastIndexOf(5); // returns the last index of the object

    }
}
