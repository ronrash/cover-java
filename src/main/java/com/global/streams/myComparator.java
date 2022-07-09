package com.global.streams;

import java.util.Comparator;

import com.global.corejava.equalsandhascodes.Student;

public class myComparator  implements Comparator<Student> {
    @Override
    public int compare(final Student s1, final Student s2) {
        if(s1.getMarks()< s2.getMarks())
            return -1;
        else if(s1.getMarks()>s2.getMarks())
            return 1;

        else return 0;
    }
}
