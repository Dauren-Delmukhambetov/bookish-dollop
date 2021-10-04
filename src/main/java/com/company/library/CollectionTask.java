package com.company.library;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Collections.emptyList;
import static java.util.Collections.emptyMap;

public class CollectionTask {

    public static void main(String[] args) throws IOException, URISyntaxException {
        System.out.println("This task demos Java Collection Framework");


        // read data from file

        final var lines = getLinesFromFile("book.txt");
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

        /*for (final var e : booksByAuthor.entrySet()) {
            final var author = e.getKey();
            final var authorBooks = e.getValue();
            System.out.printf("Author %s %s has %d books in library: %s %n",
                    author.getFirstName(),
                    author.getLastName(),
                    authorBooks.size(),
                    authorBooks);

        }*/

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
        /*Map<Author, List<Book>> listMap = new HashMap<>();
        for (Book book : books) {
            if (!listMap.containsKey(book.author)) {
                listMap.put(book.author, new ArrayList<>());
            }
            listMap.get(book.author).add(book);

        }*/
        return books.stream()
                .collect(Collectors.groupingBy(book -> book.author));
    }

    //TODO change return type to appropriate one
    private static Collection<Author> findUniqueAuthors(List<Book> books) {
        //TODO return only unique authors
        /*Set<Author> uniqueAuthors = new HashSet<>();
        for (Book book : books) {
            uniqueAuthors.add(book.author);
        }*/
        return books.stream()
                .map(book -> book.author)
                .collect(Collectors.toSet());
    }

    //TODO change return type to appropriate one
    private static Collection<Book> findUniqueBooks(List<Book> books) {
        //TODO return only unique books
        //return new HashSet<>(books);

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
        //TODO parse string, instantiate Author and Book classes and return list of books
        List<Book> bookList = new ArrayList<>();


            for (String e : lines) {
                String[] columns = e.split(",");
                try {
                    bookList.add(new Book(new Author(columns[0], columns[1]), columns[2], Integer.parseInt(columns[3])));
                } catch (NumberFormatException ex) {
                    System.err.println("Wrong data format at document: " + e);
                }
            }
            return bookList;


            //Pattern exampleString = Pattern.compile(("[a-zA-Z]+,[a-zA-Z]+,[a-zA-Z\\w-\\d]*,\\d{4}"), Pattern.CASE_INSENSITIVE);




        /*try {

            return lines.stream()
                    .map(s -> s.split(","))
                    .map(s -> new Book(new Author(s[0], s[1]), s[2], Integer.parseInt(s[3])))
                    .sorted((Comparator.comparingInt(Book::getPublishingYear))
                            .reversed())
                    .collect(Collectors.toList());
        }catch (NumberFormatException e){
            System.err.println("Wrong data format at document");


        }*/


        }
    }
