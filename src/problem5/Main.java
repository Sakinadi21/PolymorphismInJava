package problem5;

public class Main {
    public static void main(String[] args) {
        // Create a problem5.Manager object with name, base salary, and bonus
        Manager emp1 = new Manager("Mashrafi", 760000, 15000);
        // Create a problem5.Programmer object with name, base salary, and overtime pay
        Programmer emp2 = new Programmer("Sakiba", 700000, 10000);

        // Print details of the manager
        System.out.println("problem5.Manager: " + emp1.getName() + "\nRole: " + emp1.getRole() + "\nSalary: $" + emp1.calculateSalary());
        // Print details of the programmer
        System.out.println("problem5.Programmer: " + emp2.getName() + "\nRole: " + emp2.getRole() + "\nSalary: $" + emp2.calculateSalary());
    }
}
