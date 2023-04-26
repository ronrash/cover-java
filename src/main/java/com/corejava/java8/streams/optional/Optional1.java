package com.corejava.java8.streams.optional;

import java.util.Arrays;
import java.util.Optional;

import com.corejava.corejava.equalsandhascodes.Student;
import com.corejava.java8.streams.StudentUtility;

public class Optional1 {
    public static void main(String[] args) {

        // of -- when we are sure our object is not null

        // ofNullable -- when we don't know it returns Optional.empty if object is null

        // orElse orElseGet orElseThrows

        // isPresent-- checks if value is present
        // ifPresent(s->sout(s)) -- checks if the value is present or not  and give additional operation to perform on that

        Student student = new Student(null,28,90, Arrays.asList(""),"CSE");

        // if we get a null value we can replace it by default value
        // we can alos use orElseThrows -- throw an exception or use a supplier interfcace

      //  final String default_name = Optional.ofNullable(student.getName()).orElse("default name");

     //   final String default_name = Optional.ofNullable(student.getName()).orElseGet(()->"default name");

      //  final String default_name = Optional.ofNullable(student.getName()).orElseThrow(()->new IllegalArgumentException("email not present"));

//        System.out.println(default_name);

        // find a student with the given department
        String department="abc";
        final Optional<Student> studentWithMatchingDepartment = getStudentWithMatchingDepartment(department);
        if(studentWithMatchingDepartment.isPresent())
            studentWithMatchingDepartment.get();

//        Optional.ofNullable(getStudentWithMatchingDepartment(department)).isPresent(student1 -> System.out.println(student1.get())).;

        Optional.ofNullable(getStudentWithMatchingDepartment(department)).ifPresent(student1 -> System.out.println(student1));
        if(studentWithMatchingDepartment.isPresent())
        {

        }
    }

    private static Optional<Student>  getStudentWithMatchingDepartment(String department){

//      return   StudentUtility.getStudentList()
//                .stream()
//                .filter(student -> student.getDepartment().equalsIgnoreCase(department))
//                .findAny()
//                .orElse(new Student());

//        return   StudentUtility.getStudentList()
//                .stream()
//                .filter(student -> student.getDepartment().equalsIgnoreCase(department))
//                .findAny()
//                .orElseThrow(()->new RuntimeException("no student with matching department"));



            return   StudentUtility.getStudentList()
                    .stream()
                    .filter(student -> student.getDepartment().equalsIgnoreCase(department))
                    .findAny();
    }
}
