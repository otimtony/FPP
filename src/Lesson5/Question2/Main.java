package Lesson5.Question2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        System.out.println(LocalDate.now());

        DeptEmployee[] dept = new DeptEmployee[5];

        DeptEmployee p1 = new Professor("Tony Otim", LocalDate.of(2024, 12, 13), 3, 1500);
        DeptEmployee p2 = new Professor("Sushil Karki", LocalDate.now(), 4, 5600);
        DeptEmployee p3 = new Professor("Pavin Robin", LocalDate.of(2021, 4, 15), 3, 3000);

        DeptEmployee s1 = new Secretary("Jallow Amadou", LocalDate.of(2009, 9, 15), 300, 1300);
        DeptEmployee s2 = new Secretary("Akera Brian", LocalDate.of(2013, 4, 28), 800, 7800);

        dept[0] = p1;
        dept[1] = p2;
        dept[2] = p3;
        dept[3] = s1;
        dept[4] = s2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Do you wish to see the sum of all Professor and Secretary salary in the department? (Yes/No)");

        String input = sc.nextLine();

        if (input.isEmpty()) {

            System.out.println("The input is empty.");

        } else if (input.equals("y")) {

            double totalSalary = 0;
            for (DeptEmployee employee : dept) {
                totalSalary += employee.computeSalary();
            }

            double averageSalary = totalSalary / dept.length;

            System.out.println("Total employees salary: " + totalSalary);
            System.out.println("Average employee salary: " + averageSalary);

        } else {

            System.out.println("The input is neither empty nor equal to 'y'.");

        }

        sc.close();

        System.out.println(findEmploy(dept).toString());

    }

    public static DeptEmployee findEmploy(DeptEmployee[] deptEmployee){

        if(deptEmployee == null || deptEmployee.length == 0){
            return null;
        }

        DeptEmployee deptEmployee1 = null;
        double maxSalary = 0.0;

        for (DeptEmployee employee: deptEmployee){
            if(employee.computeSalary() > maxSalary){
                maxSalary = employee.computeSalary();
                deptEmployee1 = employee;
            }
        }

        return deptEmployee1;

    }
}
