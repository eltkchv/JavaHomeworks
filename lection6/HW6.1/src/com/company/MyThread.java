package com.company;

import java.math.BigInteger;

public class MyThread extends Thread{

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        int k = 0;
        for (int i = 3000000; i<= 6000000; i++) {
            BigInteger bi = BigInteger.valueOf(i);
            if (bi.isProbablePrime((int) Math.log(i))) {
                k++;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("Number is: "+k+ "\nProcessing took "+(end-start)+" milliseconds");
    }
}