package com.company.library;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.emptyList;
import static java.util.stream.Collectors.toSet;

public class CollectionTask extends Thread {
    private String fileName;
    private Map<Author, Set<Book>> allAuthors;
    private Author author;
    private List<Book> value;


    public static void main(String[] args) {

    }

    CollectionTask(String fileName) {
        this.fileName = fileName;
        this.allAuthors = new HashMap<>();
        setName(String.format("Thread for %s file", this.fileName));
    }

    public void waitAuthors() {
        try {
            join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Map<Author, Set<Book>> getAllAuthors() {
        return this.allAuthors;
    }

    public Author getAuthor() {
        return this.author;
    }

    public List<Book> getValue() {
        return this.value;
    }

    private Map<Author, Set<Book>> groupBooksByAuthors(List<Book> books) {
        return books.stream()
                .collect(Collectors.groupingBy(book -> book.author, toSet()));
    }

    private Collection<Author> findUniqueAuthors(List<Book> books) {
        return books.stream()
                .map(book -> book.author)
                .collect(toSet());
    }

    private Collection<Book> findUniqueBooks(List<Book> books) {
        return books.stream().distinct().collect(Collectors.toList());

    }

    public List<String> getLinesFromFile(final String filepath) throws IOException, URISyntaxException {

        try {
            return Files.lines(
                            Path.of(
                                    CollectionTask.class
                                            .getClassLoader()
                                            .getResource(filepath)
                                            .toURI()
                            )
                    )
                    .toList();
        } catch (NullPointerException e) {
            System.err.println("File" + fileName + "doesn't found");
            return emptyList();
        }
    }


    public List<Book> instantiateBooks(List<String> lines) {
        List<Book> bookList = new ArrayList<>();
        for (String e : lines) {
            String[] columns = e.split(",");
            try {
                //validate(columns);
                Author author = new Author(columns[0], columns[1]);
                author.validate();
                bookList.add(new Book(author, columns[2], Integer.parseInt(columns[3])));

            } catch (NumberFormatException ex) {
                System.err.println("Wrong data format at document: " + e);
            } catch (AuthorValidationException ey) {
                System.err.println(ey.getMessage());
            }
        }
        return bookList;

    }

    @Override
    public void run() {
        System.out.printf("%s: This task demos Java Concurrency %n", Thread.currentThread().getName());
        System.out.println("This task demos Java Collection Framework");

        // read data from file

        List<String> lines = null;
        try {
            lines = getLinesFromFile(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        System.out.printf("Lines number we got from file is %d %n", lines.size());

        // instantiate objects
        final var books = instantiateBooks(lines);

        // analyse data
        final var uniqueBooks = findUniqueBooks(books);
        final var uniqueAuthors = findUniqueAuthors(books);
        final var booksByAuthor = groupBooksByAuthors(books);
        this.allAuthors = this.groupBooksByAuthors(books);

        // print out result
        System.out.printf("Total number of books in file is %d %n", books.size());
        System.out.printf("Number of unique books in file is %d %n", uniqueBooks.size());
        System.out.printf("Number of unique authors in file is %d %n", uniqueAuthors.size());

        booksByAuthor.entrySet().stream().forEach(entry -> {
            final var author = entry.getKey();
            final var authorBooks = entry.getValue();
            /*System.out.printf("Author %s %s has %d books in library: %s %n",
                    author.getFirstName(),
                    author.getLastName(),
                    authorBooks.size(),
                    authorBooks);*/
        });


    }
}


