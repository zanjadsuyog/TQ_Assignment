package com.section1;

import java.util.HashMap;

public class Que2 {

//	WAP add elements to HashMap without using generics, 0th location use String
//  as key and Integer as value, on 1st location use String as key String and Integer 
//	as value.
	
	public static void main(String[] args) {
		HashMap m1=new HashMap();
		m1.put("suyog", 101);
		m1.put("Sagar", 102);
		
		System.out.println("Element at 0th loccation: "+m1.get("suyog"));
		System.out.println("Element at 0th loccation: "+m1.get("Sagar"));

		
		
		
		
	}
}
