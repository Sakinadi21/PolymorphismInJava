
package problem6;

// problem5.Main class to test the shapes
public class Main {
    public static void main(String[] args) {
        // Initialize the radius for the circle
        double r = 4.0;
        // Create a Circle object with the given radius
        Circle circle = new Circle(r);

        // Initialize the sides for the rectangle
        double rs1 = 4.0, rs2 = 6.0;
        // Create a Rectangle object with the given sides
        Rectangle rectangle = new Rectangle(rs1, rs2);

        // Initialize the sides for the triangle
        double ts1 = 3.0, ts2 = 4.0, ts3 = 5.0;
        // Create a Triangle object with the given sides
        Triangle triangle = new Triangle(ts1, ts2, ts3);

        // Print details for the circle
        System.out.println("Radius of the Circle: " + r);
        System.out.println("Area of the Circle: " + circle.getArea());
        System.out.println("Perimeter of the Circle: " + circle.getPerimeter());

        // Print details for the rectangle
        System.out.println("\nSides of the Rectangle are: " + rs1 + ", " + rs2);
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());

        // Print details for the triangle
        System.out.println("\nSides of the Triangle are: " + ts1 + ", " + ts2 + ", " + ts3);
        System.out.println("Area of the Triangle: " + triangle.getArea());
        System.out.println("Perimeter of the Triangle: " + triangle.getPerimeter());
    }
}
