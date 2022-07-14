package com.global.corejava.equalsandhascodes;

import java.util.HashMap;

public class MainExample {
    public static void main(String[] args) {
        Person p1 = new Person(1,"rohit");//123
        Person p2 = new Person(2,"swati");//333
        Person p3 = new Person(1,"rohit");
        Person p4 = new Person(2,"swati");


        HashMap<Person,String> map = new HashMap<>();

        map.put(p1,"footballer");
        map.put(p2,"singer");
        map.put(p3,"actor");
        map.put(p4,"actress");

        System.out.println(map);


    }
}
