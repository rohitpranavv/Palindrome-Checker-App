import java.util.*;

public class UseCasePalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        System.out.print("Input : ");
        String input = S.nextLine();

        boolean isPalindrome = check(input, 0, input.length() - 1);

        System.out.println("Is Palindrome? : " + isPalindrome);

        S.close();
    }

    private static boolean check(String s, int start, int end) {

        if (start >= end)
            return true;

        if (s.charAt(start) != s.charAt(end))
            return false;

        return check(s, start + 1, end - 1);
    }
}