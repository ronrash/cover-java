package com.corejava.corejava.equalsandhascodes;

public class EqualsAndHashcode {

    /*
    *  if 2 objects are equal using the equals method then there hashcode must be same ,, but not vice versa

    * */
    public static void main(String[] args) {

//        Student e1 = new Student(1,"rohit");
//        Student e2 = new Student(1,"paji");
//
//        System.out.println("shaloow compare "+(e1==e2));
//        System.out.println("shaloww compare "+(e1.equals(e2)));
    }
}

class Employee{
    private int id;
    private String name;

    public Employee(final int id, final String name) {
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


}