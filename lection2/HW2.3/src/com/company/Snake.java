package com.company;

public class Snake extends Animal {

    @Override
    public void voice() {
        System.out.println("Ш-ш-ш!");
    }
    @Override
    public  void eat(){
        System.out.println("*snake eat*");
    }
}
