package naukridsa.oops;

public class Inheritence {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}

class Animal{
    void eat() {
        System.out.println("is Animal eating food?");
    }
}

class Dog extends Animal{
    void bark() {
        System.out.println("is barking over the thief?");
    }
}
