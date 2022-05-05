package stringReverse;

public class OddAndEvenNo {
	
	public void oddNo() {
	
		int count = 10;
		for(int i=1;i<=count;i=i+2) {    //Odd Number
			System.out.println(i);
		}
		System.out.println("-----------------------");

	}
	
	public void evenNo() {
		int count = 10;
		for(int i=0;i<=count;i=i+2) {    //Even Number
			System.out.println(i);
		}
		System.out.println("------------------------");
	}

	
	
	public void sumOfOdd() {
		
		int count = 0;
		for(int i=1;i<=10;i=i+2) {     //Sum of Odd Number
			count = count+i;
		}
		System.out.println("Sum of Odd Number: "+count);

	}
	
	public void sumOfEven() {
		
		int count = 0;
		for(int i=0;i<=10;i=i+2) {     //Sum of Even Number
			count = count+i;
		}
		System.out.println("Sum of Even Number: "+count);

	}
	
	
	public void example1() {

		for (int i = 0;i <=10;i++) {    //Another Example Even Number
			if(i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println("------------------");
	}
	
	public void example2() {

		for (int i = 0; i <=10; i++) {    //Another Example Odd Number
			if(i%2==1) {
				System.out.println(i);
			}
		}
		System.out.println("------------------");
	}
	
	public static void main(String[] args) {
		
		OddAndEvenNo call = new OddAndEvenNo();
		call.oddNo();
		call.evenNo();
		call.sumOfOdd();
		call.sumOfEven();
		call.example1();
		call.example2();
	}

}
