package Lesson9.Problem1;

import java.util.Arrays;

public class ArrayQueueImpl {

    private int[] queue = new int[10];
    int front = -1;
    int rare = 0;


    public int peek() {
        if (front == -1) throw new RuntimeException("Queue is empty");
        return queue[front];
    }

    public void enqueue(int item) {
        if (front == -1) front++;
        if (rare == queue.length - 1) resize();

        queue[rare] = item;
        rare++;
    }

    public void dequeue() {
        if (front == -1) throw new RuntimeException("Queue is empty");
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        queue[front] = 0;
        front++;
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
