package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] names = new String[] {"Эмилия", "Леонид", "Виктор", "Валерия", "Василиса", "Константин", "Мирослава", "Анастасия", "Тимофей", "Арсений"};
        boolean input;
        input = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scanner.nextLine();

        for (String s : names) {
            if (name.equals(s)) {
                input = true;
                break;
            }
        }
        if (input) {
            System.out.println("Имя присутствует в массиве");
        }else{
            System.out.println("Введённое имя отсутствует в массиве");
        }

    }

}