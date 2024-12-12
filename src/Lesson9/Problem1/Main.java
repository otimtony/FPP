package Lesson9.Problem1;

public class Main {

    public static void main(String[] args) {

        ArrayQueueImpl queue = new ArrayQueueImpl();

        queue.enqueue(1);
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        queue.enqueue(11);
        queue.enqueue(12);
        queue.enqueue(13);
        queue.enqueue(15);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        System.out.println(queue.size());

        System.out.println(queue.peek());

        System.out.println(queue.toString());
    }
}
