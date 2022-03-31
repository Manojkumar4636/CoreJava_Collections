/*Set - TreeSet
----------------
=> TreeSet is the implementation class of SortedSet Interface.
=> Does not allow duplicates.
=> It has 6 methods like first,last,headSet,tailSet,subSet and comparator.
=> Difference between Hashset and Treeset, hash doesnt maintain order
   but Treeset maintains ascending or alphabetical order.
=> Data Structure-> Balanced Tree.

*/
package com.java.learn.day17;

import java.util.Iterator;
import java.util.TreeSet;
import java.lang.*;
public class TreeSetExample {

	public void treeSetExample(){
		//Creating object
		TreeSet<Integer> treeSet= new TreeSet<Integer>() ;
		
		treeSet.add(10);
		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(9);
		treeSet.add(7);
		treeSet.add(3);
	  //treeSet.add(null);Null value not allow in TreeSet but you have insert null value throw the NullPointerException.
		
		System.out.println("Elements are sorted on ascending order :"+ treeSet);
		
		//first() 
		System.out.println("First element :"+treeSet.first());
		
		//last()
		System.out.println("Last element :"+treeSet.last());
		
		//headSet()
		System.out.println("Values lesser than given value"+treeSet.headSet(3));
		
		//tailSet()
		System.out.println("Values equal to and higher than given value"+treeSet.tailSet(9));
		
		//subSet()
		System.out.println("Subset values :"+treeSet.subSet(2, 9));
		
		//comparator()
		System.out.println("Comparator returns null if the sorting is default natural order :"+ treeSet.comparator());
		
		//Adding null to a non empty tree set causes null pointer exception.
		//treeSet.add(null);
		
		//Higher
		System.out.println("Higher"+treeSet.higher(3));
		
		//Lower
		System.out.println("Lower"+treeSet.lower(2));
		
		//PollFirst retrieve and Delete it
		System.out.println("PollFirst"+treeSet.pollFirst());
		System.out.println(treeSet);
		
		//PollLast retrieve and Delete it
		System.out.println("PollLast"+treeSet.pollLast());
		System.out.println(treeSet);
		
		//Descending order Set
		System.out.println("Descending order Set"+treeSet.descendingSet());
		
		System.out.println("-----------------------------------------------");
		//Normal Iteration
		Iterator<Integer> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			System.out.println("Normal Order: "+iterator.next());	
		}
		
		System.out.println("-----------------------------------------------");
		//Descending Iteration
		Iterator<Integer> descendingIterator = treeSet.descendingIterator();
		while (descendingIterator.hasNext()) {
			System.out.println("Descending Order: "+descendingIterator.next());
		}
		
		
	/*Heterogeneous data not allowed. If added Exception, ClassCast will occur
	  For default natural sorting order,the objects should be homogeneous and comparable else class cast exception
	  To say any class is comparable or not, the class should implement comparable interface.*/
		
		TreeSet<StringBuffer> set = new TreeSet<StringBuffer>();
	  //set.add(new StringBuffer("A")); 
	  //System.out.println(set);
		
	}
	
	public static void main(String[] args) {
		
		TreeSetExample treeSetExample= new TreeSetExample();
		treeSetExample.treeSetExample();
	}

}
