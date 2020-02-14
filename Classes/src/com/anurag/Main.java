package com.anurag;

public class Main {

    public static void main(String[] args) {

        Car honda = new Car();
        Car marutiSuzuki = new Car();

        System.out.println("Model is " + honda.getModel());
        honda.setModel("9888");
        System.out.println("Mode is " + honda.getModel());
    }
}
