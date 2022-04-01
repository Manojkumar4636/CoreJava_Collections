/*Map - (Interface)
------------------
=> Map is a key and value pair combination.
=> Duplicate Keys are NOT allowed in Map.
=> Duplicate Values are allowed.

Types of Map / Class of Map
----------------------------
1 - HashMap        - Random    --> Key = 1null, Value = n null
2 - LinkedHashMap  - Insertion --> Key = 1null, Value = n null
3 - TreeMap        - Assenting --> Key = Ignore null, Value = n null
4 - HashTable      - Random    --> Key = Ignore null, Value = Ignore null

Difference between HashMap and HashTable
-----------------------------------------
HashMap
--------
=>Allow users parallely.
=>Key allow 1 null, in more than one key passing NullPointerException throwing.
=>Non-Thread safe.

HashTable
----------
=>Allow users one by one.
=>Ignore null value in key and value.
=>Thread safe

Map - HashMap
--------------
=> HashMap (Class) is implementation class for Map (Interface)
=> Duplicate Keys are NOT allowed in Map. Duplicate Values are allowed.
=> Only one NULL key is allowed.
=> The order is not Maintained as it uses Hashing. So we can't predict the retrieval order.
=> A Value of the Map can only be fetched using it's Key
=> Default capacity: 16 and load factor: 75%



 */
package com.learn.java.day18;

import java.util.HashMap;

public class HashMapExample {
	public static void main(String[] args) {

		//To Insert an element PUT method is used
		HashMap<Integer, String> employeeMap = new HashMap<>();
		employeeMap.put(1, "Manoj");//This is One Entry
		employeeMap.put(2, "Gopi");
		employeeMap.put(3, "Chinna");
		employeeMap.put(4, "MK");
		
		System.out.println("EmployeeInfo: "+employeeMap);
		
		
		//To make a copy of the existing Map use putAll()
		HashMap<Integer, String> duplicateMap = new HashMap<>();
		duplicateMap.putAll(employeeMap);
		System.out.println("Duplicate Map: "+duplicateMap);
		
		//Clear() to delete the Map
		duplicateMap.clear();
		System.out.println("Clear Map: "+duplicateMap);
		
		//To check if a key is present or not in the Map
		System.out.println(employeeMap.containsKey(1));
		
		//To check if a value is present or not in the Map
		System.out.println(employeeMap.containsValue("MK"));
		
		//Clone the Map
		System.out.println("Clone Map: "+employeeMap.clone());
		
		//Check if the Map is Empty or Not
		System.out.println("Check if the Map is Empty or Not: "+employeeMap.isEmpty());
		
		//Fetch a value
		System.out.println("Get the Value: "+employeeMap.get(2));
				
		//Fetch the set of keys in the Map (NOTE: Here it's not List of Key, It's Set of Key)
		//Because list will allow duplicate but set won't. Key should be unique.
		
		System.out.println("KeySet: "+employeeMap.keySet());
		
		//Fetch a values
		System.out.println("Value: "+employeeMap.values());
		
		//Fetch all the Value
		System.out.println("Value: "+employeeMap.entrySet());
	
		System.out.println("---------------------------------------");
		//Iterate the Values
		for (int i = 0; i <= employeeMap.size(); i++) {
			System.out.println("Iterate the value: "+employeeMap.get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
