package com.inheritance1;

public class AccountSummary1 extends CreditAccount1{



public static void main(String[] args) {
// if We need both class property then we need to be create child class object
AccountSummary1 obj = new AccountSummary1();
obj.openAccount();
obj.savingDetails();
obj.CheckingDetails();
obj.creditDetails();

}

} 


