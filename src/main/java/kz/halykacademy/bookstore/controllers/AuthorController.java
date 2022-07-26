package kz.halykacademy.bookstore.controllers;

import kz.halykacademy.bookstore.DTOs.Author;
import kz.halykacademy.bookstore.services.AuthorServiceRealization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthorController {

    @Autowired
    private AuthorServiceRealization authorService;

    @RequestMapping(value = "/addAuthor", method = RequestMethod.POST)
    public Author addAuthor(@RequestBody Author author) {
        return authorService.saveAuthor(author);
    }

    @RequestMapping(value = "/addAuthors", method = RequestMethod.POST)
    public List<Author> addAuthors(@RequestBody List<Author> authors) {
        return authorService.saveAuthors(authors);
    }

    @RequestMapping(value = "/authors", method = RequestMethod.GET)
    public List<Author> findAllAuthors() {
        return authorService.getAuthors();
    }

    @RequestMapping(value = "authors/{id}", method = RequestMethod.GET)
    public Author findAuthorByID(@PathVariable long id) {
        return authorService.getAuthor(id);
    }

    @RequestMapping(value = "/updateAuthor/", method = RequestMethod.PUT)
    public Author updateAuthor(@RequestBody Author author) {
        return authorService.updateAuthor(author);
    }

    @RequestMapping(value = "/deleteAuthor/{id}", method = RequestMethod.DELETE)
    public String deleteAuthor(@PathVariable long id) {
        return authorService.deleteAuthor(id);
    }

}
