package Lesson3.Question2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String firstName = null;
        while (firstName == null) {
            System.out.println("Enter Your First Name: ");
            String input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("First name cannot be empty.");
            } else {
                firstName = input;
            }
        }

        String lastName = null;
        while (lastName == null) {
            System.out.println("Enter Your Last Name: ");
            String input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("last name cannot be empty.");
            } else {
                lastName = input;
            }
        }

        String dateOfBirth = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");

        while (dateOfBirth == null) {
            System.out.println("Enter Your Date Of Birth in the format yyyy-MM-dd: ");
            String input = sc.nextLine().trim();
            try {
                LocalDate parsedDate = LocalDate.parse(input, formatter);
                if (parsedDate.isBefore(LocalDate.now())) {
                    dateOfBirth = input;
                } else {
                    System.out.println("Date of birth must be before today's date. Please try again.");
                }
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please use yyyy-MM-dd.");
            }
        }

        HeartRates hr = new HeartRates(firstName, lastName, dateOfBirth);
        System.out.printf("Your target heart rate is between %.2f and %.2f bpm%n", hr.getLowerBoundaryTargetHeartRate(), hr.getUpperBoundaryTargetHeartRate());
        System.out.println(hr.toString());

    }
}


