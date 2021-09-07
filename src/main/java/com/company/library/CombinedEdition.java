package com.company.library;

public class CombinedEdition extends MaterialConstruction {

    protected boolean isContainsAudio;

    protected boolean isContainsVideo;

    protected boolean isContainsImage;

    protected CombinedEdition(int pageNumber, String author, String polygraphy, boolean isContainsAudio, boolean isContainsImage, boolean isContainsVideo) {
        super(pageNumber, author, polygraphy);
        this.isContainsAudio = isContainsAudio;
        this.isContainsVideo = isContainsVideo;
        this.isContainsImage = isContainsImage;
    }

    public boolean isContainsAudio() {
        return isContainsAudio;
    }

    public boolean isContainsVideo() {
        return isContainsVideo;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPolygraphy(String polygraphy) {
        this.printingHouse = polygraphy;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
