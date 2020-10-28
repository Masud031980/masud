package co.practice.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.testng.reporters.jq.Main;

public class CodingPractice {
	public static void Arraymethod() {
	int num []= new int [6];
	
	num [0]=10;
	num [1]=20;
	num [2]=30;
	num [3]=40;
	num [4]=50;
	num [5]=60;
	System.out.println(Arrays.toString(num));
	System.out.println(num[3]);
	
	for (int i = 0; i < num.length; i++) { // i j k
	 System.out.println(i);
	}
	}
	//for (int j : num) {
		
	//}	
	public static void multiArrayMethod() {
	String[][] names  = {{"md ,mr,mrs"},
	            {"rana,ahmed,pervin"}};
	
	
	System.out.println(names[0][2] + names[1][2]);
	System.out.println(names[0][0] + names[1][2]);
	
	}
		
	//Arraylist<tegerin>num=new Arraylist<>();
	
	public static void ArrayListStringTest() {
	
	
	 List<String> num = new ArrayList<>();
		num.add("Java");
		num.add("Maven");
		num.add("Cucumber");
		num.add("TestNG");
		num.add("GitHub");
		num.add("Jenkins");
		num.add("JDBC");
		num.add("Appache POI");
		num.add("Appache POI");
		num.add("Null");
		num.add("Null");
		
		
		
		
		
		//Collections.sort(num,Collections.reverseOrder());
		//System.out.println(num);
		//Collections.sort(num);
		//System.out.println(num);
		//Collections.reverse(num);
		//System.out.println(num);
		num.size();
		
	}

		

	
	public static void main(String[] args) {
		ArrayListStringTest();
		//multiArrayMethod();
		//Arraymethod();
	}
}

