package naukridsa;

class FinalClass {  // if run remove final keyword
    void run() {
        System.out.println("running the car");
    }
}
//final class FinalClass {  // if run remove final keyword
//    void run() {
//        System.out.println("running the car");
//    }
//}
class Buggadi extends FinalClass {
    void run() {
        System.out.println("running with safety 80kmph");
    }

    public static void main(String[] args) {
        Buggadi buggadi = new Buggadi();
        buggadi.run();
    }
 }