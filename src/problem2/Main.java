package problem2;

public class Main{
    public static void main(String[] args) {
        Car car=new Car();
        Motorcycle motorcycle=new Motorcycle();
        System.out.println("Car initial speed:"+car.getSpeed());
        System.out.println("Motorcycle initial speed: + motorcycle.getSpeed()");
        car.speedUp();
        motorcycle.speedUp();
        System.out.println("\nCar speed after speeding up;"+car.getSpeed());
        System.out.println("\nMotorcycle speed after speeding up;"+motorcycle.getSpeed());
    }
}
