package com.company.library;

public class Newspaper extends LeafyEdition {

    protected boolean isFastening;


    protected Newspaper(int pagesNumber, String author, String printingHouse, int startPublishingYear, boolean isPeriodical, FrequencyOfPublication frequencyOfPublication, boolean isFastening) {
        super(pagesNumber, author, printingHouse, startPublishingYear, isPeriodical, frequencyOfPublication);
        this.isFastening = isFastening;
    }

    public boolean isFastening() {
        return isFastening;
    }

    public void setFastening(boolean isFastening) {
        this.isFastening = isFastening;
    }

}
