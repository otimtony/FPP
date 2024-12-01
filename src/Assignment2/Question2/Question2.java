package Assignment2.Question2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First Name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter Your Last Name: ");
        String lastName = sc.nextLine();

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
        System.out.println("Your target heart rate is between " + hr.getLowerBoundaryTargetHeartRate() + "and" + hr.getUpperBoundaryTargetHeartRate());
        System.out.println(hr.getPersonsDetails());

    }
}

class HeartRates {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private static final double LB = 0.5;
    private static final double UB = 0.85;
    private final int RHR = 70;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");


    HeartRates(String firstName, String lastName, String dateOfBirth) {

        if (firstName.trim().isEmpty() || lastName.trim().isEmpty() || dateOfBirth.isEmpty()) {
            throw new IllegalArgumentException("Invalid inputs");

        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return this.getYrsDiffFromToday(this.dateOfBirth);
    }

    public int getMaximumHeartRate() {
        return 220 - this.getAge();
    }

    public int getAverageHeartRate() {
        return getMaximumHeartRate() - this.RHR;
    }


    public double getLowerBoundaryTargetHeartRate() {
        return (getAverageHeartRate() * LB) + RHR;
    }

    public double getUpperBoundaryTargetHeartRate() {
        return (getAverageHeartRate() * UB) + RHR;
    }


    private int getYrsDiffFromToday(String date) {
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.parse(date, this.formatter);
        return Period.between(birthDate, today).getYears();
    }


    public String getPersonsDetails() {
        return toString();
    }

    @Override
    public String toString() {

        return "Person Details:\n" +
                "First Name: " + getFirstName() + "\n" +
                "Last Name: " + getLastName() + "\n" +
                "Date of Birth: " + getDateOfBirth() + "\n" +
                "Age: " + getAge() + " years\n" +
                "Maximum Heart Rate (MHR): " + getMaximumHeartRate() + " bpm";

    }

}
