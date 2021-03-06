package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public class Library extends Prototype<Library> {

    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBooks(Book book) {
        this.books = books;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    public Library deepCopy() throws  CloneNotSupportedException {
        Library cloned = (Library) super.clone();
        cloned.books = new HashSet<>();
        for (Book book : books) {
            cloned.books.add(new Book(book.getTitle(), book.getAuthor(), book.getPublicationDate()));
        }
        return cloned;
    }
}
