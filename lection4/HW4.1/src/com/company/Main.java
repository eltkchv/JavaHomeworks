package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map<String, Planet> planetMap = new HashMap<String, Planet>();
        planetMap.put("Earth", new Planet(1000000.0, 6400.0, 4000.0));
        planetMap.put("Mercury", new Planet(50000.0, 3000.0, 400.0));
        planetMap.put("Venus", new Planet(70000.0, 4000.0, 1200.0));

        System.out.println("Enter planet name:");
        Scanner in = new Scanner(System.in);
        String key = in.next();
        if(planetMap.containsKey(key)) {
            System.out.println("distance to sun: "+planetMap.get(key).getDistanceToSun() + "\nmass: "+ planetMap.get(key).getMass() + "\ndiameter: "+planetMap.get(key).getDiameter());
        } else {
            System.out.println("Planet "+key+" not found");
        }
    }
}