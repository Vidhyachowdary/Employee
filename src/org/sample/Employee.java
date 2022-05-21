package org.sample;

public class Employee {

		private void information() {
		
		
		String empId = "employee is id 12345";
		System.out.println("empId is"+empId);
		
		String empName = "mabjan";
		System.out.println("empName is"+empName);
		
		String empEmail = "mabjan6175@gamil.com";
		System.out.println("empEmail is"+empEmail);
		
		long phonenumber = 8217293924l;
		System.out.println("phonenumber is"+phonenumber);
		
		double salary = 842531;
		System.out.println("salary is"+salary);
		
		boolean genderfemale = true;
		System.out.println("gender is female"+genderfemale);
		
		String empCity ="Bangalore";
		System.out.println("emp city is bangalore"+empCity);
		
	}
	
	public static void main(String[] args) {
		Employee e=new Employee();
		e.information();
	}
}
