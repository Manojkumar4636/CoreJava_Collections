/*
Exception
----------
=>It is like a error, whenever it occur in a program will terminate the line itself.

Types of Exception
------------------
1 - Unchecked exception (Runtime exception)
2 - Checked exception (Compile time exception)

Unchecked exception
-------------------
=>Whenever exception will occur in runtime it is called runtime exception

Types of Unchecked exception
----------------------------
1 - Arithmetic exception
2 - Null pointer exception
3 - String index out of bound exception
4 - Array index out of bound exception
5 - index out of bound exception
6 - Number format exception
7 - Input mismatch exception


Checked exception
-----------------
=>Whenever exception will occur in compile time it is called compile time exception

Types of checked exception
--------------------------
1 - File not found exception
2 - IO Exception
3 - SQL Exception
4 - Class not found exception


*/
package com.learn.java.day14;

public class Exception {
	
	//ArithmeticException
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3/0);
		System.out.println(4);
		System.out.println(5);
		
	}
	
	
}
/*
OUTPUT
------
ArithmeticException Error Show
*/