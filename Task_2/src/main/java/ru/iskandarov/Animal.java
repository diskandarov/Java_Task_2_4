package ru.iskandarov;

import java.util.Scanner;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(int s) {
        System.out.println("Живтоное бежит");
    }
    public void swim(int s) {
        System.out.println("Животное плывет");
    }
}
