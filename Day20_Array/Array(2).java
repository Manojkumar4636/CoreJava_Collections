package com.learn.java.array;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		
		int a[][]  = new int[2][3];
		
		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;
		
		a[1][0] = 40;
		a[1][1] = 50;
		a[1][2] = 60;
		
		System.out.println(a[1][2]);
		
		int length = a.length;
		System.out.println("Length is: "+length);
		
		System.out.println("For loop iterate");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(a[i][j]);
			}
		}
	}
}

