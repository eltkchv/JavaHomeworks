package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число типа int: ");
        String s1 = in.next();

        System.out.println("Введите число типа double: ");
        String s2 = in.next();

        int x = toInt(s1);
        double y = toDouble(s2);

        Integer rez = x + (int) y;
        System.out.println("результат " + rez.toString() + "\nтип результата: " + rez.getClass());
    }

    public static int toInt (String num) {

        return Integer.parseInt(num);
    }

    public static double toDouble (String num) {

        return Double.parseDouble(num);
    }
}