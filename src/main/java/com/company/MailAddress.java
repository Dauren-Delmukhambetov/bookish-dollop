package com.company;

public class MailAddress {

    private final Address address;
    private final String zipCode;

    public MailAddress(String zipCode, Address address) {
        this.zipCode = zipCode;
        this.address = address;
    }

    public String toString() {
        return String.format("%s %s", address, zipCode);
    }

    public Address getAddress() {
        return address;
    }

    public String getZipCode() {
        return zipCode;
    }


}
