package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String flag = "y";
        StringBuilder result = new StringBuilder();
        int k = 0;
        Scanner in = new Scanner(System.in);

        while (flag.equals("y")) {
            k++;
            System.out.println("Enter string part:");
            result.append(in.nextLine());
            System.out.println("Do you want to continue? (y/n)");
            flag = in.nextLine();
        }
        System.out.println("\nResult string: " + result +
                "\nLength: " + result.length() +
                "\nIterations: " + k);
    }
}