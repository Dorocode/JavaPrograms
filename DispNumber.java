import java.io.*;
public class NumbersDisplay {

    public static void displayNumbers(int m, int n) {
        if (m > n) {
            System.out.println("Invalid input: m should be less than or equal to n.");
            return;
        }

        int currentNumber = m;

        while (currentNumber <= n) {
            System.out.println(currentNumber);
            currentNumber++;
        }
    }

    public static void main(String[] args) {
        int m,n;
        DataInputStream din=new DataInputStream(System.in);
        try {
            System.out.println("Enter the starting Nmber:");
            m=Integer.parseInt(din.readLine());
            System.out.println("Enter the last nUmber:");
            n=Integer.parseInt(din.readLine());   

            System.out.println("Numbers from " + m + " to " + n + ":");
            displayNumbers(m, n);
        } catch (Exception e) {
            System.out.println("Error:"+e);
        }
        
    }
}