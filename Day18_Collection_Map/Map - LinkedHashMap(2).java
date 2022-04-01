/*Map - LinkedHashMap
----------------------
=> LinkedHashMap (Class) is implementation class for Map (Interface)
=> Duplicate Keys are NOT allowed in Map. Duplicate Values are allowed.
=> Only one NULL key is allowed.
=> ***The order is Maintained.***
=> A Value of the Map can only be fetched using it's Key
=> Default capacity: 16 and load factor: 75%



*/
package com.learn.java.day18;

import java.util.HashMap;

public class LinkedHashMap {
	
	public static void main(String[] args) {
		
		HashMap<String, String> cars = new HashMap<>();
		cars.put("Manoj", "BMW");
		cars.put("Gopi", "Benz");
		cars.put("Chinna", "AUDI");
		cars.put("MK", "Lambogani");
		
		System.out.println("HashMap: "+cars);
		
		System.out.println("---------------------------------------");
		java.util.LinkedHashMap<String, String> car = new java.util.LinkedHashMap<>();
		car.put("Manoj", "BMW");
		car.put("Gopi", "Benz");
		car.put("Chinna", "AUDI");
		car.put("MK", "Lambogani");
		
		System.out.println("LinkedHashMap: "+car);
	}

}
