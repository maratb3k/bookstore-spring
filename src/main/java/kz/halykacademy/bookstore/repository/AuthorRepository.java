package kz.halykacademy.bookstore.repository;

import kz.halykacademy.bookstore.DTOs.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
