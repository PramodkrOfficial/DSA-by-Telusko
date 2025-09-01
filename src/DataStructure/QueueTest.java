package DataStructure;

//import java.util.Queue;


public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(30);
        queue.enqueue(50);
        queue.enqueue(70);

        System.out.println(queue.dequeue());

        queue.enqueue(60);
        queue.enqueue(80);

        System.out.println("Peek " + queue.peek());

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());


//        queue.show();
//        System.out.println(queue);
    }
}
