/**
 * UC1: Application Entry & Welcome Message
 * Goal: Display a welcome message and app details at startup.
 *
 * Key Concepts:
 * - Class: Container for the Palindrome Checker application logic
 * - Main Method: Entry point with signature public static void main(String[] args)
 * - Static Keyword: Allows JVM to invoke main() without creating an object
 * - Console Output: System.out.println() displays messages
 * - Application Flow Control: Defines startup behavior
 */
public class UseCase1PalindromeCheckerApp {
    public static void main(String[] args) {
        // Display application name
        System.out.println("Palindrome Checker App");

        // Display application version
        System.out.println("Version: 1.0.0");

        // Display description
        System.out.println("Description: A console-based Java application that validates");
        System.out.println("whether a given string is a palindrome under different conditions.");
        System.out.println();
        System.out.println("Welcome to Palindrome Checker!");
        System.out.println("Please select a use case to continue...");
    }
}
