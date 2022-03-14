package ru.iskandarov;

import ru.iskandarov.iterf.Move;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void run(int s) {
        if (s > 500) {
            System.out.println("Собака "+name+" не сможет пробежать "+s+" м");
        }
        else {
            System.out.println("Собака "+name+" пробежала "+s+" м");
        };
    }
    public void swim(int s) {
        if (s > 10) {
            System.out.println("Собака "+name+" не сможет проплыть "+s+" м");
        }
        else {
            System.out.println("Собака "+name+" проплыла "+s+" м");
        };
    }
}
