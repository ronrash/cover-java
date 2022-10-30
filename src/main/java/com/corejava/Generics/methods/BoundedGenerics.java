package com.corejava.Generics.methods;

public class BoundedGenerics {
    /*
    * Type parameters they can be bounded , we can restrict the type a method accepts
    * For example, we can specify that a method accepts a type and all its subclasses (upper bound) or a type and all its superclasses (lower bound).
    * To declare an upper-bounded type, we use the keyword extends after the type, followed by the upper bound that we want to use:
    * A type can also have multiple upper bounds:
    *
    * */

    private static <T extends Number> T getMultipliedValue(T someType)
    {
        return someType;

    }

    public static void main(String[] args) {
        // passing a value which extends Number
        final Integer multipliedValue = BoundedGenerics.getMultipliedValue(10);
        // passinga long value also extends Number 
        final Long multipliedValue1 = BoundedGenerics.getMultipliedValue(10L);
    }
}
