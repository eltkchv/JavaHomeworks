package com.company;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        first:
        {
            while (true) {
                System.out.println("Enter command:");
                Scanner in = new Scanner(System.in);
                String commandStr = in.nextLine();

                StringTokenizer st = new StringTokenizer(commandStr, "<>");

                if (st.hasMoreTokens()) {
                    StringTokenizer command = new StringTokenizer(st.nextToken(), " ");

                    switch (command.nextToken()) {
                        case "length":
                            System.out.println(st.nextToken().length());
                            break;

                        case "hash":
                            System.out.println(st.nextToken().hashCode());
                            break;

                        case "reverse":
                            System.out.println(reverse(st.nextToken()));
                            break;

                        case "substring":
                            System.out.println(st.nextToken().substring(Integer.parseInt(command.nextToken()),
                                    Integer.parseInt(command.nextToken())));
                            break;

                        case "exit":
                            break first;

                        default:
                            System.out.println("Incorrect command");
                    }
                }
            }
        }
    }

    public static String reverse(String a) {
        String rez = "";

        for (int i = a.length()-1; i >= 0; i--) {
            rez += a.charAt(i);
        }

        return rez;
    }
}