import java.util.Scanner;

public class UseCasePalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        System.out.print("enter the String");
        String input = S.nextLine();
        char[] chars = input.toCharArray();
        int start=0;
        int end = chars.length-1;
        boolean isPalindrome=true;

        while(start<end){

           if (chars[start] != chars[end]){
               isPalindrome=false;
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