import java.util.*;

public class PalindromeCheckerapp {

    // Stack method
    public static boolean stackPalindrome(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop())
                return false;
        }
        return true;
    }

    // Deque method
    public static boolean dequePalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast())
                return false;
        }
        return true;
    }

    // Simple two-pointer method
    public static boolean twoPointerPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        long startTime, endTime;

        // Stack performance
        startTime = System.nanoTime();
        stackPalindrome(input);
        endTime = System.nanoTime();
        System.out.println("Stack Method Time: " + (endTime - startTime) + " ns");

        // Deque performance
        startTime = System.nanoTime();
        dequePalindrome(input);
        endTime = System.nanoTime();
        System.out.println("Deque Method Time: " + (endTime - startTime) + " ns");

        // Two Pointer performance
        startTime = System.nanoTime();
        twoPointerPalindrome(input);
        endTime = System.nanoTime();
        System.out.println("Two Pointer Method Time: " + (endTime - startTime) + " ns");

        sc.close();
    }
}