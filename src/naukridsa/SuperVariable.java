package naukridsa;

class SuperVariable {
    public static void main(String[] args) {
        Audi d = new Audi();
        d.printColor();
    }
}

class Car {
    String color = "white";
}

class Audi extends Car{
    String color = "black";
    void printColor() {
        System.out.println("current class: " +color);
        System.out.println("parent class: " + super.color);
    }
}