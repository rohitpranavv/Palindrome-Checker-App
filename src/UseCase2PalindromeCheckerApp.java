/**
 * UC2: Print a Hardcoded Palindrome Result
 * Goal: Display whether a hardcoded string is a palindrome.
 *
 * Key Concepts:
 * - Class: Container for program logic
 * - Main Method: Entry point of the Java application
 * - Static Keyword: Allows JVM to invoke main() without creating an object
 * - String: Built-in class to store textual data
 * - String Literal: Text in double quotes ("madam"), stored in String constant pool
 * - Conditional Statement (if-else): Evaluates palindrome condition
 * - Console Output: System.out.println() displays result
 *
 * Data Structure: String
 */
public class UseCase2PalindromeCheckerApp {
    public static void main(String[] args) {
        // Hardcoded string to check
        String input = "madam";

        // Simple check using hardcoded comparison
        boolean isPalindrome = true;

        // Check if string reads same forwards and backwards
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Input String: " + input);
        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}
