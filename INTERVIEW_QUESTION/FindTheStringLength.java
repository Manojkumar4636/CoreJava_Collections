package stringReverse;

public class FindTheStringLength {

	public void method1() {

		//With length Function
		String given = "I'm a Software Developer";
		int length = given.length();

		System.out.println("Length is: "+length);
	}

	public void method2() {

		//Without length Function
		String given = "I'm a Software Developer";
		char[] list = given.toCharArray();

		int length = 1;

		//Normal forloop
		for(int i=0;i<list.length;i++) {
			System.out.println("Length is: "+length);
			length++;
		}

		//Enhanced forloop
		/*for (char c : list) {
			System.out.println(length);
			length++;
		}*/
	}

	public static void main(String[] args) {
		FindTheStringLength call = new FindTheStringLength();
		call.method1();
		call.method2();
	}

}
