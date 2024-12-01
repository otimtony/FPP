package Lesson3.Question3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Event {
    private String eventName;
    private ZonedDateTime eventDateTime;
    public Event(String eventNameInput, String eventDateTimeInput, String eventTimeZoneInput) {

        this.eventName = eventNameInput;
        this.eventDateTime = ZonedDateTime.parse(eventDateTimeInput + " " + eventTimeZoneInput, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm z"));

    }

    public String getDayOfWeek() {
        return eventDateTime.getDayOfWeek().toString();
    }

    public boolean isLeapYear() {
        return eventDateTime.toLocalDate().isLeapYear();
    }

    public long calculateDaysUntilEvent() {
        LocalDateTime now = LocalDateTime.now();
        Duration duration = Duration.between(now, eventDateTime.toLocalDateTime());
        return duration.toDays();
    }

    // Fxn to format
    public String formatConvertedEventDetails() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy 'at' hh:mm a");
        return eventDateTime.format(formatter) + " [" + eventDateTime.getZone() + "]";
    }
    // Fxn to handle timezone conversion
    public String convertTimeZone(String targetTimeZone) {
        ZonedDateTime targetTime = eventDateTime.withZoneSameInstant(ZoneId.of(targetTimeZone));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy 'at' hh:mm a");
        return targetTime.format(formatter) + " [" + targetTime.getZone() + "]";
    }

    public String getEventName() {
        return eventName;
    }

    public ZonedDateTime getEventDateTime() {
        return eventDateTime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Event name
        System.out.print("Enter event name: ");
        String eventNameInput = scanner.nextLine();

        System.out.print("Enter event date and time in format (yyyy-MM-dd HH:mm): ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String eventDateTimeInput = scanner.nextLine();

        System.out.print("Enter event time zone (America/Chicago): ");
        String eventTimeZoneInput = scanner.nextLine();

        // Event object
        Event event = new Event(eventNameInput, eventDateTimeInput, eventTimeZoneInput);

        // Show event details
        System.out.println("\nEvent Details:");
        System.out.println("Event: " + event.getEventName());
        System.out.println("Day of Week: " + event.getDayOfWeek());
        System.out.println("Leap Year: " + (event.isLeapYear() ? "Yes" : "No"));
        System.out.println("Days Until Event: " + event.calculateDaysUntilEvent());

        // Display formatted event details
        System.out.println("\nFormatted Event Details (in system time zone):");
        System.out.println(event.formatConvertedEventDetails());

        // Add target time zone
        System.out.print("\nEnter a target time zone (America/Chicago): ");
        String targetTimeZone = scanner.nextLine();

        // Convert event time to time zone
        System.out.println("\nEvent Time in " + targetTimeZone + ":");
        System.out.println(event.convertTimeZone(targetTimeZone));

    }
}

