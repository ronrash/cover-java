package com.corejava.corejava.comparableandcomparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class FixedSortingEnums {
    static List<String> weekdays = Arrays.asList("Sunday", "Monday", "Saturday", "Thursday", "Wednesday", "Tuesday", "Friday");
    public static void main(String[] args) {


        // this will sort based on natural sorting order  since String implements the comparable interface
        // we need to sort in actual week format i.e Sunday,monday,tues,wed,thur,fri,sat
        Collections.sort(weekdays);
        System.out.println(weekdays); // [Friday, Monday, Saturday, Sunday, Thursday, Tuesday, Wednesday]

        // we use hashmap and index the value
        HashMap<String, Integer> week = new HashMap<>();
        week.put("Sunday", 0);
        week.put("Monday", 1);
        week.put("Tuesday", 2);
        week.put("Wednesday", 3);
        week.put("Thursday", 4);
        week.put("Friday", 5);
        week.put("Saturday", 6);

   String s = "hello";


        // Use comparator for default sorting
//        Comparator<String> weekComparator = new Comparator<String>() {
//            @Override
//            public int compare(final String s1, final String s2) {
//                Integer day1 = week.get(s1);
//                Integer day2 = week.get(s2);
//                return day1.compareTo(day2);
//            }
//        };
//
//        Collections.sort(weekdays, weekComparator);
//        System.out.println(weekdays);

             //using lamda function
       //Collections.sort(weekdays,(s1,s2)->week.get(s1).compareTo(week.get(s2)));
       // or using Comparator function
        Collections.sort(weekdays, Comparator.comparing(week::get));// [Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday]
        System.out.println(weekdays);


        TreeMap<String, Integer> weekmap = new TreeMap<>();
        weekmap.put("Sunday", 0);
        weekmap.put("Monday", 1);
        weekmap.put("Tuesday", 2);
        weekmap.put("Wednesday", 3);
        weekmap.put("Thursday", 4);
        weekmap.put("Friday", 5);
        weekmap.put("Saturday", 6);

        System.out.println(weekmap);



    }
}
