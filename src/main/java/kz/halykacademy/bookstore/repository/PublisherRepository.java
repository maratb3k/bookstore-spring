package kz.halykacademy.bookstore.repository;
import kz.halykacademy.bookstore.DTOs.Book;
import kz.halykacademy.bookstore.DTOs.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
    public List<Publisher> getPublishersByMatchingName(String name);
}
