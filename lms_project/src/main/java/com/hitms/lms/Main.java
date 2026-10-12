package com.hitms.lms;

public class Main {
    public static void main(String[] args) {
        try {
            int left = LibraryService.issueBook(5, "Algorithms Unlocked");
            System.out.println("Copies left after issue: " + left);
            LibraryService.issueBook(0, "Algorithms Unlocked");
        } catch (BookUnavailableException e) {
            System.out.println("Could not issue book: " + e.getMessage());
        }
    }
}
