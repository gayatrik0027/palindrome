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
 * At this stage, the application:
 * - Starts execution from the main() method
 * - Displays a welcome message
 * - Shows application version
 *
 * No advanced palindrome management logic is implemented yet.
 *
 * The goal is to establish a clear startup flow.
 *
 * @author Gayathri K
 * @version 1.0
 */

import java.util.Scanner;

public class PalindromeCheckerapp {

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
        System.out.println("  Welcome to Palindrome Checker System ");
        System.out.println("  Version: 1.0");
        System.out.println("=======================================\n");

        Scanner sc = new Scanner(System.in);

        // Accept user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String reversed = "";

        // Reverse the string
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Check palindrome
        if (input.equals(reversed)) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is not a palindrome.");
        }

        sc.close();
    }
}
