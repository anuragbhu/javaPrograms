package com.anurag;

public class Main {

    public static void main(String[] args) {

        for (int i = 2; i < 9; i++) {
            System.out.println("Calculated interest rate is " + String.format("%.3f", calcInterest(10000, i)));
        }
    }

    public static double calcInterest(double principal, double interest) {
        return ((principal * interest) / 100);
    }
}