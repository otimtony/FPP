package Lesson3.Question2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

class HeartRates {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private static final double LB = 0.5;
    private static final double UB = 0.85;
    private final int RHR = 70;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");

    HeartRates(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    //  getters and setters
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
        return 220 - getAge();
    }

    public int getAverageHeartRate() {
        return getMaximumHeartRate() - RHR;
    }

    public double getLowerBoundaryTargetHeartRate() {
        return (getAverageHeartRate() * LB) + RHR;
    }

    public double getUpperBoundaryTargetHeartRate() {
        return (getAverageHeartRate() * UB) + RHR;
    }

    //  Utility function to calculate duration in years
    private int getYrsDiffFromToday(String date) {
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.parse(date, formatter);
        return Period.between(birthDate, today).getYears();
    }


    @Override
    public String toString() {
        return "[First Name: " + getFirstName() + ", Last Name: " + getLastName() +
                ", Date of Birth: " + getDateOfBirth() + ", Age: " + getAge() + " years" +
                ", Maximum Heart Rate (MHR): " + getMaximumHeartRate() + " bpm]";
    }


}
