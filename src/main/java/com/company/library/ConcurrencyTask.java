package com.company.library;

import java.util.*;
import java.util.function.BiConsumer;

public class ConcurrencyTask {

    public static void main(String[] args) throws InterruptedException {
        var time = System.currentTimeMillis();
        System.out.printf("%s: This task demos Java Concurrency %n", Thread.currentThread().getName());

        //parallel
        var booksDocumentCollection = new CollectionTask("books.txt");
        var novelsDocumentCollection = new CollectionTask("novels.txt");
        booksDocumentCollection.start();
        novelsDocumentCollection.start();
        booksDocumentCollection.waitAuthors();
        novelsDocumentCollection.waitAuthors();

        //consequently
        /*var booksDocumentCollection = new CollectionTask("books.txt");
        booksDocumentCollection.start();
        booksDocumentCollection.join();
        var novelsDocumentCollection = new CollectionTask("novels.txt");
        novelsDocumentCollection.start();
        novelsDocumentCollection.join();*/

        Map<Author, Set<Book>> authors = new HashMap<>(novelsDocumentCollection.getAllAuthors());
        booksDocumentCollection.getAllAuthors().forEach((author, books) ->
                authors.merge(author, books, (value1, value2) -> {
                    value1.addAll(value2);
                    return value1;
                }));

        authors.entrySet().stream().forEach(entry -> {
            var author = entry.getKey();
            var authorBooks = entry.getValue();
                        System.out.printf("Author %s %s has %d books in library: %s %n",
                    author.getFirstName(),
                    author.getLastName(),
                    authorBooks.size(),
                    authorBooks);
        });

        System.out.println("Program completed in " + (System.currentTimeMillis() - time) + " ms");
    }

}
