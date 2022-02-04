package com.uppgift2;


public class Main {
    public static void main(String[] args){
        System.out.println(CarFactory.buildCar(CarType.SPORTSCAR));
        System.out.println(CarFactory.buildCar(CarType.SEDAN));
        System.out.println(CarFactory.buildCar(CarType.SUV));
    }
}
