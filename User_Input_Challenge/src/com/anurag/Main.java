package com.anurag;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int sum = 0;
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int frequency = count + 1;
            System.out.println("Enter number #" + frequency + " :");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
                if (count == 10)
                    break;
            } else
                System.out.println("Invalid number");
            scanner.nextLine();
        }
        System.out.println("Sum of numbers is = " + sum);
        scanner.close();
    }
}
