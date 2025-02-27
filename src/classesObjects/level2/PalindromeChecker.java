package classesObjects.level2;

class PalindromeCheckerr {
    String text;

    // Constructor
    public PalindromeCheckerr(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("The text is a palindrome.");
        } else {
            System.out.println("The text is not a palindrome.");
        }
    }
}

public class PalindromeChecker {
    public static void main(String[] args) {
        PalindromeCheckerr checker = new PalindromeCheckerr("Madam");
        checker.displayResult();
    }
}
