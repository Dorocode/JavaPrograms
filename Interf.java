// Interface defining method for calculating area
interface Shape {
    double calculateArea();
}

// Triangle class implementing Shape interface
class Triangle implements Shape {
    private double base;
    private double height;

    // Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Override method to calculate area of triangle
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Main class to demonstrate runtime polymorphism
public class Interf {
    public static void main(String[] args) {
        // Creating instances of Triangle
        Triangle triangle1 = new Triangle(5, 8);
        Triangle triangle2 = new Triangle(3, 6);

        // Storing triangles in Shape references
        Shape shape1 = triangle1;
        Shape shape2 = triangle2;

        // Printing areas using Shape references
        System.out.println("Area of Triangle 1: " + shape1.calculateArea());
        System.out.println("Area of Triangle 2: " + shape2.calculateArea());
    }
}
