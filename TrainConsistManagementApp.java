import java.util.*;

/**
 * Train Consist Management App
 * UC1: Initialize Train and Display Consist Summary
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("   Train Consist Management App");
        System.out.println("=======================================\n");

        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train initialized successfully...");
        System.out.println("Initial bogie count: " + trainConsist.size());
        System.out.println("Current Train Consist: " + trainConsist);
    }
}