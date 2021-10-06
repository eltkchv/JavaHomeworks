
package com.company;

public class Circle {
    private double x;
    private double y;
    private double r;

    public Circle (double xi, double yi, double ri){
        this.x = xi;
        this.y = yi;
        this.r = ri;
    }

    public void print() {
        System.out.println("Координаты центра: \nx: " + x + "\ny: " + y + "\nРадиус: " + r);
    }

    public void move(double xm, double ym) {
        x += xm;
        y += ym;
    }

    public double distToOtherCircle(Circle c) {
        return Math.sqrt(Math.pow(Math.abs(x - c.x), 2) + Math.pow(Math.abs(y - c.y), 2)) - r - c.r;
    }

    public void changeRadius(double rn) {
        r = rn;
    }

    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    public double getSquare() {
        return Math.PI * Math.pow(r, 2);
    }
}