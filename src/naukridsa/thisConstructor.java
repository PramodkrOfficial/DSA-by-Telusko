package naukridsa;

public class thisConstructor {
    public static void main(String[] args) {
        ThisKeyword tk = new ThisKeyword();
    }
}

class ThisKeyword {
    ThisKeyword() {
        this(10);
    }

    ThisKeyword(int k) {
        System.out.println("you have called the parameter constructor with value: " +k);
    }
}