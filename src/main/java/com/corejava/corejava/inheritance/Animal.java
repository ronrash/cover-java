package com.corejava.corejava.inheritance;

public class Animal {

    private String name;
    private int body;

    public Animal(final String name, final int body) {
        this.name = name;
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getBody() {
        return body;
    }

    public void setBody(final int body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", body=" + body +
                '}';
    }
}
