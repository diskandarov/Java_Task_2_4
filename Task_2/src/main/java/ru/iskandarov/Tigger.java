package ru.iskandarov;

public class Tigger extends Animal {
    public Tigger(String name) {
        super(name);
    }

    public void run(int s) {
        if (s > 800) {
            System.out.println("Тигр "+name+" не сможет пробежать "+s+" м");
        }
        else {
            System.out.println("Тигр "+name+" пробежал "+s+" м");
        };
    }
    public void swim(int s) {
        if (s > 50) {
            System.out.println("Тигр "+name+" не сможет проплыть "+s+" м");
        }
        else {
            System.out.println("Тигр "+name+" проплыл "+s+" м");
        };
    }
}
