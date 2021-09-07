package com.company;

public class Address {

    private String city;
    private String district;
    private String street;
    private String numberOfHouse;

    public Address(String city, String district, String street, String numberOfHouse) {
        this.city = city;
        this.district = district;
        this.street = street;
        this.numberOfHouse = numberOfHouse;
    }

    public String toString() {
        return String.format("%s %s %s %s", city, district, street, numberOfHouse);
    }

    public String getCity() {
        return city;
    }

    public String getDistrict() {
        return district;
    }

    public String getStreet() {
        return street;
    }

    public String getNumberOfHouse() {
        return numberOfHouse;
    }
}
