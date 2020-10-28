package co.practice.code;

import java.util.HashSet;
import java.util.Set;

import org.testng.reporters.jq.Main;

public class SetTest {
	//set is an interface
	//set interface implemented Hashset,LinkedHashset,Treeset
	//set does not allow duplicate value
	//does not maintains the insertion order
	//set allow only one null value
	//set you cannot find the index value
	
	public static void duplicateValue() {
		String []duplicate = {"Mango","Apple","Banana","Orange","Apple"};
		Set<String>name =new HashSet<>();
		for(String i : duplicate) {
			if (name.add(i)==false) {
				System.out.println("duplicate value is "+  i);
			}
		}
	
	}
	public static void main(String[] args) {
		SetTest.duplicateValue();
	}
	
	

}
