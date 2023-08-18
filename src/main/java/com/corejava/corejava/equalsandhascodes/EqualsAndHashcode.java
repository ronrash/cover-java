package com.corejava.corejava.equalsandhascodes;

import java.util.Objects;

public class EqualsAndHashcode {

    /*
    *  if 2 objects are equal using the equals method then there hashcode must be same ,, but not vice versa

    * */
    public static void main(String[] args) {

        Employee e1 = new Employee(1,"donny"); // reference is pointng to different objects
        Employee e2 = new Employee(1,"donny");

        System.out.println("shaloow compare "+(e1==e2));
        System.out.println("shaloww compare "+(e1.equals(e2)));

        System.out.println(e1.hashCode()+" "+e2.hashCode());
    }
}

class Employee{
    private int id;
    private String name;

    public Employee(final int id, final String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Employee employee = (Employee) o;
        return id == employee.id ;
    }

    @Override
    public int hashCode() {
        // what is a hashcode?
        // hascode genereate ann integer value ,return the hashcode/ integer value of an object/instance
        //This method is supported for the benefit of hash tables such as those provided by HashMap.
        // f two objects are equal according to the equals(Object) method, then calling the hashCode method on each of the two objects must produce the same integer result.
        return Objects.hash(id);
    }
}