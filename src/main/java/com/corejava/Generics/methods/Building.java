package com.corejava.Generics.methods;

public class Building {

  private String name;

    public Building(final String name) {
        this.name = name;
    }

    public void paint()
    {
        System.out.println(this.name+" paint in building");
    }
}
