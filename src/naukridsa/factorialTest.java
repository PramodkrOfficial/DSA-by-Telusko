package naukridsa;

import java.math.BigInteger;

public class factorialTest {
    public static void main(String[] args) {
        int n = 20;
        int mul = 1;
        int fact = 1;
        while (fact <= n) {
            mul *= fact;
            fact++;
        }
        System.out.println("Factorial of 20 using int: " + mul);


        BigInteger result = factorial(500);
        System.out.println("Factorial of 500: " + result);
    }

    public static BigInteger factorial(int n) {
        BigInteger factorial = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial;
    }
}

class  factTest {
    public static void main(String[] args) {
        int n = 500;
        BigInteger tempnum = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            tempnum = tempnum.multiply(BigInteger.valueOf(i));

        }
        System.out.println(tempnum);
    }
}
