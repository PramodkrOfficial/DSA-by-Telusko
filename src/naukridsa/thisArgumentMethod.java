package naukridsa;

public class thisArgumentMethod {
    public static void main(String[] args) {
        thisKey k = new thisKey();
        k.func1();
    }
}

class thisKey {
    int testValue = 2451;
    void func1() {
        System.out.println("hello you are myFunction");
        func2(this);
    }
    void func2(thisKey obj) {
        System.out.println(obj.testValue);
    }
}