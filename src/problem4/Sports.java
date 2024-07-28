/*Write a java program to create a class problem5.Employee with a method called calculateSalary().Create two subclasses Manager and Programmer.
In each subclass,override the calculateSalary() method to calculate and return the salary based on their specific roles.
*/

package problem4;

 class Sports {
    public void play(){
        System.out.println("Playing a sport....\n");
    }
}
class Football extends Sports {
    @Override
    public void play() {
        System.out.println("Mashrafi Playing Football");
    }
}
class Basketball extends Sports {
    @Override
    public void play() {
        System.out.println("Mashrafi Playing Basketball");
    }
}
class Rugby extends Sports {
    @Override
    public void play() {
        System.out.println("Mashrafi Playing Rugby");
    }
}

