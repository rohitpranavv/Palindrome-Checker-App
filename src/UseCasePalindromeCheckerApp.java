import java.util.Scanner;

public class UseCasePalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("enter the String");
        String input = S.nextLine();
        String reversed="";

        for (int i=input.length()-1;i>=0;i--){
            reversed=reversed + input.charAt(i);
        }
        if (input.equals(reversed)){
            System.out.println("Result: The given string is a Palindrome.");
        }
        else{
            System.out.println("Result: The given string is NOT a Palindrome.");
        }
        S.close();


    }
}