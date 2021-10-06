package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите координаты центра круга:\nx1: ");
        double x1 = input.nextDouble();
        System.out.print("y1: ");
        double y1 = input.nextDouble();
        System.out.print("Введите радиус: ");
        double r1 = input.nextDouble();

        Circle circle1 = new Circle(x1, y1, r1);

        System.out.println("\nНаш круг:");
        circle1.print();

        System.out.print("\nКак вы хотите подвинуть круг:\nсдвиг по х: ");
        double xm = input.nextDouble();
        System.out.print("\nсдвиг по у: ");
        double ym = input.nextDouble();
        circle1.move(xm, ym);

        System.out.println("Теперь круг передвинут на:");
        circle1.print();

        System.out.print("Введите координаты другого круга:\nx2: ");
        double x2 = input.nextDouble();
        System.out.print("y2: ");
        double y2 = input.nextDouble();
        System.out.print("Введите радиус другого круга: ");
        double r2 = input.nextDouble();

        Circle circle2 = new Circle(x2, y2, r2);

        double dist = circle1.distToOtherCircle(circle2);

        System.out.println("\nРасстояние между двумя кругами: " + dist);
        System.out.print("Введите радиус для нового круга: ");
        double rn = input.nextDouble();
        circle1.changeRadius(rn);

        System.out.println("\nТеперь круг такой:");
        circle1.print();

        double p = circle1.getPerimeter();
        double s = circle1.getSquare();

        System.out.println("Perimeter is: " + p + "\nSquare is: " + s);
    }
}