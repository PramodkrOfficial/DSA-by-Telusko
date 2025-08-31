package naukridsa.oops;

public class Interface {
    public static void main(String[] args) {
        printable obj = new printable();
        obj.print();
        obj.show();
    }
}
interface InterfaceTest {
    void print();
}

class printable implements InterfaceTest {
    public void print(){
        System.out.println("Interface Testing");
    }

    public void show() {
        System.out.println("Welcome to SDE preparation...");
    }
}
