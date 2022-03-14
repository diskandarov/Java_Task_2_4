package ru.iskandarov.model;

import ru.iskandarov.Animal;
import ru.iskandarov.Cat;
import ru.iskandarov.Dog;
import ru.iskandarov.Tigger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int s = sc.nextInt();
        Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Рекс");
        Dog dog3 = new Dog("Альберто");
        Cat cat1 = new Cat("Томас");
        Cat cat2 = new Cat("Мурзик");
        Tigger tig1 = new Tigger("Ширхан");

        List<Animal> listanimal = new ArrayList<>();
        listanimal.add(dog1);
        listanimal.add(dog2);
        listanimal.add(dog3);
        listanimal.add(cat1);
        listanimal.add(cat2);
        listanimal.add(tig1);
        int id = 0;
        int ic = 0;
        int it = 0;
        for (Animal animal1 : listanimal) {
            animal1.run(s);
            animal1.swim(s);
            if (animal1 instanceof Dog) {
                id++;
            } else if (animal1 instanceof Cat) {
                ic++;
            } else if (animal1 instanceof Tigger) {
                it++;
            } else {
                System.out.println("Not animal");
            }
        }
        System.out.println("Кол-во собак: "+id);
        System.out.println("Кол-во домашних котов: "+ic);
        System.out.println("Кол-во тигров: "+it);

    }
}
