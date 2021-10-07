package com.company;

public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal animal3 = new Bear();
        Animal animal4 = new Snake();
        Cat homecat = new HomeCat();

        animal1.voice();
        animal2.voice();
        animal3.eat();
        animal4.eat();
    }
}