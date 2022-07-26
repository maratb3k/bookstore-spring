package kz.halykacademy.bookstore.services;

import kz.halykacademy.bookstore.DTOs.Author;
import kz.halykacademy.bookstore.DTOs.Book;

import java.util.List;

public interface AuthorService {

    Author saveAuthor(Author author);
    List<Author> saveAuthors(List<Author> authors);
    Author getAuthor(long id);
    List<Author> getAuthors();
    Author updateAuthor(Author author);
    String deleteAuthor(long id);

}
