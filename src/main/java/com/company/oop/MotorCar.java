package com.company.oop;

public class MotorCar extends Car {
    private int passengersNumber;
    private String bodyType;



    public MotorCar(int passengersNumber, String bodyType, int numberOfWheel, String color, String engineType) {
        super(numberOfWheel, color, engineType);
        this.passengersNumber = passengersNumber;
        this.bodyType = bodyType;
        System.out.println("The parametrized constructor of MotorCar class has been invoked");
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String makeSound() {
        return "bipbip";
    }
}
