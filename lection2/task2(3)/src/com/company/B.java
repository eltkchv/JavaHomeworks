package com.company;

public class B extends A {
    @Override
    public int count(int a, int b){
        System.out.println(a + " - " + b + " = " + (a - b));
        return a - b;
    }

    @Override
    public void show(){
        System.out.println("B\n");
    }
}