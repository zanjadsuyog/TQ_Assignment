package com.section1;

import java.util.HashMap;

public class Que4 {
//	4.	WAP to create a map using Wrapper class as key and value same as keys’ data 
//  type WAP to count the number of key-value (size) mappings in a map.

	public static void main(String[] args) {
		HashMap<Integer, Integer> myMap = new HashMap<>();

		// Adding elements to the map
		myMap.put(1,11);
		myMap.put(2,22);
		myMap.put(3,33);
		myMap.put(4,44);
	/*	
		for(Integer it: myMap.keySet())
		{
           Integer integer=myMap.get(it);
           System.out.println(it+" : "+integer);
 
		}
		*/
		
		int size=myMap.size();
		
		System.out.println("The Size Is: "+size);
	}
}
