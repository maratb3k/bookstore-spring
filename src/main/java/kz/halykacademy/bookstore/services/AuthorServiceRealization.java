package kz.halykacademy.bookstore.services;

import kz.halykacademy.bookstore.DTOs.Author;
import kz.halykacademy.bookstore.DTOs.Book;
import kz.halykacademy.bookstore.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceRealization implements AuthorService{

    private AuthorRepository authorRepository;

    public AuthorServiceRealization(AuthorRepository repository) {
        this.authorRepository = repository;
    }

    @Override
    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public List<Author> saveAuthors(List<Author> authors) {
        return authorRepository.saveAll(authors);
    }

    @Override
    public Author getAuthor(long id) {
        return authorRepository.findById(id).orElse(null);
    }

    @Override
    public List<Author> getAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Author updateAuthor(Author author) {
        Author existingAuthor = authorRepository.findById(author.getId()).orElse(null);
        existingAuthor.setName(author.getName());
        existingAuthor.setMiddlename(author.getMiddlename());
        existingAuthor.setSurname(author.getSurname());
        existingAuthor.setDateOfBirth(author.getDateOfBirth());
        existingAuthor.setBooks(author.getBooks());
        return authorRepository.save(existingAuthor);
    }

    @Override
    public String deleteAuthor(long id) {
        authorRepository.deleteById(id);
        return "Author deleted " + id;
    }

    @Override
    public List<Author> findAuthorsByName(String name) {
        return authorRepository.getAuthorsByMatchingName(name);
    }
}
