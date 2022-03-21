package com.learn.java.day10;

//Method Overriding
public class Son extends Parent {
	
	//Child class
	@Override
	public void marriage() {
		System.out.println("Sorry daddy ");
	}

	public static void main(String[] args) {
		Son use = new Son();
		use.properties();
		use.marriage();
		
	}
}

/*
OUTPUT
------
Son use my all properties
Sorry daddy 
*/