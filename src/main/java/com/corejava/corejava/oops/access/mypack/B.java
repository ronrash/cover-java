package com.corejava.corejava.oops.access.mypack;

import com.corejava.corejava.oops.access.pack.A;

public class B extends A {
    public static void main(String[] args) {

        B b = new B();
        b.hello(); // im able to access method of A class which is in diff package becoz the access modifier is proteected

        // if i remove the access modifier to default i will not be able to access the method
    }
}
