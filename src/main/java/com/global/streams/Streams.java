package com.global.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Streams {
    public static void main(String[] args) {

        final List<String> stringList = Arrays.asList("entert", "movies", "sky");

        stringList.stream()
                .filter(sub -> sub.equalsIgnoreCase("sky"))
                .findFirst();



    }
}
