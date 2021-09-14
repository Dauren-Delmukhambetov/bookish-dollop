package com.company.oop;

import java.io.Serializable;

public class MotorCar extends Car implements Beeper, Comparable<MotorCar>, Serializable, Cloneable {
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
    public String beep() {
        return "beep";
    }

    @Override
    public int compareTo(MotorCar o) {
        if (passengersNumber == o.passengersNumber) {
            return 0;
        }
        return passengersNumber > o.passengersNumber ? 1 : -1;
    }

//    @Override
//    public String makeSound() {
//        return "bipbip";
//    }
}
