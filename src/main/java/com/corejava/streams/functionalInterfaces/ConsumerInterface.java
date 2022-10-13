package com.corejava.streams.functionalInterfaces;

import java.util.function.Consumer;

public class ConsumerInterface {


    // functional Interface 4
    // 1. Consumer Interface
    //

  static   Consumer<String> stringConsumer =(s)->{
        System.out.println(s.toLowerCase());
    };

    public static void main(String[] args) {

        stringConsumer.accept("ROHIT");
        integerConsumer.accept(2);
    }
    static  Consumer<Integer> integerConsumer =(s)-> System.out.println(s.intValue()*s.intValue());

}
