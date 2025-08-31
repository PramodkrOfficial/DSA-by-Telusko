package naukridsa;

class ParameterizedConstructor {
    public static void main(String[] args) {
        Student S1 = new Student(5, "Pramod");
        Student S2 = new Student(10, "Surya");

        S1.display();
        S2.display();
    }

    static class Student {
        int id;
        String name;

        public Student(int stdId, String stdName) {
            id = stdId;
            name = stdName;
        }

        void display() {
            System.out.println(id + " " + name);
        }
    }
}
