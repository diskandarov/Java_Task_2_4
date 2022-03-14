package ru.iskandarov;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }
    public void run(int s) {
        if (s > 200) {
            System.out.println("Домашний кот "+name+" не сможет пробежать "+s+" м");
        }
        else {
            System.out.println("Домашний кот "+name+" пробежал "+s+" м");
        };
    }
    public void swim(int s) {
            System.out.println("Кот "+name+" не умеет плавать");
         }
 }
