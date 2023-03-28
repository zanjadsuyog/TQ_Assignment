package com.section2;

import java.util.HashMap;

public class Que5_SpecificValue {

//   WAP to test if a HashMap contains a mapping for the specified value

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("Vivek", 30);
		map.put("suyog", 25);
		map.put("omkar", 40);
		
		if(map.containsValue(30) )
		{
			System.out.println("Is present....");
		}
		else {
			System.out.println("Not Present...");
		}
	}
}
