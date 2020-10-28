package co.practice.code;

public class StringTest {
	
	
	public static void immutabletest() {
		String name = "Masud Rana";//immutable
		       name = "Tawhid";//immutable
		       name ="Zarin";
		 System.out.println(name);     
	}
	 public static void string1() {
		 String obj = new  String("Ups");
		 obj.concat("Company");
		 System.out.println("I am a String class  "+ obj);
	 }
 public static void stringBuffer() {
			 StringBuffer obj = new  StringBuffer("Ups ");
			 obj.append("Company");
			 System.out.println("I am a StringBuffer class  " + obj);
		 } 
 public static void stringBuilder() {
				 StringBuilder obj = new  StringBuilder("Ups ");
				 obj.append("Company");
				 System.out.println("I am a String class  " + obj);
		        }
 //How to reverse string ?
public static void stringBuffeReverse() {
	String obj = new  String("SMARTTECH");	
	String rev = new StringBuffer(obj).reverse().toString();
	System.out.println("Reverse String value :" +rev);
	}	
public static void getSpecificCar() {
	String obj = new  String("SMARTTECH");
	char ch = obj.charAt(4);
	System.out.println("Index number of char is a :"+ch);
}
//How to compare to string?
public static void compareString() {
    String s1 = "Selenium";
    String s2 = "Selenm";
    System.out.println(s1==s2);
    System.out.println(s1.equals(s2));
}
//How to split the Word?
public static void splitWord() {
String word = "Republic of Bangladesh";
String [] wd = word.split("\\s");
for(String w :wd) {
	System.out.println(w);
}}
public static void upperCaseLowerCase() {
//String obj = new String	("BANGLADESH");
String obj = new String	("bangladesh");
System.out.println(obj.toUpperCase());
System.out.println(obj.toLowerCase());
}
//how to remove special sine form string
public static void removespecialsine() {
	String value = "My #*name@ Masud%Rana$";
	value=value.replaceAll("[^a-zA-z0-9]", "");
	System.out.println(value);
	
	String num ="10,500.97";
	num=num.replaceAll("\\w+", "");
	System.out.println(num);
			
}




public static void main(String[] args) {
	//string1();
	//stringBuffer();
    //stringBuilder();
	//stringBuffeReverse();
	//getSpecificCar();
	//compareString();
	//splitWord();
	//upperCaseLowerCase();
	removespecialsine();
}
}
