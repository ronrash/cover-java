package com.global.corejava.equalsandhascodes;

import java.util.Objects;

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

    public boolean equals(Object object)
    {
        if(object==null || object.getClass()!=this.getClass())
            return false;

        if(object==this) // both are physicall pointing to the same referernce they are same
            return true;

        Employee employee = (Employee) object;
        return (this.getId()==employee.getId() && this.getName().equals(((Employee) object).getName()));

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}