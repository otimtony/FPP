package Lesson9.Question1;

import java.util.Arrays;

public class ArrayQueueImpl {

    private int[] queue = new int[10];
    int front = -1;
    int rare = 0;


    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return queue[front];
    }

    public void enqueue(int item) {
        if (isEmpty()) front++;
        if (rare == queue.length - 1) resize();

        queue[rare] = item;
        rare++;
    }

    public int dequeue() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1; // Assuming Queue items will be positive. So for Empty queue I'm returning 0.
        }
        int item = queue[front];
        queue[front] = 0;
        front++;
        return item;
    }

    public boolean isEmpty() {
        return front >= rare || front < 0;
    }

    public int size() {
        if (isEmpty()) return 0;
        return rare - front;
    }

    public void resize() {
        queue = Arrays.copyOf(queue, queue.length * 2);
    }

    @Override
    public String toString() {
        return Arrays.toString(queue);
    }
}
