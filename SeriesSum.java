import java.io.*;
public class SeriesSum {

    public static int calculateSeriesSum(int n) {
        int sum = 0;
        int currentSum = 0;
        int i = 1;

        while (i <= n) {
            currentSum += i; // Incrementally adding each term to the current sum
            sum += currentSum; // Adding the current sum to the overall sum
            i++;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n ; // Change the value of n as needed
        DataInputStream din=new DataInputStream(System.in);
        try {
            System.out.println("Enter the Number");
            n=Integer.parseInt(din.readLine());
            int seriesSum = calculateSeriesSum(n);

            System.out.println("The sum of the series is: " + seriesSum);
        } catch (Exception e) {
            System.out.println("Error:"+e);
        }
        
    }
}