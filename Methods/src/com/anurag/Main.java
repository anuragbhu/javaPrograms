package com.anurag;

public class Main {

    public static void main(String[] args) {

        //System.out.println("Marks scored in third semester is = " + sumOfScore(82, 90, 84, 88, 2));
        // OR


        //int cs206, cs208, cs111, cs501, minor;
        // System.out.println("Marks scored in third semester is = " + sumOfScore(85, 55, 98, 98, 74));
        //OR

        int cs206 = 55;
        int cs208 = 54;
        int cs111 = 35;
        int cs501 = 78;
        int minor = 78;
        System.out.println("Marks scored in third semester is = " + sumOfScore(cs206, cs208, cs111, cs501, minor));
    }

    public static int sumOfScore (int cs206, int cs208, int cs111, int cs501, int minor) {
        int sum;
        if (cs206 >= 33 && cs208 >= 33 && cs111 >= 33 && cs501 >= 33 && minor >= 33) {
            sum = cs206 + cs208 + cs111 + cs501 + minor;
            return sum;
        } //else {
//            return -1;
//      }
        return -1;
    }
}
