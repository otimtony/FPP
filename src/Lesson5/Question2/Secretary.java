package Lesson5.Question2;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {

    double overtimeHours;

    public Secretary(String name, LocalDate hireDate, double overtimeHours, double salary) {
        super(name, hireDate, salary);
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double computeSalary() {
        return salary + 12 * overtimeHours; // Secretary gets overtime payment
    }
}
