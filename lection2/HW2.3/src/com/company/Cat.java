package com.company;

public class Cat extends Animal {

    @Override
    public void voice() {
        System.out.println("Мяу!");
    }
    @Override
    public  void eat(){
        System.out.println("*cat eat*!");
    }
}