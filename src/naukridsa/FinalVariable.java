package naukridsa;

public class FinalVariable {
//    final int speedLimit = 90;  // final variable
    int speedLimit = 90;

    void run() {
        speedLimit = 400;
    }
    public static void main(String[] args) {
        FinalVariable myCar = new FinalVariable();
        myCar.run();
    }
}

