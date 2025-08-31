package DataStructure;

//import java.util.LinkedList;

public class LinkedTest {
    public static void main(String[] args) {

        LinkedList nums = new LinkedList();


        nums.add(5);
        nums.add(9);
        nums.add(6);

        nums.addFirst(7);

        nums.delete(9);

        nums.printValues();

//
//        nums.addFirst(6);
//        System.out.println(nums.get(2));
//        nums.peek();

//        System.out.println(nums);

    }

}
