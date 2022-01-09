package com.geekbrains;

public abstract class Animal {
    private String name;
    private String color;
    private int age;
    public static int number = 0;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        number = number + 1;
    }

    public abstract void run(int runDist);

    public abstract void swim(int swimDist);

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }
}

