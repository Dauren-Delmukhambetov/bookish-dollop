package com.company;


import java.util.Locale;

public class DataWarehouse {

    private final BasicEntry[] phoneBook = new BasicEntry[10];

    int counter = 0;

    public void addContact(BasicEntry basicEntry) {
        phoneBook[counter] = basicEntry;
        counter++;

    }

    public BasicEntry editContact(BasicEntry basicEntry, Integer counter) {
        return phoneBook[counter] = basicEntry;
    }

    public BasicEntry searchContactByNumber(BasicEntry basicEntry, Integer counter) {
        return phoneBook[counter] = basicEntry;
    }



    public BasicEntry[] searchContactByProperty(BasicEntry basicEntry, String property) {
        int j = 0;
        BasicEntry[] searchedContacts = new BasicEntry[10];

        for (int i = 0; i < phoneBook.length; i++) {


            if (phoneBook[i].toString().toLowerCase(Locale.ROOT).contains(property.toLowerCase(Locale.ROOT))) {
                System.out.println("Result of search" + phoneBook[i]);
                searchedContacts[j] = phoneBook[i];
                j++;
            }
        }
        if (j == 0) {
            System.out.println("Sorry we can't found any contacts");
        }
        return searchedContacts;
    }


    public DataWarehouse() {
        }


    }
