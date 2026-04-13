import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Train Consist Management App
 * UC5: Preserve Insertion Order of Bogies using LinkedHashSet
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("      Train Consist Management App");
        System.out.println("=========================================\n");

        System.out.println("========== UC5 - Preserve Insertion Order of Bogies ==========\n");

        // Create LinkedHashSet to maintain order + uniqueness
        Set<String> formation = new LinkedHashSet<>();

        // ----- ADD bogies -----
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // ----- ADD duplicate -----
        formation.add("Sleeper"); // duplicate (ignored automatically)

        // Display final formation
        System.out.println("Final Train Formation:");
        System.out.println(formation);
    }
}