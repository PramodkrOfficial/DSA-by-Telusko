package naukridsa.oops;

public class Polymorphism {
    public static void main(String[] args) {

        System.out.println(Overloading.Multiply(13, 14));
        System.out.println(Overloading.Divide(115, 5));
        System.out.println(Overloading.Add(32, 43, 67));
    }
}

class Overloading {
    static int Multiply(int a, int b) {
        return a * b;
    }
    static double Divide(double a, double b) {
        return a / b;
    }
    static int Add(int a, int b, int c) {
        return a + b + c;
    }
}