package co.practice.code;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapInterface {
	//How to handle the data structure?//Allegories
	//Ans:Help with Map interface also we can handle with LinkedList
	
     //Map is a interface
	//Implemented class HashMap,HashTable,LinkedHashMap
	//Map store the value key & value pair(Id,Name)
	//Map allow only one null key and many null value
	//does not maintain the
	
	public static void main(String[] args) {
		Map<Integer,String> name =new HashMap<> ();
		name.put(1, "Masud");
		name.put(2, "Masud");
		name.put(3, "Masud");//Map allow multiple value
		name.put(4, "Masud");
		name.put(5, "Masud");
		name.put(6, "null");//does not allow the duplicate key 
		name.put(1, "null");//does not allow more than one null key
		
		for (Entry m:name.entrySet()) {
			System.out.println(m.getKey()+ "  "+m.getValue());
		}
	}
	
	
}
