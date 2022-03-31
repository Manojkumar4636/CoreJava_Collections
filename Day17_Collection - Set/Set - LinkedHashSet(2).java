/*Set - LinkedHashSet
 ---------------------                  
=> Set(Interface)----->HashSet(Class) --->LinkedHashSet(Child class of HashSet).
=> Data Structure ----> Hash table + Linked List
=> *******Insertion order is maintained.*******
=> Duplicates not allowed.
=> Can insert Heterogeneous object (If generics are not used).
=> We can insert null values.
=> Implements Serializable and Cloneable?-> Yes
=> Data are stored based on ASCII Code, so search is very effective.
=> Default capacity-16
=> Fill Ratio or Load factor:0.75 or 75%
                   

*/

package com.java.learn.day17;

import java.util.LinkedHashSet;

public class linkedHashSetExample {

	public void linkedHashSetExample(){
		LinkedHashSet linkedHashSet = new LinkedHashSet();
		linkedHashSet.add(1);
		linkedHashSet.add("A");
		linkedHashSet.add("B");
		linkedHashSet.add("C");
		linkedHashSet.add("10");

		System.out.println("Insertion order is maintained LinkedHashSet :"+ linkedHashSet);
	}

	public static void main(String[] args) {
		
		linkedHashSetExample example= new linkedHashSetExample();
		example.linkedHashSetExample();
	}

}
