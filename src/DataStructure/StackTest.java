package DataStructure;

//import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack nums = new Stack();
        nums.pop();

        nums.push(10);
        nums.push(30);
        System.out.println(nums.pop());
        nums.push(70);
        nums.push(20);
        System.out.println(nums.peek());
        nums.push(50);
        nums.push(90);

        nums.printStack();

       /*
        (while using inbuilt Stack method...)
        System.out.println(nums.pop());
        nums.push(70);
        nums.push(20);
        System.out.println(nums);
        */


    }
}
