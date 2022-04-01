/*Map - TreeSet
----------------
=> TreeMap (Class) is implementation class for Map (Interface)
=> Duplicate Keys are NOT allowed in Map. Duplicate Values are allowed.
=> NULL key is not allowed.
=> The elements will be retrieved on natural sorting order or alphabetic order maintained in KEY Value based.


*/
package com.learn.java.day18;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeSet {
	
	public static void main(String[] args) {
		
		TreeMap<String, String> district = new TreeMap<>();
		//alphabetic order maintained in KEY Value based
		district.put("Namakkal", "Rasipuram");
		district.put("Salem", "NH-7");
		district.put("Chennai", "OMR");
		
		System.out.println(district);
		
		//Key is duplicated the value is override
		district.put("Thichy", "Gate");
		district.put("Thichy", "Malaputhur");
		System.out.println(district);
		
		/*null value is not allowed because Tree means Compared to 
		inserting the order so Null is cannot compared value so NullPointerException throwing.*/
		
	  //district.put(null, "Gate");
		
		//LinkedHashMap
		java.util.LinkedHashMap<String, String> car = new java.util.LinkedHashMap<>();
		car.put("Manoj", "BMW");
		car.put("Gopi", "Benz");
		car.put("Chinna", "AUDI");
		car.put("MK", "Lambogani");
		
		//LinkedHashMap only maintained the insertion order, null key cannot compare any value so value is override.
		car.put(null, "Swift");
		car.put(null, "Scrpio");
		
		System.out.println("LinkedHashMap: "+car);
		
		//HashMap
		HashMap<String, String> cars = new HashMap<>();
		cars.put("Manoj", "BMW");
		cars.put("Gopi", "Benz");
		cars.put("Chinna", "AUDI");
		cars.put("MK", "Lambogani");
		
		//Duplicate key is come, values are override.
		cars.put(null, "ABC");
		cars.put(null, "XYZ");
		
		System.out.println("HashMap: "+cars);
		
		
		
	}

}
