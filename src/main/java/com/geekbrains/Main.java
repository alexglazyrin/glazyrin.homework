package com.geekbrains;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrOr = {2, 2, 2, 1, 2, 2, 10, 1};
        /*invArr();
        fillArr();
        doubSix();
        quadArr(9);
        System.out.println(Arrays.toString(array1(8, 2)));
        minAndMax();*/
        System.out.println(checkArr(new int[]{2, 2, 2, 1, 2, 2, 10, 1}));
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

    public static int[] array1(int len, int initialValue) {
        int[] arr1 = new int[len];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = initialValue;
        }
        return arr1;
    }

    public static void minAndMax() {
        int[] arr = {2, 5, 3, 12, 26, 23, 34, 1};
        int minV = arr[0], maxV = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxV) {
                maxV = arr[i];
            }
            if (arr[i] < minV) {
                minV = arr[i];
            }
        }
        System.out.println("Максимальное значение элемент массива: " + maxV);
        System.out.println("Минимальное значение элемта массива: " + minV);
    }

    public static boolean checkArr(int[] arr) {
        //int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};
        for (int i = 0; i < arr.length; i++) {
            int sumL = 0, sumR = 0;
            for (int aL = 0; aL <= i; aL++) {
                sumL += arr[aL];
            }
            //System.out.println("LSum= " + sumL);
            for (int aR = i + 1; aR < arr.length; aR++) {
                sumR += arr[aR];
            }
            //System.out.println("RSum= " + sumR);
            if (sumL == sumR) {
                System.out.println("Равенство сумм правой и левой части элементов массива после " + i + " элемента");
                return true;
            }

        }
        return false;
    }
}
