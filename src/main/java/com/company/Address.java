package com.company;

public class Address {

    private String city;
    private String district;
    private String street;
    private String numberOfHouse;

    public Address(String cit, String dist, String str, String noh) {
        city = cit;
        district = dist;
        street = str;
        numberOfHouse = noh;
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
