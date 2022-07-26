package kz.halykacademy.bookstore.repository;
import kz.halykacademy.bookstore.DTOs.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
