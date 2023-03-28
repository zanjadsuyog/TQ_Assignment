package com.section2;

import java.util.HashMap;

public class Que4_Search {

//	WAP to search for an element from HashMap using key

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("Vivek", 30);
		map.put("suyog", 25);
		map.put("omkar", 40);

		Integer maryAge = map.get("suyog");

		if (maryAge != null) {
			System.out.println("suyog age is " + maryAge);
		} else {
			System.out.println("suyog is not in the map");
		}
	}
}
