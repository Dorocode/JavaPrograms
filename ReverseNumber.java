import java.io.*;

public class ReverseNumber {

    // Function to reverse the number and display the result
    public static void reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed number: " + reversedNumber);
    }

    public static void main(String[] args) {

        int n;
        DataInputStream din = new DataInputStream(System.in);

        try {
            System.out.println("Enter a number to Reverse");
            n=Integer.parseInt(din.readLine());
            reverse(n);
        } catch (Exception e) {
            System.out.println("error:"+e);
        }
        
    }
}