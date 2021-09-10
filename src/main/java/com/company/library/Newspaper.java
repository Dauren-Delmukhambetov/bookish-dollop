package com.company.library;

public class Newspaper extends LeafyEdition {

    protected boolean isFastening;


    protected Newspaper(int pagesNumber, Author author, String printingHouse, int publishingYear, int startPublishingYear, boolean isPeriodical, FrequencyOfPublication frequencyOfPublication, boolean isFastening) {
        super(pagesNumber, author, printingHouse, publishingYear, startPublishingYear, isPeriodical, frequencyOfPublication);
        this.isFastening = isFastening;
    }

    public boolean isFastening() {
        return isFastening;
    }

    public void setFastening(boolean isFastening) {
        this.isFastening = isFastening;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "pageNumber=" + pageNumber +
                ", author=" + author +
                ", printingHouse='" + printingHouse + '\'' +
                ", publishingYear=" + publishingYear +
                ", startPublishingYear=" + startPublishingYear +
                ", isPeriodical=" + isPeriodical +
                ", frequencyOfPublication=" + frequencyOfPublication +
                ", isFastening=" + isFastening +
                '}';
    }
}
