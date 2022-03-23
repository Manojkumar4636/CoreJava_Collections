/*String
--------
=> String predefined class which present java.lang package
=> It is a sequence of character or collection of words enclosed within the "double quotes"
=> In java, STRING IS AN IMMUTABLE object which means it is constant and can cannot be changed once it has been created
=> String is index based Index start from 0 and ends with n-1

How to create a String
-----------------------
1 - String literal ---> String string1 = "MANOJKUMAR";
2 - new keyword ------> String s = new String("MK");

String literal via creation
---------------------------

---------|
string1  |-------------> "MANOJKUMAR"
---------|                    |
string2  |--------------------|
---------|

new keyword via creation
-------------------------

--------|
string1 |----------------> "MANOJKUMAR"
--------|
string2 |----------------> "MANOJKUMAR"
--------|

String is Immutable
-------------------
=> In java, STRING IS AN IMMUTABLE object which means it is constant and
   can cannot be changed once it has been created.
   
--------|
string1 |                   "MK"(Garbage collection)
--------|
string1 |----------------> "MANOJKUMAR"               
--------|

EXAMPLE:
--------
String string1 = "MK";
string1 = "MANOJKUMAR";
System.out.println(string1);

*/
package com.learn.java.day12;

public class StringConcept {

	public static void main(String[] args) {
		
		String name = "  Manojkumar"; //String Literal
		Integer number = 143;
		//Returns character value for the particular index
		char charAt = name.charAt(1);
		System.out.println(charAt);
		
		//Returns string length
		int length = name.length();
		System.out.println(length);
		
		//Checks the equality of string with the given object
		boolean equals = name.equals("manojkumar");
		System.out.println(equals);
		
		//Checks the equality of string with the given object without case sensitivity
		boolean equalsIgnoreCase = name.equalsIgnoreCase("manojkumar");
		System.out.println(equalsIgnoreCase);
		
		//Checks if string is empty or not
		boolean empty = name.isEmpty();
		System.out.println(empty);
		
		//Returns true or false based on the given value is present or not
		boolean contains = name.contains("Manoj");
		System.out.println(contains);
		
		//Take a particular portion of the string
		String substring = name.substring(1);
		System.out.println(substring);
		
		//Take a particular portion of the string begin and end index
		CharSequence subSequence = name.subSequence(1, 9);
		System.out.println(subSequence);
		
		//Appends the string to the given string
		String concat = name.concat("MK");
		System.out.println(concat);
		
		//Replaces the existing char with given char
		String replace = name.replace('M', 'S');
		System.out.println(replace);
		String replace2 = name.replace("kumar", "Bavi");
		System.out.println(replace2);
		
		//Find the position of a character in the string
		int indexOf = name.indexOf('j');
		System.out.println(indexOf);
		
		//Find the position of a character specified from the index position
		int indexOf2 = name.indexOf('a',0 );
		System.out.println(indexOf2);
		int indexOf3 = name.indexOf("kumar", 1);
		System.out.println(indexOf3);
		
		//Trim will remove the white spaces before
		String trim = name.trim();
		System.out.println(trim);
		
		//Convert the given data type  to string
		System.out.println(String.valueOf(number));
		
		//UpperCase and LowerCase
		String upperCase = name.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = name.toLowerCase();
		System.out.println(lowerCase);
		
		//Returns a joined String with given delimiter
		System.out.println(String.join("-","I","LOVE","YOU"));
		System.out.println(String.join("/","I","LOVE","YOU"));
		
		//Split
		String splitThis="I,LOVE,YOU";
		String[] split = splitThis.split(",");
		
		for (String string : split ) {
			System.out.println(string);
		}
	}

}
