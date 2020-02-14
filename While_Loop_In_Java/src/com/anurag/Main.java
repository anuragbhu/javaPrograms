package com.anurag;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        while (count != 5) {
            System.out.println("Value of count is = " + count);
            count++;
        }

        count = 0;
        while (true) {
            if (count == 5)
                break;
            System.out.println("Value of count is = " + count);
            count++;
        }
    }
}
