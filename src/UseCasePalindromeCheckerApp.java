import java.util.*;

public class UseCasePalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        System.out.print("Input : ");
        String input = S.nextLine();

        PalindromeService service = new PalindromeService();
        boolean result = service.checkPalindrome(input);

        System.out.println("Is Palindrome? : " + result);

        S.close();
    }
}

class PalindromeService {

    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}