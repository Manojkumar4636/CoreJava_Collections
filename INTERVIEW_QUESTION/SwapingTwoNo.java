package stringReverse;

public class SwapingTwoNo {
	
	public void method1() {
		// Without using Third Variable
		
		int a = 5000;
		int b = 10000;
		int temp = a;
		
		a = b;
		b = temp;
		System.out.println("With using Third Variable");
		System.out.println("A is: "+a+" B is: "+b);
	}
	
	public void method2() {
		// Without using Third Variable

		int a = 5000;
		int b = 10000;
		
		a = a - b;
		b = a + b;
		a = b - a;
		System.out.println("Without using Third Variable");
		System.out.println("A is: "+a+" B is: "+b);
	}
	
	public static void main(String[] args) {
		
		SwapingTwoNo call = new SwapingTwoNo();
		call.method1();
		call.method2();
	}

}
