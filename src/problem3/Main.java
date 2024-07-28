package problem3;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println("Area of Circle:" + circle.calculateArea());
        
        Triangle triangle=new Triangle(5,9);
        System.out.println("\nArea of Triangle:"+ triangle.calculateArea());
    }
}
