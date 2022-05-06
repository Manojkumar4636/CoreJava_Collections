package stringReverse;

import java.util.Scanner;

public class FactorialNo {
	
	public void method1() {
		
			int factotial = 1;
			
			//5! = 5*4*3*2*1 = 120
			int count = 5;
			for (int i = 1; i <= count; i++) {
				factotial = factotial * i;
			}
			System.out.println("Factorial Number is: "+factotial);
	}
	
	public void method2() {
		
		int factotial = 1;
		
		int count = 0 ;
		
		//Input from the user in Runtime
		System.out.println("Enter a Number...");
		Scanner scan = new Scanner(System.in);
		count = scan.nextInt();

		for (int i = 1; i <= count; i++) {
			factotial = factotial * i;
		}
		System.out.println("Factorial Number is: "+factotial);
	}
	
	public static void main(String[] args) {
		
		FactorialNo call = new FactorialNo();
		call.method1();
		call.method2();
	}

}
