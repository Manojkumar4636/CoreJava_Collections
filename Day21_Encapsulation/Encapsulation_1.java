/*
Encapsulation
-------------

Interview Answer {
----------------- 
=> Encapsulation means binding the data together into the Single Unit.

So let's have a real example 
=> So the word is a capsule, so what capsule doing capsule is wrapping the data into the single unit, its provide
   the protection by using plastic. so same thing happen programming.
   class is the best example of Encapsulation, so what class doing class wrapping the data into the functions, data and methods in
   the single unit, its providing the protection by using access modifier public, private, protected and default so class is the 
   best way to bind the data into the single unit that is Encapsulation.
   
   }
   
   getters: To get the values from variable
   setters: To set the values from variable
   
POJO - Plain Old Java Object
----------------------------
=> It contains private variable, getters and setters method and constructor.

*/
package encapsulation;

public class EncapsulationPractice {
	
	private int atmCardNo;
	private int atmPin ;

	public int getAtmCardNo() {
		return atmCardNo;
	}
	
	public void setAtmCardNo(int atmCardNo) {
		this.atmCardNo = atmCardNo;
	}
	
	public int getAtmPin() {
		return atmPin;
	}
	
	public void setAtmPin() {
		this.atmPin = atmPin;
	}	

}
