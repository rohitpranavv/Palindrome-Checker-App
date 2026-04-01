/**
 * UC4: Character Array Based Palindrome Check
 * Goal: Convert string to character array and compare characters.
 *
 * Key Concepts:
 * - Character Array (char[]): Primitive array storing individual characters
 * - Array Indexing: Accessing elements using index positions (0-based)
 * - Two-Pointer Technique: One pointer from start, one from end
 * - Time Complexity: Efficient comparison without creating extra objects
 *
 * Data Structure: char[]
 */
public class UseCase4PalindromeCheckerApp {
    public static void main(String[] args) {
        // Input string to check
        String input = "level";

        // Convert string to character array
        char[] charArray = input.toCharArray();

        // Two-pointer approach: compare start and end characters
        int left = 0;
        int right = charArray.length - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (charArray[left] != charArray[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Display result
        System.out.println("Input String: " + input);
        System.out.println("Character Array: " + new String(charArray));
        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}
