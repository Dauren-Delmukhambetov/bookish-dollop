package com.company.library;

public class Book extends MaterialConstruction {

    protected final String genre;

    protected final String bookName;

    protected int volume;

    protected Book(int pageNumber, String author, String printingHouse, String genre, String bookName) {

        this(pageNumber, author, printingHouse, genre, bookName, 0);
    }

    protected Book(int pageNumber, String author, String printingHouse, String genre, String bookName, int volume) {
        super(pageNumber, author, printingHouse);
        this.genre = genre;
        this.bookName = bookName;
        this.volume = volume;
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

}
