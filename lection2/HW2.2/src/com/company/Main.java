package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите a:");
        double a = in.nextDouble();
        System.out.print("Введите b:");
        double b = in.nextDouble();
        System.out.print("Введите c:");
        double c = in.nextDouble();

        Parallelepiped p = new Parallelepiped(a, b, c);

        System.out.println("Объём: " + Parallelepiped.getVolume(p) + "\nПлощадь: " + Parallelepiped.getSquare(p));    }
}
