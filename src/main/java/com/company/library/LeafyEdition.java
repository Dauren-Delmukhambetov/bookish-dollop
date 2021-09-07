package com.company.library;

public abstract class LeafyEdition extends MaterialConstruction {

    protected int startPublishingYear;

    protected boolean isPeriodical;

    protected FrequencyOfPublication frequencyOfPublication;


    protected LeafyEdition(int pagesNumber, String author, String printingHouse, int startPublishingYear, boolean isPeriodical, FrequencyOfPublication frequencyOfPublication) {
        super(pagesNumber, author, printingHouse);
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
}

