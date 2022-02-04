package com.uppgift2;

public class SuvCar extends Car{

    SuvCar(){
        super(CarType.SUV);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building Suv");
    }
}
