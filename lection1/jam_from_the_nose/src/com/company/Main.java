package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        Double begn = in.nextDouble();
        System.out.println("Введите второе число:");
        Double end = in.nextDouble();
        String question = "";

        if (begn > end) {
            double temp = begn;
            begn = end;
            end = temp;
        }

        do {
            System.out.println("левая точка: " + begn.toString() + "\nправая точка: " + end.toString() + "\nвведите число:");
            Double test = in.nextDouble();
            String isin = test >= begn && test <= end ? " принадлежит " : " не принадлежит ";
            System.out.println("число " + test.toString() + isin + "отрезку" + "\nХотите ли вы продолжить? (y/n)");

            question = in.next();
        } while (!question.equals("n"));
    }
}