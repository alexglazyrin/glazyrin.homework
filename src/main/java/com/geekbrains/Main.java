package com.geekbrains;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Филя", "Черный", 13);
        Cat cat2 = new Cat("Черныш", "Рыжий", 5);
        Cat cat3 = new Cat("Максим", "Белый", 2);
        Dog dog1 = new Dog("Пират", "Рыжий", 7);
        Dog dog2 = new Dog("Чермон", "Черный", 8);


        /*Cat[] cats = new Cat[3];
        cats[0] = cat1;
        cats[1] = cat2;
        cats[2] = cat3;

        Dog[] dogs = new Dog[2];
        dogs[0] = dog1;
        dogs[1] = dog2;

        Animal[] animals = new Animal[5];
        animals[0] = cat1;
        animals[1] = cat2;
        animals[2] = cat3;
        animals[3] = dog1;
        animals[4] = dog2;

        animals[0].swim(1);*/

        cat1.run(150);
        cat1.swim(3);
        dog1.run(520);
        dog1.swim(4);

        System.out.println("Количество созданных животных: " + Animal.number);
        System.out.println("Количество созданных котов: " + Cat.catNumber);
        System.out.println("Количество созданных собак: " + Dog.dogNumber);
    }
}
