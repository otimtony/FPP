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
        return "[" + super.getFirstName() + ", " + super.getLastName() + ", SSN: " + super.getSocialSecurityNumber() +
                ", Gross Sales: $" + getGrossSales() + ", Commission Rate: " + getCommissionRate() + "%, Salary: $" + getPayment() + "]";
    }

}
