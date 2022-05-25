package Interview;

import java.util.Arrays;

public class SecondGreatestNo {
	
	public void method1() {
		                                    
		int given[] = {3,2,5,50,9,1,20};   
		int n = given.length;
		
		                          //Ascending order
		Arrays.sort(given);      //1,2,3,5,9,20,50
		
		//Iterate the value
		/*for (int i : given) {
			System.out.println(i);
		}*/
		
		System.out.println("SecondGreatestNo: "+given[n-2]);
	}
	
	public void method2() {

		int given[] = {3,2,5,50,9,1,20};//1,2,3,5,9,20,50
		int n = given.length;
		
		int highest = Integer.MIN_VALUE;
		int secHigh = Integer.MIN_VALUE;
		
		
		for(int i=0;i<n;i++) {
			if(given[i]>highest) {
				secHigh = highest;
				highest =given[i];
			}
			if(given[i]<highest && given[i]>secHigh) {
				secHigh = given[i];
			}
		}
		
		System.out.println("GreatestNo: "+highest);
		System.out.println("SecondGreatestNo: "+secHigh);
	}
	
	
	public static void main(String[] args) {

		SecondGreatestNo call = new SecondGreatestNo();
		call.method1();
		call.method2();
		
		
		
	}
}
