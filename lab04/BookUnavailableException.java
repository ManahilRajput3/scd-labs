/** Thrown when a book is requested but no copies are left. */
public class BookUnavailableException extends Exception {
    public BookUnavailableException(String message) {
        super(message);
    }
}
