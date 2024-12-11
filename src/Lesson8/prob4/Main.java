package Lesson8.prob4;

public class Main {

    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();

        list.addLast("ram");
        list.addLast("hari");
        list.addLast("shyam");
        list.addLast("gopal");
        list.addLast("prem");


        System.out.println(list.toString());
        list.printReverse();

    }
}
