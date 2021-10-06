package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Объём какой фигуры Вы хотите посчитать?");
        Scanner scan = new Scanner(System.in);
        String figure3D = scan.next();
        Scanner scanner = new Scanner(System.in);
        if (figure3D.equals("параллелепипед")) {
            System.out.println("Какие параметры у параллелепипеда? (высота, длина, ширина)");
            int height = scanner.nextInt();
            int lenght = scanner.nextInt();
            int width = scanner.nextInt();
            int volumeOfParallelepiped = (height*lenght*width);
            System.out.println("Объём параллелепипеда равен: " + volumeOfParallelepiped);
        }

        else if (figure3D.equals("шар"))  {
            System.out.println("Какой радиус у шара?");
            int radiusOfBall = scanner.nextInt();
            final double pi = 3.14;
            double volumeOfBall = (4*pi*radiusOfBall*radiusOfBall/3);
            System.out.println("Объём шара равен: " + volumeOfBall);
        }

        else if (figure3D.equals("цилиндр")) {
            System.out.println("Какие параметры у цилиндра? (высота, радиус)");
            int radiusOfCylinder = scanner.nextInt();
            int heightOfCylinder = scanner.nextInt();
            final double pi = 3.14;
            double volumeOfCylinder = (pi*radiusOfCylinder*radiusOfCylinder*heightOfCylinder);
            System.out.println("Объём цилиндра равен: " + volumeOfCylinder);
        }
    }
}