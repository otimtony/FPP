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
        return "Employee Details:\n" +
                "First Name: " + super.getFirstName() + "\n" +
                "Last Name: " + super.getLastName() + "\n" +
                "Social Security Number: " + super.getSocialSecurityNumber() + "\n" +
                "Salary: " + getWeeklySalary() + "\n";
    }
}
