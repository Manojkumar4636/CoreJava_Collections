/*Abstraction
-------------
=>Hiding the implementation details or method business logic details.

Types of abstraction
--------------------
1 - Abstract class (Partial abstraction)
2 - Interface (Fully abstraction)

Abstract class
---------------
=> Contains both abstract and non abstract methods.
=> We can't create object for abstract class.
=> Contains keywords extends.
=> If a class is having, an unimplemented method (Without body), then the method should be declare abstract.
=> If a class is having one abstract method then it should be declared whole "class" is abstract.
=> A class can be declared abstract even if doesn't have abstract methods.
=> If a child does not implement all the abstract methods of parent class, then the child class must need to be declared abstract as well.

2 - Interface
--------------
=> Contain only the abstract methods.
=> We can't create object for interface.

How a class can be use an Interface?
=> By using implements keyword.

How an Interface use another Interface?.
=> By using extends keyword.

Tag or Marker Interface
----------------
=> An empty interface is known as tag or marker interface.

Encapsulation
---------------
=>Process of binding data and methods together into a single unit.

*/
package com.learn.java.day11;

public abstract class Car {

	public abstract void carWheel();	
	public abstract void carEngine();
	
	public void carCc() {
		System.out.println("650CC");
	}
	
	//We can't create object for abstract class	
	
}
