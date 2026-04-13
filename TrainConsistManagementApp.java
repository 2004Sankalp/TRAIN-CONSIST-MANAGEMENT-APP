import java.util.HashMap;
import java.util.Map;

/**
 * Train Consist Management App
 * UC6: Map Bogie to Capacity using HashMap
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("      Train Consist Management App");
        System.out.println("=========================================\n");

        System.out.println("========== UC6 - Map Bogie to Capacity ==========\n");

        // Create HashMap to store bogie → capacity
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // ----- INSERT data -----
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 24);
        bogieCapacity.put("Cargo", 100);

        // ----- DISPLAY using entrySet() -----
        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                               " | Capacity: " + entry.getValue());
        }
    }
}