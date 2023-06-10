package collections.maps;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMapSample {
    /*
    * underlying data structure is red-black trees
    * keys cannot be duplicate
    * values can be duplicate
    * if default natural sorting order -- then keys should be homogenous and comparable or we will get runtime exception
    * if we are deifinig our own sorting by our own comparator   then keys need not be homogenous or comparablse we can take
    *  heterogenous objects
    * no restirctions on values -- we can take heterogenous
    * null -if map is empty first entry can be null ,, but if map is not empty we cannot insert null becoz it will compare with null and give error in case
    *  of sorted maps
    * // constructors
    *
    * */
    public static void main(String[] args) {
        Map map  = new HashMap<>();
        map.put(2,2);
        map.put(1,1);

        TreeMap<Integer, Integer> integerTreeMap = new TreeMap<>();
        integerTreeMap.put(10,10);
        integerTreeMap.put(5,5);
        TreeMap<Integer, Integer> treeMap3 = new TreeMap<>(map) ; // initilaize with another map now this will sort this map according to the keys
        TreeMap<Integer, Integer> treeMap4 = new TreeMap<>(integerTreeMap) ; // inttialized with sorted map

        System.out.println(treeMap3); // normal map
        System.out.println(treeMap4);

        // our own sorting based on keys

        Comparator<Integer> c = (obj1,obj2)-> obj1>obj2?1:-1;


        // we need to sort  a map based on its values
        Map<String, String> newMap  = new HashMap<>();
        newMap.put("rohit","himachal");
        newMap.put("swati","assam");
        newMap.put("rahul","trichy");
        newMap.put("akash","bangalore");

        // this will give us in unsorted way the keys that is the names will not be sorted
        // if i want to sort this based on keys/names i can use treemap -- keys are string string are homogenoue and comaprable it will wokr
        System.out.println(newMap);
        TreeMap<String , String > newTreeMap = new TreeMap<>(newMap);
        System.out.println(newTreeMap);
        System.out.println(newTreeMap.descendingMap()); // descending means reverse order of keys
        // if i want to sort by value in the map I wil use Comparator and ;;

        // we can do this or on line 57
        Comparator<String> stringComparator = Comparator.comparing(key -> newMap.get(key));
       // Comparator<String> stringComparator1 = (obj1,obj2)-> newMap.get(obj1).compareTo(newMap.get(obj2));
        TreeMap<String , String > newTreeMapByValue = new TreeMap<>(stringComparator);
        newTreeMapByValue.putAll(newMap);
        System.out.println("sorted based on map values"+newTreeMapByValue);

        TreeMap<String , Integer> treeMap1 = new TreeMap<>() ; // default sorting
        treeMap1.put("rohit",100);
        treeMap1.put("swati",200);
        treeMap1.put("ajay",300);
        TreeMap<Integer, Integer> treeMap2 = new TreeMap<>(c) ; // our own sorting

        treeMap2.put(2,2);
        treeMap2.put(1,1);
        treeMap2.put(0,0);
        System.out.println(treeMap2);// default soring order base on keys


    }
}
