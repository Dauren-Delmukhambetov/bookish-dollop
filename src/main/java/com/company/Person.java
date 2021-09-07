package com.company;

public class Person extends BasicEntry {

    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName, MailAddress address, String email, String mobilePhone, String landLinePhone) {
        super(address, email, mobilePhone, landLinePhone);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return String.format("%s %s %s %s %s %s", firstName, lastName, getAddress(), getEmail(), getMobilePhone(), getLandLinePhone());
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
