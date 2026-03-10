// PalindromeCheckerApp.java

public class Main {

    public static void main(String[] args) {

        // Hardcoded string
        String word = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check if the string is a palindrome
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        // Program ends
        System.out.println("Program execution completed.");
    }
}