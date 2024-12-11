package Lesson8.prob4;

public class DoublyLinkedList {


    Node header;

    DoublyLinkedList() {
        this.header = new Node();
    }

    public void addLast(String item) {

        if (item.isEmpty()) {
            throw new RuntimeException("Invalid String input");
        }

        Node newNode = new Node(item);

        if (header.next != null) {
            Node currentNode = header.next;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = newNode;
            newNode.previous = currentNode;
        } else {
            header.next = newNode;
        }


    }


    public boolean remove(String item) {
        if (item.isEmpty() || header.next == null) return false;

        Node curr = header.next;

        if (curr.data.equals(item)) { // if the data is in the first node;
            header.next = curr.next;
            if (curr.next != null) curr.next.previous = header;
            return true;
        }

        while (curr.next != null && !curr.data.equals(item)) {
            curr = curr.next;
        }

        if (curr.next == null) { //  if node is last
            curr.previous.next = null;
            return true;
        }

        // Default case unlink current node with its adjacent nodes.
        curr.previous.next = curr.next;
        curr.next.previous = curr.previous;
        return true;
    }

    public boolean removeFirst() {
        if (header.next == null) return false;

        Node firstNode = header.next;

        header.next = firstNode.next;
        if (firstNode.next != null) firstNode.next.previous = header;
        firstNode = null;

        return true;
    }

    public void printReverse() {
        if (header.next == null) {
            System.out.println("[]");
            return;
        }

        Node curr = header.next;

        while (curr.next != null) {
            curr = curr.next;
        }

        StringBuilder sb = new StringBuilder();

        while (curr != null) {
            sb.append(" ").append(curr.data);
            curr = curr.previous;
        }

        System.out.println(sb.toString());
    }

    @Override
    public String toString() {

        if (header.next == null) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        Node current = header.next;
        toString(sb, current);

        return sb.toString();
    }

    private void toString(StringBuilder sb, Node n) {
        if (n == null) return;
        if (n.data != null) sb.append(" ").append(n.data);
        toString(sb, n.next);
    }

    public class Node {
        String data;
        Node previous;
        Node next;

        Node() {

        }

        Node(String data) {
            this.data = data;
        }

        Node(String data, Node previous, Node next) {
            this.data = data;
            this.previous = previous;
            this.next = next;
        }

        public String toString() {
            return this.data == null ? "" : this.data;
        }
    }
}
