//Array index out of bound exception

package com.learn.java.day14;

public class ArrayIndexOutOfBoundException {

	//ArrayIndexOutOfBoundsException
	public static void main(String[] args) {
		int a[] = new int [2];
		a[0] = 10;
		a[1] = 20;
		
		System.out.println(a[7]);

	}

}

/*
OUTPUT
------
ArrayIndexOutOfBoundsException Error Show
*/