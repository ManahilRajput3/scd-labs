import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class AppLogger {
    private static final Logger LOGGER =
            Logger.getLogger(AppLogger.class.getName());

    public static void main(String[] args) throws IOException {
        FileHandler fileHandler = new FileHandler("app.log", true);
        fileHandler.setFormatter(new SimpleFormatter());
        LOGGER.addHandler(fileHandler);
        LOGGER.setLevel(Level.INFO);

        LOGGER.info("Library system starting...");
        LOGGER.info("Catalogue loaded successfully");
    }
}
