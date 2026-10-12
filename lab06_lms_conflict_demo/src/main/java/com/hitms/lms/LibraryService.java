package com.hitms.lms;

import java.util.List;

/** Handles issuing and returning of library books. */
public class LibraryService {

    /**
     * Issues one copy of a book.
     *
     * @param availableCopies copies currently on the shelf
     * @param title the book title
     * @return the number of copies left after the issue
     * @throws BookUnavailableException if no copies are left
     */
    // Issues one copy of the given title from the shelf stock; throws
    // BookUnavailableException when no copies are left.
    public static int issueBook(int availableCopies, String title)
            throws BookUnavailableException {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be blank.");
        }
        if (availableCopies <= 0) {
            throw new BookUnavailableException(
                    "'" + title + "' has no copies available.");
        }
        return availableCopies - 1;
    }

    /**
     * Takes one copy back onto the shelf.
     *
     * @param availableCopies copies currently on the shelf
     * @return the number of copies after the return
     */
    /** Returns the fine for a late return: Rs. 15 for each overdue day. */
    public static int calculateFine(int daysOverdue) {
        return Math.max(0, daysOverdue) * 15;
    }

    public static int returnBook(int availableCopies) {
        return availableCopies + 1;
    }

    /**
     * Looks up a member in a list of member IDs.
     *
     * @param members all registered member IDs
     * @param id the ID to look for
     * @return the matching ID, or null when there is no such member
     */
    public static String findMemberById(List<String> members, String id) {
        int position = members.indexOf(id);
        return position >= 0 ? members.get(position) : null;
    }
}
