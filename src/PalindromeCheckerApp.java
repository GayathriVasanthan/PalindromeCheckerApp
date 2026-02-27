import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

    public class PalindromeCheckerApp {

        public static void main(String[] args) {

            String word = "rotor";

            PalindromeStrategy strategy;

            strategy = new StackStrategy();
            System.out.println("Using StackStrategy: " + word + " is " +
                    (strategy.isPalindrome(word) ? "" : "NOT ") + "a Palindrome.");

            strategy = new DequeStrategy();
            System.out.println("Using DequeStrategy: " + word + " is " +
                    (strategy.isPalindrome(word) ? "" : "NOT ") + "a Palindrome.");
        }
    }

    interface PalindromeStrategy {
        boolean isPalindrome(String word);
    }

    class StackStrategy implements PalindromeStrategy {

        public boolean isPalindrome(String word) {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < word.length(); i++) {
                stack.push(word.charAt(i));
            }
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) != stack.pop()) {
                    return false;
                }
            }
            return true;
        }
    }

    class DequeStrategy implements PalindromeStrategy {

        public boolean isPalindrome(String word) {
            Deque<Character> deque = new LinkedList<>();
            for (int i = 0; i < word.length(); i++) {
                deque.addLast(word.charAt(i));
            }
            while (deque.size() > 1) {
                if (!deque.removeFirst().equals(deque.removeLast())) {
                    return false;
                }
            }
            return true;
        }
    }




