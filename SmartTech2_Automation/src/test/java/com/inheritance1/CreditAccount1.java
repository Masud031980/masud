package com.inheritance1;

public class CreditAccount1 extends CheckingAccount1{
	
	protected void creditDetails(){
		CreditAccount1.Initialbalance  =50000;
		CreditAccount1.withdraw  = 3000;
		CreditAccount1.balance = CreditAccount1.Initialbalance - CreditAccount1.withdraw;
		System.out.println("Customer total Credit account money" +CreditAccount1.balance);
		
	}
	}		  


