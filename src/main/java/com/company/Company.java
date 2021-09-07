package com.company;

public class Company extends BasicEntry {

    private final String companyName;

    public Company(String companyName, MailAddress address, String email, String mobilePhone, String landLinePhone) {
        super(address, email, mobilePhone, landLinePhone);
        this.companyName = companyName;
    }

    public String toString() {
        return String.format("%s %s %s %s %s", companyName, getAddress(), getEmail(), getMobilePhone(), getLandLinePhone());
    }

    public String getCompanyName() {
        return companyName;
    }
}
