/* Super keyword
----------------
*/

//ParentClass - 1
package com.learn.java.day3;

public class GrandParent {
	
	GrandParent(){
		System.out.println("GrandParent");
	}

}


//ParentClass - 2
package com.learn.java.day3;

public class ParentClass extends GrandParent {
	
	ParentClass(){
		System.out.println("ParentClass");
	}

}


//ChildClass
package com.learn.java.day3;

//Super keyword

public class ChildClass extends ParentClass {

	ChildClass(){

		//Automatically it will take super keyword

		System.out.println("ChildClass");
	}

	public static void main(String[] args) {
		ChildClass child = new ChildClass();

	}

}

/*
OUTPUT
------
GrandParent
ParentClass
ChildClass
*/


