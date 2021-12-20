package com.company;

import java.math.BigInteger;

public class MyThread extends Thread {
    int n1;
    int n2;
    long summ;

    public MyThread(int a, int b) {
        this.n1 = a;
        this.n2 = b;
    }

    @Override
    public  void run() {
        long start = System.currentTimeMillis();
        int k = 0;
        for (int i = n1; i<= n2; i++) {
            BigInteger bi = BigInteger.valueOf(i);
            if (bi.isProbablePrime((int) Math.log(i))) {
                k++;
            }
        }
        long end = System.currentTimeMillis();

        this.summ = end-start;
        System.out.println("\nNumber is: "+k+";\nCounting in "+n1+" : "+n2+ "\nProcess "+this.getName()+" took "+summ+" milliseconds");
    }
}