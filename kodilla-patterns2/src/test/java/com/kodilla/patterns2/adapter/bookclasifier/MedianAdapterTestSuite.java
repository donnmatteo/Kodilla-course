package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("author1", "title1", 2012, "signature1"));
        books.add(new Book("author2", "title2", 2000, "signature2"));
        books.add(new Book("author3", "title3", 2007, "signature3"));
        MedianAdapter adapter = new MedianAdapter();
        //When
        int result = adapter.publicationYearMedian(books);
        //Then
        assertEquals(2007, result);
    }
}