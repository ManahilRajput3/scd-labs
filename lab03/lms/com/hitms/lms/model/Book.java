package com.hitms.lms.model;

/** Represents a book held in the library catalogue. */
public class Book {

    private final String isbn;
    private final String title;
    private final String author;
    private boolean issued;

    /**
     * Creates a book that is available on the shelf.
     *
     * @param isbn the unique book identifier
     * @param title the book title
     * @param author the author's name
     */
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.issued = false;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return issued;
    }

    public void setIssued(boolean issued) {
        this.issued = issued;
    }
}
