package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        final int x = 3000000;
        final int y = 6000000;

        MyThread[] threads = new MyThread[n];

        int gap = (y - x)/n;

        int n1 = x;
        int n2 = n1+gap;

        for (int i = 0; i < n; i++){
            MyThread thread = new MyThread(n1, n2);
            thread.setName("thread"+i);
            threads[i] = thread;
            n1 = n2;
            n2 = n1+gap;
        }
        int summ = 0;
        for (MyThread thread : threads) {
            thread.start();
            thread.join();
            summ += thread.summ;
        }
        long end = System.currentTimeMillis();
        System.out.println("\n\nTotal processes time: " + summ +
                "\nTotal app time: "+(end-start));
    }
}