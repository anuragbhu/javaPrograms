package com.anurag;

public class Animal {

    private String animalName;
    private int noOfLegs;
    private String coat;

    public Animal(String animalName, int noOfLegs, String coat) {
        this.animalName = animalName;
        this.noOfLegs = noOfLegs;
        this.coat = coat;
    }

    public Animal() {

    }

    public String getAnimalName() {
        return animalName;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public String getCoat() {
        return coat;
    }

    public void eat() {
        System.out.println("Animals always eat.");
    }
}
