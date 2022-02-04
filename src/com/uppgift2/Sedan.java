package com.uppgift2;

public class Sedan extends Car {

    Sedan() {
        super(CarType.SEDAN);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building Sedan");
    }
}
