/**
 * Train Consist Management App
 * UC16: Sort Passenger Bogies using Bubble Sort
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("      Train Consist Management App");
        System.out.println("=========================================\n");

        System.out.println("========== UC16 - Bubble Sort ==========\n");

        // Array of passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        // Display original array
        System.out.print("Original Capacities: ");
        printArray(capacities);

        // ----- BUBBLE SORT -----
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // Display sorted array
        System.out.print("\nSorted Capacities: ");
        printArray(capacities);
    }

    // Helper method to print array
    public static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println("]");
    }
}