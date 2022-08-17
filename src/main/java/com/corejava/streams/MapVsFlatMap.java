package com.corejava.streams;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {

        // map is used to convert from one type to another and one to one mapping
        final List<String> names = StudentUtility.getStudentList().stream()
                .map(student -> student.getName())
                .distinct()
                .collect(Collectors.toList());
        //flatmap is used for transformation + flattening the stream -- one to many mapping
        // processes a stream of stream of values
        // this is a mapper function which produces multiple values for each input
        final List<String> hobbies = StudentUtility.getStudentList().stream()
                .flatMap(student -> student.getHobbies().stream())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(hobbies);
    }
}
