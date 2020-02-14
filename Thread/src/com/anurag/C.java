package com.anurag;

public class C extends Thread {

    public void run() {
        for(int k = 1; k < 5; k++) {
            System.out.println("k = " + k);
        }
    }
}
