package com.anurag;

public class Main {

    public static void main(String[] args) {

        System.out.println("The result of conversion is = " + calcFeetAndInchesToCentimeters(6, 1));
        System.out.println("The result of conversion is = " + calcFeetAndInchesToCentimeters(11));
    }

    public static float calcFeetAndInchesToCentimeters (int feet, float inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            float centimeters = (feet * 12f * 2.54f) + (inches * 2.54f);
            return centimeters;
        }
        return -1;
    }

    public static float calcFeetAndInchesToCentimeters (float inches) {
        if (inches >= 0) {
            int feet = (int) (inches / 12);
            float remainingInches = (inches % 12);
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
        return -1;
    }
}
