package com.geekbrains;

public class Dog extends Animal {
    private static int maxDogRun = 500;
    private static int maxDogSwim = 10;
    public static int dogNumber = 0;

    public Dog(String name, String color, int age) {
        super(name, color, age);
        dogNumber = dogNumber + 1;
    }

    @Override
    public void run(int runDist) {
        if (runDist > maxDogRun) {
            System.out.println("Собака " + getName() + " не может столько (" + runDist + " м) пробежать (максимум: " + maxDogRun + " м)");
        } else {
            System.out.println("Собака " + getName() + " пробежал " + runDist);
        }
    }

    @Override
    public void swim(int swimDist) {
        if (swimDist > maxDogSwim) {
            System.out.println("Cобака " + getName() + " не может столько (" + swimDist + " м) проплыть (максимум: " + maxDogSwim + " м)");
        } else {
            System.out.println("Собака " + getName() + " проплыл " + swimDist);
        }

    }
}
