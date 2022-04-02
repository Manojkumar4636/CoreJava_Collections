/*Datatype
----------
=> It specifies the type and size of variable.
=> Variable is used to store the value.

SYNTAX
------
DataType VariableName = value;

-----------------------------------------------------------------------------|
DataType                       Size(Byte)                       WrapperClass |
-----------------------------------------------------------------------------|
byte                             2                              Byte
short                            4                              Short
int                              9                              Integer
long                             19                             Long
float                            4                              Float
double                           8                              Double
char                          ('Manoj')                         Character

          String( "alphabets, numerical, special character" )
          
boolean                         True/False                      Boolean
-----------------------------------------------------------------------------|

Range Calculating formula
-------------------------
1byte   = 8bits
Range   = -(2^n-1) to ((2^n-1)-1)
byte    = -(2^7) to (2^7)-1)
        = -128 to 127
        
WrapperClass
------------
=> Class of datatype is called wrapperclass.
=> It is used to convert datatype into object.

*/
package com.learn.java.datatype;

public class DatatypeExample {

	public static void main(String[] args) {
	   
		byte empAge = 25;
		System.out.println("Employee Age: "+empAge);
		
		short atmPin = 1234;
		System.out.println("Your ATM pin: "+atmPin);
		
		int pincode = 636202;
		System.out.println("Your pincode: "+pincode);
		
		long empPhoneNo = 3333344444l;
		System.out.println("Employee Phone No: "+empPhoneNo);
		
		float empSalary = 30000.00f;
		System.out.println("Employee Salary: "+empSalary);
		
		float x = 20/3f;
		System.out.println("X is: "+x);
		
		double y = 20/3d;
		System.out.println("Y is: "+y);
		
		char sex = 'M';
		System.out.println("Employee Gender: "+sex);
		
		String empEmail = "manojkumarsp009mail.com";
		System.out.println("Employee EmailID: "+empEmail);
		
		boolean empStatus = false;
		System.out.println("Employee Status: "+empStatus);
		
	}

}
