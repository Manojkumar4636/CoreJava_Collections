/*Static Keyword Concept
------------------------
1 - Can be used with class, variable, method and block.
2 - belong to the class instead of a specific instance, this means if you make a member static, you can access it without object.

static method
--------------
=> Create a static method and call it without object.

static block
-------------
=> Static block is nothing but of block of code which additionally has the keyword of 
   static is called static block.
=>Initializing the static variables.
=>Gets executed when the class is loaded in the memory.
=>Can have multiple static blocks, execution in written order.
=>Why we go Static block to initialize the value of static variable.

static variables
----------------
=> Common to all the instances or objects of the class because it is a class level variable.
=> Only a single copy of static variable is created and shared among all the instances of the class.

static class
-------------
=> A class can be made static only if it is a nested class.
=> We don't need this. Because we wont use nested class.

*/

package com.learn.java.day7;

public class StaticKeywordConcept {
	
	//Static method
	public static void staticMethod() {
		System.out.println("Static method");
	}
	
	public void nonStaticMethod() {
		System.out.println("Non-Static method");
	}
	
	public static void main(String[] args) {
		staticMethod();
		//nonStaticMethod(); and cannot call it without object. 
	}

}

/*
OUTPUT
--------
Static method
*/