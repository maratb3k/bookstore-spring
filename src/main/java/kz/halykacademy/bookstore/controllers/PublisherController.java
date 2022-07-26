package kz.halykacademy.bookstore.controllers;

import kz.halykacademy.bookstore.DTOs.Author;
import kz.halykacademy.bookstore.DTOs.Publisher;
import kz.halykacademy.bookstore.services.PublisherServiceRealization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class PublisherController {

    @Autowired
    private PublisherServiceRealization publisherService;

    @RequestMapping(value = "/addPublisher", method = RequestMethod.POST)
    public Publisher addPublisher(@RequestBody Publisher publisher) {
        return publisherService.savePublisher(publisher);
    }

    @RequestMapping(value = "/addPublishers", method = RequestMethod.POST)
    public List<Publisher> addPublishers(@RequestBody List<Publisher> publishers) {
        return publisherService.savePublishers(publishers);
    }

    @RequestMapping(value = "/publishers", method = RequestMethod.GET)
    public List<Publisher> findAllPublishers() {
        return publisherService.getPublishers();
    }

    @RequestMapping(value = "publishers/{id}", method = RequestMethod.GET)
    public Publisher findPublisherByID(@PathVariable long id) {
        return publisherService.getPublisher(id);
    }

    @RequestMapping(value = "/updatePublisher/", method = RequestMethod.PUT)
    public Publisher updatePublisher(@RequestBody Publisher publisher) {
        return publisherService.updatePublisher(publisher);
    }

    @RequestMapping(value = "/deletePublisher/{id}", method = RequestMethod.DELETE)
    public String deletePublisher(@PathVariable long id) {
        return publisherService.deletePublisher(id);
    }

}
