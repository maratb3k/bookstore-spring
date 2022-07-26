package kz.halykacademy.bookstore.repository;

import kz.halykacademy.bookstore.DTOs.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Long> {

}
