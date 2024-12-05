package Lesson5.Question4;

class BasePlusCommissionEmployee extends CommissionEmployee {

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
        return "Employee Details:\n" +
                "First Name: " + super.getFirstName() + "\n" +
                "Last Name: " + super.getLastName() + "\n" +
                "Social Security Number: " + super.getSocialSecurityNumber() + "\n" +
                "base Salary: " + getBaseSalary() + "\n" +
                "Gross Sales: " + getGrossSales() + "\n" +
                "Commission Rate: " + getCommissionRate() + "\n" +
                "Salary: " + getPayment() + "\n";
    }


}
