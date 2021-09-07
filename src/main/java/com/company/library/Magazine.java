package com.company.library;

public class Magazine extends MaterialConstruction{

    protected boolean isGlossy;

    protected Magazine(int pageNumber, String author, String polygraphy, boolean isGlossy) {
        super(pageNumber, author, polygraphy);
        this.isGlossy = isGlossy;
    }

    public boolean isGlossy(){return isGlossy;}

    public void setGlossy(boolean isGlossy){this.isGlossy = isGlossy;}
}
