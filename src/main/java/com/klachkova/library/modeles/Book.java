package com.klachkova.library.modeles;

import javax.validation.constraints.*;

public class Book {
    private int id;

   // private Integer person_id;

    @NotEmpty(message = "Name of the book should not be empty")
    @Size(min = 1, max = 100, message = "Name of the book should be between 1 and 100 characters")
    private String nameOfBook;

    @Size(min = 0, max = 50, message = "The author's name must not exceed 50 characters")
    private String author;

    @Min(value = 1000, message = "The year must be in the format: 1234")
    @Max(value = 9999, message = "The year must be in the format: 1234")
    private int year;

    public Book() {
    }

    public Book(int id, String nameOfBook, String author, int year) {
        this.id = id;
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.year = year;
       // this.person_id = null;
    }


//    public Book(int id, int person_id, String nameOfBook, String author, int year) {
//        this.id = id;
//        this.person_id = person_id;
//        this.nameOfBook = nameOfBook;
//        this.author = author;
//        this.year = year;
//    }

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

//    public int getPerson_id() {
//        return person_id;
//    }
//
//    public void setPerson_id(int person_id) {
//        this.person_id = person_id;
//    }
}
