package kz.halykacademy.bookstore.services;

import kz.halykacademy.bookstore.DTOs.Book;
import kz.halykacademy.bookstore.providers.BookProviderRealization;
import kz.halykacademy.bookstore.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceRealization implements BookService {
    @Autowired
    private BookRepo repository;
    private BookProviderRealization bookProviderRealization;
    private BookRepo bookRepository;

    public BookServiceRealization(BookRepo bookRepository) {
        this.bookRepository = bookRepository;
    }


    ///CRUD
    @Override
    public Book saveBook(Book book) {
        return repository.save(book);
    }

    public List<Book> saveBooks(List<Book> books) {
        return repository.saveAll(books);
    }

    @Override
    public List<Book> getBooks() {
        return repository.findAll();
    }

    @Override
    public Book getBook(long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public String deleteBook(long id) {
        repository.deleteById(id);
        return "Book deleted " + id;
    }

    @Override
    public Book updateBook(Book book) {
        Book existingBook = repository.findById(book.getId()).orElse(null);
        existingBook.setName(book.getName());
        existingBook.setAuthors(book.getAuthors());
        existingBook.setPrice(book.getPrice());
        existingBook.setPublisher(book.getPublisher());
        existingBook.setNumOfPages(book.getNumOfPages());
        existingBook.setProductionYear(book.getProductionYear());
        return repository.save(existingBook);
    }
}
