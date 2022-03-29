/*Collection
------------
=> Collection is a interface
=> Storing multiple values of dis - similar datatype in a single variable (or) Collection as a group of individual objects.
=> Memory wastage is low

                -------> List (Interface)
                |
Collections ----|------> Set  (Interface)
                |
                -------> Map  (Interface)
               
1 - List
---------
=> ArrayList
=> LinkedList 
=> Stack     ------>Not Use
=> Vector    ------>Not Use

2 - Set
--------
=> HashSet
=> LinkedList
=> TreeSet

3 - Map
--------
=> HashSet
=> HashLinkedList
=> HashTable
=> TreeSet


1 - List - ArrayList 
---------------------
=> List is the predefined interface which is present in java.util package.
=> List(Interface) is the Child of Collection(Interface).
=> ArrayList (Class) is one of the classes provides implementation for the List(Interface).
=> In list duplicate values are allowed and the insertion order is maintained.        
=> The underlying Data Structure is resizeable Array or Growable Array. We can insert Heterogeneous objects as well.
=> Growth Rate: current_size + current_size/2
=> NOTE: All the collections can store Heterogeneous objects can be stored except TREE SET and TREE MAP.
=> Synchronized-> No
=> Thread safe-> No
=> Best suited for search operations and performs worst on insertion and deletion.

List al = new ArrayList();
This line will be executed, default 10 size created.
----------------------
|1|2|3|4|5|6|7|8|9|10|
----------------------

Data Structure is resizeable Array or Growable Array.
If we have to add 11 value we will use this formula: current_size + current_size/2

Example:
10+10/2 = 15 Size will be created.

----------------------
|1|2|3|4|5|6|7|8|9|10|------This data is collect Garbage.
----------------------
 | | | | | | | | | |           
-------------------------------------
|1|2|3|4|5|6|7|8|9|10|11|  |  |  |  |
-------------------------------------

Why ArrayList is not suitable for Insertion and Deletion

Index value 0 1 2 3 4 5 6 7 8 9
           ----------------------
           |1|2|3|4|5|6|7|8|9|10|
           ----------------------
           
    If we are going to insert one element at position (Index = 5)

           -----------------------
           |1|2|3|4|5|NEW|6|7|8|9|
           -----------------------
           ONE ELEMENT WILL BE CHANGE BUT ANOTHOR POSITION AUTOMATICALLY CHANGED SO ARRAYLIST IS NOT SUITABLE FOR INSERTION AND DELETION

*/
package com.java.learn.day16;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
public class ArrayListExample {
	
	public void arrayListExample(){

		//add() used to add the specified element at the end of the List
		List<String> arrayList= new ArrayList<String>(); //Upcasting
		arrayList.add("Manoj");
		arrayList.add("Gopi");
		arrayList.add("Chinna");
		arrayList.add("MK");
		

		System.out.println(arrayList);

		//add(int index, Object element) method will add at specified index position
		arrayList.add(0,"Vijay");
		System.out.println(arrayList);

		//to check the indexof any element
		System.out.println("Index position of MK is :"+arrayList.indexOf("MK"));
		//-1 is returned if the element is not there
		System.out.println("Index position of Suriya is :"+arrayList.indexOf("Suriya"));

		//List allows duplicate elements
		arrayList.add("Manoj");
		System.out.println(arrayList);

		//indexof() always returns the first occurrence
		System.out.println("Index position of Manoj is :"+arrayList.indexOf("Manoj"));
		//last index of is used to check the last occurence position
		System.out.println("Last Index position of Manoj is :"+arrayList.lastIndexOf("Manoj"));

		//addAll() add a list to another list
		List<String> anotherList=new ArrayList<String>();
		anotherList.addAll(arrayList);
		System.out.println("New List copied: "+ anotherList);

		//clear() to delete all the elements
		anotherList.clear();
		System.out.println("List after clearing: "+anotherList);

		//we can also insert null
		anotherList.add(null);
		System.out.println("After adding null "+anotherList);
		
		anotherList.add("R15");
		anotherList.add("Yemaha");
		System.out.println(anotherList);
		//adding list to a list at specified position.
		anotherList.addAll(0,arrayList);
		System.out.println("New list after adding the old list at 0th position :"+anotherList);

		//set() is used to update the element based on index
		anotherList.set(7, "Dominar");
		anotherList.set(8,"Bajai");
		System.out.println("List after updating the last two elements : "+anotherList);

		//remove(int position) removes the value at the specified position
		anotherList.remove(6);
		System.out.println("After removing :"+anotherList);

		//remove using object value
		anotherList.remove("Bajai");
		System.out.println("After removing Bajai: "+ anotherList);

		/*get an element based on index position. 
		If the index is not there we will get index out of bound exception*/
		System.out.println("Element at 5th Position "+anotherList.get(5));

		//isEmpty() method to check the list is empty or not
		System.out.println("This list is empty. True or False? "+ anotherList.isEmpty());
		
		System.out.println("-------------------------------------------");
		System.out.println(anotherList);

		System.out.println("-------------------------------------------");
		//get all the elements in the list using for loop
		for(int size=0; size<anotherList.size();size++){
			System.out.println("element at "+size+"th position " +anotherList.get(size));
		}
		System.out.println("-------------------------------------------");

		//fetch using advanced for loop
		for (String string : anotherList) {
			System.out.println("List elements "+string);
		}
		System.out.println("-------------------------------------------");

		//forward traversing using ListIterator
		ListIterator<String> listIterator= anotherList.listIterator();
		while(listIterator.hasNext()){
			System.out.println("Forward Iteration : "+listIterator.next());
		}
		System.out.println("-------------------------------------------");

		// reverse Iteration using ListIterator
		while(listIterator.hasPrevious()){
			System.out.println("Reverse Iteration : "+listIterator.previous());
		}
		System.out.println("-------------------------------------------");

		/*Iteration with Iterator (NOTE: Not ListIterator)
		Iterator can only traverse forward but not on reverse.
		Hence we are using ListIterator for better usages.*/

		Iterator< String> iterator=anotherList.iterator();
		while(iterator.hasNext()){
			System.out.println("Forward Only:"+iterator.next());
		}
		System.out.println("-------------------------------------------");

		/* ArrayList is non-synchronized.It should not be used in multi-threaded 
		   environment without explicit synchronization.Hence,
		   adding an element to the list when traversing through it
		   will give concurrent modification exception.
		   This is happening because when a thread is trying to read the elements
		   from the list another thread is trying to add or remove an element from the same. 
		 */
		
		try{
			for (String string : anotherList) {
				System.out.println("Reading the list values"+ string);
				anotherList.add("BAJAI");
			}
		}
		catch(Exception e){
			
			System.out.println("Dude! You are trying to modify a list while a read operation is happening");
		}	
	}

	/* CopyOnWriteArrayList allows us to modify
	   the list while reading it
	 */
	public void syncArrayListExample(){	

		CopyOnWriteArrayList<String> syncal = new CopyOnWriteArrayList<String>();

		//Adding elements to synchronized ArrayList
		syncal.add("Pen");
		syncal.add("NoteBook");
		syncal.add("Paper");
		System.out.println("Iterating synchronized ArrayList:");

		Iterator<String> syncIterator = syncal.iterator(); 
		while (syncIterator.hasNext()){
			System.out.println(syncIterator.next());
			syncal.add("Eraser");
			syncal.add("Book");
			syncal.remove("Eraser");
			
		}
		System.out.println("Final List: "+syncal);
	}

	public static void main(String[] args) {
			
		ArrayListExample example= new ArrayListExample();
			example.arrayListExample();
		    example.syncArrayListExample();

	}

}

