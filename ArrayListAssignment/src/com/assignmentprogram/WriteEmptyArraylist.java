package com.assignmentprogram;

import java.util.ArrayList;

public class WriteEmptyArraylist {

	public static void main(String[] args) {
		// create a new ArrayList
		ArrayList<String> list = new ArrayList<String>();

		// add some elements to the list
		list.add("apple");
		list.add("banana");
		list.add("orange");

		// print the original list
		System.out.println("The original list is: " + list);

		// empty the list
		list.clear();

		// print the updated list
		System.out.println("The updated list is: " + list);

		// confirm that the list is empty
		if (list.isEmpty()) {
			System.out.println("The list is empty.");
		} else {
			System.out.println("The list is not empty.");
		}
	}
}
