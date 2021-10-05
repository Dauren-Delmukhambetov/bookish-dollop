package com.company.library;

import java.util.ArrayList;
import java.util.Objects;

public class Book extends Edition implements Comparable<Book> {

    protected String genre;

    protected final String bookName;

    protected int volume;

    protected Book(int pageNumber, Author author, String printingHouse, int publishingYear, String genre, String bookName) {
        this(pageNumber, author, printingHouse, publishingYear, genre, bookName, 0);


    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return volume == book.volume && Objects.equals(genre, book.genre) && Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), genre, bookName, volume);
    }

    @Override
    public String toString() {
        return "\nBook{" +
                " bookName='" + bookName + '\'' +
                ", author=" + author +
                ", publishingYear=" + publishingYear +
                "}";
    }

    protected Book(int pageNumber, Author author, String printingHouse, int publishingYear, String genre, String bookName, int volume) {
        super(pageNumber, author, printingHouse, publishingYear);
        this.genre = genre;
        this.bookName = bookName;
        this.volume = volume;
    }

    protected Book(Author author, String bookName, int publishingYear) {
        super(author, publishingYear);
        this.bookName = bookName;
    }


    public String getGenre() {
        return genre;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getBookName() {
        return bookName;
    }


    @Override
    public int compareTo(Book o) {
        if (pageNumber == o.pageNumber) {
            return 0;
        }
        return pageNumber > o.pageNumber ? 1 : -1;
    }


}
