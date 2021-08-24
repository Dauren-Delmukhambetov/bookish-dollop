package com.company;

public class BasicEntry {

    private final String email;
    private final MailAddress address;
    private final String mobilePhone;
    private final String landLinePhone;


    public BasicEntry(MailAddress address, String email, String mobilePhone, String landLinePhone) {
        this.address = address;
        this.email = email;
        this.mobilePhone = mobilePhone;
        this.landLinePhone = landLinePhone;

    }


    public MailAddress getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getLandLinePhone() {
        return landLinePhone;
    }

}
