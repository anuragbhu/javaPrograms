package com.anurag;

public class Main {

    public static void main(String[] args) {

        System.out.println("The sum of digits is = " + digitSum(-3232));
    }

    public static int digitSum (int digit) {
        int sum = 0;
        int rem = 0;

        if (digit >= 0) {
            while (digit != 0) {
                rem = digit % 10;
                sum += rem;
                digit /= 10;
            }
            return sum;
        } else {
            int newDigit = Math.abs(digit);
            while (newDigit != 0) {
                rem = newDigit % 10;
                sum += rem;
                newDigit /= 10;
            }
            return sum;
        }
    }
}
