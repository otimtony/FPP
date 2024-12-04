package Lesson5.Question4;

public class CommissionEmployee extends Employee {

    protected double grossSales;
    protected double commissionRate;

    CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    double getCommissionRate() {
        return commissionRate;
    }

    double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    double getPayment() {
        return grossSales * (commissionRate / 100);
    }

    @Override
    public String toString() {
        return "Employee Details:\n" +
                "First Name: " + super.getFirstName() + "\n" +
                "Last Name: " + super.getLastName() + "\n" +
                "Social Security Number: " + super.getSocialSecurityNumber() + "\n" +
                "Gross Sales: " + getGrossSales() + "\n" +
                "Commission Rate: " + getCommissionRate() + "\n" +
                "Salary: " + getPayment() + "\n";
    }
}
