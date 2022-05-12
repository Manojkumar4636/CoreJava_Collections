package stringReverse;

public class PatternPrograms {

	public void method1() {

		int row = 5;
		for(int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public void method2() {

		int row = 5;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

	public void method3() {

		int row = 5;
		for (int i = 1; i <=row ; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

	public void method4() {
		
		int row = 5;
		int count = 1;

		for (int i = 1; i <=row; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();

		}

	}

	public void method5() {

		int row = 5;
		for (int i = 1; i <=row; i++) {
			for (int j = row; j >=i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <=i; k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

	public void method6() {
		
		int row = 5;
		for (int i = 1; i <=row; i++) {
			for (int j = row; j >=i; j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

	public void method7() {

		int row =5;
		for(int i=1;i<=row;i++) {
			for(int j=row;j>=i;j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <=i; k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}

	}

	public void method8() {

		int row = 5;
		int count = 1;

		for (int i = 1; i <=row; i++) {
			for (int j = row; j >=i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <=i; k++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		PatternPrograms call = new PatternPrograms();
		call.method1();
		call.method2();
		call.method3();
		call.method4();
		call.method5();
		call.method6();
		call.method7();
		call.method8();
	}

}
