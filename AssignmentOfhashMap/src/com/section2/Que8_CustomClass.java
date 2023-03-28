package com.section2;

import java.util.HashMap;
import java.util.Map.Entry;

public class Que8_CustomClass {

	// WAP to create a map using Custom class as key and any other JDK provided
	// object as value

	public static void main(String[] args) {

		HashMap<Student, String> s1 = new HashMap<>();

		s1.put(new Student(22, "Suyog", 90), "parner");
		s1.put(new Student(25, "Gaurav", 80), "pune");
		s1.put(new Student(27, "Omkar", 88), "nagar");
		s1.put(new Student(20, "Vivek", 85), "shirur");

		// for(Map.Entry<Student, String> m1:s1.g)
		for (Entry<Student, String> entry : s1.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());

		}
	}
}
