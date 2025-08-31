package naukridsa;

public class thisMethod {
    public static void main(String[] args) {
        thisKeyword k = new thisKeyword();
        k.call();
    }
}

class thisKeyword {
    void myFunction() {
        System.out.println("Hello you are myfunction");
    }
    void call() {
        System.out.println("Hello you are call");
        this.myFunction();
    }
}
