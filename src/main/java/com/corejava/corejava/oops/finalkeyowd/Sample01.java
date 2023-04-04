package com.corejava.corejava.oops.finalkeyowd;

public class Sample01 {

    // final can be used on a class --> not extendable ,, method not override ,, variable constant
    // Yes, final method is inherited but you cannot override it.
    // A final variable that is not initialized at the time of declaration , should be initialized at the time of a constructor
   // A static final variable that is not initialized at the time of declaration is known as static blank final variable.
    // It can be initialized only in static block.

  //  If you declare any parameter as final, you cannot change the value of it.

    final String name;

    public Sample01(final String name) {
        this.name = name;
    }
    
    static final String allocation = "yes";

    public static void main(String[] args) {
        
    }

    public void calculate(final int value)
    {
       // value = value*2; compile time error
    }
}
