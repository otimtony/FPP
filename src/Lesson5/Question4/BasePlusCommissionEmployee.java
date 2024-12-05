package Lesson5.Question4;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    double baseSalary;

    BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }


    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    double getPayment() {
        return baseSalary + super.grossSales * (commissionRate / 100);
    }

    @Override
    public String toString() {
        return "[" + super.getFirstName() + ", " + super.getLastName() + ", SSN: " + super.getSocialSecurityNumber() +
                ", Base Salary: $" + getBaseSalary() + ", Gross Sales: $" + getGrossSales() +
                ", Commission Rate: " + getCommissionRate() + "%, Salary: $" + getPayment() + "]";
    }



}
