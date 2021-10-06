package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Выберите операцию: 1 - сложение, 2 - разность, 3 - произведение, 4 - деление, 5 - возведение в степень, 6 - факториал числа");
        Scanner scan = new Scanner(System.in);
        String operation = scan.next();

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double a = in.nextDouble();
        System.out.print("Введите второе число: ");
        double b = in.nextDouble();

        switch (operation){
            case "1":
                System.out.println(a + " + " + b + " = " + MathUtils.sum(a, b));
                break;
            case "2":
                System.out.println(a + " - " + b + " = " + MathUtils.diff(a, b));
                break;
            case "3":
                System.out.println(a + " * " + b + " = " + MathUtils.mul(a, b));
                break;
            case "4":
                System.out.println(a + " / " + b + " = " + MathUtils.div(a, b));
                break;
            case "5":
                System.out.println(a + "^" + b + " = " + MathUtils.pow(a, b));
                break;
            case "6":
                System.out.print("Введите число от которого нужно факториал: ");
                int d = in.nextInt();
                System.out.println(d + "!" + " = " + MathUtils.fact(d));
                break;
            default:
                System.out.println("Ошибка");
        }

    }
}