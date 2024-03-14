import java.io.*;
/**
 * EvenNum
 */
public class EvenNum {

    public static void main (String args[]){
        int n;
        DataInputStream din= new DataInputStream(System.in);
        try {
            System.out.print("Enter any number: ");
            n=Integer.parseInt(din.readLine());

            checkEven(n);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public static void checkEven(int n){
        if (n<=0) {
            return;
        }
        for(int i=0;i<=n;i++){
            if (i%2==0) {
                System.out.println(i);
            }
        }
    }
}