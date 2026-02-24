import java.util.*;

public class UseCasePalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        System.out.print("enter the String");
        String input = S.nextLine();

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()){
            deque.add(c);
        }
        int start = 0;
        int end = deque.size() -1;


        boolean isPalindrome=true;
        while (deque.size()>1){
            char front= deque.removeFirst();
            char last = deque.removeLast();
            if (front != last){
                isPalindrome = false;
                break;
            }
            start++;
            end--;
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