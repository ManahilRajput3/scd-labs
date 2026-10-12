package com.hitms.lms;

import com.hitms.lms.model.Book;
import com.hitms.lms.service.LibraryService;
import com.hitms.lms.util.LibraryUtils;
import java.time.LocalDate;

/** Driver class exercising the LMS modules. */
public class Main {
    public static void main(String[] args) {
        LibraryService library = new LibraryService();

        String title = LibraryUtils.formatTitle("the  alchemist");
        library.addBook(new Book("978-0062315007", title, "Paulo Coelho"));
        library.addBook(new Book("978-0140449136", "The Odyssey", "Homer"));
        System.out.println("Total books: " + library.totalBooks());

        LocalDate issueDate = LocalDate.of(2026, 2, 3);
        LocalDate returnDate = LocalDate.of(2026, 2, 26);
        System.out.println("Issued '" + title + "': "
                + library.issueBook("978-0062315007", issueDate));
        System.out.println("Issued again (expected false): "
                + library.issueBook("978-0062315007", issueDate));

        double fine = library.returnBook("978-0062315007", returnDate);
        System.out.println("Kept for "
                + LibraryUtils.daysBetween(issueDate, returnDate)
                + " days, late fine = Rs. " + fine);
    }
}
