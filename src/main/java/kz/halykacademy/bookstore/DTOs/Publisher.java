package kz.halykacademy.bookstore;

import java.util.List;

public class Publisher {
    private long id;
    private String name;
    private List<Book> publishedBooks;

    public Publisher(long id, String name, List<Book> publishedBooks) {
        this.id = id;
        this.name = name;
        this.publishedBooks = publishedBooks;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getPublishedBooks() {
        return publishedBooks;
    }

    public void setPublishedBooks(List<Book> publishedBooks) {
        this.publishedBooks = publishedBooks;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", publishedBooks=" + publishedBooks +
                '}';
    }
}
