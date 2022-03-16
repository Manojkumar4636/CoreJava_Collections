package com.learn.java.day3;

//Define Constructor Overloading

public class ConstructorOverloading {

	String drawing;

	//No Argument Constructor
	ConstructorOverloading(){
		System.out.println("Draw the Images");
	}

	//Parameterized Constructor
	ConstructorOverloading(String toDrowing ){
		drawing=toDrowing;
		System.out.println("Drawing "+toDrowing);
	}
	public static void main(String[] args) {
		ConstructorOverloading overloading = new ConstructorOverloading();
		ConstructorOverloading overloading1 = new ConstructorOverloading("circle");
	}

}
