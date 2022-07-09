package com.global.corejava.sampletestcodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SampleTest {
    public static void main(String[] args) {
        final boolean hello = isUserPresent("hello");
        System.out.println(hello);
    }

    public static boolean isUserPresent(final String user) {
        final List<String> test = new ArrayList<>();
        return test != null && !test.isEmpty();
    }
}
