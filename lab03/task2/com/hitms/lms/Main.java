package com.hitms.lms;

import java.time.LocalDate;
import com.hitms.lms.util.LibraryUtils;

public class Main {
    public static void main(String[] args) {
        String title = LibraryUtils.formatTitle("  the ALCHEMIST ");
        long days = LibraryUtils.daysBetween(
                LocalDate.of(2026, 2, 3), LocalDate.of(2026, 2, 24));
        System.out.println(title);
        System.out.println(days);
    }
}
