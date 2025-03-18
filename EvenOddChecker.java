import java.util.Scanner;

public class EvenOddChecker {

    public static void main(String[] args) {
        // Get an integer input from the user
        int number = getIntegerInput();
        
        // Check if the number is even or odd
        String resultMessage = checkEvenOrOdd(number);
        
        // Display the result message to the user
        System.out.println(resultMessage);
    }

    // Method to get an integer input from the user
    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in); // Create a scanner object to read user input
        int number = 0; // Initialize the number variable

        // Continue prompting the user until a valid integer is entered
        while (true) {
            System.out.print("Please enter an integer: ");
            
            // Check if the input is a valid integer
            if (scanner.hasNextInt()) {
                number = scanner.nextInt(); // Read the input as an integer
                break; // Exit the loop once a valid integer is entered
            } else {
                // If the input is not a valid integer, display an error message
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Consume the invalid input to prevent an infinite loop
            }
        }

        return number; // Return the valid integer
    }

    // Method to check if the number is even or odd
    public static String checkEvenOrOdd(int number) {
        // Use the modulo operator to check if the number is even or odd
        if (number % 2 == 0) {
            return number + " is an Even number."; // Return the message if the number is even
        } else {
            return number + " is an Odd number."; // Return the message if the number is odd
        }
    }
}
