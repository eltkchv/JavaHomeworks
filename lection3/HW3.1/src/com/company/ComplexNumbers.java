package com.company;

public class ComplexNumbers implements ArithmeticOperations {
    public NumberParams add(NumberParams a, NumberParams b) {
        double r1 = a.getReal();
        double r2 = b.getReal();
        double c1 = a.getImaginary();
        double c2 = b.getImaginary();
        return new NumberParams(r1 + r2, c1 + c2);
    }

    public NumberParams subtract(NumberParams a, NumberParams b) {
        double r1 = a.getReal();
        double r2 = b.getReal();
        double c1 = a.getImaginary();
        double c2 = b.getImaginary();
        return new NumberParams(r1 - r2, c1 - c2);
    }

    public NumberParams divide(NumberParams a, NumberParams b) {
        double r1 = a.getReal();
        double r2 = b.getReal();
        double c1 = a.getImaginary();
        double c2 = b.getImaginary();
        double divider = Math.pow(r2, 2) + Math.pow(c2, 2);
        return new NumberParams((r1*r2 + c1*c2)/ divider, (c1*r2-r1*c2)/ divider);
    }

    public NumberParams multiply(NumberParams a, NumberParams b) {
        double r1 = a.getReal();
        double r2 = b.getReal();
        double c1 = a.getImaginary();
        double c2 = b.getImaginary();
        return new NumberParams(r1*r2 - c1*c2, r1*c2 + c1*r2);
    }
}