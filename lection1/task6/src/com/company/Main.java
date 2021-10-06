package com.company;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        char[] arr = new char[15];

        for (int i = 0; i < 15; i++){
            arr[i] = (char)(new Random().nextInt(26) + 'a');
        }
        System.out.println("Создан массив: " + Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("Отссортируем массив: " + Arrays.toString(arr));

        char[] fives = Arrays.copyOfRange(arr, 5, 10);

        System.out.println("Пять средних элементов: " + Arrays.toString(fives));
    }

    }


