package com.anurag;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        A a = new A();
        B b = new B();
        C c = new C();

        a.start();
        b.start();
        c.start();
    }
}
