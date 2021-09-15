package com.company.library;

import java.util.ArrayList;

public abstract class Edition {

    protected int pageNumber;
    protected Author author;
    protected String printingHouse;
    protected int publishingYear;


    protected Edition(int pageNumber, Author author, String printingHouse, int publishingYear) {
        this.pageNumber = pageNumber;
        this.author = author;
        this.printingHouse = printingHouse;
        this.publishingYear = publishingYear;
    }

    protected Edition() {
    }

    public String getPrintingHouse() {
        return printingHouse;
    }

    public void setPrintingHouse(String polygraphy) {
        this.printingHouse = polygraphy;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

}
