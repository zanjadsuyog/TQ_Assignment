package com.assignmentprogram;

import java.util.ArrayList;

public class SearchElement {

	public static void main(String[] args) {
		//search the element
		
		ArrayList<String> list = new ArrayList<>();

		list.add("apple");
		list.add("banana");
		list.add("cherry");
		list.add("date");
		
		String searchele="apple";
		
		if(list.contains(searchele))
		{
			System.out.println("Element is found:"+searchele);
		}
		else {
			System.out.println("Element is not found: "+searchele);
		}
	}
}
