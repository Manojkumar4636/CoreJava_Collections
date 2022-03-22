package com.learn.java.day11;


//Child class
public class ManojBank implements AxisBank {

	@Override
	public void savings() {
		System.out.println("5%");
	}

	@Override
	public void fixed() {
		System.out.println("8%");
	}

	@Override
	public void deposited() {
		System.out.println("4%");
	}
	public static void main(String[] args) {
		ManojBank bank = new ManojBank();
		bank.deposited();
		bank.fixed();
		bank.savings();
	}

}

/*
OUTPUT
-------
4%
8%
5%
*/