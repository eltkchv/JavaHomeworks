package com.company;

public class Parallelepiped {
    private double a;
    private double b;
    private double c;

    public Parallelepiped(double a, double b, double c){
        setA(a);
        setB(b);
        setC(c);
    }
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public static double getVolume(Parallelepiped c) {
        return c.getA() * c.getB() * c.getC();
    }

    public static double getSquare(Parallelepiped c) {
        return 2 * (c.getA() * c.getB() + c.getB() * c.getC() + c.getC() * c.getA());
    }
}
