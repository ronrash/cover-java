package com.corejava.corejava.comparableandcomparator.assignmet;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class assignment {

    //  sort students based on their marks
    // s1,s2,s3,s4 -> 100,99,86,87,98
    public static void main(String[] args) {
        Studentes s1 = new Studentes(1,"rohit",100);
        Studentes s2 = new Studentes(2,"pallavi",99);
        Studentes s3 = new Studentes(3,"sanjay",86);
        Studentes s4 = new Studentes(4,"ajay",98);

        final List<Studentes> studentesList = Arrays.asList(s1, s2, s3, s4);
        // Display students who have got the highest marks

     //   Collections.sort(studentList); throws a compiler error because Student object does not implement comparable interface
     // so we now have to use default comparator

     Collections.sort(studentesList,(studentes1, studentes2)-> studentes1.getMarks()> studentes2.getMarks()?-1: studentes1.getMarks()< studentes2.getMarks()?1:0);
        System.out.println(studentesList);

    }


}

class Studentes {
    private static final String COLLEGE_NAME = "XYZ_ENGINEERING COLLEGE";
    private int id;
    private String name;
    private int marks;


    public Studentes(final int id, final String name, final int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public boolean equals(final Object object) {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;
        Studentes other = (Studentes) object;

        return (this.id == other.id && this.name.equals(other.name));

    }

    public int hashCode() {
        return Objects.hash(id, name);
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Studentes{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}