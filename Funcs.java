public class PalindromeChecker {

    // Function to reverse an integer
    public static int reverseInteger(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    // Function to check if an integer is a palindrome
    public static int isPalindrome(int num) {
        int reversed = reverseInteger(num);
        if (reversed == num) {
            return 1; // It is a palindrome
        } else {
            return 0; // It is not a palindrome
        }
    }

    public static void main(String[] args) {
        int number1 = 12321;
        int number2 = 12345;

        // Checking number1
        int result1 = isPalindrome(number1);
        System.out.println("Is " + number1 + " a palindrome? Result: " + result1);

        // Checking number2
        int result2 = isPalindrome(number2);
        System.out.println("Is " + number2 + " a palindrome? Result: " + result2);
    }
}