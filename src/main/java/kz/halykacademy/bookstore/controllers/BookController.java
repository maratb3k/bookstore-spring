package kz.halykacademy.bookstore.controllers;

import kz.halykacademy.bookstore.DTOs.Book;
import kz.halykacademy.bookstore.services.BookServiceRealization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookServiceRealization bookService;

    @RequestMapping(value = "/addBook", method = RequestMethod.POST)
    public Book addBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @RequestMapping(value = "/addBooks", method = RequestMethod.POST)
    public List<Book> addBooks(@RequestBody List<Book> books) {
        return bookService.saveBooks(books);
    }

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public List<Book> findAllBooks() {
        return bookService.getBooks();
    }

    @RequestMapping(value = "book/{id}", method = RequestMethod.GET)
    public Book findBookByID(@PathVariable long id) {
        return bookService.getBook(id);
    }

    @RequestMapping(value = "/updateBook/", method = RequestMethod.PUT)
    public Book updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }

    @RequestMapping(value = "/deleteBook/{id}", method = RequestMethod.DELETE)
    public String deleteBook(@PathVariable long id) {
        return bookService.deleteBook(id);
    }
}
