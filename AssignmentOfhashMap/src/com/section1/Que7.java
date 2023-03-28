package com.section1;

import java.util.Collection;
//7.	WAP to get only the Values from a HashMap
import java.util.HashMap;

public class Que7 {

	public static void main(String[] args) {
		HashMap hm1 = new HashMap();
		hm1.put(1, "Suyog");
		hm1.put(2, "Yashank");
		hm1.put(3, "Ratndeep");
		hm1.put(4, "Vivek");

		Collection<String> s1 = hm1.values();
		for (String s2 : s1) {
			System.out.println(s2);
		}

	}

}
