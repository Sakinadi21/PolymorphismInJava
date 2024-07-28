package problem6;

// Abstract class Shape which defines the methods that each shape must implement
abstract class Shape {
    // Abstract method to calculate the area of a shape
    public abstract double getArea();
    // Abstract method to calculate the perimeter of a shape
    public abstract double getPerimeter();
}

// Circle class that extends Shape and represents a circle
class Circle extends Shape {
    // Private member variable to store the radius of the circle
    private double radius;

    // Constructor to initialize the radius of the circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Overridden method to calculate the area of the circle
    @Override
    public double getArea() {
        // Area of a circle = π * radius^2
        return Math.PI * radius * radius;
    }

    // Overridden method to calculate the perimeter (circumference) of the circle
    @Override
    public double getPerimeter() {
        // Perimeter of a circle = 2 * π * radius
        return 2 * Math.PI * radius;
    }
}

// Triangle class that extends Shape and represents a triangle
class Triangle extends Shape {
    // Private member variables to store the sides of the triangle
    private double side1;
    private double side2;
    private double side3;

    // Constructor to initialize the sides of the triangle
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Overridden method to calculate the area of the triangle using Heron's formula
    @Override
    public double getArea() {
        // Semi-perimeter (s) = (side1 + side2 + side3) / 2
        double s = (side1 + side2 + side3) / 2;
        // Area of the triangle = sqrt(s * (s - side1) * (s - side2) * (s - side3))
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Overridden method to calculate the perimeter of the triangle
    @Override
    public double getPerimeter() {
        // Perimeter of the triangle = side1 + side2 + side3
        return side1 + side2 + side3;
    }
}

// Rectangle class that extends Shape and represents a rectangle
class Rectangle extends Shape {
    // Private member variables to store the sides of the rectangle
    private double length;
    private double width;

    // Constructor to initialize the sides of the rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overridden method to calculate the area of the rectangle
    @Override
    public double getArea() {
        // Area of a rectangle = length * width
        return length * width;
    }

    // Overridden method to calculate the perimeter of the rectangle
    @Override
    public double getPerimeter() {
        // Perimeter of a rectangle = 2 * (length + width)
        return 2 * (length + width);
    }
}

