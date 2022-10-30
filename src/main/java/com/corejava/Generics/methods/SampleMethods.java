package com.corejava.Generics.methods;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SampleMethods {
    /*
    Generic methods have a type parameter (the diamond operator enclosing the type) before the return type of the method declaration.
    Type parameters can be bounded
    Generic methods can have different type parameters separated by commas in the method signature.
    Method body for a generic method is just like a normal method.
    */

    // generic method of converting an array to a list

    private static <T>  List<T> convertArrayToList(T[] array) {

        // The <T> in the method signature implies that the method will be dealing with generic type T. This is needed even if the method is returning void.

        return Arrays.stream(array).collect(Collectors.toList());
    }

    private static <T,G> List<G> convertArrayToList(T[] array, Function<T,G> mapperFunction) {

       // the method can deal with more than one generic type. Where this is the case, we must add all generic types to the method signature.

        return Arrays.stream(array)
                .map(mapperFunction)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        List<String> stringList
                = SampleMethods.convertArrayToList(intArray, integer -> integer.toString());

        System.out.println(stringList);
    }

}
