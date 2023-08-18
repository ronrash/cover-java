package com.corejava.corejava.comparableandcomparator;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class SortingBasedOnMapValues {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("ron", 21);
        map.put("sheena", 18);
        map.put("ajay", 23);
        map.put("vijay", 25);
        map.put("bob", 12);

        // default sorting based on keys ie names
        //  String class implements the Comparable Interface hence it is best option fo maps to use it as keys
        // also they are immutable
        TreeMap<String, Integer> keySortMap = new TreeMap<>(map);
        System.out.println(keySortMap);// {ajay=23, bob=12, ron=21, sheena=18, vijay=25}


        //the treemap takes in a comparator hence we can use our own default sorting ie we can use Comparator interface  compare method to sort values based on our need
        // sorting age in decreasing manner

        //  Java 8
        TreeMap<String, Integer> valueSortMap = new TreeMap<>((v1, v2) -> map.get(v2).compareTo(map.get(v1)));

        valueSortMap.putAll(map);
        System.out.println(valueSortMap);// {vijay=25, ajay=23, ron=21, sheena=18, bob=12}

        // sorting age in increasing manner
        // TreeMap<String, Integer> valueSortMap2 = new TreeMap<>((v1, v2) -> map.get(v1).compareTo(map.get(v2)));
        TreeMap<String, Integer> valueSortMap2 = new TreeMap<>(Comparator.comparing(map::get));
        valueSortMap2.putAll(map);
        System.out.println(valueSortMap2);// {bob=12, sheena=18, ron=21, ajay=23, vijay=25}

        // Before Java 8
        class AgeComparator implements Comparator {

            @Override
            public int compare(final Object o1, final Object o2) {
                return map.get(o2).compareTo(map.get(o1));
            }
        }
        TreeMap<String, Integer> integerTreeMap = new TreeMap<>(new AgeComparator());
        integerTreeMap.putAll(map);
        System.out.println(integerTreeMap);
    }
}