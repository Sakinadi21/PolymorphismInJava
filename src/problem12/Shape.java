package problem12;

// Define an abstract class Shape
abstract class Shape {
    // Abstract method draw to be implemented by subclasses
    public abstract void draw();

    // Abstract method calculateArea to be implemented by subclasses
    public abstract double calculateArea();
}

// Circle class inherits from Shape
class Circle extends Shape {
    private double radius; // Private variable to store the radius of the circle

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override the draw method to draw a circle
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    // Override the calculateArea method to calculate the area of a circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Protected method to get the radius of the circle
    protected double getRadius() {
        return radius;
    }
}

// Cylinder class inherits from Circle
class Cylinder extends Circle {
    private double height; // Private variable to store the height of the cylinder

    // Constructor to initialize the radius and height
    public Cylinder(double radius, double height) {
        super(radius); // Call the constructor of the superclass (Circle)
        this.height = height;
    }

    // Override the draw method to draw a cylinder
    @Override
    public void draw() {
        System.out.println("Drawing a cylinder");
    }

    // Override the calculateArea method to calculate the total surface area of a cylinder
    @Override
    public double calculateArea() {
        double circleArea = super.calculateArea(); // Calculate the area of the top/bottom circle
        double sideArea = 2 * Math.PI * getRadius() * height; // Calculate the lateral surface area
        return 2 * circleArea + sideArea; // Total surface area = 2 * circle area + side area
    }
}

