package com.company.library;

import java.util.ArrayList;
import java.util.List;

public class LibraryMain {

    public static void main(String[] args) {

        Author authorBook = new Author("Max", "Block", 1900);
        Book book = new Book(320, authorBook, "Moscow", 2001, "documental", "war");

        Author authorBookTest = new Author("MaxTest", "BlockTest", 1900);
        Book bookTest = new Book(430, authorBookTest, "MoscowTest", 2001, "documental", "warTest");

        Author authorHistoryEgypt = new Author("Ron", "Brown", 1990);
        CombinedEdition historyOfEgypt = new CombinedEdition(500, authorHistoryEgypt, "Cairo", 1945, false, true, true);

        Author authorFilmPoster = new Author("Roman", "Petrov", 1991);
        Posters filmPoster = new Posters(1, authorFilmPoster, "new york", 2020, 1945, false, FrequencyOfPublication.ANNUALLY, "new york");

        Author authorCalambur = new Author("Alex", "Ovanno", 1900);
        Magazine calambur = new Magazine(30, authorCalambur, "minsk", 2005, true);

        Author authorTimes = new Author("John", "Lennon", 1956);
        Newspaper times = new Newspaper(10, authorTimes, "new york", 2020, 1800, true, FrequencyOfPublication.DAILY, true);

        Author authorWarAndPeace = new Author("Lev", "Tolstoy", 1828);
        Book warAndPeace = new Book(200, authorWarAndPeace, "Moscow", 2000, "history", "war and peace");

        System.out.println(book.compareTo(bookTest));

        List<Book> books = new ArrayList<>();
        books.addAll(List.of(book, bookTest));
        System.out.println(books);
        System.out.println(books.size());
        System.out.println(books.isEmpty());
        System.out.println(books.contains(book));
        System.out.println(books.containsAll(List.of(book,bookTest)));
        books.remove(book);
        System.out.println(books);
        System.out.println(books.add(book));
        books.removeAll(List.of(book, bookTest));
        System.out.println(books);
        books.addAll(List.of(book, bookTest));
        System.out.println(books);
        books.clear();
        System.out.println(books);




        List<Edition> editions = new ArrayList<>();
        List<Comparable> items = new ArrayList<>();




    }
}