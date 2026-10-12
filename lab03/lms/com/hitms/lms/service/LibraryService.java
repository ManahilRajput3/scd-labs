package com.hitms.lms.service;

import com.hitms.lms.model.Book;
import com.hitms.lms.util.LibraryUtils;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/** Handles add, issue and return operations for the library. */
public class LibraryService {

    private static final long LOAN_PERIOD_DAYS = 14;
    private static final double FINE_PER_LATE_DAY = 15.0;

    private final Map<String, Book> catalogue = new HashMap<>();
    private final Map<String, LocalDate> issuedOn = new HashMap<>();

    /** Adds a book to the catalogue; false if the ISBN is already used. */
    public boolean addBook(Book book) {
        return catalogue.putIfAbsent(book.getIsbn(), book) == null;
    }

    /** Issues a book if it exists and is currently on the shelf. */
    public boolean issueBook(String isbn, LocalDate date) {
        Book book = catalogue.get(isbn);
        if (book == null || book.isIssued()) {
            return false;
        }
        book.setIssued(true);
        issuedOn.put(isbn, date);
        return true;
    }

    /** Takes a book back and returns the late fine (-1 if not issued). */
    public double returnBook(String isbn, LocalDate date) {
        Book book = catalogue.get(isbn);
        if (book == null || !book.isIssued()) {
            return -1;
        }
        long daysKept = LibraryUtils.daysBetween(issuedOn.remove(isbn), date);
        book.setIssued(false);
        return Math.max(0, daysKept - LOAN_PERIOD_DAYS) * FINE_PER_LATE_DAY;
    }

    /** Returns how many books the catalogue holds. */
    public int totalBooks() {
        return catalogue.size();
    }
}
