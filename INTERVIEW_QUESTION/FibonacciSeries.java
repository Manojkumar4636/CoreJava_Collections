package stringReverse;

import java.util.Scanner;

public class FibonacciSeries {

	public void method1() {

		int firstNo = 0;
		int secondNo = 1;
		int count = 5;

		//I went to be 5 Fibonacci series so use forloop
		for (int i = 0; i < count; i++) {
			System.out.println(firstNo);

			int thridNo = firstNo + secondNo;
			firstNo = secondNo;
			secondNo = thridNo;
		}
		System.out.println("------------------------------------------");
	}

	public void method2() {

		int firstNo = 0;
		int secondNo = 1;
		int count = 5;

		//I went to be 5 Fibonacci series so use whileloop
		int i = 0;
		while (i<count) {
			System.out.println(firstNo);

			int thridNo = firstNo + secondNo;
			firstNo = secondNo;
			secondNo = thridNo;
			i++;
		}
		System.out.println("------------------------------------------");
	}

	public void method3() {
		int firstNo = 0;
		int secondNo = 1;
		int count = 0;

		System.out.println("Enter a number....");
		Scanner scanner = new Scanner(System.in);
		count = scanner.nextInt();

		//I went to be 5 Fibonacci series but based on the Runtime User Input
		int i = 0;
		while(i<count) {
			System.out.println(firstNo);

			int thridNo = firstNo + secondNo;
			firstNo = secondNo;
			secondNo = thridNo;
			i++;
		}
		System.out.println("------------------------------------------");
	}

	public static void main(String[] args) {
		FibonacciSeries call = new FibonacciSeries();
		call.method1();
		call.method2();
		call.method3();
	}

}
