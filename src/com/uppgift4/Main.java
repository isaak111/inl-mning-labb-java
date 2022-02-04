package com.uppgift4;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> primes = new ArrayList<Integer>();

        Thread thread1 = new Thread(new PrimeChecker(0, 250000, primes));
        Thread thread2 = new Thread(new PrimeChecker(250001,500000, primes));
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        System.out.println(primes.size());
    }
}
