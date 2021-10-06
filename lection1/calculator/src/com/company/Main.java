package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String ans;
        ans = "y";
        while (!ans.equals("n")) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите целочисленное значение №1");
            String number1 = sc.nextLine();
            int first_num = Integer.parseInt(number1);
            System.out.println("Введите целочисленное значение №2");
            String number2 = sc.nextLine();
            int second_num = Integer.parseInt(number2);

            System.out.println("Какое вычисление хотите произвести?(+, - , * , /)");
            String str = sc.nextLine();

            switch (str) {
                case "+" -> summa(first_num, second_num);
                case "-" -> subtraction(first_num, second_num);
                case "*" -> multiplication(first_num, second_num);
                case "/" -> division(first_num, second_num);
                default -> System.out.println("Оператор неверен.Выберите оператор из предложенного списка (+, - , * , /) и введите его еще раз.");
            }

            System.out.println("Чтобы продолжить, выберите y/n?");
            do {
                ans = sc.nextLine();
                if (!ans.equals("y") && !ans.equals("n")) {
                    System.out.println("Неверный запрос, чтобы продолжить, выберите y/n?");
                }
            } while (!ans.equals("y") && !ans.equals("n"));
        }
    }

    public static void summa ( int A, int B){
        int C = A + B;
        System.out.println("Результат сложения:" + C);
    }
    public static void subtraction ( int A, int B){
        int C = A - B;
        System.out.println("Результат вычитания:" + C);
    }
    public static void multiplication ( int A, int B){
        int C = A * B;
        System.out.println("Результат произведения:" + C);
    }
    public static void division( int A, int B){
        double C = A / B;
        System.out.println("Результат деления:" + C);
    }
    public static void Error () {
        System.out.println("Такой оперпции нет в этом калькуляторе");
    }

}