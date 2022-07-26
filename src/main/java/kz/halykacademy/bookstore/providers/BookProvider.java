package kz.halykacademy.bookstore.providers;

import kz.halykacademy.bookstore.DTOs.Book;

import java.util.List;
import java.util.stream.Stream;

public interface BookProvider {
    public List<Book> getAll();
}
