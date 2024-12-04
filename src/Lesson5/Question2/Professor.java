package Lesson5.Question2;

import java.time.LocalDate;

public class Professor extends DeptEmployee{

    private int numberOfPublications;

    public Professor(String name, LocalDate hireDate, int numberOfPublications, double salary) {
        super(name, hireDate, salary);
        this.numberOfPublications = numberOfPublications;
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }
    @Override
    public double computeSalary(){
        return salary;
    }

}
