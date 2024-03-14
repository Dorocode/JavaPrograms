import java.util.*;
interface Shape {
    void disp();
    double calc();
}

// Circle class implementing Shape interface
class Circle implements Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override disp() method to display circle
    @Override
    public void disp() {
        System.out.println("Circle is displayed.");
    }
    @Override
    public double calc() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class implementing Shape interface
class Rectangle implements Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    // Override disp() method to display rectangle
    @Override
    public void disp() {
        System.out.println("Rectangle is displayed.");
    }
    @Override
    public double calc() {
        return length * width;
    }
}
public class Interf2 {
    public static void main(String[] args) {
        int choice; 

        // Reference of Shape interface
        Shape shape;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Circle.\n Enter 2 for Rectangle");
        choice = sc.nextInt();
        
        if (choice == 1) {
            System.out.println("Enter the Radius");
            double radius = sc.nextDouble();
            shape = new Circle(radius); 
        } else {
            System.out.println("Enter the Length");
            double leng= sc.nextDouble();
            System.out.println("Enter wid");
            double wid=sc.nextDouble();
            shape = new Rectangle(leng, wid);
        }
        // Displaying the shape
        shape.disp();
        // Calculating and displaying the volume
        System.out.println("Volume: " + shape.calc());
    }
}
