package com.geekbrains;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println(within10and20(4,5));
        pOrN(6);
        System.out.println(isN(-2));
        printNStrings(3,"java");
        System.out.println(leapYear(2012));
    }
        public static boolean within10and20 (int x1, int x2){
        if ((x1+x2>=10) && (x1+x2)<=20){
            return true;
        } else {
            return false;
        }
    }
        public static void pOrN (int x){
        if (x>=0){
            System.out.println("Число положительное");
        }else {
            System.out.println("Число отрицательное");
        }
        }
        public static boolean isN (int x){
        if (x<0){
            return true;
        }else{
            return false;
        }
        }
        public static void printNStrings (int x, String a){
        for (int i = 1; i <= x; i++){
            System.out.println(a);
        }
        }
        public static boolean leapYear (int x){
        if ((x % 400) == 0){
            return true;
        }else if ((x % 100) == 0){
            return false;
        }else if ((x % 4) == 0){
            return true;
        }else{
            return false;
        }
        }
}
