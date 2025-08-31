package naukridsa;

public class CopyConstructor {

    public static void main(String[] args) {

        CopyConst c1 = new CopyConst( 10,15);

        CopyConst c2 = new CopyConst(c1);

        CopyConst c3 = c2;

        System.out.println(c2.display());

    }
}

class CopyConst {
    private double x, y;

    public  CopyConst (double one, double two) {
        x = one;
        y = two;

    }

     CopyConst (CopyConst c) {
        System.out.println("Copy constructor called");
        x = c.x;
        y = c.y;

    }

    public String display() {
        return "(" + x + " + " + y + ")";
    }
}
