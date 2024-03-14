import java.io.*;
/**
 * FactorialRec
 */
public class FactorialRec {
    public static int findFactRec(int n){
        if(n==0){
            return 1;
        }
        return n*findFactRec(n-1);
    }
    public static void main (String []args){
        int n;
        DataInputStream din=new DataInputStream(System.in);
        try {
            System.out.println("Enter the number");
            n=Integer.parseInt(din.readLine());
            if (n<0) {
                System.out.println("Factorial Applied for positive numbers only");
            }
            else{
                int fac=findFactRec(n);
                System.out.println("the Factorial of "+n+" is: "+fac);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}