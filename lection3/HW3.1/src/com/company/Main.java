package com.company;

public class Main {

    public static void main(String[] args) {
        NumberParams number1 = new NumberParams(-3, 3);
        NumberParams number2 = new NumberParams(1, 2);

        System.out.println(" real number1 + real number2 = " + new Numbers().add(number1, number2).getReal() + "\n" +
                " real number1 - real number2 = " + new Numbers().subtract(number1, number2).getReal() + "\n" +
                "real number1 * real number2 = " + new Numbers().multiply(number1, number2).getReal() + "\n" +
                "real number1 / real number2 = " + new Numbers().divide(number1, number2).getReal() + "\n");

        NumberParams addition = new ComplexNumbers().add(number1, number2);
        NumberParams subtraction = new ComplexNumbers().subtract(number1, number2);
        NumberParams division = new ComplexNumbers().divide(number1, number2);
        NumberParams multiplication = new ComplexNumbers().multiply(number1, number2);

        System.out.println("img number1 + img number2 = " + addition.getReal() + " + " + addition.getImaginary() + "i\n" +
                "img number1 - img number2 = " + subtraction.getReal() + " + " + subtraction.getImaginary() + "i\n" +
                "img number1 * img number2 = " + multiplication.getReal() + " + " + multiplication.getImaginary() + "i\n" +
                "img number1 / img number2 = " + division.getReal() + " + " + division.getImaginary() + "i\n");
    }
}