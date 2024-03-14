import java.util.Scanner;

public class SumOfDigits {

    // Function to calculate the sum of digits
    public static int calculateSumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();

        int sumOfDigits = calculateSumOfDigits(inputNumber); // Calling the function to calculate sum of digits
        System.out.println("Sum of digits: " + sumOfDigits);
    }
}