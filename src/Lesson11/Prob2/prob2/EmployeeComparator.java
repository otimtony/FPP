package Lesson11.Prob2.prob2;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSsn().compareTo(o2.getSsn());
    }
}
