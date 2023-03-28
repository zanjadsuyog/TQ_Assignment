package com.section1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//5.	WAP to get all the entries from a HashMap.
//Iterate the entries and print the Key & Value values
public class Que5 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1.put(1, "Suyog");
		hm1.put(2, "Yashank");
		hm1.put(3, "Ratndeep");
		hm1.put(4, "Vivek");

		System.out.println(hm1);
		Set<Integer> s1 = hm1.keySet();
		Iterator<Integer> itr = s1.iterator();
		while (itr.hasNext()) {
			Integer a = itr.next();
			System.out.println(a + " " + hm1.get(a));
		}

	}
}
