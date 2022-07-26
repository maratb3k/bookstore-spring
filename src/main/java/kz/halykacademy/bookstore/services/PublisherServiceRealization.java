package kz.halykacademy.bookstore.services;

import kz.halykacademy.bookstore.DTOs.Publisher;
import kz.halykacademy.bookstore.repository.PublisherRepository;

import java.util.List;

public class PublisherServiceRealization implements PublisherService {

    private PublisherRepository publisherRepository;

    public PublisherServiceRealization(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public Publisher savePublisher(Publisher publisher) {
        return publisherRepository.save(publisher);
    }

    @Override
    public List<Publisher> savePublishers(List<Publisher> publishers) {
        return publisherRepository.saveAll(publishers);
    }

    @Override
    public Publisher getPublisher(long id) {
        return publisherRepository.findById(id).orElse(null);
    }

    @Override
    public List<Publisher> getPublishers() {
        return publisherRepository.findAll();
    }

    @Override
    public Publisher updatePublisher(Publisher publisher) {
        Publisher existingPublisher = publisherRepository.findById(publisher.getId()).orElse(null);
        existingPublisher.setName(publisher.getName());
        existingPublisher.setPublishedBooks(publisher.getPublishedBooks());
        return publisherRepository.save(existingPublisher);
    }

    @Override
    public String deletePublisher(long id) {
        publisherRepository.deleteById(id);
        return "Publisher removed " + id;
    }
}
