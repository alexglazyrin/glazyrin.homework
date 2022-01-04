package com.geekbrains;

public class Employee {
    private String fIO;
    private String position;
    private String email;
    private String phoneNum;
    private int salary;
    private int age;

    public Employee(String fIO, String position, String email, String phoneNum, int salary, int age) {
        this.fIO = fIO;
        this.position = position;
        this.email = email;
        this.phoneNum = phoneNum;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ФИО:" + fIO);
        System.out.println("Должность: " + position);
        System.out.println("e-mail: " + email);
        System.out.println("Номер телефона: " + phoneNum);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }

    public int getAge() {
        return age;
    }
}
