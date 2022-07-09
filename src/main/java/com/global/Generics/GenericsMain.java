package com.global.Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsMain {
    public static void main(String[] args) {

        SampleGenerics<Integer> sampleGenerics = new SampleGenerics<>(19);
        // if generics extends NUmber then we can only pass whatever is child of inherits Number
       // SampleGenerics<String> stringSampleGenerics= new SampleGenerics<>("rohit");

        sampleGenerics.print();
      //  stringSampleGenerics.print();

        print(1);
        print("Hello world");
        print(new SampleGenerics<Integer>(100));
        List<Integer> integers = new ArrayList<>();
        print(1,"hello ",new SampleGenerics<Integer>(100));
        integers.add(1090);
        print(integers);
    }

    /// we can create a generics method as well which can take any value
    private static <T> void print(T value){
        System.out.println(value);
    }

    // as many params can be passed
    private static <T,U,A> void print (T t,U u,A a){
        System.out.println(t+" "+u+""+a);
    }

   private static void print(List<? extends Number> list)
   {
       System.out.println(list.get(0));
   }
}
