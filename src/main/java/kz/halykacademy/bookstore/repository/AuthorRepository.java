package kz.halykacademy.bookstore.repository;

import kz.halykacademy.bookstore.DTOs.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
