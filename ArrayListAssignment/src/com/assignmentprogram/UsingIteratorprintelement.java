package com.assignmentprogram;

import java.util.ArrayList;
import java.util.Iterator;

public class UsingIteratorprintelement {

	public static void main(String[] args) {
//	WAP to print all elements of ArrayList using iterator
		ArrayList<String> list = new ArrayList<>();

		list.add("apple");
		list.add("banana");
		list.add("cherry");
		list.add("date");
	 
		Iterator<String> itr=list.iterator(); 
	
		while (itr.hasNext()) {
		  String element = itr.next();
		  System.out.println("Element : "+element);
			
		}
	}
}
