package com.company;

public class Square extends Quadrangle {
    @Override
    public double getPerimeter(Params p) {
        return 4 * p.getA();
    }

    @Override
    public double getSquare(Params p) {
        return Math.pow(p.getA(), 2);
    }
}