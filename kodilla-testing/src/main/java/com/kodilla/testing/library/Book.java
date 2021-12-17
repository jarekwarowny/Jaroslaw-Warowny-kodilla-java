package com.kodilla.testing.library;

import java.util.Objects;

public class Book {

    String title;
    String author;
    int pubicationYear;

    public Book(String title, String author, int pubicationYear) {
        this.title = title;
        this.author = author;
        this.pubicationYear = pubicationYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPubicationYear() {
        return pubicationYear;
    }

    public void setPubicationYear(int pubicationYear) {
        this.pubicationYear = pubicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pubicationYear == book.pubicationYear && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, pubicationYear);
    }
}

