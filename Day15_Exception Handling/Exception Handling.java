/*Exception Handling
--------------------
=> Exception is an unexpected event, which occurs during the execution of a program.
=>Exception is the super class of all exception.

1 - try     ---> Whenever exception will occur we will use try block.
              => A try block can have multiple catch block.
              
2 - catch   ---> catch is a block, it is going to catch the exception, it contains solutions.
              => If there are no exceptions then the catch blocks will not get executed.
              
3 - finally ---> finally is a block of code which will get executed even if the exception occurs or not.
              => Finally block also can have exception.
              => When System.exit() is use the finally block cannot executed.

*/

package com.learn.java.day15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
			System.out.println("Hi Programmer!");
			
			//ArithmeticException
			System.out.println(2/1);
			
			//NullPointerException
			String name="null";
			System.out.println(name.length());
			
			//StringIndexOutOfBoundsException
			String name1 = "MANOJ";
			System.out.println(name1.charAt(4));
			
			//ArrayIndexOutOfBoundsException
			int a[] = new int [2];
			a[0] = 10;
			a[1] = 20;
			System.out.println(a[0]);
			
			//IndexOutOfBoundsException
			List li = new ArrayList();
			li.add(10);
			li.add(20);
			li.add(30);
			System.out.println(li.get(2));
			
			//NumberFormatException
			String name2 = "143";
			int parseInt = Integer.parseInt(name2);
			System.out.println(parseInt);
			
			//InputMismatchException
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a Id: ");
			int nextInt = scan.nextInt();
			System.out.println(nextInt);
			
		}catch(ArithmeticException e){
			System.out.println("It is a ArithmeticException ");
		}catch (NullPointerException e) {
			System.out.println("It is a NullPointerException ");
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("It is a StringIndexOutOfBoundsException");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("It is a ArrayIndexOutOfBoundsException");
		}catch (IndexOutOfBoundsException e) {
			System.out.println("It is a IndexOutOfBoundsException");
		}catch (NumberFormatException e) {
			System.out.println("It is a NumberFormatException");
		}finally {
			System.out.println("Thank you Programmer");
		}
		

	}
	

}
