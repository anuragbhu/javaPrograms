package com.anurag;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your salary?");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Your age is " + age);

            System.out.println("What's your name?");
            String name = scanner.nextLine();
            System.out.println("Your name is " + name);
        } else {
            System.out.println("Unable to parse");
        }
        scanner.close();
    }
}
