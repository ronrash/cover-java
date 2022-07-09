package com.global.Generics;

public class SampleGenerics<T extends Number> {

    T value;

    SampleGenerics(T value)
    {
        this.value=value;
    }

    public void print()
    {
        System.out.println(this.value);
    }

    @Override
    public String toString() {
        return "" +
                "value=" + value ;
    }
}
