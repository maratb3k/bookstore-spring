package kz.halykacademy.bookstore.services;

import kz.halykacademy.bookstore.DTOs.Book;
import java.util.List;

public interface BookService {

    Book saveBook(Book book);
    List<Book> saveBooks(List<Book> books);
    Book getBook(long id);
    List<Book> getBooks();
    Book updateBook(Book book);
    String deleteBook(long id);
    public List<Book> findBooksByName(String name);

}
