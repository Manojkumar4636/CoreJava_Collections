package stringReverse;

import java.util.Arrays;

public class FindSmallestAndLargestNo {

	public void findSmallestNo1() {

		int given[] = {5,6,9,2,4,8};
		int smallestNo = Integer.MAX_VALUE;

		for(int i=0;i<given.length;i++) {
			if(given[i]<smallestNo) {
				smallestNo=given[i];
			}
		}
		System.out.println("This is a SmallestNo: "+smallestNo);
	}

	public void findSmallestNo2() {

		// This is Jumbled Order so Arrange the Ascending Order then get the [0] index position.
		//Arrays - Java.Utils Package
		int given[] = {5,6,9,2,1,4,8}; 
		Arrays.sort(given);

		System.out.println("This is a SmallestNo: "+given[0]);
	}
	

	public void findLargestNo() {

		int given[] = {5,6,9,2,4,8};
		int largestNo = Integer.MIN_VALUE;

		for(int i=0;i<given.length;i++) {
			if(given[i]>largestNo) {
				largestNo=given[i];
			}
		}
		System.out.println("This is a LargestNo: "+largestNo);
	}


	public static void main(String[] args) {
		FindSmallestAndLargestNo call = new FindSmallestAndLargestNo();
		call.findSmallestNo1();
		call.findSmallestNo2();
		call.findLargestNo();
		
	}

}
