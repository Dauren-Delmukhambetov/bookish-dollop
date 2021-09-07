package com.company.oop;


public abstract class Car extends Vehicle {
    protected int wheelsNumber;
    protected String color;
    protected String engineType;

    protected Car(int numberOfWheel, String color, String engineType) {
        this.wheelsNumber = numberOfWheel;
        this.color = color;
        this.engineType = engineType;
        System.out.println("The parametrized constructor of Car class has been invoked");
    }

    protected Car() {
        System.out.println("The default constructor of Car class has been invoked");
    }

    public int getWheelsNumber() {
        return wheelsNumber;
    }

    public String getColor() {
        return color;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setWheelsNumber(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public abstract String makeSound();


}


