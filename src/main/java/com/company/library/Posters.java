package com.company.library;

public class Posters extends LeafyEdition {

    protected String placeOfExhibiting;

    protected Posters(int pagesNumber, Author author, String printingHouse,int publishingYear, int startPublishingYear, boolean isPeriodical, FrequencyOfPublication frequencyOfPublication, String placeOfExhibiting) {
        super(pagesNumber, author, printingHouse, publishingYear, startPublishingYear, isPeriodical, frequencyOfPublication);
        this.placeOfExhibiting = placeOfExhibiting;
    }

    public String getPlaceOfExhibiting(){return placeOfExhibiting;}

    public void setPlaceOfExhibiting(String placeOfExhibiting){this.placeOfExhibiting = placeOfExhibiting;}

    @Override
    public String toString() {
        return "Posters{" +
                "pageNumber=" + pageNumber +
                ", author=" + author +
                ", printingHouse='" + printingHouse + '\'' +
                ", publishingYear=" + publishingYear +
                ", startPublishingYear=" + startPublishingYear +
                ", isPeriodical=" + isPeriodical +
                ", frequencyOfPublication=" + frequencyOfPublication +
                ", placeOfExhibiting='" + placeOfExhibiting + '\'' +
                '}';
    }
}


