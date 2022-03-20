package com.learn.java.day8;

public class Bmw extends Car {
	
	//Bmw is child of Car, Car is parent of Bmw it is called "IS-A" relationship.
	
	public static void main(String[] args) {
		
		Bmw car = new Bmw();
		car.carEngine();
		System.out.println("HeadLight "+car.headLight);
		
	}
}
