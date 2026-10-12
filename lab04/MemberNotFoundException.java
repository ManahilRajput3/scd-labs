import java.util.List;

/** Thrown when a library member ID cannot be found. */
public class MemberNotFoundException extends Exception {
    public MemberNotFoundException(String message) {
        super(message);
    }

    /** Looks a member up by ID and fails with a clear message. */
    public static String findMember(List<String> memberIds, String id)
            throws MemberNotFoundException {
        if (!memberIds.contains(id)) {
            throw new MemberNotFoundException(
                    "No member is registered with ID '" + id + "'.");
        }
        return id;
    }

    public static void main(String[] args) {
        List<String> memberIds = List.of("S101", "S102", "S103");
        try {
            System.out.println("Found member: "
                    + findMember(memberIds, "S102"));
            findMember(memberIds, "S999");
        } catch (MemberNotFoundException e) {
            System.out.println("Lookup failed: " + e.getMessage());
        }
    }
}
