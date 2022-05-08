package stringReverse;

public class PalindromeOrNot {
	
	public void checkIntegerValue() {
		
		int given = 123456789;
		int reversed = 0;
		
		while(given>0) {
			reversed = (reversed*10)+given%10;
			given = given/10;
		}

		System.out.println(reversed);
		if(reversed == given) {
			System.out.println("It is a Palindrome");
		}else {
			System.out.println("It is not Palindrome");
		}
		System.out.println("---------------------------");
	}
	
	public void checkStringValue() {
		
		String given = "MANOJKUMAR";
		String reversed ="";
		char[] list = given.toCharArray();
		
		
		for(int i=list.length-1;i>=0;i--) {
			reversed = reversed + list[i];
		}
		
		System.out.println(reversed);
		if(reversed == given) {
			System.out.println("It is a Palindrome");
		}else {
			System.out.println("It is not Palindrome");
		}

		
		
	}

	public static void main(String[] args) {
		PalindromeOrNot call = new PalindromeOrNot();
		call.checkIntegerValue();
		call.checkStringValue();
	}
}
