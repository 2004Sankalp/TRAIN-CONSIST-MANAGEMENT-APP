import java.util.ArrayList;
import java.util.List;

/**
 * Train Consist Management App
 * UC10: Count Total Seats using Stream reduce()
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

        System.out.println("========== UC10 - Total Seating Capacity ==========\n");

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Luxury", 80));

        // Display original list
        System.out.println("Bogies:");
        System.out.println(bogies);

        // ----- AGGREGATION -----
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)          // extract capacity
                .reduce(0, Integer::sum);      // sum all values

        // Display total
        System.out.println("\nTotal Seating Capacity: " + totalCapacity);

        // Verify original list unchanged
        System.out.println("\nOriginal List After Calculation:");
        System.out.println(bogies);
    }
}