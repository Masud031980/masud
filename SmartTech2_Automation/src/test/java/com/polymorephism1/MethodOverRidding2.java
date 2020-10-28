package com.polymorephism1;

public class MethodOverRidding2 extends MethodOverRidding1{
	 public void wife() {
		 System.out.println("My wife name is ABC");
	
	 }
	
	public static void main(String[] args) {
		
		MethodOverRidding1 obj =new MethodOverRidding1();
		obj.getCash();
		obj.getGold();
		obj.getProperty();
		obj.wife();
	}

}
