package com.next_15;

import java.util.Arrays;
import java.util.Collection;

public class OneCollectionToanother {

	public static void main(String[] args) {
		// Create the two collections
		Collection<Integer> collection1 = Arrays.asList(1, 2, 3, 4, 5);
		Collection<Integer> collection2 = Arrays.asList(2, 4);

		// Search for collection2 in collection1
		if (collection1.containsAll(collection2)) {
			System.out.println("collection1 contains all elements of collection2");
		} else {
			System.out.println("collection1 does not contain all elements of collection2");
		}

	}

}
