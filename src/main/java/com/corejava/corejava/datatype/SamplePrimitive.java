package com.corejava.corejava.datatype;

public class SamplePrimitive {

    // 8 data types
    // whole number -- byte short int long
    // decimal -- float and double

    // single char -- char
    // boolean value -- boolean

    // then we have wrapper classes for these data types
    // objects


    // overflow situation -- when u put a value larger than the max value into an int you will create a situation of overflow

    // byte short int long has the smallest range to store whole numbers

    // java defaluts the type to an int

    // Floating type numbers have fractions -- float and double  also known as real number s

    // double is default type in java for decimal/ real numbers // they do have suffixes of D but that is optional
    // float has a suffix of f or F ,, this is not optional
    // double will represent decimal numbers more accurately
    // double is a beter choice than float bcz computers or java are functionall equivalent to deal with double
    // math funtions deal with double better than float
    // double is more precise handles larger numbers and its the default type for decimal/real numbers

    // float and double are good but should not be used when using precies calculations ,bcoz there is a limitation
    // on how floating point numbers are stored in java

    // USE BIGDECIMAL  class -- class is custom data type -- for precise calculations use BIGDECIMAL

    public static void main(String[] args) {
        double numberOfPounds = 200d;
        System.out.println(numberOfPounds);

        double convertedToKilogrms = numberOfPounds * 0.45359237;
        System.out.println(convertedToKilogrms);
    }
}
