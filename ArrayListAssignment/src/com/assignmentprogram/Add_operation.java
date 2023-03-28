package com.assignmentprogram;

import java.util.ArrayList;

public class Add_operation {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		// add elements to the list using add operation
		list.add("apple");
		list.add("banana");
		list.add("cherry");
		list.add("date");

		// display the elements of the list
		System.out.println("Elements of the list: ");
		for (String element : list) {
			System.out.println(element);
		}
	}

}
