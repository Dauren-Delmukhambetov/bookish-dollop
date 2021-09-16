package com.company.library;

public abstract class LeafyEdition extends Edition {

    protected int startPublishingYear;

    protected boolean isPeriodical;

    protected FrequencyOfPublication frequencyOfPublication;


    protected LeafyEdition(int pagesNumber, Author author, String printingHouse, int publishingYear, int startPublishingYear, boolean isPeriodical, FrequencyOfPublication frequencyOfPublication) {
        super(pagesNumber, author, printingHouse, publishingYear);
        this.startPublishingYear = startPublishingYear;
        this.isPeriodical = isPeriodical;
        this.frequencyOfPublication = frequencyOfPublication;
    }

    public int getStartPublishingYear() {
        return startPublishingYear;
    }

    public boolean isPeriodical() {
        return isPeriodical;
    }

    public void setStartPublishingYear(int startPublishingYear) {
        this.startPublishingYear = startPublishingYear;
    }

    public void setPeriodical(boolean isPeriodical) {
        this.isPeriodical = isPeriodical;
    }

    public FrequencyOfPublication getFrequencyOfPublication() {
        return frequencyOfPublication;
    }

    public void setFrequencyOfPublication(FrequencyOfPublication frequencyOfPublication) {
        this.frequencyOfPublication = frequencyOfPublication;
    }

    @Override
    public String toString() {
        return "LeafyEdition{" +
                "pageNumber=" + pageNumber +
                ", author=" + author +
                ", printingHouse='" + printingHouse + '\'' +
                ", publishingYear=" + publishingYear +
                ", startPublishingYear=" + startPublishingYear +
                ", isPeriodical=" + isPeriodical +
                ", frequencyOfPublication=" + frequencyOfPublication +
                '}';
    }
}

