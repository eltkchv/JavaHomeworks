package com.company;

public class Student {
    private String name;
    private int age;
    private double averageScore;

    public Student(String n, int a, double aS) {
        this.name = n;
        this.age = a;
        this.averageScore = aS;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getAverageScore() {
        return averageScore;
    }
}