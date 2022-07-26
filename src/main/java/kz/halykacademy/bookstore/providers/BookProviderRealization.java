package kz.halykacademy.bookstore.providers;

import kz.halykacademy.bookstore.DTOs.Book;

import java.util.Collections;
import java.util.List;

public class BookProviderRealization implements BookProvider {

    private static List<Book> books = List.of(
            new Book(1, 1200, null, null, "aaaa", 120, 2015),
            new Book(2, 700, null, null, "bbaa", 100, 2017)
    );

    @Override
    public List<Book> getAll() {
        return books;
    }

}
