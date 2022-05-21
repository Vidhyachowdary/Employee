package org.login;

import org.packageclassdifferentclass.Company;
import org.packageclassdifferentclass.Employee;

public class Client {

	
	public void clientId() {
	System.out.println("cli id is 159357");

	}
	
	public void cliName() {
		System.out.println("cli name is mabjan");

	}
	
	public static void main(String[] args) {
		Client b=new Client();
		b.clientId();
		b.cliName();
		
		Company c=new Company();
		c.comanyId();
		c.companyName();
		
		Employee e=new Employee();
		e.empId();
		e.empName();
		
		
		
	}
}
