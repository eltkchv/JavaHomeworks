package com.company;

public abstract class Quadrangle implements Figure {
    public String getFigureName(){
        return "Квадрат";
    }

    public void show(Params p) {
        System.out.println("Figure: " + getFigureName() + "\nSquare: " + getSquare(p) + "\nPerimeter: " + getPerimeter(p) + "\n");
    }
}
