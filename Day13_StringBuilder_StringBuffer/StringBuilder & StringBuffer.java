/*
1 - StringBuilder
-----------------
=>In java, STRING IS AN MUTABLE object
=>Non - Synchronous (Parallel execution)
=>non thread safe
=>Fast execution


2 - StringBuffer
----------------
=>In java, STRING IS AN MUTABLE object
=>StringBuffer is Synchronous (Step by step execution)
=>Thread safe
=>Slow execution


How to create a StringBuilder object
-----------------------------------
StringBuilder s = new StringBuilder("Manojkumar");


StringBuilder & StringBuffer via creation
------------------------------------------

------------------|  name.append("MK")
StringBuilder name|--------------------> "MANOJKUMAR"
------------------|




 */
package com.learn.java.day13;

public class StringBuffer {
	

	public static void main(String[] args) {

		//String name = "Manoj"; Literal String
		String name = "Manoj";
		System.out.println("STRING IS IMMUTABLE:");
		
		String concat = name.concat("Kumar");
		System.out.println("Appending a name to Original name: "+concat);
		System.out.println("Original name: "+name);

		//StringBuilder name1 = new StringBuilder("Manoj"); new keyword 
		System.out.println("STRINGBUILDER IS MUTABLE:");
		
		StringBuilder s1 = new StringBuilder("Manoj");
		StringBuilder append = s1.append("Kumar");
		System.out.println("Appending a name to Original name: "+append);
		System.out.println("Original name: "+append);
		
		
		
		//Reverse
		StringBuilder reverse = s1.reverse();
		System.out.println(reverse);
		
		//Replace
		StringBuilder reverse1 = s1.reverse();
		System.out.println(reverse1);
		StringBuilder replace = s1.replace(0, 4, "mk");
		System.out.println(replace);
		
		//Delete
		StringBuilder delete = s1.delete(0, 2);
		System.out.println(delete);
		
		//Insert
		StringBuilder insert = s1.insert(0, "Mano");
		System.out.println(insert);
		
		//Capacity
		int capacity = s1.capacity();
		System.out.println(capacity);
		//Like String we have CharAt(), Substring(), length() methods as well,
		//This all methods also used StringBuffer.

		
	}

}
