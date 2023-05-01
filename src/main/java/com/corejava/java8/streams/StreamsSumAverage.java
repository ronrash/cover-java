package com.corejava.java8.streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamsSumAverage {
    public static void main(String[] args) {

        // average

        final Double collect = Arrays.asList(1, 2, 3, 4, 5, 6)
                .stream()
                .collect(Collectors.averagingInt(Integer::intValue));

        System.out.println(collect);


        // sum of all numbers

        final int sum = Arrays.asList(1, 2, 3).stream().collect(Collectors.summingInt(i -> i)).intValue();
        System.out.println(sum);



    }
}
