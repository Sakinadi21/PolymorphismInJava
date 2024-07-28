package problem7;

// Assuming there is an abstract class Animal with abstract methods move() and makeSound()
abstract class Animal {
    // Abstract method to define how the animal moves
    public abstract void move();
    // Abstract method to define the sound the animal makes
    public abstract void makeSound();
}

// Panthera class that extends Animal and represents a specific type of animal
class Panthera extends Animal {
    // Overridden method to define how Panthera moves
    @Override
    public void move() {
        // Print statement to indicate the movement of Panthera
        System.out.println("Panthera walks");
    }

    // Overridden method to define the sound Panthera makes
    @Override
    public void makeSound() {
        // Print statement to indicate the sound made by Panthera
        System.out.println("Panthera roars");
    }
}

