package com.corejava.corejava.inheritance;

public class Dog extends Animal{

    private int legs;
    private int eyes;

    public Dog(final int legs, final int eyes) {
        super("Al", 1);
        this.legs = legs;
        this.eyes = eyes;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(final int legs) {
        this.legs = legs;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(final int eyes) {
        this.eyes = eyes;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "legs=" + legs +
                ", eyes=" + eyes +
                '}';
    }
}
