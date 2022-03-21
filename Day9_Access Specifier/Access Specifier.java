/*Access Specifier - Check the visiblity of method
------------------
1 - default --> When no access modifier is specified, java will consider this has default access specifier.
            ==>It will support only within the package using both object as well extends keywords.

2 - private --> Class level access specifier(It will support only within the class.

3 - protected --> Same package(extends + object), different package(extends) sub classes in different package.

4 - public --> Same package(extends + object), different package(extends + object) public from everywhere in the program.


-------------------------------------------------------------------------|
Access Specifier -- SameClass -- SamePackage -- SubClass -- OtherPackage 
-------------------------------------------------------------------------|
public           --     Y             Y             Y             Y      
-------------------------------------------------------------------------|
protected        --     Y             Y             Y             N
-------------------------------------------------------------------------|
default          --     Y             Y             N             N
-------------------------------------------------------------------------|
private          --     Y             N             N             N
-------------------------------------------------------------------------|



*/

package com.learn.java.day9;

public class AccessSpecifier {

	//When no access modifier is specified, java will consider this has default access specifier.
	void bikeName() {
		System.out.println("R15");
	}

	//private
	private void bikeCompany() {
		System.out.println("Yamaha");
	}
	
	//protected
	protected void bikeCc() {
		System.out.println("150CC"); 
	}
	
	//public
	public void bikeTopSpeed() {
		System.out.println("135 per hour");

	}
	
	public static void main(String[] args) {
		AccessSpecifier bike = new AccessSpecifier();
		bike.bikeName();
		bike.bikeCompany();
		bike.bikeCc();
		bike.bikeTopSpeed();
	}
}
