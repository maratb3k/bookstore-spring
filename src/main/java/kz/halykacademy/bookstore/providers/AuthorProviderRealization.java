package kz.halykacademy.bookstore.providers;

import kz.halykacademy.bookstore.DTOs.Author;
import kz.halykacademy.bookstore.DTOs.Book;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class AuthorProviderRealization implements AuthorProvider {

    private static List<Author> authors = List.of(
            new Author(1, "Asem", "Maratbek", "Zhenisovna", LocalDate.of(2002, 06, 23), null),
            new Author(2, "Bekezhan", "Nurlan", "", LocalDate.of(2000, 9, 15), null)
    );

    @Override
    public List<Author> getAll() {
        return authors;
    }
}
