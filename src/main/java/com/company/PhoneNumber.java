package com.company;

public class PhoneNumber {

    private String mobilePhone;
    private String landLinePhone;

    public PhoneNumber (String mobilePhone,String landLinePhone){
        this.mobilePhone = mobilePhone;
        this.landLinePhone = landLinePhone;
    }

    public String getMobilePhone(){
        return mobilePhone;
    }

    public String getLandLinePhone(){
        return landLinePhone;
    }
}
