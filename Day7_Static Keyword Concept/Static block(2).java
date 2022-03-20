package com.learn.java.day7;

public class StaticBlock {
	
	//Static block
	static{
		System.out.println("Static block - 1");
	}
	
	static{
		System.out.println("Static block - 2");
	}
	
	
	public static void main(String[] args) {
		System.out.println("Main method");
	}

}

/*OUTPUT
-------
Static block - 1
Static block - 2
Main method
*/