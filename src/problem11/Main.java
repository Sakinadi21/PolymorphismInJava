package problem11;

// Main class to test the vehicle classes
public class Main {
    public static void main(String[] args) {
        // Create a Car object
        Vehicle car = new Car();
        // Create a Motorcycle object
        Vehicle motorcycle = new Motorcycle();

        // Start and stop the car's engine
        startAndStopEngine(car);
        // Start and stop the motorcycle's engine
        startAndStopEngine(motorcycle);
    }

    // Static method to start and stop a vehicle's engine
    public static void startAndStopEngine(Vehicle vehicle) {
        vehicle.startEngine(); // Call the startEngine method on the vehicle
        vehicle.stopEngine();  // Call the stopEngine method on the vehicle
    }
}
