package co.practice.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListCodePrac {

 public static void main(String[] args) {
	List<Integer> num = new ArrayList <>();
	   num.add(22);
	   num.add(12);
	   num.add(32);
	   num.add(02);
	   num.add(72);
	   num.add(82);
	 Collections.reverse(num);
	 Collections.sort(num);
	   
	  System.out.println(num);
	for (int i=0; i< num.size();i++) {
     System.out.println(num.get(i));
	}
	for(int j:num) {
		System.out.println();
	}
	}
 }	
	

