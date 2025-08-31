package naukridsa;

import java.sql.SQLOutput;

public class ConstructorOverriding {
    public static void main(String[] args) {

        ConstructorStudent S1 = new ConstructorStudent(122332);
        ConstructorStudent S2 = new ConstructorStudent(122442, "Surya");

        S1.display();
        S2.display();


        System.out.println();
        System.out.println("Constructor Overloading....");
        Employee emp = new Employee();
        Employee emp1 = new Employee("Surya");
        Employee emp2 = new Employee("TCS", 122332);
    }
}

class ConstructorStudent{
    int id;
    String name;

//    Constructor - 1
    ConstructorStudent(int stdId, String stdName) {
        id = stdId;
        name = stdName;
    }

//    Constructor - 2

    ConstructorStudent(int stdId) {
        id = stdId;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}
class Employee {

    Employee() {
        System.out.println("Employee Details");
    }
    Employee(String name) {
        System.out.println("Employee name: " + name);
    }
    Employee (String nCompany, int id){
        System.out.println("Company name: " + nCompany);
        System.out.println("Employee id: " + id);
    }
}
