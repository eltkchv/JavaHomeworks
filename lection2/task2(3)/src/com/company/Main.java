package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        A aClass = new A();
        B bClass = new B();
        C cClass = new C();
        D dClass = new D();

        Scanner in = new Scanner(System.in);
        System.out.print("Введите а: ");
        int a = in.nextInt();
        System.out.print("Введите b: ");
        int b = in.nextInt();

        aClass.count(a, b);
        aClass.show();

        bClass.count(a, b);
        bClass.show();

        cClass.count(a, b);
        cClass.show();

        dClass.count(a, b);
        dClass.show();
    }
}