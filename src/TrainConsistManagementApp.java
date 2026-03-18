import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize Train Consist (Empty List of Bogies)
        List<String> trainConsist = new ArrayList<>();

        // Display Initial State
        System.out.println("Train consist initialized.");
        System.out.println("Initial number of bogies: " + trainConsist.size());

        // Program continues...
    }
}
import java.util.ArrayList;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Step 1: Create ArrayList for passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        System.out.println("=== Train Consist Management System ===");

        // Step 2: Add passenger bogies
        System.out.println("\nAdding Passenger Bogies...");
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Step 3: Display bogies
        System.out.println("\nCurrent Bogies in Train:");
        System.out.println(passengerBogies);

        // Step 4: Remove a bogie (AC Chair)
        System.out.println("\nRemoving 'AC Chair' bogie...");
        passengerBogies.remove("AC Chair");

        // Step 5: Display after removal
        System.out.println("\nBogies after Removal:");
        System.out.println(passengerBogies);

        // Step 6: Check existence of "Sleeper"
        System.out.println("\nChecking if 'Sleeper' bogie exists...");
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie is present in the train.");
        } else {
            System.out.println("Sleeper bogie is NOT present in the train.");
        }

        // Step 7: Final state
        System.out.println("\nFinal Train Consist:");
        System.out.println(passengerBogies);

        System.out.println("\n=== Program Continues... ===");
    }
}