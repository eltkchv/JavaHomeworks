package com.company;

public class Car {
    private final String model;
    private double maxSpeed = -1;
    private double weight = -1;

    public Car(String model) {
        this.model = model;
    }

    public Car(String model, double maxspeed) {
        this.model = model;
        this.maxSpeed = maxspeed;
    }

    public Car(String model, double maxspeed, double weight) {
        this.model = model;
        this.maxSpeed = maxspeed;
        this.weight = weight;
    }

    public void show() {
        System.out.println("Модель: " + model);
        if (maxSpeed != -1) {
            System.out.println("Максимальная скорость: " + maxSpeed);
        }
        if (weight != -1) {
            System.out.println("Вес: " + weight);
        }
    }
}