package com.abstractions1;

import java.security.PublicKey;

public class Employee implements Companyidea {

	public void getEmployees() {
	System.out.println("Employee name :  Md Masud rana");
		
	}

	public void getsalary() {
		System.out.println("Employee salary :  105000");
		
	}

	public void getcar() {
		System.out.println( "Employee car :  New car");
		
	  
	}

	public void getmedicare() {
	System.out.println("Employee Medicara  :    Full coverage");
	}
	public static void main(String[] args) {
		Employee obj =new Employee();
		obj.getEmployees();
		obj.getsalary();
		obj.getcar();
		obj.getmedicare();
				
				
		
	}
	
	


}
