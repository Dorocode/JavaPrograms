import java.io.*;
public class SeriesSum {

    public static double calculateSeriesSum(int n) {
        double sum = 0;
        double factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i; 

            double term = i / factorial;
            sum += term; 
        }

        return sum;
    }

    public static void main(String[] args) {
        int n;
        DataInputStream din= new DataInputStream(System.in);
        
        try {
            System.out.println("Enter a Number:");
            n=Integer.parseInt(din.readLine());

            double seriesSum = calculateSeriesSum(n);

            System.out.println("The sum of the series is: " + seriesSum);
        } catch (Exception e) {
            System.out.println("Error:"+e);
        }
        
    }
}