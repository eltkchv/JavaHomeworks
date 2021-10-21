package com.company;

public class Circle implements Figure {

    public String getFigureName() {
        return "Круг";
    }

    public double getPerimeter(Params p) {
        return 2*Math.PI*p.getR();
    }

    public double getSquare(Params p) {
        return Math.PI*Math.pow(p.getR(), 2);
    }

    public void show(Params p) {
        System.out.println("Figure: " + getFigureName() + "\nSquare: " + getSquare(p) + "\nPerimeter: " + getPerimeter(p) + "\n");
    }
}