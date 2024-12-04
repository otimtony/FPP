package Lesson5.Question4;

public class TestClass {

    public static void main(String[] args) {
        Employee commissionEmployee = new CommissionEmployee("ALex", "karma", "001x", 9000, 10);
        Employee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Alice", "Johnson", "002x", 7500, 8, 1000);
        Employee hourlyEmployee = new HourlyEmployee("Emma", "Wilson", "003x", 27, 40);
        Employee salariedEmployee = new SalariedEmployee("John", "Smith", "004x", 1500);
        Employee basePlusCommissionEmployee2 = new BasePlusCommissionEmployee("David", "Lee", "005x", 6500, 9, 1100);


        Employee[] employeeArr = {commissionEmployee, basePlusCommissionEmployee, hourlyEmployee, salariedEmployee, basePlusCommissionEmployee2};





        Employee maxSalariedEmployee = findMaxSalary(employeeArr);
        System.out.println(maxSalariedEmployee.toString());
    }


    public static Employee findMaxSalary(Employee[] col) {

        if (col.length == 0) {
            throw new IllegalArgumentException("invalid employee array");
        }

        Employee maxSalaryEmployee = col[0];


        for (Employee employee : col) {


            if (employee.getPayment() > maxSalaryEmployee.getPayment()) {
                maxSalaryEmployee = employee;
            }
        }


        return maxSalaryEmployee;
    }
}
