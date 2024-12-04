package Lesson5.Question4;

public class HourlyEmployee extends Employee {

    double wage;
    double hours;

    HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {

        super(firstName, lastName, socialSecurityNumber);

        this.wage = wage;
        this.hours = hours;
    }


    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    double getWage() {
        return wage;
    }

    double getHours() {
        return hours;
    }


    @Override
    double getPayment() {
        return wage * hours;
    }

    @Override
    public String toString() {
        return "Employee Details:\n" +
                "First Name: " + super.getFirstName() + "\n" +
                "Last Name: " + super.getLastName() + "\n" +
                "Social Security Number: " + super.getSocialSecurityNumber() + "\n" +
                "hours: " + getHours() + "\n" +
                "Wage: " + getWage() + "\n" +
                "Salary: " + getPayment() + "\n";
    }
}
