import java.util.Scanner;

public class SumOfEvenNumbers {

    // Function to calculate sum of n even numbers
    public static void calculateSumOfEvenNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int sum = 0;
        int count = 0;
        int number = 2; 

        while (count < n) {
            sum += number;
            number += 2; 
            count++;
        }

        System.out.println("Sum of first " + n + " even numbers is: " + sum);
    }

    public static void main(String[] args) {
        calculateSumOfEvenNumbers(); 
    }
}