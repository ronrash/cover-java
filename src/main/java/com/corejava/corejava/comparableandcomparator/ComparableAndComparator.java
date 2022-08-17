package com.corejava.corejava.comparableandcomparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import com.corejava.corejava.Util;

public class ComparableAndComparator {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(2, 4, 5, 1);
//        List<String> stringList = Arrays.asList("b", "d", "a", "c");
//        Collections.sort(list);
//        Collections.sort(stringList);
//        Util.sortList(list);
//        Util.sortList(stringList);

        final List<Student> studentList = Arrays.asList(new Student(2, "ron"),
                new Student(1, "bae"), new Student(3, "apple"));

        // default natural sorting order
        Collections.sort(studentList);
        Util.sortList(studentList);

        // customized sorting
        System.out.println("--- reverse sort based on name---");
//        Collections.sort(studentList,new StudentComparator());
//        Util.sortList(studentList);

        Collections.sort(studentList, (s1, s2) -> s1.getName().compareTo(s2.getName()));
        Util.sortList(studentList);

        // comparing or sorting person that does not implemet comparable interface

        final List<Person> personList = Arrays.asList(new Person(2, "ron"),
                new Person(1, "bae"), new Person(3, "apple"));

        Collections.sort(personList);
        Util.sortList(personList);

        final List<Emp> emp = Arrays.asList(new Emp(2, "ron"),
                new Emp(1, "bae"), new Emp(3, "apple"));

        // custom sorting
        System.out.println("");
        System.out.println("Custom sorting order using comparator does not require class to implemnet Comparable interface");
        Collections.sort(emp, (e1, e2) -> e1.getId() < e2.getId() ? 1 : e1.getId() > e2.getId() ? -1 : 0);
        Util.sortList(emp);
    }

}


class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(final int id, final String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object)
            return true;// they are both pointing tto the samre refernce
        if (object == null || object.getClass() != this.getClass())
            return false;

        Student student = (Student) object;
        return id == student.id && Objects.equals(name, student.name);
    }


//    @Override
//    public boolean equals(final Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        final Student student = (Student) o;
//        return id == student.id && Objects.equals(name, student.name);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(final Student student) {
//        int eid = this.id;
//        if(this.id < student.id)
//            return -1;
//        else if(this.id> student.id)
//            return 1;
//        else
//            return 0;

        // or simply write this
        return this.name.compareTo(student.getName());
    }
    //    @Override
    //    public int compareTo(final Student o) {
    //        return this.name.compareTo(o.getName());
    //    }
}

class Person implements Comparable<Person> {
    private int id;
    private String name;

    public Person(final int id, final String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(final Person person) {
        return -this.name.compareTo(person.name);
    }
}

class Emp {
    private int id;
    private String name;

    public Emp(final int id, final String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}