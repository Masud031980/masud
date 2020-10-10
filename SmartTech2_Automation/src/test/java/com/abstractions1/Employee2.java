package com.abstractions1;

public class Employee2 implements Companyidea,Companyidea2{

	public void getEmployees() {
		System.out.println("Zarin");
		
	}

	public void getsalary() {
		System.out.println("12000");	
		
	}

	public void getcar() {
		System.out.println("Honda");
		
	}

	public void getmedicare() {
		System.out.println("full");
		
	}
	public static void main(String[] args) {
		Employee2 obj=new Employee2();
			obj.getEmployees();
			obj.getsalary();obj.Engine();
			obj.getmedicare();
			obj.Brand();
			obj.Engine();
			obj.Model();
			obj.year();
	}

	@Override
	public void Engine() {
		System.out.println("flatsix");	
		
	}

	@Override
	public void Model() {
		System.out.println("488");
		
	}

	@Override
	public void Brand() {
		System.out.println("bmw");
	
	}

	@Override
	public void year() {
		System.out.println("2020");
		
	}

}
