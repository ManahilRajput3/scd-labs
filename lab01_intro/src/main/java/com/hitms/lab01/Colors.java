package com.hitms.lab01;

import static org.fusesource.jansi.Ansi.Color.CYAN;
import static org.fusesource.jansi.Ansi.ansi;

import org.fusesource.jansi.AnsiConsole;

/**
 * Prints a message in colour using the Jansi library.
 */
public final class Colors {

    /** Not meant to be instantiated. */
    private Colors() {
    }

    /**
     * Entry point of the program.
     *
     * @param args command line arguments (unused)
     */
    public static void main(final String[] args) {
        AnsiConsole.systemInstall();
        String message = "Hello, Software Construction!";
        System.out.println(ansi().fg(CYAN).a(message).reset());
        AnsiConsole.systemUninstall();
    }
}
