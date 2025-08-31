package naukridsa;

class SuperMethod {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.work();
    }
}

class Animal {
    void eat() {
        System.out.println("eating... from parent");
    }
}
class Horse extends Animal{
    void neigh() {
        System.out.println("neighing...");
    }

    void work() {
        super.eat();
        neigh();
    }
}