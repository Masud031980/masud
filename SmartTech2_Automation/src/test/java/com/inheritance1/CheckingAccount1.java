package com.inheritance1;

public class CheckingAccount1 extends SavingAccount1 {
	
	 protected void CheckingDetails()
	 {
	 CheckingAccount1. Initialbalance = 25000;
	 CheckingAccount1.deposit =    3000; 
	 CheckingAccount1.withdraw =    2000;
	 CheckingAccount1. balance  = CheckingAccount1.Initialbalance +CheckingAccount1. deposit -CheckingAccount1. withdraw ;

	System.out.println("Customer Checking total "+ CheckingAccount1. balance );
	 }

}
