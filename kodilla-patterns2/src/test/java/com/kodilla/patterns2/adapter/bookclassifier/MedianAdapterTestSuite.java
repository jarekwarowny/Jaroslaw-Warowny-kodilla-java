package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifer.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifer.librarya.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("aaa", "aaaa", 2222, "assa"));
        bookSet.add(new Book("bbb", "bbbb", 1111, "asds"));
        //When
        int mediana1 = medianAdapter.publicationYearMedian(bookSet);
        int mediana2 = medianAdapter.publicationYearMedian(bookSet);
        //Then
        Assertions.assertEquals(2222, mediana1);
    }
}
