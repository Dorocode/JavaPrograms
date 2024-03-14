import java.util.*;

public class Fsquer {
    public static void main(String[] args) {
        double number;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number:");
        number = sc.nextDouble();
        SquareRoot squareRoot = new SquareRoot(number);
        // Call the function to find the square root
        findSquareRoot(squareRoot);
        System.out.println("Square root of " + number + " is: " + squareRoot.result);
    }
    // Function to find the square root using call by reference
    public static void findSquareRoot(SquareRoot obj) {
        obj.result = Math.sqrt(obj.number);
    }
}
// Class to hold the number and its square root
class SquareRoot {
    double number;
    double result;

    public SquareRoot(double number) {
        this.number = number;
    }
}
