package com.inheritance1;

public class SavingAccount1 {
	
	
	static String name;
	 static  double Initialbalance;
	 static double deposit;
	 static  double withdraw;
	 static double balance;
	 
	 
	 protected void openAccount() {
		 name = "Masud";
		 int id = 1077;
		 String address = "299 n main st";
		 int Account  =1219900;
		 String Customer =   name   +"    Customer ID  "   +  id  +  "    Customer address  "  +  address+   "  Account Number is   :"+   Account;
		 System.out.println("Customer info  :"+ Customer);
	 
	 }
	  protected void savingDetails() {
		 
		name = "Masud";
		 Initialbalance =   15000;
		  deposit =    4000; 
		 withdraw =    3000;
		 balance  =  Initialbalance+    deposit - withdraw ;
		
		 System.out.println("Customer total saving "+ balance);
		 
				
			}
		  }





