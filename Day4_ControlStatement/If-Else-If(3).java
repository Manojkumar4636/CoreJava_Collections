package com.learn.java.day4;

//Define if else if / else if ladder Condition

public class IfElseIf {
	
	String hero = "Vijay";
	
	private void myFavHero() {
		
		if (hero.equals("Ajith")) {
			System.out.println("Correct");
		}else if (hero.equals("Suriya")) {
			System.out.println("Correct");
		}else if (hero.equals("STR")) {
			System.out.println("Correct");
		}else {
			System.out.println("I'm not find your hero");
		}

	}
	public static void main(String[] args) {
		IfElseIf hero = new IfElseIf();
		hero.myFavHero();
	}

}

/*
OUTPUT
-------

I'm not find your hero*/