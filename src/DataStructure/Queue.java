package DataStructure;

public class Queue {

    private int front = 0;
    private int rear = -1;
    private int size = 0;
    private int[] arr = new int[4];

    public void enqueue(int data) {
//        rear++;
        if (!isFull()) {
            rear = (rear + 1) % 4;
            arr[rear] = data;
            size++;
        } else  {
            System.out.println("Queue is full");
        }
    }

    public int dequeue() {

//        front++;
        if (!isEmpty()) {
            int data = arr[front];
            front = (front + 1) % 4;
            size--;
            return data;
        } else {
            System.out.println("Queue is empty");
        }

        if (isEmpty()) {
            throw new RuntimeException("Queue is empty, provide data");
        }
        return 0;
    }

    public boolean isFull() {

        return size == 4;
    }

    public boolean isEmpty() {

        return size == 0;
    }

    public int peek() {

        if (isEmpty()) {
            throw new RuntimeException("Queue is empty, provide data");
        }
        return arr[front];
    }
    /*
    while using simple queue----
    public void show(){
        for (int i=front;i<size;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    */

}
