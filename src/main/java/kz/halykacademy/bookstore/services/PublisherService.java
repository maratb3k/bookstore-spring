package kz.halykacademy.bookstore.services;

import kz.halykacademy.bookstore.DTOs.Publisher;

import java.util.List;

public interface PublisherService {
    Publisher savePublisher(Publisher publisher);
    List<Publisher> savePublishers(List<Publisher> publishers);
    Publisher getPublisher(long id);
    List<Publisher> getPublishers();
    Publisher updatePublisher(Publisher publisher);
    String deletePublisher(long id);
}
