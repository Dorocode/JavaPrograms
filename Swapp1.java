
import java.util.*;

public class Swapp1 {

    public static void swapValues(float x, float y) {

        float temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println(
                "After swapping  num1 = " + x + ", num2 = " + y);
    }

    public static void main(String[] args) {
        float num1;
        float num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st Value");
        num1 = sc.nextFloat();
        System.out.println("Enter the 2nd Value");
        num2 = sc.nextFloat();
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        // Call the swap function
        swapValues(num1, num2);

    }
}
