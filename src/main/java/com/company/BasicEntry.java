package com.company;

public class BasicEntry {

    private String firstName;
    private String lastName;
    private MailAddress address;
    private PhoneNumber phoneNumber;

    public BasicEntry(String firstName, String lastName, MailAddress address, PhoneNumber phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public MailAddress getAddress() {
        return address;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

}
