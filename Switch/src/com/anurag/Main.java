package com.anurag;

public class Main {

    public static void main(String[] args) {

        char myChar = 'B';
        switch(myChar) {
//            case 'A':
//                System.out.println("Character A found");
//                break;
//            case 'B':
//                System.out.println("Character B found");
//                break;
//            case 'C':
//                System.out.println("Character C found");
//                break;
//            case 'D':
//                System.out.println("Character D found");
//                break;
//            case 'E':
//                System.out.println("Character E found");
//                break;
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Character " + myChar + " found.");
                break;
            default:
                System.out.println("Character not found");
                break;
        }

        String myString = "JaNuArY";
        switch(myString.toLowerCase()) {
            case "january":
                System.out.println("Found January month");
                break;
            case "december":
                System.out.println("Found December month");
                break;
        }
    }
}
