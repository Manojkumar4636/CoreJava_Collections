//InputMismatchException

package com.learn.java.day14;

import java.util.Scanner;

public class InputMismatchException {

	//InputMismatchException
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Id: ");
		int nextInt = scan.nextInt();
		System.out.println(nextInt);
		
	}

}


/*OUTPUT
------
InputMismatchException Error Show
*/