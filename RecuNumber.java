import java.io.*;
/**
 * RecuNumber
 */
public class RecuNumber {
    public static void main(String []args){
        int n;
        DataInputStream din=new DataInputStream(System.in);
        try {
            System.out.println("Enter the n number:");
            n=Integer.parseInt(din.readLine());
            System.out.println("Number from "+n+" to 1 is: ");
            PrintDescending(n);
            System.out.println("\n Number from 1 to "+n+" is: ");
            PrintAscending(1, n);
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("\n");
    }
    public static void PrintDescending(int n){
        if (n>=1) {
            System.out.print(n+" ");
            PrintDescending(n-1);          
        }
    }
    public static void PrintAscending(int current, int n){
        if (current<=n) {
            System.out.print(current+" ");
            PrintAscending(current+1,n);
        }
    }
}
