import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Train Consist Management App
 * UC11: Validate Train ID & Cargo Code using Regex
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("      Train Consist Management App");
        System.out.println("=========================================\n");

        System.out.println("========== UC11 - Regex Validation ==========\n");

        Scanner scanner = new Scanner(System.in);

        // Take input
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        // ----- REGEX PATTERNS -----
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern trainRegex = Pattern.compile(trainPattern);
        Pattern cargoRegex = Pattern.compile(cargoPattern);

        // Create matchers
        Matcher trainMatcher = trainRegex.matcher(trainId);
        Matcher cargoMatcher = cargoRegex.matcher(cargoCode);

        // Validate inputs
        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();

        // Output results
        System.out.println("\nValidation Results:");

        if (isTrainValid) {
            System.out.println("Train ID is VALID ✅");
        } else {
            System.out.println("Train ID is INVALID ❌");
        }

        if (isCargoValid) {
            System.out.println("Cargo Code is VALID ✅");
        } else {
            System.out.println("Cargo Code is INVALID ❌");
        }

        scanner.close();
    }
}