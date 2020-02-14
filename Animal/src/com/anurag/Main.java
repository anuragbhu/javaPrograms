package com.anurag;

public class Main {

    public static void main(String[] args) {

        Animal cat = new Animal();
        Cat cutie = new Cat("cutie", "soft", "yes", "very cute");
        System.out.println(cutie.getCute());
        cutie.eat();
        Cat.WhiteBlack myFavourate = cutie.new WhiteBlack("White & Black", "ILU");
        myFavourate.lastLines();

    }
}
