package com.company.library;

public class CombinedEdition extends Edition {

    private final boolean isContainsAudio;

    private final boolean isContainsVideo;

    private final boolean isContainsImage;

    protected CombinedEdition(int pageNumber, Author author, String printingHouse, int publishingYear, boolean isContainsAudio, boolean isContainsImage, boolean isContainsVideo) {
        super(pageNumber, author, printingHouse, publishingYear);
        this.isContainsAudio = isContainsAudio;
        this.isContainsVideo = isContainsVideo;
        this.isContainsImage = isContainsImage;
    }

    public void setAuthor(Author author) {
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

    public boolean isContainsAudio() {
        return isContainsAudio;
    }

    public boolean isContainsVideo() {
        return isContainsVideo;
    }

    public boolean isContainsImage() {
        return isContainsImage;
    }

    @Override
    public String toString() {
        return "CombinedEdition{" +
                "isContainsAudio=" + isContainsAudio +
                ", isContainsVideo=" + isContainsVideo +
                ", isContainsImage=" + isContainsImage +
                ", author=" + author +
                ", printingHouse='" + printingHouse + '\'' +
                ", publishingYear=" + publishingYear +
                ", pageNumber=" + pageNumber +
                '}';
    }
}
