/*No Arguments Constructor Explained
  =>No Arguments will be there
  =>It will allow us to write logic when object is created.
  =>This is not Default constructor.*/

package com.learn.java.day3;

      //Define No Argument Constructor

public class Employee {
	
	int employeeId;
	String employeeName;
	
	Employee(){
		employeeId=6208;
		employeeName="MANOJKUMAR";
		System.out.println("Employee Id Created");
	}
	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println(employee.employeeId);
		System.out.println(employee.employeeName);
		
	}

}