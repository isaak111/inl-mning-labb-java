package com.uppgift2;

public class CarFactory {
    public static Car buildCar(CarType model) {
        Car car = null;
        switch (model){
            case SEDAN :
                car = new Sedan();
                break;

            case SPORTSCAR:
                car = new SportsCar();
                break;

            case SUV:
                car = new SuvCar();
                break;

            default:
                System.out.println("ånej");
                break;
        }
        return car;
    }
}

