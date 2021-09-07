package com.company.library;

public class LibraryMain {

    public static void main(String[] args) {

        Book book = new Book(200, "Rowling", "London", "Fantasy", "fil stone");

        CombinedEdition historyOfEgypt = new CombinedEdition(500, "Tven", "Cairo", true, false, true);

        Posters filmPoster = new Posters(1, "test", "new york", 2020, true, FrequencyOfPublication.ANNUALLY, "new york");

        Magazine calambur = new Magazine(30, "magazineAuthor", "minsk", false);

        Newspaper times = new Newspaper(10, "papertest", "new york", 1970, true, FrequencyOfPublication.DAILY, true);

        Book warAndPeace = new Book(200, "tolstoy", "Moscow", "history", "War and Peace", 3);


    }
}