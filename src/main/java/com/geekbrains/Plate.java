package com.geekbrains;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (food - n >= 0) {
            food -= n;
            return true;
        } else {
            System.out.println("Еда закончилась!");
            return false;
        }
    }
    public void increaseFood(int k){
        food += k;
    }

    public void info() {
        System.out.println("Еды в миске " + food);
    }

}
