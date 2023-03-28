//3.	WAP to add elements to a HashMap using generics with Integer as Key
//and String as value. 
//And 4 key-value Map.Entry
package com.section1;

import java.util.HashMap;
import java.util.Map;

public class Que3 {
	public static void main(String[] args) {
		Map<Integer, String> myMap = new HashMap<Integer, String>();

		// Adding elements to the map
		myMap.put(1, "Apple");
		myMap.put(2, "Banana");
		myMap.put(3, "Cherry");
		myMap.put(4, "Durian");

		// Printing out the contents of the map
		for (Map.Entry<Integer, String> entry : myMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}
}
