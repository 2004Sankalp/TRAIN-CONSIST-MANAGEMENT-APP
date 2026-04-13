import java.util.Arrays;

/**
 * Train Consist Management App
 * UC17: Sort Bogie Names using Arrays.sort()
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("      Train Consist Management App");
        System.out.println("=========================================\n");

        System.out.println("========== UC17 - Arrays.sort() ==========\n");

        // Array of bogie names
        String[] bogieNames = {
            "Sleeper", "AC Chair", "First Class", "General", "Luxury"
        };

        // Display original array
        System.out.println("Original Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        // ----- SORT USING BUILT-IN METHOD -----
        Arrays.sort(bogieNames);

        // Display sorted array
        System.out.println("\nSorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));
    }
}