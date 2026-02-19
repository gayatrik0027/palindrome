// Version 1.0
// Author: Gayathri K
// Use Case 1: Welcome Page

/**
 * ======================================================
 * MAIN CLASS - UseCase1PalindromeCheckerApp
 * ======================================================
 *
 * Use Case 1: Application Entry & Welcome Message
 *
 * Description:
 * This class represents the entry point of the
 * Palindrome Checker Management System.
 *
 * The application:
 * - Starts execution from the main() method
 * - Displays a welcome message
 * - Accepts user input
 * - Checks whether the given string is a palindrome
 *
 * @author Gayathri K
 * @version 1.0
 */

import java.util.Scanner;

public class UseCase1PalindromeCheckerApp {

    /**
     * Application entry point.
     *
     * This is the first method executed by the JVM
     * when the program starts.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Display Welcome Message
        System.out.println("=======================================");
        System.out.println("   Welcome to Palindrome Checker System");
        System.out.println("   Version: 1.0");
        System.out.println("=======================================\n");

        Scanner scanner = new Scanner(System.in);

        // Accept user input
        System.out.print("Enter your string: ");
        String input = scanner.nextLine();

        // Clean input (remove spaces & ignore case)
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();

        // Reverse using StringBuilder
        String reversed = new StringBuilder(cleanedInput).reverse().toString();

        // Check palindrome
        if (cleanedInput.equals(reversed)) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is not a palindrome.");
        }

        scanner.close();
    }
}
