package com.corejava.corejava.inheritance;

public class MainInheritance {

    public static void main(String[] args) {

        Animal animal = new Animal("Dogs",1);

        Dog dog = new Dog(4,2);
        dog.setName("DOggies");
        System.out.println(dog.getName());

        System.out.println(dog);
    }
}
