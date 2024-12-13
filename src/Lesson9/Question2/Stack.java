package Lesson9.Question2;

// Stack Implemented with Doubly Linked List.
public class Stack {

    Node head;
    private int size;

    Stack() {
        this.head = new Node();
    }

    public void push(String item) {
        if (item == null) {
            throw new IllegalArgumentException("Null items cannot be pushed to the stack.");

        }
        Node temp = new Node(item);

        if (head.next == null) { // If head next is null. Link the new node prev to head and head next to new node.
            head.next = temp;
            temp.prev = head;

        } else {
            // remove connection of previous top node to head and connect head with new node.
            temp.next = head.next;
            temp.prev = head;

            head.next.prev = temp;
            head.next = temp;
        }

        size++;
    }


    public String pop() {
        if (head.next == null) return null;

        Node temp = head.next;
        head.next = temp.next; // Update the connection of header to link the next node in the list (If temp.next is null head.next will be null)

        if (temp.next != null) { // if there is next node in the list connect it with the head.
            temp.next.prev = head;
        }

        size--;
        return temp.data;
    }

    public String peek() {
        return head.next != null ? head.next.data : null;
    }

    boolean isEmpty() {
        return head.next == null;
    }


    @Override
    public String toString() {
        if (head.next == null) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");
        Node current = head.next;
        while (current != null) {
            sb.append(current.data).append(current.next != null ? ", " : "");
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }


    int size() {
        return size;
    }

    class Node {
        Node next;
        Node prev;
        String data;

        Node() {
            this.data = null;
        }

        Node(String data) {
            this.data = data;
        }

        Node(String data, Node next, Node prev) {
            this.next = next;
            this.prev = prev;
            this.data = data;
        }

        @Override
        public String toString() {
            return this.data;
        }

    }

}
