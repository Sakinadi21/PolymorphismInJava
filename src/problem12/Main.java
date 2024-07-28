package problem12;

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(8.0); // Create a Circle object with radius 8.0
        Shape cylinder = new Cylinder(4.0, 9.0); // Create a Cylinder object with radius 4.0 and height 9.0

        drawShapeAndCalculateArea(circle); // Draw and calculate the area of the circle
        drawShapeAndCalculateArea(cylinder); // Draw and calculate the area of the cylinder
    }

    // Method to draw a shape and calculate its area
    public static void drawShapeAndCalculateArea(Shape shape) {
        shape.draw(); // Call the draw method of the shape
        double area = shape.calculateArea(); // Call the calculateArea method of the shape and store the result
        System.out.println("Area: " + area); // Print the area of the shape
    }
}
