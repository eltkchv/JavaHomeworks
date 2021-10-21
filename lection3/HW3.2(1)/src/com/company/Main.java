package com.company;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string:");

        String input = scanner.nextLine();
        StringTokenizer words = new StringTokenizer(input, " ");

        String max_word = "";
        int x = 0;
        int letters = 0;

        while (words.hasMoreTokens()) {
            String word = words.nextToken();
            x++;
            letters += word.length();

            if (word.length() > max_word.length()) {
                max_word = word;
            }
        }

        System.out.println("\nNumber of words: " + x + "\nNumber of letters: " + letters + "\nLongest word: " + max_word);
    }
}