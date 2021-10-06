package com.company;

import java.math.BigInteger;

public class MathUtils {
    //сумма
    public static double sum(double a, double b) {
        return a + b;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, int b) {
        return a + b;
    }

    public static double sum(int a, double b) {
        return a + b;
    }


    //разность
    public static double diff(double a, double b) {
        return a - b;
    }

    public static int diff(int a, int b) {
        return a - b;
    }

    public static double diff(double a, int b) {
        return a - b;
    }

    public static double diff(int a, double b) {
        return a - b;
    }


    //произведение
    public static double mul(double a, double b) {
        return a * b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static double mul(double a, int b) {
        return a * b;
    }

    public static double mul(int a, double b) {
        return a * b;
    }


    //деление
    public static double div(double a, double b) {
        return a / b;
    }

    public static double div(int a, int b) {
        return a / b;
    }

    public static double div(double a, int b) {
        return a / b;
    }

    public static double div(int a, double b) {
        return a / b;
    }


    //возведение в степень
    public static double pow(double a, double c) {
        return Math.pow(a, c);
    }

    public static double pow(int a, int c) {
        return Math.pow(a, c);
    }

    public static double pow(double a, int c) {
        return Math.pow(a, c);
    }

    public static double pow(int a, double c) {
        return Math.pow(a, c);
    }


    //факториал
    public static BigInteger fact(int f) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= f; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

}