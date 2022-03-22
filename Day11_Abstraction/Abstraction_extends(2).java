package com.learn.java.day11;

public class Benz extends Car{

 /* If a child does not implement all the abstract methods of parent class,
	then the child class must need to be declared abstract as well*/
	
	@Override
	public void carWheel() {
		System.out.println("4 - Wheels");
	}
	

	@Override
	public void carEngine() {
		System.out.println("Engine Secret");
	}
	
	public static void main(String[] args) {
		Benz car = new Benz();
		car.carCc();
		car.carEngine();
		car.carWheel();
	}

}

/*
OUTPUT
-------
650CC
Engine Secret
4 - Wheels
*/
