package co.practice.code;

import java.util.HashSet;
import java.util.Set;



public class SetTest1 {
	public static void duplicate() {
		int []dup = {20,30,40,50,60,40};
		Set <Integer>number=new HashSet<>();
		for(int x:dup) {
			if(number.add(x)==false) {
				System.out.println("duplicate value  "+x);
			}
			}
}
public static void splitTest() {
	String number = "20 80 70 60 70";
	String []  num= number.split("\\s");
	for(String i:num) {
		System.out.println(i);
	}
	}
public static void main(String[] args) {
	duplicate();
    splitTest();
}	
}
