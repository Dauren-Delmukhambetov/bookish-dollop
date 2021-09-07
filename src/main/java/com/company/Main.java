package com.company;

public class Main {

    public static void main(String[] args) {

        DataWarehouse phoneBook = new DataWarehouse();

        UserDataProcessor userDataProcessor = new UserDataProcessor();

        boolean isCorrect = false;

        do {
            String action = userDataProcessor.getGlobalAction();
            if (action.equalsIgnoreCase("add")) {
                phoneBook.addContact(userDataProcessor.createEntry());
            } else if (action.equalsIgnoreCase("search")) {
                String searchText = userDataProcessor.getSearchParam();
                BasicEntry[] searchResult = phoneBook.searchContactByProperty(searchText);

                for (BasicEntry e : searchResult) {
                    System.out.println("Search result: " + e);
                }
            } else if (action.equalsIgnoreCase("exit")) {
                isCorrect = true;
            } else if (action.equalsIgnoreCase("list")) {
                phoneBook.printEntries();
            } else {
                System.err.println("Pls enter correct action");
            }
        } while (!isCorrect);
    }
}

