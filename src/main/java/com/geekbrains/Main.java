package com.geekbrains;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        invArr();
        fillArr();
        doubSix();
        quadArr(9);
        System.out.println(Arrays.toString(array1(8, 2)));
    }

    public static void invArr() {
        int[] arr = {0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0};
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println("Инвертированный массив: " + Arrays.toString(arr));
    }

    public static void fillArr() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println("Заполненный массив из 100 эл.: " + Arrays.toString(arr));
    }

    public static void doubSix() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println("Преобразованный массив:" + Arrays.toString(arr));
    }

    public static void quadArr(int a) {
        int[][] arr = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i == j || i + j == a - 1) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
                System.out.print(" " + arr[i][j]);
            }
            System.out.println("");
        }
    }

    public static int[] array1 (int len, int initialValue) {
        int[] arr1 = new int[len];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = initialValue;
        }
        return arr1;
    }
}
