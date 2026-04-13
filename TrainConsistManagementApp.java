import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Train Consist Management App
 * UC7: Sort Bogies by Capacity using Comparator
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

        System.out.println("========== UC7 - Sort Bogies by Capacity ==========\n");

        // Create list of Bogie objects
        List<Bogie> bogies = new ArrayList<>();

        // ----- ADD bogies -----
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // Display before sorting
        System.out.println("Before Sorting:");
        System.out.println(bogies);

        // ----- SORT using Comparator -----
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Display after sorting
        System.out.println("\nAfter Sorting (by capacity):");
        System.out.println(bogies);
    }
}