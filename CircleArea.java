import java.util.Scanner;

public class CircleArea {


    public static void calculateArea() {
        double radius;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();

        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }

    public static void main(String[] args) {
        calculateArea();
    }
}