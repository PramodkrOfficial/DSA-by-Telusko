package naukridsa;

public class StaticVariable {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Pramod");
        Student s2 = new Student(103, "Surya");

        s1.display();
        s2.display();
        s1.college = "MIET";
        System.out.println("s1 changed the college name, now let us see is it changed for s2 too ?");
        System.out.println();

        s1.display();
        s2.display();
        System.out.println("yes, if any object changed that variable that changes will be reflected to all objects");
    }
}

class Student {
    int rollNo;
    String name;
    static String college = "ITS";

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    void display() {
        System.out.println(rollNo + " " + name + " "+ college);
    }
}
