package com.anurag;

public class Dog extends Animal {

    @Override
    void eat () {
        System.out.println("Dog eating bread");
    }


    //    @Override
//    void eat() {
//        System.out.println("Dog eating bread");
//    }

    void bark () {
        System.out.println("Dog barking");
    }

    void work () {
        super.eat();
        bark();
        eat();
    }
}
