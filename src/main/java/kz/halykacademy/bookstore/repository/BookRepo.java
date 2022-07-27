package kz.halykacademy.bookstore.repository;

import kz.halykacademy.bookstore.DTOs.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepo extends JpaRepository<Book, Long> {
    public List<Book> getBooksByMatchingName(String name);
}
