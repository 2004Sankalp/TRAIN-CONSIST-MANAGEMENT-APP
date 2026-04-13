import java.util.HashSet;
import java.util.Set;

/**
 * Train Consist Management App
 * UC3: Track Unique Bogie IDs using HashSet
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("      Train Consist Management App");
        System.out.println("=========================================\n");

        System.out.println("========== UC3 - Track Unique Bogie IDs ==========\n");

        // Create a Set to store unique bogie IDs
        Set<String> bogies = new HashSet<>();

        // ----- ADD IDs (including duplicates) -----
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Duplicate entries
        bogies.add("BG101"); // duplicate
        bogies.add("BG102"); // duplicate

        // Display final set
        System.out.println("Unique Bogie IDs in Train:");
        System.out.println(bogies);
    }
}