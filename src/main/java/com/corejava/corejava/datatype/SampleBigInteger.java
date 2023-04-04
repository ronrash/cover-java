package com.corejava.corejava.datatype;

public class SampleBigInteger {

    // for large numbers whose value cannot be fit into primitive types  like int or float

   // Autoboxing is converting from primitive to object like int to Integer
    // unboxing is object to primitive

    public static void main(String[] args) {
        Integer myInt = 34; //-- Integer.valueOf(34) -- autoboxing
        int intvale= myInt; // unboxing -- myInt.intValue
    }
}
