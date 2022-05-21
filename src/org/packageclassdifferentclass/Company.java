package org.packageclassdifferentclass;

public class Company {

	public void companyName() {
	System.out.println("company name is hcl");
	}
	
	public void comanyId() {
	System.out.println("company is number is 789456");

	}
	
	public static void main(String[] args) {
		Company c=new Company();
		c.companyName();
		c.comanyId();
		
		Employee e=new Employee();
		e.empId();
		e.empName();
	}
	
}
