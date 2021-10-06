package com.company;

public class Cylinder {
    private double r;
    private double h;

    public double getSquare() {
        return 2*Math.PI*(Math.pow(r,2) + r*h);
    }

    public double getVolume (){
        return Math.PI*Math.pow(r,2)*h;
    }

    public static double getSquare (double r, double h){
        return 2*Math.PI*(Math.pow(r,2) + r*h);
    }

    public static double getVolume (double r, double h){
        return Math.PI*Math.pow(r,2)*h;
    }

    public static double getSquare (String inp){
        double r = Double.parseDouble(inp.split(" ")[0]);
        double h = Double.parseDouble(inp.split(" ")[1]);
        return getSquare(r, h);
    }

    public static double getVolume (String inp){
        double r = Double.parseDouble(inp.split(" ")[0]);
        double h = Double.parseDouble(inp.split(" ")[1]);
        return getVolume(r, h);
    }
}