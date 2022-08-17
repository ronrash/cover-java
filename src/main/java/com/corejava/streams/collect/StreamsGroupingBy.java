package com.corejava.streams.collect;

import static java.util.stream.Collectors.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.corejava.corejava.equalsandhascodes.Student;
import com.corejava.streams.StudentUtility;

public class StreamsGroupingBy {
    public static void main(String[] args) {


        // groupingBy Is equal to sql opertaion of group by
    // outut is a map
    // group the elements using their property and then store the results using in a Map instance
        // group students based on theier marks

     // group student by their department and average soceers

        StudentUtility.getStudentList()
                .stream()
                .collect(groupingBy(Student::getDepartment, averagingDouble(Student::getMarks)))
        .entrySet()
        .forEach(e-> System.out.println(e.getKey()+" "+e.getValue()));




        final Map<Integer, Set<Student>> collect = StudentUtility.getStudentList()
                .stream()
                .collect(groupingBy(Student::getMarks,toSet()));

        // group students based on special key

        final Map<String, List<Student>> map = StudentUtility.getStudentList()
                .stream()
                .collect(groupingBy(student -> student.getName().startsWith("r") ? "R" : "NO-R"));

        map.entrySet().stream()
                .filter(e->!e.getKey().startsWith("R"))
                .forEach(e ->{
                    final List<Student> list = e.getValue();
                    list.stream().forEach(student -> System.out.println(student.getName()));
                });


        // mapping students with their name and marks

        final Map<String, Double> mapps = StudentUtility.getStudentList()
                .stream()
                .collect(groupingBy(Student::getName, averagingInt(Student::getMarks)));

        mapps.entrySet().stream()
                .forEach(e-> System.out.println(e.getKey()+" "+e.getValue()));

        final Map<String, Integer> collect1 = StudentUtility.getStudentList()
                .stream()
                .collect(toMap(Student::getName, Student::getMarks));

        collect1.entrySet()
                .stream()
                .forEach(e->{
                    System.out.println(e.getKey()+" "+e.getValue());
                });

        // to Map
        Arrays.asList("aa","bbbb","ccccc","dccc").stream()
        .collect(toMap(String::toString,String::length))
        .entrySet()
        .forEach(s-> System.out.println(s.getKey()+" "+s.getValue()));

    }
}
