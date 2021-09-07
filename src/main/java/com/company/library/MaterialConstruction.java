package com.company.library;

public class MaterialConstruction extends Edition{

    protected int pageNumber;
    protected String author;
    protected String printingHouse;

    protected MaterialConstruction(int pageNumber, String author, String printingHouse){
        this.author = author;
        this.printingHouse = printingHouse;
        this.pageNumber = pageNumber;
    }

    public int getPageNumber(){return pageNumber;}

    public void setPageNumber(int pageNumber){this.pageNumber = pageNumber;}

    public String getAuthor(){
        return author;
    }

    public String getPolygraphy(){
        return printingHouse;
    }

    public void setAuthor(String author){this.author = author;}

    public void setPolygraphy(String polygraphy){this.printingHouse = polygraphy;}
}
