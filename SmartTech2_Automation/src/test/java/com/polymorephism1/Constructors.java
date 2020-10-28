package com.polymorephism1;

public class Constructors {
String name;
int age;
String gender;
int id;


	Constructors(String n,int a,String g,int i){
		//initialize variable
     name=n;
	 age=a;
	 gender=g;
	 id=i;
	}
	
	Constructors(){
		
	System.out.println("no valu");
	}
	
	public void display() {
	System.out.println("My name is:"+name +"  My age is:"+age+"  My gender is:"+ gender+"  My id is:"+id);	
	System.out.println("/n");	
		
		
	}
}