package com.polymorephism1;

public class ConstructorsSubClass {
public static void main(String[] args) {
	Constructors obj=new Constructors("Masud", 35,"Male",1004);
	obj.display();
	Constructors obj1=new Constructors("Rana", 36,"Male",1007);
	obj1.display();
	Constructors obj2=new Constructors("Sohel", 35,"Male",1005);
    obj2.display();
    Constructors obj3=new Constructors();
	obj3.display();
}
}