package com.global.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.global.corejava.equalsandhascodes.Student;

public class IntermediateOperations {

    public static void main(String[] args) {

        // map and flatmap
        // they return a stream as output
        // map is used for transformatin
        // flatmap is used for transformation and flattening

        // map function  produces a single value for each input value
        // one to one mapping

        // flat map -- converting stream of stream into a single stream

        final List<Student> studentList = StudentUtility.getStudentList();

        // I want all the hobiies and students have a ist of hobbies

        final List<String> collect = studentList.stream()
                .filter(student -> student.getMarks()>95)
                .flatMap(student -> student.getHobbies().stream())
            //    .distinct()
                .sorted()
                .collect(Collectors.toList());


        System.out.println(collect);



    }
}
