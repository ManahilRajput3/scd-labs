package com.hitms.lms.util;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LibraryUtils {

    /** Returns a title in Title Case with surrounding whitespace removed. */
    public static String formatTitle(String title) {
        String[] words = title.strip().toLowerCase().split("\\s+");
        StringBuilder formatted = new StringBuilder();
        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }
            if (formatted.length() > 0) {
                formatted.append(' ');
            }
            formatted.append(Character.toUpperCase(word.charAt(0)))
                     .append(word.substring(1));
        }
        return formatted.toString();
    }

    /** Returns the number of whole days between two dates. */
    public static long daysBetween(LocalDate first, LocalDate second) {
        return Math.abs(ChronoUnit.DAYS.between(first, second));
    }
}
