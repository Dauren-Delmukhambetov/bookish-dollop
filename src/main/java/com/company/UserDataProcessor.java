package com.company;

import java.util.Scanner;

public class UserDataProcessor {

    private final Scanner in = new Scanner(System.in);


    public BasicEntry createEntry() {

        boolean isCorrect;

        BasicEntry entry = null;


        do {
            System.out.println("Pls enter type of entry (person or company)");
            String typeEntry = in.nextLine();
            if (typeEntry.equalsIgnoreCase("person") || typeEntry.equalsIgnoreCase("company")) {
                isCorrect = true;
                System.out.println("Pls enter email");
                String email = in.nextLine();
                System.out.println("Pls enter mobile phone");
                String mobilePhone = in.nextLine();
                System.out.println("Pls enter landline phone");
                String landlinePhone = in.nextLine();
                System.out.println("Pls enter zipcode");
                String zipcode = in.nextLine();
                System.out.println("Pls enter city");
                String city = in.nextLine();
                System.out.println("Pls enter district");
                String district = in.nextLine();
                System.out.println("Pls enter street");
                String street = in.nextLine();
                System.out.println("Pls enter number of house");
                String numberOfHouse = in.nextLine();

                Address address = new Address(city, district, street, numberOfHouse);

                MailAddress mailAddress = new MailAddress(zipcode, address);

                if (typeEntry.equalsIgnoreCase("person")) {
                    System.out.println("Pls enter firstname");
                    String firstName = in.nextLine();
                    System.out.println("Pls enter lastname");
                    String lastName = in.nextLine();
                    entry = new Person(firstName, lastName, mailAddress, email, mobilePhone, landlinePhone);

                } else if (typeEntry.equalsIgnoreCase("company")) {
                    System.out.println("Pls enter company name");
                    String companyName = in.nextLine();
                    entry = new Company(companyName, mailAddress, email, mobilePhone, landlinePhone);
                }
            } else {
                System.err.println("Pls enter correct entry type");
                isCorrect = false;
            }
        } while (!isCorrect);

        return entry;

    }

    //public BasicEntry editEntry() {
    //}

}


