package com.global.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.global.corejava.equalsandhascodes.Student;

public class StreamsSorting {

    public static void main(String[] args) {
        System.out.println(Arrays.asList(1,2,3,4)
        .stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
List<Student> studentList= StudentUtility.getStudentList();
        Collections.sort(studentList,new myComparator());
        System.out.println(studentList);

        // usng streanss
        final Map<String, List<Student>> collect = studentList.stream()
                .sorted(Comparator.comparing(s -> {
                    return s.getAge();
                }))
                .collect(Collectors.groupingBy(Student::getName,Collectors.toList()));

        System.out.println(collect);
    }
}
