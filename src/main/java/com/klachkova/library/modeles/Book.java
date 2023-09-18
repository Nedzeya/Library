package com.klachkova.library.modeles;

import javax.validation.constraints.*;

public class Book {
    private int id;

    @NotEmpty(message = "Name of the book should not be empty")
    @Size(min = 1, max = 100, message = "Name of the book should be between 1 and 100 characters")
    private String nameOfBook;

    @Size(min = 1, max = 50, message = "Name of the author should be between 1 and 50 characters")
    private String author;

    @Size(min = 4, max = 4, message = "Year should be in format: 1234")
    private int year;

    public Book() {
    }

    public Book(int id, String nameOfBook, String author, int year) {
        this.id = id;
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
