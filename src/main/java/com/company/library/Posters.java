package com.company.library;

public class Posters extends LeafyEdition {

    protected String placeOfExhibiting;

    protected Posters(int pagesNumber, String author, String printingHouse, int startPublishingYear, boolean isPeriodical, FrequencyOfPublication frequencyOfPublication, String placeOfExhibiting) {
        super(pagesNumber, author, printingHouse, startPublishingYear, isPeriodical, frequencyOfPublication);
        this.placeOfExhibiting = placeOfExhibiting;
    }

    public String getPlaceOfExhibiting(){return placeOfExhibiting;}

    public void setPlaceOfExhibiting(String placeOfExhibiting){this.placeOfExhibiting = placeOfExhibiting;}
}


