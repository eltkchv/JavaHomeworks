package com.company;

public class Main {

    public static void main(String[] args) {
        Params p = new Params(5.6,4.9,8.4);

        Figure figure = new Circle();
        figure.show(p);

        Figure square = new Square();
        square.show(p);

        Figure rectangle = new Rectangle();
        rectangle.show(p);
    }
}