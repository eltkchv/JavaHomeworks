package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        String ans = "y";
        Scanner in = new Scanner(System.in);
        while (ans.equals("y")) {
            System.out.print("Enter the name: ");
            String n = in.next();
            System.out.print("Enter the age: ");
            int a = in.nextInt();
            System.out.print("Enter the average score: ");
            double aS = in.nextDouble();

            Student s = new Student(n, a, aS);

            students.add(s);

            System.out.print("Do you want to continue? (y/n): ");
            ans = in.next();
        }
        Iterator<Student> i = students.iterator();
        Student best = students.get(0);
        while (i.hasNext()) {
            Student curr = i.next();
            if (curr.getAverageScore() > best.getAverageScore()) {
                best = curr;
            }
        }
        System.out.println("""
                The best student is:
                Name:\040"""+best.getName()+"""
                Age:\040"""+best.getAge()+"""
                Average score:\040"""+best.getAverageScore()+"""
                """);
    }
}