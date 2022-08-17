package com.corejava.streams.collect;

import static java.util.stream.Collectors.*;

import java.util.List;

import com.corejava.corejava.equalsandhascodes.Student;
import com.corejava.streams.StudentUtility;

public class StreamCollector {
    public static void main(String[] args) {

        // counting
        // count the number of students playing chess
        final long cricket = StudentUtility.getStudentList()
                .stream()
                .map(Student::getHobbies) // Stream<List<Strin>>
                .flatMap(list -> list.stream())
                .filter(s -> s.equalsIgnoreCase("chess"))
                .count();

        System.out.println(cricket);


        // mapping function similar to map

        final List<String> namesList =
                StudentUtility.getStudentList()
                .stream()
                .collect(mapping(Student::getName, toList()));


        final String collect = namesList.stream()
                .collect(joining("--"));

        System.out.println(collect);

     //

    }
}
