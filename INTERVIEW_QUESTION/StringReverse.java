package stringReverse;

public class StringReverse {
	
	public void method1() {
		
		String given = "Manojkumar";
		
		//StringBuffer (or) StringBuilder is a Mutable method so value can be change and also use reverse function, it's Inbuild method	
		StringBuffer buffer = new StringBuffer();
		buffer.append(given);
		System.out.println("Java Inbuild Method: "+buffer.reverse());
		
		System.out.println("----------------------------------------");
	}
	
	public void method2() {
		
		String given = "Manojkumar";
		//manojkumar it's a character so use toCharArray function
		
		char[] character = given.toCharArray();
		
		String reversed = "";
		
		                                              //          i       i 
		for(int i= character.length-1;i>=0;i--) {    // for( int 10 - 1 ; 9 >= 0 (true) ; i-- ) <--------------
			reversed = reversed+character[i];   //  0 + 9                                                  |
		}                                          //   0 1 2 3 4 5 6 7 8 9                                    |
		System.out.println(reversed);             //    M a n o j k u m a r --------------Print r then goto decrease value is 8 again condition check ....
		                                         //                                       8 >= 0 condition true print the value else terminate the loop.
		
		System.out.println("----------------------------------------");
	}
	
	public void method3() {
		String given = "My Name Is Manoj";
		String reversed = "";
		String[] splitChar = given.split(" "+" ");
		
		for(int i=splitChar.length-1;i>=0;i--) {
			reversed = reversed + splitChar[i] ;
		}
		System.out.println(reversed);
	}

	public static void main(String[] args) {
		StringReverse call = new StringReverse();
		call.method1();
		call.method2();
		call.method3();
	}
}
