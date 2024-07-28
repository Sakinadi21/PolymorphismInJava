/*Write a java program to create a  class Vehicle with a method called speedUp().
Create two subclasses Car and Bicycle.
Override the speedUp() method in each subclass to increase the vehicle's speed differently
*/

package problem2;

public class Vehicle {
    private int speed;

    public void speedUp( ) {
        speed += 10;
    }
    public int getSpeed(){
        return speed;
    }
}

class Car extends Vehicle{
    @Override
    public void speedUp(){
        super.speedUp();
        System.out.println("\nCar speed increased by 22 units");
    }
}
class Motorcycle extends Vehicle{
    @Override
    public void speedUp(){
        super.speedUp();
        System.out.println("\nMotorcycle speed increased by 12 units");
    }
}
