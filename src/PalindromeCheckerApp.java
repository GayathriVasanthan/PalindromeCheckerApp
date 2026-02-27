import java.util.Stack;

    public class PalindromeCheckerApp {

        public static void main(String[] args) {

            PalindromeChecker checker = new PalindromeChecker();
            String word = "noon";

            if (checker.checkPalindrome(word)) {
                System.out.println(word + " is a Palindrome.");
            } else {
                System.out.println(word + " is NOT a Palindrome.");
            }
        }
    }

    class PalindromeChecker {

        public boolean checkPalindrome(String word) {
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



