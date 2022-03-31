/*Set
------
=> Set(Interface) is one of the child interfaces of collection(Interface).
=> Duplicate values are NOT allowed.
=> Insertion order is NOT followed.
=> Can insert Heterogeneous object (If generics are not used).

1 - HashSet         ---> Random order
2 - LinkedHashSet   ---> Insertion order
3 - TreeSet         ---> Accesending order

Set - HashSet
--------------

*Important ---> List methods always use to Set

     0. Set is value based.
	 1. To store group of individual objects.
	 2. Duplicates not allowed
	 3. Insertion order will not be maintained
	 4. Set(Interface) doesn't have any new methods other than given in Collection(Interface).
	 5. Data Structure for HashSet is Hash table
	 6. If we add duplicate value to HashSet, simply it will return false to the
	    add() and it won't throw any error or exception.
	 7. We can insert null values
	 8. Heterogeneous values can be added.
	 9. Implements Serializable and Cloneable?-> Yes
	 10.Data are stored based on ASCII Code, so search is very effective.
	 11.Default capacity-16
	 12.Fill Ratio or Load factor:0.75 or 75%
	 
Number Constructors available in HashSet=4
------------------------------------------
	  1. HashSet hs= new HashSet();// size-16 and fill ratio is 0.75
	  2. HashSet hs= new HashSet(int initialSize);size as declared and fill ratio is 0.75(default)
	  3. HashSet hs= new HashSet(int initialSize, float fillRatio);//size and fill ratio can be declared
	  4. HashSet hs= new HashSet(Collection c);// creates a HashSet for any given Collection (Acts as interconversion)

*/
package com.java.learn.day17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashSetExample {

	public void basicExamplesHashSet(){
		HashSet<String>hashSet= new HashSet<String>();
		hashSet.add("G");
		hashSet.add("A");
		hashSet.add("Y");
		hashSet.add("T");
		hashSet.add("B"); // the return type of add() is boolean. Since A is already there it will return false and wont add
		hashSet.add(null);
		//We have no control on insertion order
		System.out.println("Contents of the HashSet :"+ hashSet);
		
		// Iterate using Iterator 
		Iterator< String> iterator= hashSet.iterator();
		while(iterator.hasNext()){
			System.out.println("Elements of HashSet :"+ iterator.next());
		}
		
		System.out.println("----------------------------------");
		//Data are stored based on ASCII Code.
		Set hashCode = new TreeSet<>();
		hashCode.add("A");
		hashCode.add("a");
		hashCode.add("1");
		hashCode.add("$");
		hashCode.add("z");
		
		System.out.println(hashCode);
		
		char a = 'A';
		int b = a;
		System.out.println("A: "+b);
		
		char c = 'a';
		int d = c;
		System.out.println("a: "+d);
		
		char e = '1';
		int f = e;
		System.out.println("1: "+f);
		
		char g = '$';
		int h = g;
		System.out.println("$: "+h);
		
		char i = 'z';
		int j = i;
		System.out.println("z: "+j);
		
	}

	public static void main(String[] args) {
	
		HashSetExample hashSetExample= new HashSetExample();
		hashSetExample.basicExamplesHashSet();
		
	}

}
