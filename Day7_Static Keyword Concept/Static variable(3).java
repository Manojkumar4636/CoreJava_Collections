package com.learn.java.day7;

public class StaticVariable {
	
	//Static variable
	//Example Only a single copy of static variable is created and shared among all the instances of the class.
	static int accountBalance = 0;
	String depositedBy;
	
	public static void main(String[] args) {
	
		 StaticVariable account1 = new StaticVariable();
		 account1.accountBalance=1000;
		 account1.depositedBy="Manoj";
		 
		 StaticVariable account2 = new StaticVariable();
		 account2.accountBalance=2000;
		 account2.depositedBy="Manojkumar";
		 
		 System.out.println("Account 1 "+account1.accountBalance);
		 System.out.println("DepositedBy "+account1.depositedBy);
		 System.out.println("Account 2 "+account2.accountBalance);
		 System.out.println("DepositedBy "+account2.depositedBy);
	}

}

/*
OUTPUT
--------
Account 1 2000
DepositedBy Manoj
Account 2 2000
DepositedBy Manojkumar
*/