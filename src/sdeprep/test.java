package sdeprep;

public class test {
    public static void main(String[] args) {
        int num = 10;
        int num2 = 15;
        System.out.println("For Increment....");
        System.out.println("Post increment: " + num++);
        System.out.println("Pre increment: " + ++num);


        System.out.println("For Decrement....");
        System.out.println("Post increment: " + num2--);
        System.out.println("Pre increment: " + --num2);
    }
}


class function {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int maxium = max (a, b);
        System.out.println(maxium);
    }

    public static int  max(int x, int y) {

        if (x > y)
            return x;
        else
            return y;
    }
}

class function1 {
    public static int findSum(int a, int b) {
        int sum = a + b;
        return sum;
        
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = findSum(a,b);

        System.out.println("'Find sum is: " + c);
    }
}

class functionMin {
    public static void main(String[] args) {
        System.out.println(Math.min(10, 5));
    }
}

class functionAddTwoNum {
    public static int sumOfTwoNum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        System.out.println(sumOfTwoNum(a,b));
    }
}

class funcIncrease{
    public static void increase(int x, int y) {
        x++;
        y = y +2;

        System.out.println(x + ":"+ y);
    }

    public static void main (String[] args) {
        int a = 20;
        int b = 10;
        increase(a, b);
        System.out.println(a +":" + b);
    }
}

class methodOverriding {

    // Function with two integer parameters
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Function with two double parameters
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static void main(String args[]) {

        // Method calling by passing arguments
        int sumOfTwoNumbers = methodOverriding.add(10, 20);
        double sumOfThreeNumbers = methodOverriding.add(10.5, 20.5);

        System.out.println(sumOfTwoNumbers);
        System.out.println(sumOfThreeNumbers);
    }

}



class TernaryOperator {
    public static void main(String args[]) {
        int a = 50;
        int b = 100;
        int minimum;


        // Printing the value of a and b
        System.out.println("First Number = " + a);
        System.out.println("Second Number = " + b);

        // Find the minimum number
        minimum = (a < b) ? a : b;


        // Printing the minimum number
        System.out.println("Minimum Number = " + minimum);
    }
}


class LogicalOrOperator {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;

        System.out.println( a!= b );  // true
        System.out.println( a== b );  // false
    }
}

//Constructor Created

class DefaultConstructor{
    public static void main(String[] args) {
        Student S1 = new Student();
        Student S2 = new Student();

        S1.display();
        S2.display();
    }
}

class  Student{
    int id;
    String name;

   void display() {
        System.out.println(id + " " + name);
    }
}

