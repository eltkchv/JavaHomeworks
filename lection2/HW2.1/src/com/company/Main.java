package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String i;
        String m;
        double ms = -1;
        String w;
        double wg = -1;
        Car car;

        do {
            Scanner in = new Scanner(System.in);
            System.out.print("Напишите модель машины: ");
            String model = in.nextLine();

            System.out.println("Хотите ли вы ввести максимальную скорость? (y/n)");
            m = in.next();
            if ("y".equals(m)) {
                System.out.print("Введите максимальную скорость: ");
                ms = in.nextDouble();
            }

            System.out.println("Хотите ли вы ввести максимальный вес? (y/n)");
            w = in.next();
            if ("y".equals(w)) {
                System.out.print("Введите вес: ");
                wg = in.nextDouble();
            }

            if ("y".equals(m) && "y".equals(w)) {
                car = new Car(model, ms, wg);
            } else if ("y".equals(m)) {
                car = new Car(model, ms);
            } else {
                car = new Car(model);
            }

            car.show();

            System.out.println("Хотите ли вы продолжить? (y/n)");

            i = in.next();
        } while (!i.equals("n"));
    }
}