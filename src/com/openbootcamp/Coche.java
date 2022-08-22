package com.openbootcamp;

public class Coche {
    private String name;
    private int year;

    public Coche(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
