package com.company;


public class DataWarehouse {

    private final BasicEntry[] phoneBook = new BasicEntry[10];

    int counter = 0;

    public void addContact(BasicEntry basicEntry) {
        phoneBook[counter] = basicEntry;
        counter++;
        System.out.println("Adding entry: " + phoneBook[counter - 1].toString());
    }

    public void printEntries() {

        System.out.println("List of contacts: ");

        for (BasicEntry e : phoneBook) {
            if (e != null){
                System.out.println(e);
            }
        }
    }

    public BasicEntry editContact(BasicEntry basicEntry, Integer counter) {
        return phoneBook[counter] = basicEntry;
    }

    public BasicEntry searchContactByNumber(BasicEntry basicEntry, Integer counter) {
        return phoneBook[counter] = basicEntry;
    }

    public BasicEntry[] searchContactByProperty(String property) {
        int j = 0;
        BasicEntry[] searchedContacts = new BasicEntry[10];

        property = property.trim();

        if (property.isEmpty()) {
            System.out.println("Pls enter valid value");
        } else {
            for (BasicEntry basicEntry : phoneBook) {

                if (basicEntry == null) {
                    continue;
                }
                if (basicEntry.toString().toLowerCase().contains(property.toLowerCase())) {
                    searchedContacts[j] = basicEntry;
                    j++;
                }
            }

            if (j == 0) {
                System.out.println("Sorry we can't found any contacts");
            }
        }

        BasicEntry[] cutSearchedContacts = new BasicEntry[j];
        for (int i = 0; i < j; i++) {
            if (searchedContacts[i] != null) {
                cutSearchedContacts[i] = searchedContacts[i];
            }

        }

        return cutSearchedContacts;
    }

}
