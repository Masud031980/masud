package co.practice.code;

import java.util.ArrayList; //you cannot create you class ArrayList is give u error
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;
 
public class ListInterfaceTest {
	
	//Homogeneous data
    //How to dealer arrayList  
	//public static void ArrayListTest() {
		//this is java 1.6 non generic cod thats why is yellow sine
		/*ArrayList<Integer> num = new ArrayList<>();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		num.add(60);
		num.add(70);
		num.add(80);*/
	  public static void  ArrayListStringTest() {
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
		num.add("Null");//increase the size50%
		}
	public static void vectortest() {
		Vector num  = new Vector();
		num.add("Selenium");
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
		num.add("Null");// Increase the size 100%*/
		

		//if (num.contains("JDBC"));
		//System.out.println("JDBC is exists :");
	//	else
			//System.out.println("JDBC is not exists");
		
		
		
		//System.out.println(num);	
	   // num.clear();
       //System.out.println(num.size());
		//System.out.println(num);
		//num = num.stream().distinct().collect(Collectors.toList());
		
			//System.out.println("My string size is:"+  num.size());	
			//num.size();
			               //Descending
			
		                    //Ascending
			
		//System.out.println(num.get(5));
	    //for loop
		
		for (int i = 0; i< num.size(); i++) {
			System.out.println(num.get(i));
		}
		//for (String j : num) {
			}
		//System.out.println(num);
		
	  public static void main(String[] args) {
		//ArrayListTest();
		 ArrayListStringTest();
		  vectortest();
	}
		
	}
	
