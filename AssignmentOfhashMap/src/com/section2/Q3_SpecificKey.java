package com.section2;

import java.util.HashMap;

public class Q3_SpecificKey {

//	WAP to test if a HashMap contains a mapping for the specified key

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("Vivek", 30);
		map.put("suyog", 25);
		map.put("omkar", 40);
		
		if(map.containsKey("Vivek")  &&  map.containsValue(30))
		{
			System.out.println("Is present....");
		}
		else {
			System.out.println("Not Present...");
		}
	}
}
