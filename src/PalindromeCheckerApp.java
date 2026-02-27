import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

    public class PalindromeCheckerApp {

        public static void main(String[] args) {

            String word = "wow";

            long start, end;

            start = System.nanoTime();
            boolean resultStack = checkWithStack(word);
            end = System.nanoTime();
            System.out.println("Stack approach: " + resultStack + " | Time: " + (end - start) + " ns");

            start = System.nanoTime();
            boolean resultDeque = checkWithDeque(word);
            end = System.nanoTime();
            System.out.println("Deque approach: " + resultDeque + " | Time: " + (end - start) + " ns");

            start = System.nanoTime();
            boolean resultCharArray = checkWithCharArray(word);
            end = System.nanoTime();
            System.out.println("Char array approach: " + resultCharArray + " | Time: " + (end - start) + " ns");
        }

        public static boolean checkWithStack(String word) {
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

        public static boolean checkWithDeque(String word) {
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

        public static boolean checkWithCharArray(String word) {
            char[] chars = word.toCharArray();
            int start = 0;
            int end = chars.length - 1;
            while (start < end) {
                if (chars[start] != chars[end]) {
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }

    }



