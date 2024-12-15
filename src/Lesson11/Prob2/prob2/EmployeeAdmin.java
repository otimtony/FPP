package Lesson11.Prob2.prob2;

import java.util.*;

public class EmployeeAdmin {
	
	/**
		
	Your method prepareReport should return a list of all Employees in the input table 
	whose social security number is in the input list socSecNums and whose salary is greater than $80,000. 
	In addition, this list of Employees must be sorted by social security number, in ascending order (from numerically smallest to numerically largest).
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		List<Employee> tempList = new ArrayList<>();
		Set<String> keys = table.keySet();
		for(String key: keys) {
			double salary = table.get(key).getSalary();
			if(salary > 80000 && socSecNums.contains(key)) tempList.add(table.get(key));
		}

		Collections.sort(tempList, new EmployeeComparator());
		return tempList;
		
	}
	
}
