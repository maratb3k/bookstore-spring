package kz.halykacademy.bookstore;

import java.util.List;

public class Book {
    private long id;
    private double price;
    private List<Author> authors;
    private Publisher publisher;
    private String name;
    private int numOfPages;
    private int productionYear;

    public Book(long id, double price, List<Author> authors, Publisher publisher, String name, int numOfPages, int productionYear) {
        this.id = id;
        this.price = price;
        this.authors = authors;
        this.publisher = publisher;
        this.name = name;
        this.numOfPages = numOfPages;
        this.productionYear = productionYear;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", price=" + price +
                ", authors=" + authors +
                ", publisher=" + publisher +
                ", name='" + name + '\'' +
                ", numOfPages=" + numOfPages +
                ", productionYear=" + productionYear +
                '}';
    }
}
