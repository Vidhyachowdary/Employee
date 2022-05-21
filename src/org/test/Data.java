package org.test;

public class Data {

	public void information() {
	
		String firstName = "mabjan";
		System.out.println("first name is"+firstName);
		
		String lastname ="rasool sab";
		System.out.println("last name is"+lastname);
		
		long mobile = 8217293924l;
		System.out.println("mobile number is"+mobile);
		
		boolean femalestatus = true;
		System.out.println("feamale status is true"+femalestatus);
		
		boolean malestatus = false;
		System.out.println("male status is false"+malestatus);
		
		byte date =21;
		System.out.println("date is"+date);
		
		short year =2022;
		System.out.println("yaer is 2022"+year);
		
		float salary= 123456.3698f;
		System.out.println("salary is"+salary);
		
		double sal= 123456256.36986;
		System.out.println("sal is"+sal);
				
	}
	
	public static void main(String[] args) {
		Data d= new Data();
		d.information();
	}
}
