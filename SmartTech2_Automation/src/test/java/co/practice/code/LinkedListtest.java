package co.practice.code;

import java.util.LinkedList;

public class LinkedListtest {
	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<>();
		
		names.add(0,"Apple");
		names.add(1,"Orange");
		names.add(2,"Mango");
		names.add(3,"Banana");
		names.add(4,"Pears");
		System.out.println(names.size());
		names.addFirst("Peach");
		names.addLast("Pinapple");
		names.removeLast();
		System.out.println(names);
		
	}
	

}
