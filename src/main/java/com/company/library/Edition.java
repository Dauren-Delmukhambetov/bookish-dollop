package com.company.library;

import java.util.ArrayList;
import java.util.Objects;

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

    protected Edition(Author author, int publishingYear) {
        this.publishingYear = publishingYear;
        this.author = author;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edition edition = (Edition) o;
        return pageNumber == edition.pageNumber && publishingYear == edition.publishingYear && Objects.equals(author, edition.author) && Objects.equals(printingHouse, edition.printingHouse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageNumber, author, printingHouse, publishingYear);
    }
}
