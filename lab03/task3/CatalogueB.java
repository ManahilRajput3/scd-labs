import java.util.ArrayList;
import java.util.List;

public class CatalogueB {

    public static List<String> addItem(List<String> catalogue, String title) {
        catalogue.add(title);
        return catalogue;
    }

    public static int itemCount(List<String> catalogue) {
        return catalogue.size();
    }

    public static void main(String[] args) {
        // Version A keeps one hidden counter shared by every caller
        CatalogueA.addItem("Dune");
        CatalogueA.addItem("Emma");
        CatalogueA.addItem("Hamlet");
        System.out.println("Version A count (shared static): "
                + CatalogueA.catalogueCount);

        // Version B: every test passes in its own catalogue
        List<String> science = new ArrayList<>();
        addItem(science, "Cosmos");
        addItem(science, "Sapiens");
        List<String> poetry = new ArrayList<>();
        addItem(poetry, "Odes");
        System.out.println("Version B science list: " + itemCount(science));
        System.out.println("Version B poetry list : " + itemCount(poetry));
    }
}
