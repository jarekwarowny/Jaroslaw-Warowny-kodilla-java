package com.kodilla.patterns2.adapter.bookclasifer;

import com.kodilla.patterns2.adapter.bookclasifer.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifer.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifer.libraryb.BookStatistics;
import com.kodilla.patterns2.adapter.bookclasifer.libraryb.Statistics;
import com.kodilla.patterns2.adapter.company.newhrsystem.CompanySalaryProcessor;
import com.kodilla.patterns2.adapter.company.newhrsystem.Employee;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class MedianAdaptee implements BookStatistics {

    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        Statistics statistics = new Statistics();
        return statistics.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        Statistics statistics = new Statistics();
        return statistics.medianPublicationYear(books);
    }
}
