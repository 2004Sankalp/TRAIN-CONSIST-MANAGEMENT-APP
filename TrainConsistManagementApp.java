import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Train Consist Management App
 * UC8: Filter Passenger Bogies using Streams
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

        System.out.println("========== UC8 - Filter Bogies Using Streams ==========\n");

        // Original list (same as UC7)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Luxury", 80));

        // Display original list
        System.out.println("Original Bogies:");
        System.out.println(bogies);

        // ----- FILTER using Stream -----
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Display filtered list
        System.out.println("\nFiltered Bogies (capacity > 60):");
        System.out.println(filteredBogies);

        // Verify original list unchanged
        System.out.println("\nOriginal List After Filtering:");
        System.out.println(bogies);
    }
}