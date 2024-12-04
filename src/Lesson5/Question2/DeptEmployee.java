package Lesson5.Question2;

import java.time.LocalDate;

public abstract class DeptEmployee {

    private String name;
    protected double salary;
    private LocalDate hireDate;

    public DeptEmployee(String name, LocalDate hireDate, double salary) {
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public abstract double computeSalary();
}
