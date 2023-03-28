
package com.assignmentprogram;

import java.util.ArrayList;

public class Retainall {

	// retainn all print common element
	
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		// add some elements to the first list
		list1.add(1);
		list1.add(2);
		list1.add(8);
		list1.add(4);

		// add some elements to the second list
		list2.add(2);
		list2.add(4);
		list2.add(6);
		list2.add(8);

		// retain only the common elements in both lists
		list1.retainAll(list2);

		// print the updated list
		System.out.println("The common elements in both lists are: " + list1);
	}
}
