import java.util.*;

public class UseCasePalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        System.out.print("enter the String");
        String input = S.nextLine();

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()){
            stack.push(c);
        }

        boolean isPalindrome=true;
        for (char c : input.toCharArray()){
            char popped = stack.pop();

            if(c != popped){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println("Is Palindrome?: True");
        }
        else{
            System.out.println("Is Palindrome?: False");
        }

        S.close();
    }
}