package naukridsa.oops;

public class Polymorphism2 {
    public static void main(String[] args) {
         Overriding o = new Car();
         o.run();

        Overriding or = new Overriding();
        or.run();

        Car c = new Car();
        c.run();

    }
}

class Overriding {
    void run() {
        System.out.println("Vehicle is running");
    }
}
class Car extends Overriding {
    void run() {
        System.out.println("Car is running");
    }
}
