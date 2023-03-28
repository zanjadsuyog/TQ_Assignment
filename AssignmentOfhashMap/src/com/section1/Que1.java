//WAP to add elements to a HashMap without using generics (ie do not use <>)
//and print content of it. Use Integer as Key and String as Value.
//In second HashMap add elements of String type as Key and Integer as Value
package com.section1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Que1 {
	public static void main(String[] args) {
		HashMap hm1 = new HashMap();
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

		HashMap hm2 = new HashMap();
		hm2.put("Orange", 1);
		hm2.put("Red", 2);
		hm2.put("Black", 3);
		hm2.put("Pink", 4);

//		Set<String> s2 = hm2.keySet();
//		Iterator<Integer> itr2 = s2.Iterator();
//		while (itr2.hasNext()) {
//			Integer a = itr2.next();
//			System.out.println(a + " " + hm1.get(a));
//		}

	}

}
