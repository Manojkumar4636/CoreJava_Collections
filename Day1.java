/*

OOPS 
----
=> OOPS - Object Oriented Programming Structure.
=> It is a method of implementation in which program is organised as collections of class, methods and objects.

Principles:
-----------
1 - Class
2 - Method
3 - Object
4 - Inheritance
5 - Polymorphism
6 - Abstraction
7 - Encapsulation

Working:
--------
Project --> Package --> Class --> (Methods + Object)

* Project is a collections of package.
* Package is a collections of class.
* Class is a collections of object and methods.
* Method is a set of actions to be performed // bussiness logic.
* Object 
     =>It is a runtime memory allocation.
     =>It is used to call the methods.
     =>SYNTAX ==> ClassName objectName = new ClassName();
* Call the method  
     =>SYNTAX ==> objectName.methodName


Standard Notation:
------------------
1 - Pascal Notation
  =>Each word first letter, must be in capital letter.
  =>Pascal Notation used in ProjectName, ClassName

2 - Camel Notation
  =>First word first letter should be in small letter, remaining word first letter start with capital.
  =>Camel Notation used in methodName, objectName, variableName


Wrapper Classes:
----------------
Primitive Datatype - byte, Short, int, long, double, float, char, boolean
Wrapper class - Byte, Short, Integer, Long, Double, Float, Character, Boolean

Entry point of execution:
-------------------------
public static void main(String [] args){

}
*/


package com.learn.java.day1;

public class BankAccount {
	long accountNumber=620818104054l;
	String accountName="MANOJKUMAR";
	int accountBalance=1500;

	private void getBalance() {
		System.out.println(accountNumber);
	}
	private void getName() {
		System.out.println(accountName);
	}
	private void getNumber() {
		System.out.println(accountBalance);
	}
      //Entry point of execution
	public static void main(String [] args){
		//ClassName objectName = new ClassName();
		BankAccount details = new BankAccount();
		//objectName.methodName
		details.getBalance();
		details.getName();
		details.getNumber();
	}

}