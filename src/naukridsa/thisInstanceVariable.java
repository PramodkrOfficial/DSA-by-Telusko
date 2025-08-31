package naukridsa;

class thisInstanceVariable {
    public static void main(String[] args) {
        Student1 s1 = new Student1(12230,"Surya", 20030f);
        Student2 s2 = new Student2(13330,"Pramod", 20040f);

        s1.display();
        s2.display();
    }
}

class Student1 {
    int rollNo;
    String name;
    float fee;

    Student1(int rollNo, String name, float fee) {
        rollNo = rollNo;      // using this keyword for instance value.
        name = name;           // using this keyword for instance value.
        fee = fee;               // using this keyword for instance value.
    }

    void display() {
        System.out.println(rollNo+ " " +name+ " " +fee);
    }
}

class Student2 {
    int rollNo;
    String name;
    float fee;

    Student2(int rollNo, String name, float fee) {
        this.rollNo = rollNo;
        this.name = name;
        this.fee = fee;
    }
    void display() {
        System.out.println(rollNo+" "+name+" "+fee);
    }
}