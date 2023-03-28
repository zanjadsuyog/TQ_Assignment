package com.section2;

import java.util.HashMap;
import java.util.Map;

public class Que1_copy {

// WAP to copy all of the mappings from the specified HashMap to another map

	public static void main(String[] args) {

		HashMap<Integer, String> m1 = new HashMap<>();

		m1.put(101, "Suyog");
		m1.put(102, "Vivek");
		m1.put(103, "Rohit");
		m1.put(104, "Omkar");

		// System.out.println(m1);

		HashMap<Integer, String> m2 = new HashMap<>();

		m2.putAll(m1);

//		System.out.println(m2);

		for (Map.Entry<Integer, String> entry : m2.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " Value " + entry.getValue());
		}
//      for(Map.Entry<String, Integer> entry : map2.entrySet()) 

	}
}
