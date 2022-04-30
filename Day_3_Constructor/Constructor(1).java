/*Constructors
----------------
1 - What is Constructors?
  =>Constructor is a block of code that initializes the newly created object
  =>What is mean by block of code Example:  {
                                             //block of code
                                            }

 2 - Must have properties of a constructor 
   =>Constructor name must be the same as its class name
   =>must not have explicit return type
   =>cannot be abstract, static, final and synchronized

 3 - Types of Constructors    
   =>Default
   =>Arguments
  

4 - Default Constructor Explained
  =>When we don't provide any Constructor, compiler will provide one.
  =>We cannot see with your eye, it will be in class file.
  =>Used to provide the default values to the object like 0, null, etc... depending on the type.

5 - No Arguments Constructor Explained
  =>No Arguments will be there
  =>It will allow us to write logic when object is created.
  =>This is not Default constructor.
  
6 - Parameterized Constructor Explained
  =>It has arguments(parameter)

7 - Constructor overloading

8 - Having only parameterized Constructor and calling no argument Constructor

9 - Super keyword - works in Inheritance.

 */

package com.learn.java.day3;

    //Define Default Constructor

public class Student {
	//String default value is null
	//int default value is 0 but Integer default value is null because Integer is a class
	
	String studentName;
	int studentRollNo;
	Integer studentAge;
	
	
	public static void main(String[] args) {
		Student Student = new Student();
		System.out.println(Student.studentName);
		System.out.println(Student.studentRollNo);
		System.out.println(Student.studentAge);
	}
}










