/*Looping Statement
-----------------
=>When we have to perform certain operations repeatedly.

1 - For loop
2 - While loop
3 - Do while

1 - For loop 
-------------
SYNTAX
------
Initialization; Condition; Increment/Decrement


2 - While loop
--------------
=>Entry control loop 

SYNTAX
------
while(condition){
                 //block of code
                }
       

3 - Do while loop
-----------------
=>Exit control loop

SYNTAX
-------
do{
     //block of code
  }while(condition)
  

*/


package com.learn.java.day5;

public class LoopingStatement {
//Imposition:
//Print your name in 50 times
	 
	public static void main(String[] args) {
		
		
		//For looping
		for (int times = 0; times < 25; times++) {
			System.out.println("MANOJKUMAR");
		}
		
		//While looping
		int times=0;
		while (times<25) {
			System.out.println("GOPI");
			times++;
		}	
			
		//Do while looping	
		int times1=0;
		do {
			System.out.println("CHINNDURAI");
			times1++;
		} while (times1<25);
		
		}
	}

