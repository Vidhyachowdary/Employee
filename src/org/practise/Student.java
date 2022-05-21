package org.practise;

public class Student {

	public void information() {
    
	String studentId = "Id number is 12345";
	System.out.println("student id number is"+studentId);
	
	String studentName = "pallavi";
	System.out.println("student name is pallavi"+studentName);
	
	String studentEmail = "student12345@gamil.com";
	System.out.println("student emailid is"+studentEmail);
	
	long studentMobileno = 9638527413l;
	System.out.println("student mobile number is"+studentMobileno);
	
	String Department = "mechanical";
	System.out.println("department is"+Department);
	
	boolean GenderFemale = true;
	System.out.println("gender is female"+GenderFemale);
	
	String City = "Bengaluru";
	System.out.println("city is"+City);
	
	}
	
	public static void main(String[] args) {
		Student s=new Student();
		s.information();
	}
}
