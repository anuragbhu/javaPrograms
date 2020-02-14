package com.anurag;

public class Main {

    public static void main(String[] args) {

        String myString = "My name is Anurag";
        System.out.println(myString);
        myString += " and this is more.";
        System.out.println(myString);
        myString += " \u00A9 2019.";
        System.out.println(myString);

        String numString = "12.23";
        numString += "00";
        System.out.println(numString);
        int myIntValue = 50;
        numString += myIntValue;
        System.out.println(numString);
        double myDoubleValue = 12d;
        numString += myDoubleValue;
        System.out.println(numString);
    }
}
