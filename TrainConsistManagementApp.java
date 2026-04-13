import java.util.ArrayList;
import java.util.List;

/**
 * Train Consist Management App
 * UC12: Safety Compliance Check for Goods Bogies
 */

public class TrainConsistManagementApp {

    // ----- Goods Bogie Class -----
    static class GoodsBogie {
        String type;   // Cylindrical, Open, Box
        String cargo;  // Petroleum, Coal, Grain

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return type + " (" + cargo + ")";
        }
    }

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("      Train Consist Management App");
        System.out.println("=========================================\n");

        System.out.println("========== UC12 - Safety Compliance Check ==========\n");

        // Create list of goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid
        bogies.add(new GoodsBogie("Open", "Coal"));             // allowed
        bogies.add(new GoodsBogie("Box", "Grain"));             // allowed

        // Display bogies
        System.out.println("Goods Bogies:");
        System.out.println(bogies);

        // ----- SAFETY VALIDATION -----
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") || 
                        b.cargo.equals("Petroleum")
                );

        // Output result
        if (isSafe) {
            System.out.println("\nTrain is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("\nTrain is NOT SAFE ❌");
        }
    }
}