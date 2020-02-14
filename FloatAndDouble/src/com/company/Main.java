package com.company;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 10;
        float myFloatValue = 5f / 2f;
        double myDoubleValue = 15d / 2d;

        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);


        double myPoundValue = 100d;
        double myKilogramValue = 0.45359237d * myPoundValue;
        System.out.println("My Kilogram value is " + myKilogramValue);
    }
}
