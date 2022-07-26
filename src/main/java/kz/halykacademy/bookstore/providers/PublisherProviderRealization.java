package kz.halykacademy.bookstore.providers;

import kz.halykacademy.bookstore.DTOs.Book;
import kz.halykacademy.bookstore.DTOs.Publisher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PublisherProviderRealization implements PublisherProvider {

    private static List<Publisher> publishers = List.of(
      new Publisher(1, "Eskimo", null),
      new Publisher(2, "Oduvanchik",null)
    );

    @Override
    public List<Publisher> getAll() {
        return publishers;
    }
}
