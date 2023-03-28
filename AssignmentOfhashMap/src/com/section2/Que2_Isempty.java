package com.section2;

import java.util.HashMap;

public class Que2_Isempty {

//	WAP to test a HashMap is empty or not
	
	public static void main(String[] args) {
		
	HashMap<Integer, String> m1 = new HashMap<>();

		m1.put(101, "Suyog");
		m1.put(102, "Vivek");
		m1.put(103, "Rohit");
		m1.put(104, "Omkar");
		
		System.out.println(m1.isEmpty());
	}
}
