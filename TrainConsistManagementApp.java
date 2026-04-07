import java.util.ArrayList;
import java.util.List;

/**
 * Train Consist Management App
 * UC2: Add Passenger Bogies to Train
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("      Train Consist Management App");
        System.out.println("=========================================\n");

        System.out.println("========== UC2 - Add Passenger Bogies to Train ==========\n");

        // Create ArrayList to hold passenger bogies
        List<String> trainConsist = new ArrayList<>();

        // ----- CREATE (Add bogies) -----
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        System.out.println("Bogies after addition:");
        System.out.println(trainConsist);

        // ----- DELETE (Remove a bogie) -----
        trainConsist.remove("AC Chair");

        System.out.println("\nAfter removing 'AC Chair':");
        System.out.println(trainConsist);

        // ----- CHECK existence -----
        if (trainConsist.contains("Sleeper")) {
            System.out.println("\n'Sleeper' bogie exists in the train.");
        } else {
            System.out.println("\n'Sleeper' bogie does NOT exist.");
        }

        // Final state
        System.out.println("\nFinal Train Consist:");
        System.out.println(trainConsist);
    }
}