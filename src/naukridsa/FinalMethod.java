package naukridsa;

class FinalMethod  extends Honda{

    void run() {
        System.out.println("running with safety 80kmph");
    }
    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.run();
    }
}
class Honda{
        void run() {         // while run remove final keyword
        System.out.println("running bike");
    }
}
//class Honda{
//    final void run() {         // while run remove final keyword
//        System.out.println("running bike");
//    }
//}