package com.company.library;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.emptyList;

public class CollectionTask {

    public static void main(String[] args) throws IOException, URISyntaxException {
        System.out.println("This task demos Java Collection Framework");

        // read data from file

        final var lines = getLinesFromFile("books.txt");
        System.out.printf("Lines number we got from file is %d %n", lines.size());

        // instantiate objects
        final var books = instantiateBooks(lines);

        // analyse data
        final var uniqueBooks = findUniqueBooks(books);
        final var uniqueAuthors = findUniqueAuthors(books);
        final var booksByAuthor = groupBooksByAuthors(books);

        // print out result
        System.out.printf("Total number of books in file is %d %n", books.size());
        System.out.printf("Number of unique books in file is %d %n", uniqueBooks.size());
        System.out.printf("Number of unique authors in file is %d %n", uniqueAuthors.size());

        booksByAuthor.entrySet().stream().forEach(entry -> {
            final var author = entry.getKey();
            final var authorBooks = entry.getValue();
            System.out.printf("Author %s %s has %d books in library: %s %n",
                    author.getFirstName(),
                    author.getLastName(),
                    authorBooks.size(),
                    authorBooks);
        });

    }

    private static Map<Author, List<Book>> groupBooksByAuthors(List<Book> books) {
        return books.stream()
                .collect(Collectors.groupingBy(book -> book.author));
    }

    private static Collection<Author> findUniqueAuthors(List<Book> books) {
        return books.stream()
                .map(book -> book.author)
                .collect(Collectors.toSet());
    }

    private static Collection<Book> findUniqueBooks(List<Book> books) {
        return books.stream().distinct().collect(Collectors.toList());

    }

    public static List<String> getLinesFromFile(final String filepath) throws IOException, URISyntaxException {

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
            System.err.println("File 'books.txt' doesn't found");
            return emptyList();
        }
    }


    public static List<Book> instantiateBooks(List<String> lines) {
        List<Book> bookList = new ArrayList<>();
        for (String e : lines) {
            String[] columns = e.split(",");
            try {
                //validate(columns);
                Author author = new Author(columns[0],columns[1]);
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
}


