package com.geekbrains;

public class Main {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Иванов Иван Иванович",
                "Гл. конструктор", "ii.ivanov@gmail.com",
                "+79123456789", 200000, 40);
        employeeArray[1] = new Employee("Петров Петр Петрович",
                "Технически директор", "pp.petrov@gmail.com",
                "+79213457623", 250000, 42);
        employeeArray[2] = new Employee("Сидоров Сидр Сидрович",
                "Коммерческий директор", "ss.sidorov@gmail.com",
                "+79656444234", 275000, 39);
        employeeArray[3] = new Employee("Мартынов Иван Алексеевич",
                "Руководитель проекта", "ia.martynov@gmail.com",
                "+79110913361", 150000, 29);
        employeeArray[4] = new Employee("Кац Станислав Львович",
                "Инженер 2 категории", "sl.kats@gmail.com",
                "+79110976634", 100000, 26);

        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getAge() >= 40) {
                employeeArray[i].printInfo();
            }
        }
    }
}
