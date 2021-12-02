package com.company;

public class Planet {
    private Double distanceToSun;
    private Double mass;
    private Double diameter;

    public Planet(Double distanceToSun, Double mass, Double diameter) {
        this.distanceToSun = distanceToSun;
        this.mass = mass;
        this.diameter = diameter;
    }

    public Double getDistanceToSun() {
        return distanceToSun;
    }

    public void setDistanceToSun(Double distanceToSun) {
        this.distanceToSun = distanceToSun;
    }

    public Double getMass() {
        return mass;
    }

    public void setMass(Double mass) {
        this.mass = mass;
    }

    public Double getDiameter() {
        return diameter;
    }

    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }
}