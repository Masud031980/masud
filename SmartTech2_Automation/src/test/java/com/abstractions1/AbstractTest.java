package com.abstractions1;

public class AbstractTest extends CompanyIdea3{

	@Override
	void getspeed() {
 System.out.println("per hours 122");	
		
	}

	@Override
	void getEmployees() {
		 System.out.println("Masud");	
		
	}

	@Override
	void getsalary() {
		 System.out.println("120000");
		
	}

	@Override
	void getcar() {
		 System.out.println("sda");
		
	}

	@Override
	void getmedicare() {
		 System.out.println("full");
		
	}
	public static void main(String[] args) {
		AbstractTest obj=new AbstractTest ();
		obj.getEmployees();
		obj.getsalary();
	}
	

}
