/**
 * UC3: Palindrome Check Using String Reverse
 * Goal: Check whether a string is a palindrome by reversing it.
 *
 * Key Concepts:
 * - Loop (for loop): Iterates through characters in reverse order
 * - String Immutability: String objects are immutable; modifications create new objects
 * - String Concatenation (+): Builds reversed string character by character
 * - equals() Method: Compares content of String objects (not memory references)
 *
 * Data Structure: String
 */
public class UseCase3PalindromeCheckerApp {
    public static void main(String[] args) {
        // Input string to check
        String input = "racecar";

        // Reverse the string using a loop
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed string using equals() method
        boolean isPalindrome = input.equals(reversed);

        // Display result
        System.out.println("Input String: " + input);
        System.out.println("Reversed String: " + reversed);
        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}
