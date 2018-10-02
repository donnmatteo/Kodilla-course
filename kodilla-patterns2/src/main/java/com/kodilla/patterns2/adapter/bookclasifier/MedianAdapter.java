package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//public class MedianAdapter extends MedianAdaptee implements Classifier {
//    public int publicationYearMedian(Set<com.kodilla.patterns2.adapter.bookclasifier.librarya.Book> bookSet) {
//        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> booksListMap = new HashMap<>();
//        for (Book bookPyM : bookSet) {
//            booksListMap.put(new BookSignature(bookPyM.getSignature()), new Book(bookPyM.getAuthor(),
//                    bookPyM.getTitle(), bookPyM.getPublicationYear(), null));
//        }
//        return medianPublicationYear(booksListMap);
//    }
//}
