package prob2;
import Lesson8.prob2.EmployeeData;

import java.util.*;
public class Statistics {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData> list) {

		if(list.isEmpty()) {
			throw new RuntimeException("Null employee list provided");
		}

		double sum = 0;
		for (EmployeeData x : list) {
		   sum = sum + x.getSalary();
		}

		return sum;
		//implement
		//compute sum of all salaries of people in aList and return
	}
}
