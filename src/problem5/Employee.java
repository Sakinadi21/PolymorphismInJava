package problem5;

/*

Write a java program to create a class problem5.Employee with a method called calculateSalary().Create two subclasses problem5.Manager and problem5.Programmer.
In each subclass,override the calculateSalary() method to calculate and return the salary based on their specific roles.

*/
public class Employee {
    // private fields to store name and role of the employee
    private String name;
    private String role;

    // private constructor to prevent direct instantiation of problem5.Employee class
    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    // public getter method to access the name of the employee
    public String getName() {
        return name;
    }

    // public getter method to access the role of the employee
    public String getRole() {
        return role;
    }

    // method to calculate salary, to be overridden in subclasses
    public double calculateSalary() {
        return 0.0;
    }
}

class Manager extends Employee {
    // private fields to store base salary and bonus of the manager
    private double baseSalary;
    private double bonus;

    // public constructor for problem5.Manager class, initializes fields and calls the superclass constructor
    public Manager(String name, double baseSalary, double bonus) {
        super(name, "problem5.Manager");
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    // overriding the calculateSalary method to calculate salary for a manager
    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}

class Programmer extends Employee {
    // private fields to store base salary and overtime pay of the programmer
    private double baseSalary;
    private double overtimePay;

    // public constructor for problem5.Programmer class, initializes fields and calls the superclass constructor
    public Programmer(String name, double baseSalary, double overtimePay) {
        super(name, "problem5.Programmer");
        this.baseSalary = baseSalary;
        this.overtimePay = overtimePay;
    }

    // overriding the calculateSalary method to calculate salary for a programmer
    @Override
    public double calculateSalary() {
        return baseSalary + overtimePay;
    }
}

