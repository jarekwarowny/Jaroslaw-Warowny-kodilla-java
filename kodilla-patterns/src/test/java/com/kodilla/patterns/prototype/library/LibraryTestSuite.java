package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {

        Book book1 = new Book("aaa", "asd", LocalDate.of(1798, 1, 3));
        Book book2 = new Book("aadd", "asdddw", LocalDate.of(1997, 4, 23));
        Library library = new Library("Library nr 1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);

        Library cloned = null;
        try {
            cloned = library.shallowCopy();
            cloned.setName("Library nr 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepCloned = null;
        try {
            deepCloned = library.deepCopy();
            deepCloned.setName("Library nr 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        library.getBooks().remove(book2);

        System.out.println(library);
        System.out.println(cloned);
        System.out.println(deepCloned);
        Assertions.assertEquals(1, library.getBooks().size());
        Assertions.assertEquals(1, cloned.getBooks().size());
        Assertions.assertEquals(2, deepCloned.getBooks().size());
    }
}
