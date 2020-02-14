package com.company;

public class Main {

    public static void main(String[] args) {

        byte myByteValue = 64; // width = 8
        short myShortValue = 3000; // width = 16
        int myIntValue = 1232; // width = 32
        long myLongValue = 50000L + 10L * (myByteValue + myShortValue + myIntValue); // width = 64

        System.out.println("My long value is " + myLongValue);

        short mySumTotal = (short) (5 + 2 * (myByteValue + myShortValue + myIntValue));
        System.out.println("My short value is " + mySumTotal);


    }
}
