//IndexOutOfBoundsException

package com.learn.java.day14;
import java.util.ArrayList;
import java.util.List;

//IndexOutOfBoundsException
public class IndexOutOfBoundException {

	public static void main(String[] args) {
		
		List li = new ArrayList();
		li.add(10);
		li.add(20);
		System.out.println(li.get(5));
	
	}

}

/*
OUTPUT
------
IndexOutOfBoundsException Error Show*/