package naukridsa;

public class StaticMethod {
    public static void main(String[] args) {
        int result = Calculate.cube(15);
        System.out.println(result);
    }
}

class Calculate {
    static int cube(int x) {
        return x*x*x;
    }
}
