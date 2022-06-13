package com.kodilla.patterns2.adapter.bookclasifer;

import com.kodilla.patterns2.adapter.bookclasifer.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifer.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<com.kodilla.patterns2.adapter.bookclasifer.librarya.Book> books) {
       if (books.size() == 0) return 0;
       Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifer.libraryb.Book> bookMap = new HashMap<>();
       for (com.kodilla.patterns2.adapter.bookclasifer.librarya.Book book : books) {
           bookMap.put(new BookSignature(book.getSignature()), new com.kodilla.patterns2.adapter.bookclasifer.libraryb.Book(book.getAuthor(), book.getTitle(), book.getPublicationYear()));
       }
       return medianPublicationYear(bookMap);
    }
}
