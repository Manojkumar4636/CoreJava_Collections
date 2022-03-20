/*Inheritance
-------------
=>Process of acquiring the properties(Data + method), data in the sence variables, method(functions).
=>We can access one class property from another class by using extends keyword.

The one which takes - Child Class
The one which gives - Parent Class

Note :
------
A child can be a parent of another class
A parent can be a child of another class

How to inherit?
----------------
Using extends keyword

Advantages of Inherited
-----------------------
=>Reusable code purpose
=>Memory waste is low

Types of Inheritance
--------------------
1 - Single Inheritance : Parent --> Child
2 - Multi Level Inheritance : GrandParent --> Parent --> Child 
3 - Multiple : Parent1 + Parent2 -->Child (Multiple inheritance doesn't work in java)
  =>Priority problem
  =>Syntax error
  =>Compile time error
  
How to achieve the multiple inheritance by using "Interface" we can achieve the inheritance.
  
4 - Hierarical Inheritance : Parent1 --> Child1, Parent1 --> Child2, Parent1 --> Child3
  =>Combination of one parent class and more then one child class.

*/


package com.learn.java.day8;

public class Car {
	//Variables
	int wheels = 4;
	String headLight ="LED";
	String sheet = "7 Sheeter";
	
	//Function
	public void carEngine() {
		System.out.println("650CC hours power");
	}
	

}
