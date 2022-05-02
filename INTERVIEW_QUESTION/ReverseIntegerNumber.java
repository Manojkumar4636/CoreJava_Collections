package stringReverse;

import java.util.Scanner;

public class ReverseIntegerNumber {
	
	public void method1() {
	
		int given = 5;
		for(int i=given;i>=0;i--) {
			System.out.print(i);
		}
		System.out.println();
	}
	
	public void method2() {
		
		int given = 123456789;
		int reverse = 0;
		
		while(given>0) {
			reverse = (reverse*10)+given%10;
			given = given/10;
		}
		System.out.println("Reversed Number: "+reverse);

	}
	
	public void method3() {
		
		//Get the intput form user in Runtime
		int given = 0;
		int reverse = 0;
		
		System.out.println("Enter a Number....");
		Scanner scan = new Scanner(System.in);
		given = scan.nextInt();
		
		while(given>0) {
			reverse = (reverse*10)+given%10;
			given = given/10;
		}
		
		System.out.println("Reversed Number: "+reverse);

	}
	
	
	public static void main(String[] args) {
		ReverseIntegerNumber call = new ReverseIntegerNumber();
		call.method1();
		call.method2();
		call.method3();
	}

}
