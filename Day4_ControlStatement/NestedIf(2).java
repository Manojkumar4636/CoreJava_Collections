package com.learn.java.day4;

//Define Nested if Condition

public class NestedIf {
	
	public static void main(String[] args) {
		int height=165, weight=55, pressure=88;
		if (height>150) {
			if (weight>50) {
				if (pressure>85) {
					System.out.println("You are eligible to blood donate");
				}
				
			}
			
		}
	}
}

/*OUTPUT
-------

You are eligible to blood donate*/