import java.util.*;

public class UseCasePalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        System.out.print("enter the String");
        String input = S.nextLine();

        LinkedList<Character> list = new LinkedList<>();

        for (char c : input.toCharArray()){
            list.add(c);
        }

        boolean isPalindrome=true;

        while (list.size() > 1) {

            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
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