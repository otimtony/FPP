package Lesson9.Question4;

public class Test {
    public static void main(String[] args) {
        TicketingSystem ticketingSystem = new TicketingSystem();

        ticketingSystem.addTicket("Issue with login");
        ticketingSystem.addTicket("Page not loading");
        ticketingSystem.addTicket("Feature request");
        ticketingSystem.addTicket("Bug in the system");
        ticketingSystem.addTicket("Account setup help");

        System.out.println("Next ticket: " + ticketingSystem.viewNextTicket());

        // Process tickets
        System.out.println("Process ticket: " + ticketingSystem.processTicket());
        System.out.println("Process ticket: " + ticketingSystem.processTicket());

        // size of the queue
        System.out.println("Tickets remaining: " + ticketingSystem.getQueueSize());

        // Process remaining tickets
        while (!ticketingSystem.hasTickets()) {
            System.out.println("Processing ticket: " + ticketingSystem.processTicket());
        }

        // if the queue is empty
        System.out.println("Tickets remaining: " + ticketingSystem.getQueueSize());
    }
}
