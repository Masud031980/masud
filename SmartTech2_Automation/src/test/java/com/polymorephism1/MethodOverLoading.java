package com.polymorephism1;

public class MethodOverLoading {

	//Method over loading
	
	public void getname(String name, int age,int id) {
	System.out.println("My name : "+ name + " My age : "+ age +" My id :"+ id);
}
public void getname( int age, int id,String name) {

}
public void getname(String address,int salary) {
}
public void getname(int salary,String address) {
}	
public void getname(int salary,int age,int id) {
	}
	public static void main(String[] args) {
		MethodOverLoading obj=new MethodOverLoading();
         obj.getname("Masud", 39, 1002);
}	
}	


