package com.section2;

import java.util.HashMap;
import java.util.Map;

public class Que7_RemovesKeys {

// WAP to empty Map. (Hint - Get keys and iterate through the keys to remove entries from Map)

	public static void main(String[] args) {

		// Create a HashMap
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("John", 30);
		map.put("Mary", 25);
		map.put("Peter", 40);

		// Print the map before emptying it
		System.out.println("Map before emptying: " + map);

		// Get the keys from the map
		String[] keys = map.keySet().toArray(new String[0]);

		// Iterate through the keys and remove entries from the map
		for (String key : keys) {
			map.remove(key);
		}

		// Print the map after emptying it
		System.out.println("Map after emptying: " + map);
	}

}
