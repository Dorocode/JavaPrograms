import java.io.*;

public class MaxN {

    // Function to find the maximum of two numbers
    public int findMax(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        }
        else
            return num2;
    }
    // Function to find the maximum of three numbers using the result of findMax function
    public int findMaxOfThree(int num1, int num2, int num3) {
        int maxOfTwo = findMax(num1, num2);
        return findMax(maxOfTwo, num3);
    }

     public static void main(String[] args) {
        MaxN n=new MaxN();
        DataInputStream din = new DataInputStream(System.in);
        try {
            // Input three numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = Integer.parseInt(din.readLine());
        System.out.print("Enter the second number: ");
        int num2 = Integer.parseInt(din.readLine());
        System.out.print("Enter the third number: ");
        int num3 = Integer.parseInt(din.readLine());
        // Find and display the maximum of three numbers
        int maxOfThree = n.findMaxOfThree(num1, num2, num3);
        System.out.println("The maximum of the three numbers is: " + maxOfThree);
        } catch (Exception e) {
            System.out.println("Error:"+e);
        }
    }
}