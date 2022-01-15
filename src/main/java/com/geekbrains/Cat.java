package com.geekbrains;

public class Cat {
    private String name;
    private int appetit;
    private boolean satiety;

    public Cat(String name, int appetit) {
        this.name = name;
        this.appetit = appetit;
    }

    public void eat(Plate p) {
        if (p.decreaseFood(appetit)) {
            System.out.println("Кот " + name + " съел " + appetit + ". Теперь он сыт.");
            satiety = true;
        } else {
            System.out.println("Кот " + name + " все еще голоден");
            satiety = false;
        }
    }
}
