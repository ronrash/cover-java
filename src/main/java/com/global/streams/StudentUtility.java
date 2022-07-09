package com.global.streams;

import java.util.Arrays;
import java.util.List;

import com.global.corejava.equalsandhascodes.Student;

public interface StudentUtility {

    static List<Student> getStudentList() {
        Student s1 = new Student("rahul", 30, 90, Arrays.asList("cricket", "football", "gaming"),"CS");
        Student s2 = new Student("shamir", 31, 89, Arrays.asList("cricket", "chess", "ladkibaazi"),"CS");
        Student s3 = new Student("bob", 29, 79, Arrays.asList("cricket", "hockey", "shaadi"),"EE");
        Student s4 = new Student("jones", 21, 99, Arrays.asList("badminton", "football", "chutiyabaazi"),"EE");
        Student s5 = new Student("peter", 38, 80, Arrays.asList("basketball", "football", "gaandu"),"ME");
        List<Student> studentList = Arrays.asList(s1, s2, s3, s4, s5);
        return studentList;
    }
}
