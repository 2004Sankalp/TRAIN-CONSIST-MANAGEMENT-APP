import java.util.Scanner;

/**
 * Train Consist Management App
 * UC18: Linear Search for Bogie ID
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("      Train Consist Management App");
        System.out.println("=========================================\n");

        System.out.println("========== UC18 - Linear Search ==========\n");

        // Array of bogie IDs (unsorted)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Take input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = scanner.nextLine();

        // ----- LINEAR SEARCH -----
        boolean found = false;

        for (int i = 0; i < bogieIds.length; i++) {

            if (bogieIds[i].equals(searchKey)) {
                found = true;
                break; // stop early when found
            }
        }

        // ----- RESULT -----
        if (found) {
            System.out.println("Bogie ID FOUND ✅");
        } else {
            System.out.println("Bogie ID NOT FOUND ❌");
        }

        scanner.close();
    }
}