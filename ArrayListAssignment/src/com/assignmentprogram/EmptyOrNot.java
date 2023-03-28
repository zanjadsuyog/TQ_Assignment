package com.assignmentprogram;

import java.util.ArrayList;

public class EmptyOrNot {

//	WAP to test an ArrayList is empty or not
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		// add some elements to the first list
		list1.add(1);
		list1.add(2);
		list1.add(8);
		list1.add(4);
		
      	System.out.println(list1.isEmpty());

		System.out.println(list2.isEmpty());

	}
}
