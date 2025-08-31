package naukridsa;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("first run");
    }

    static {
        System.out.println("This block is executed first than main method");
    }
}
class StaticMain {

    static int id = 40;
    public static void main(String[] args) {
        System.out.println(id);
    }
}
