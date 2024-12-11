package Lesson8.prob3;

import java.util.ArrayList;
import java.util.List;

public class Marketing {
	private String employeename;
	private String productname;
	private double salesamount;

	public Marketing(String employeename, String productname, double salesamount) {
		this.employeename = employeename;
		this.productname = productname;
		this.salesamount = salesamount;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public double getSalesamount() {
		return salesamount;
	}

	public void setSalesamount(double salesamount) {
		this.salesamount = salesamount;
	}

	@Override public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Marketing marketing = (Marketing) o;
		if (Double.compare(marketing.salesamount, salesamount) != 0) {
			return false;
		}
		if (!employeename.equals(marketing.employeename)) {
			return false;
		}
		return productname.equals(marketing.productname);
	}

	@Override
	public String toString() {
		return employeename + " " + productname + " " + salesamount;
	}

}