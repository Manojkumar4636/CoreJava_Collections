package newfolder;

public class CountOfDublicateArray {

	//Particular value how many times repeated that count print
	public void method1() {
		int[] given = {10,20,30,10,20,30,10,20,30,40,40};
		int[] freq = new int[given.length];

		for(int i=0;i<given.length;i++) {
			int no = given[i];

			int count = 1;
			for(int j=i+1;j<given.length;j++) {
				if(no==given[j]) {
					count++;
					freq[j] = -1;
				}
			}
			if(freq[i]!=-1) {
				freq[i] = count;
			}
		}

		int duplicate = 0;
		for(int i=0;i<freq.length;i++) {
			if(freq[i]!=-1) {
				System.out.println(given[i]+" Appeared "+freq[i]);

			}
		}

	}


	//How many Duplicate count in this array
	public void method2() {
		int[] given = {10,20,30,10,20,30,10,20,30,40,40};
		int[] freq = new int[given.length];
		
		for(int i=0;i<given.length;i++) {
			int no = given[i];
			
			int count = 1;
			for(int j=i+1;j<given.length;j++) {
				if(no==given[j]) {
					count++;
					freq[j]= -1;
				}
			}
			if(freq[i]!=-1) {
				freq[i]=count;
			}
		}
		int duplicate = 0;
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>1) {
				duplicate++;
			}
		}
		System.out.println(duplicate);
	}
	
	
	//How many Count the Unique value in the given array
	public void method3() {
		
		int[] given = {10,20,30,10,20,30,10,20,30,40};
		int[] freq = new int[given.length];
		
		for(int i=0;i<given.length;i++) {
			int no = given[i];
			
			int count = 1;
			for(int j=i+1;j<given.length;j++) {
				if(no==given[j]) {
					count++;
					freq[j] = -1;
				}
			}
			if(freq[i]!=-1) {
				freq[i] = count;
			}
		}
		int Unique = 0;
		for(int i=0;i<freq.length;i++) {
			if(freq[i]==1) {
				uniqe++;
			}
		}
		System.out.println(Unique);
		

	}
	


	public static void main(String[] args) {
		CountOfDublicateArray call = new CountOfDublicateArray();
		call.method1();
		call.method2();
		call.method3();
	}

}
