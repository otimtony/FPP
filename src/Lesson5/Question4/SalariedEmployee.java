package Lesson5.Question4;

public class SalariedEmployee extends Employee {

    double weeklySalary;

    SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);

        this.weeklySalary = weeklySalary;

    }

    String getWeeklySalary() {
        return weeklySalary + "";
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }


    @Override
    double getPayment() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return "[" + super.getFirstName() + ", " + super.getLastName() + ", SSN: " + super.getSocialSecurityNumber() + ", Salary: $" + getWeeklySalary() + "]";
    }
}

