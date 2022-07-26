package kz.halykacademy.bookstore.providers;

import kz.halykacademy.bookstore.DTOs.Author;

import java.util.List;

public interface AuthorProvider {
    public List<Author> getAll();
}
