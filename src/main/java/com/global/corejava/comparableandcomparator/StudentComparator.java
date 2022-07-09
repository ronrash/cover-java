package com.global.corejava.comparableandcomparator;

import java.util.Comparator;

import com.global.corejava.comparableandcomparator.Student;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(final Student student1, final Student student2) {

        return -student1.getName().compareTo(student2.getName());
    }
}
