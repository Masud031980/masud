package com.encapsaulation1;

public class Encapsaulation1A {
	
	//we have to declare the valu as a private access modify.
	private String name="Masud";
	private String jobtital="QA Tester";
	private int salary= 100000;
	//we need getter and setter method (right click then source than getter and setter)
	public String getName() {
		return name;
	}
	public String getJobtital() {
		return jobtital;
	}
	public int getSalary() {
		return salary;
		
	}//finish with in class 
	public static void main(String[] args) {
		Encapsaulation1A obj =new Encapsaulation1A();
		  //system.print is not necessary 
		
		System.out.println(obj.getName());
		System.out.println(obj.getJobtital());
	
		System.out.println(obj.getSalary()); 
	}
	}
    

