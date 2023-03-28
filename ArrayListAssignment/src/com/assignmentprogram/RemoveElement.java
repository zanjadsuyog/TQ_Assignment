package com.assignmentprogram;

import java.util.ArrayList;

public class RemoveElement {

// WAP to remove element from ArrayList
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("apple");
		list.add("banana");
		list.add("cherry");
		list.add("date");
		
		System.out.println("Color: "+list);
		
		list.remove(2);
		
		System.out.println("After removing: "+list);
	}
}
