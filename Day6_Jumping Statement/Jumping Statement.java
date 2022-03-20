/*Jumping Statement
------------------

1 - break - To terminate the loop.
2 - continue - It is used to skip the particular condition and proceed the remaining loop.
3 - System.exit() - It is used to terminate the whole main program.

 */
package com.learn.java.day6;

public class JumpingStatement {
	public static void main(String[] args) {
		
		
		//break statement
		System.out.println("break statement");
		for (int i = 0; i < 10; i++) {
			if (i==5) {
				break;
			}
			System.out.println(i);
		}
		
		
		//continue statement
		System.out.println("continue statement");
		for (int i = 0; i < 10; i++) {
			if (i==5) {
				continue;
			}
			System.out.println(i);
		}

		
		//System.exit() statement
		System.out.println("System.exit() statement");
		for (int i = 0; i < 10; i++) {
			if (i==5) {
				System.exit(0);
			}
			System.out.println(i);
		}
		System.out.println("System.exit() - It is used to terminate the whole main program, It is not printing");
	}
}
