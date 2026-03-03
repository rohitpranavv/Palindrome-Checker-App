import java.util.*;

public class UseCasePalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        System.out.print("Input : ");
        String input = S.nextLine();

        long start, end;

        start = System.nanoTime();
        boolean result1 = twoPointerCheck(input);
        end = System.nanoTime();
        long time1 = end - start;

        start = System.nanoTime();
        boolean result2 = stackCheck(input);
        end = System.nanoTime();
        long time2 = end - start;

        start = System.nanoTime();
        boolean result3 = recursiveCheck(input, 0, input.length() - 1);
        end = System.nanoTime();
        long time3 = end - start;

        System.out.println("Two Pointer Result : " + result1);
        System.out.println("Execution Time (ns) : " + time1);

        System.out.println("Stack Result : " + result2);
        System.out.println("Execution Time (ns) : " + time2);

        System.out.println("Recursive Result : " + result3);
        System.out.println("Execution Time (ns) : " + time3);

        S.close();
    }

    private static boolean twoPointerCheck(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    private static boolean stackCheck(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray())
            stack.push(c);

        for (char c : input.toCharArray())
            if (c != stack.pop())
                return false;

        return true;
    }

    private static boolean recursiveCheck(String input, int start, int end) {

        if (start >= end)
            return true;

        if (input.charAt(start) != input.charAt(end))
            return false;

        return recursiveCheck(input, start + 1, end - 1);
    }
}