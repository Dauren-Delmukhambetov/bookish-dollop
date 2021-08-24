package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        DataWarehouse phoneBook = new DataWarehouse();

        UserDataProcessor userDataProcessor = new UserDataProcessor();

        phoneBook.addContact(userDataProcessor.createEntry());






    }
}

