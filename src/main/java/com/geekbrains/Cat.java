package com.geekbrains;

public class Cat extends Animal {
    private static int maxCatRun = 200;
    private static int maxCatSwim = 0;
    public static int catNumber = 0;

    public Cat(String name, String color, int age) {
        super(name, color, age);
        catNumber = catNumber + 1;
    }

    @Override
    public void run(int runDist) {
        if (runDist > maxCatRun) {
            System.out.println("Кот " + getName() + " не может столько (" + runDist + ") пробежать (максимум: 200 м)");
        } else {
            System.out.println("Кот " + getName() + " пробежал " + runDist);
        }
    }

    @Override
    public void swim(int swimDist) {
        if (swimDist > maxCatSwim) {
            System.out.println("Кот " + getName() + " не умеет плавать! Он - кот!");
        }
    }
}

