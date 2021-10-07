package com.company;

public class Bear extends Animal {
    @Override
    public void voice() {
        System.out.println("Р-р-р!");
    }
    @Override
    public  void eat(){
        System.out.println("*bear eat*");
    }
}