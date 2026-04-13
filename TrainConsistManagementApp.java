import java.util.LinkedList;
import java.util.List;

/**
 * Train Consist Management App
 * UC4: Maintain Ordered Bogie Consist using LinkedList
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("      Train Consist Management App");
        System.out.println("=========================================\n");

        System.out.println("========== UC4 - Maintain Ordered Bogie Consist ==========\n");

        // Create LinkedList for train consist
        List<String> trainConsist = new LinkedList<>();

        // ----- ADD bogies -----
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // ----- INSERT at position -----
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter inserting 'Pantry Car' at position 2:");
        System.out.println(trainConsist);

        // ----- REMOVE first and last -----
        ((LinkedList<String>) trainConsist).removeFirst();
        ((LinkedList<String>) trainConsist).removeLast();

        System.out.println("\nAfter removing first and last bogie:");
        System.out.println(trainConsist);

        // Final output
        System.out.println("\nFinal Ordered Train Consist:");
        System.out.println(trainConsist);
    }
}