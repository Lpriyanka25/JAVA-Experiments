public class PalindromeNumber {

    public static void main(String[] args) {
        int number = 12321; // Example number to check
        boolean isPalindrome = isPalindromeNumber(number);

        if (isPalindrome) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }
    }

    public static boolean isPalindromeNumber(int number) {
        // Convert the number to a string
        String str = Integer.toString(number);
        
        // Check if the string is equal to its reverse
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
