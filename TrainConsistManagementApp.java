import java.util.Arrays;
import java.util.Scanner;

/**
 * Train Consist Management App
 * UC20: Exception Handling During Search Operations
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("      Train Consist Management App");
        System.out.println("=========================================\n");

        System.out.println("========== UC20 - Safe Search ==========\n");

        // Change this array to test different cases
        String[] bogieIds = {"BG101", "BG205", "BG309"};
        // String[] bogieIds = {}; // ❌ test empty case

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = scanner.nextLine();

        try {
            // ----- FAIL-FAST VALIDATION -----
            if (bogieIds.length == 0) {
                throw new IllegalStateException("No bogies available for search!");
            }

            // ----- SEARCH (Linear Search) -----
            boolean found = false;

            for (String id : bogieIds) {
                if (id.equals(key)) {
                    found = true;
                    break;
                }
            }

            // ----- RESULT -----
            if (found) {
                System.out.println("Bogie ID FOUND ✅");
            } else {
                System.out.println("Bogie ID NOT FOUND ❌");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}