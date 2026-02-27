public class PalindromeCheckerApp {

        public static void main(String[] args) {

            String word = "A man a plan a canal Panama";
            String normalized = word.replaceAll("\\s+", "").toLowerCase();
            String reversed = "";

            for (int i = normalized.length() - 1; i >= 0; i--) {
                reversed += normalized.charAt(i);
            }

            if (normalized.equals(reversed)) {
                System.out.println("\"" + word + "\" is a Palindrome.");
            } else {
                System.out.println("\"" + word + "\" is NOT a Palindrome.");
            }
        }
    }




