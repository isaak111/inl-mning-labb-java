package com.uppgift2;

public abstract class Car {

    public  Car(CarType model) {
        this.model = model;
        arrangeparts();
    }

    private void arrangeparts(){

    }

    protected abstract void construct();

    private CarType model = null;

    public CarType getModel() {
        return model;
    }
    public void setModel(CarType model) {
        this.model = model;
    }
}
