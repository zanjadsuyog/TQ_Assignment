package com.section2;

import java.util.HashMap;

public class Que6_RemoveElement {

// WAP to remove an element from HashMap using key

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("Vivek", 30);
		map.put("suyog", 25);
		map.put("omkar", 40);
		System.out.println("Map before removing an element: " + map);

		// Remove the element associated with the key "Mary"
		Integer maryAge = map.remove("suyog");

		// Print the map after removing an element
		System.out.println("Map after removing an element: " + map);
	}
}
