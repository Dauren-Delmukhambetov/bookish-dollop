package com.company.library;

public abstract class Edition {

    protected String author;
    protected String printingHouse;
    protected int publishingYear;

    protected Edition(String author, String printingHouse, int publishingYear){
        this.author = author;
        this.printingHouse = printingHouse;
        this.publishingYear = publishingYear;
    }

    protected Edition(){
            }

    public String getAuthor(){
        return author;
    }

    public String getPolygraphy(){
        return printingHouse;
    }

    public void setAuthor(String author){this.author = author;}

    public void setPolygraphy(String polygraphy){this.printingHouse = polygraphy;}

    public int getPublishingYear(){return publishingYear;}

    public void setPublishingYear(int publishingYear){this.publishingYear = publishingYear;}
}
