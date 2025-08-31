package Algo;

public class Recursion {
    public static void main(String[] args) {

        f1(10);
    }

    public static void f1(int i) {

//        int i = 0;
        System.out.println(i);
        if (i>1)
            f1(i-1);

//        f1();   //Exception in thread "main" java.lang.StackOverflowError
    }
}
