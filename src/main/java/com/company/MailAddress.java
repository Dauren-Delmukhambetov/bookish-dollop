package com.company;

public class MailAddress {

    private Address address;
    private String email;
    private String zipCode;

    public MailAddress (String email,String zipCode, Address address){
        this.email = email;
        this.zipCode = zipCode;
        this.address = address;
    }

    public Address getAddress(){
        return address;
    }

    public String getEmail(){
        return email;
    }

    public String getZipCode(){
        return zipCode;
    }


}
