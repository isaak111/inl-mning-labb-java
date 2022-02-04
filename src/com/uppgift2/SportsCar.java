package com.uppgift2;

public class SportsCar extends Car {

    SportsCar() {
        super(CarType.SPORTSCAR);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building sports car");
    }
}
