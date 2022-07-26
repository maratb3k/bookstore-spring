package kz.halykacademy.bookstore.DTOs;

import java.time.LocalDate;
import java.util.List;

public class Author {
    private long id;
    private String surname;
    private String name;
    private String middlename;
    private LocalDate dateOfBirth;
    private List<Book> books;

    public Author(long id, String surname, String name, String middlename, LocalDate dateOfBirth, List<Book> books) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middlename = middlename;
        this.dateOfBirth = dateOfBirth;
        this.books = books;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middlename='" + middlename + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", books=" + books +
                '}';
    }
}
