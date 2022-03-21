/*Polymorphism
--------------
=>Polymorphism is the capability of performing different actions based on the object that is acting upon.

Types
-----
1 - Static/ compile/ Early binding (Over loading)
2 - Dynamic/ Run time/ Late binding (Over riding)

1 - Method Overloading
----------------------
  => Method name should be same.
  => Overloading happens in the same class.
  => If there is any change ( Change in data type, or change in order of passing) in the parameter passed to a method, then it's Overloading

  =>Arguments depends on datatype.
  =>Arguments depends on datatype count.
  =>Arguments depends on datatype order.

2 - Method Overriding
-----------------------
=>Same methods
=>Same arguments
=>Different class
=> Overriding happens in different class which means (Parent --> Child)

------------------------------------------------------------------------------------------------------------------------|
ASPECTS             -- OVERLOADING                       --       OVERRIDING
------------------------------------------------------------------------------------------------------------------------|
NAME OF THE METHOD  -- Must be same                      --       Must be same
------------------------------------------------------------------------------------------------------------------------|
ARGUMENT TYPES      -- Must be different or change in    --       Must be same(Order also should be same)
                       argument passing order
(PARAMETER PASSED)  
------------------------------------------------------------------------------------------------------------------------|
RETURN TYPES        -- Can be anything                   --       Must be same
------------------------------------------------------------------------------------------------------------------------|
ACCESS MODIFIERS    -- Can be anything                   --       It should be equal modifier or greater modifier
------------------------------------------------------------------------------------------------------------------------|
THROWING EXCEPTION  -- Can be anything                   --       Parent should be throw the same or greater exception
------------------------------------------------------------------------------------------------------------------------|
PRIVATE METHOD      -- Can be Overloading                --       Can't be Overriding
------------------------------------------------------------------------------------------------------------------------|


 */

package com.learn.java.day10;

public class Polymorphism {
	
//Method Overload
	public void employee(int employeeId) {
		System.out.println("employeeId: "+employeeId);
	}

	public void employee(String employeeName) {
		System.out.println("employeeName: "+employeeName);
	}

	public void employee(long employeePhoneNo) {
		System.out.println("employeePhoneNo: "+employeePhoneNo);
	}
	public static void main(String[] args) {
		Polymorphism employee = new Polymorphism();
		employee.employee(12345);
		employee.employee(6381531755l);
		employee.employee("Manojkumar");
	}

}
