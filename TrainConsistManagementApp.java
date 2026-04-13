import java.util.*;
import java.util.stream.Collectors;

/**
 * Train Consist Management App
 * UC9: Group Bogies by Type using groupingBy()
 */

public class TrainConsistManagementApp {

    // ----- Bogie Class -----
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " (" + capacity + ")";
        }
    }

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("      Train Consist Management App");
        System.out.println("=========================================\n");

        System.out.println("========== UC9 - Group Bogies by Type ==========\n");

        // Create list (reuse UC7/UC8 concept)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("AC Chair", 56));

        // Display original list
        System.out.println("Original Bogies:");
        System.out.println(bogies);

        // ----- GROUPING -----
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                      .collect(Collectors.groupingBy(b -> b.name));

        // Display grouped result
        System.out.println("\nGrouped Bogies:");
        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Verify original list unchanged
        System.out.println("\nOriginal List After Grouping:");
        System.out.println(bogies);
    }
}