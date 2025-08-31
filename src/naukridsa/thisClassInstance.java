package naukridsa;

public class thisClassInstance {
    public static void main(String[] args) {
        ThisKey k = new ThisKey();
        ThisKey returnobject = k.func2();
        returnobject.func1();
    }
}

class ThisKey {
    int testValue = 3635;
    void func1() {
        System.out.println("Happy learning Doston");
    }

    ThisKey func2() {
        return this;
    }
}
