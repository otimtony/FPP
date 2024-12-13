package Lesson9.Question2;

public class Main {

    public static void main(String[] args) {
        Stack newStack = new Stack(); // Stack Implemented with Doubly linked List
        newStack.push("0");
        newStack.push("1");
        newStack.push("2");
        newStack.push("5");
        newStack.push("8");

        newStack.pop();
        newStack.pop();
        newStack.pop();
        newStack.pop();
        newStack.pop();

        String x = newStack.peek();
        System.out.println(x);
        System.out.println(newStack.size());
        System.out.println(newStack.toString());
    }
}
