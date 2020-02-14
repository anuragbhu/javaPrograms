package com.anurag;

public class Main {

    public static void main(String[] args) {

        for (int i = -3; i < 1001; i++) {
            boolean value = prime(i);
            if(value == true) {
                System.out.println(i);
            }
        }
    }

    public static boolean prime (int number) {
        int count = 0;
        if (number > 1) {
            for (int i = 2; i<= number/2; i++) {
                if (number % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                return true;
            }
        }
        return false;
    }
}
