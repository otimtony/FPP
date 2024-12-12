package Lesson9.Question4;

import java.util.LinkedList;
import java.util.Queue;

public class TicketingSystem{

    private Queue<Ticket> ticketQueue;
    private int nextId;

    public TicketingSystem() {
        ticketQueue = new LinkedList<>();
        nextId = 1;
    }

    public void addTicket(String description) {
        Ticket newTicket = new Ticket(nextId++, description);
        ticketQueue.offer(newTicket);
        System.out.println("Ticket added: " + newTicket);
    }

    public Ticket processTicket() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No tickets to process.");
            return null;
        }
        Ticket ticket = ticketQueue.poll();
        System.out.println("Processing ticket: " + ticket);
        return ticket;
    }

    public Ticket viewNextTicket() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No tickets in the queue.");
            return null;
        }
        Ticket ticket = ticketQueue.peek();
        System.out.println("Next ticket: " + ticket);
        return ticket;
    }

    public boolean isEmpty() { return ticketQueue.isEmpty(); }

    public boolean hasTickets() {
        return !ticketQueue.isEmpty();
    }

    public int getQueueSize() {
        return ticketQueue.size();
    }

}
