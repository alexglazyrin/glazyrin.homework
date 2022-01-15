package com.geekbrains;

public class Main {
    public static void main(String[] args) {
        Cat [] cats = new Cat [5];
        cats[0]= new Cat ("Белый", 6);
        cats[1] = new Cat ("Черныш", 7);
        cats[2] = new Cat ("Рыжик", 35);
        cats[3] = new Cat("Шоня", 4);
        cats[4] = new Cat("Лексия", 10);

        Plate plate = new Plate(60);
        plate.increaseFood(10);
        plate.info();
        for (int i = 0; i < cats.length; i++){
            cats[i].eat(plate);
        }
        plate.info();
    }
}
