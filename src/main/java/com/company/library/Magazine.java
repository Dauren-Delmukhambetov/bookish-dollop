package com.company.library;

public class Magazine extends Edition {

    protected boolean isGlossy;

    protected Magazine(int pageNumber, Author author, String printingHouse, int publishingYear, boolean isGlossy) {
        super(pageNumber, author, printingHouse, publishingYear);
        this.isGlossy = isGlossy;
    }

    public boolean isGlossy() {
        return isGlossy;
    }

    public void setGlossy(boolean isGlossy) {
        this.isGlossy = isGlossy;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "author=" + author +
                ", printingHouse='" + printingHouse + '\'' +
                ", publishingYear=" + publishingYear +
                ", isGlossy=" + isGlossy +
                ", pageNumber=" + pageNumber +
                '}';
    }
}
