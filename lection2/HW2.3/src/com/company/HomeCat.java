package com.company;

public class HomeCat extends Cat{

    @Override
    public void voice(){
        System.out.println("*говорит \"мяу\" по-домашнему");
    }
    @Override
    public void eat(){
        System.out.println("*cat eat по-домашнему*");
    }
}
