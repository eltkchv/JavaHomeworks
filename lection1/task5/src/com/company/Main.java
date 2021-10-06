package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Вы можете вводить только целочисленные значения!!!\nВведите длину массивов: ");
        int size = input.nextInt();
        int array1[] = new int[size];
        System.out.println("Запишите элементы первого массива через пробел:");
        for (int i = 0; i < size; i++) {
            array1[i] = input.nextInt();
        }
        System.out.print("Введённые элементы первого массива:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array1[i]);
        }
        System.out.println("\nВведите длину второго массива: ");
        int array2[] = new int[size];
        System.out.println("Запишите элементы второго массива через пробел:");
        for (int i = 0; i < size; i++) {
            array2[i] = input.nextInt();
        }
        System.out.print("Введённые элементы второго массива:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array2[i]);
        }

        for (int j = 0; j < array1.length; j++)
                if (array1[j] != array2[j]) {
                    System.out.println("\nЭлемент " + (int) (j + 1) + " массива №1 отличается от элемента " + (int) (j + 1) + " массива №2");
                }

    }
}