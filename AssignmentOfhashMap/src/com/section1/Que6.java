//6.	WAP to get only the Keys from a HashMap
package com.section1;

import java.util.HashMap;
import java.util.Set;

public class Que6 {

	public static void main(String[] args) {
		HashMap hm1 = new HashMap();
		hm1.put(1, "Suyog");
		hm1.put(2, "Yashank");
		hm1.put(3, "Ratndeep");
		hm1.put(4, "Vivek");

		Set<Integer> s1 = hm1.keySet();
		for (Integer s2 : s1) {
			System.out.println(s2);
		}

	}
}
