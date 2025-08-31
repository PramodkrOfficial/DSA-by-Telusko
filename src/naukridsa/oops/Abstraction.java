package naukridsa.oops;

public class Abstraction {
    public static void main(String[] args) {

        Salary s = new Salary("Anand", "Greater Noida", 43, 3600.00);
        Employee e = new Salary("Surya", "Noida", 23, 4400.00);

        System.out.println("Call mailCheck using Salary reference--");
        s.mailCheck();
        System.out.println("Weekly pay: $" + s.computePay());

        System.out.println();
        System.out.println("\nCall mailCheck using Employee reference--");
        e.mailCheck();
        System.out.println("Weekly pay: $" + e.computePay());

        System.out.println();
        System.out.println("Employee details: " + e.toString());
    }
}

abstract class Employee {
    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number) {
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    // Abstract method - must be implemented by subclasses
    public abstract double computePay();

    public void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }

    public String toString() {
        return name + " " + address + " " + number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getNumber() {
        return number;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }
}

class Salary extends Employee {
    private double salary;

    // Constructor - was outside the class in your code
    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }

    // Override mailCheck method
    @Override
    public void mailCheck() {
        System.out.println("Within mailCheck of Salary class");
        System.out.println("Mailing check to " + getName() + " with salary $" + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if(newSalary >= 0.0) {
            salary = newSalary;
        }
    }

    // Must implement abstract method from Employee
    @Override
    public double computePay() {
        System.out.println("Computing salary pay for " + getName());
        return salary / 52; // Weekly pay
    }

    @Override
    public String toString() {
        return super.toString() + " - Salary: $" + salary;
    }
}