package problem11;

// Abstract class representing a vehicle
abstract class Vehicle {
    // Abstract method to start the engine, must be implemented by subclasses
    public abstract void startEngine();

    // Abstract method to stop the engine, must be implemented by subclasses
    public abstract void stopEngine();
}

// Class representing a car, extends the Vehicle class
class Car extends Vehicle {
    // Overridden method to start the car's engine
    @Override
    public void startEngine() {
        System.out.println("Car engine started with a key.");
    }

    // Overridden method to stop the car's engine
    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped when the key was turned off.");
    }
}

// Class representing a motorcycle, extends the Vehicle class
class Motorcycle extends Vehicle {
    // Overridden method to start the motorcycle's engine
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started with a kick-start.");
    }

    // Overridden method to stop the motorcycle's engine
    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped when ignition was turned off.");
    }
}

